package it.polito.dp2.WF.sol4.server;

import it.polito.dp2.WF.ActionReader;
import it.polito.dp2.WF.ActionStatusReader;
import it.polito.dp2.WF.ProcessActionReader;
import it.polito.dp2.WF.ProcessReader;
import it.polito.dp2.WF.SimpleActionReader;
import it.polito.dp2.WF.WorkflowMonitor;
import it.polito.dp2.WF.WorkflowMonitorException;
import it.polito.dp2.WF.WorkflowMonitorFactory;
import it.polito.dp2.WF.WorkflowReader;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.JAXBElement;

import it.polito.dp2.WF.lab4.gen.*;

@WebService(serviceName="WorkflowSearchingService", portName="WorkflowSearchingImplPort", targetNamespace="http://pad.polito.it/Workflow", endpointInterface="it.polito.dp2.WF.lab4.gen.WorkflowSearching")
public class WorkflowSearchingImpl implements WorkflowSearching {
	
	private WfInfoType workflows;
	private WorkflowMonitor monitor;

	public WorkflowSearchingImpl() throws Exception {
		System.setProperty("it.polito.dp2.WF.WorkflowMonitorFactory", "it.polito.dp2.WF.Random.WorkflowMonitorFactoryImpl");
		WorkflowMonitorFactory factory = WorkflowMonitorFactory.newInstance();
		monitor = factory.newWorkflowMonitor();
		
		workflows = printWorkflows();
	}

	@Override
	@WebMethod
	@WebResult(name = "wfInfo", targetNamespace = "http://pad.polito.it/Workflow", partName = "listOfWorkflow")
	public WfInfoType getWorkflows(
			@WebParam(name = "getWorkflowsType", targetNamespace = "http://pad.polito.it/Workflow", partName = "emptyParam") GetWorkflowsType emptyParam) {
		// TODO Auto-generated method stub
		return workflows;
	}

	@Override
	@WebMethod
	@WebResult(name = "getProcessesType", targetNamespace = "http://pad.polito.it/Workflow", partName = "listOfProcess")
	public GetProcessesType getProcesses(
			@WebParam(name = "workflowName", targetNamespace = "http://pad.polito.it/Workflow", partName = "workflowName") String workflowName)
			throws UnknownWorkflow {
		// TODO Auto-generated method stub
		GetProcessesType ret = new GetProcessesType();
		for(WorkflowType wf:workflows.getWorkflow())
			for(Object aop:wf.getActionOrProcess())
				if(aop.getClass() == ProcessType.class)
					ret.setProcess((ProcessType)aop);
					
		return ret;
	}
	
	private GetProcessesType printProcesses(String wfName) {
		try
		{
			GetProcessesType ret = new GetProcessesType();
			// Get the list of processes
			Set<ProcessReader> set = monitor.getProcesses();
			
			// For each process print related data
			for (ProcessReader wfr: set)
			{
				if(wfr.getWorkflow().getName() == wfName)
				{
					/*Element process = doc.createElement("process");
					rootElement.appendChild(process);*/
					ProcessType prc = new ProcessType();
					
					prc.setStartAt(String.valueOf(wfr.getStartTime().getTime()));
					//process.setAttribute("startAt", String.valueOf(wfr.getStartTime().getTime()));
					/*System.out.println("Process started at " + 
										dateFormat.format(wfr.getStartTime().getTime()) +
							            " "+"- Workflow " + wfr.getWorkflow().getName());
					System.out.println("Status:");*/
					List<ActionStatusReader> statusSet = wfr.getStatus();
	
					for (ActionStatusReader asr : statusSet)
					{
						/*Element actionStatus = doc.createElement("actionStatus");
						process.appendChild(actionStatus);*/
						ActionStatusType as = new ActionStatusType();
						
						as.getActorOrActionName();
						as.setActorOrActionName(asr.getActionName());
						
						//System.out.print(asr.getActionName()+"\t");
						if (asr.isTakenInCharge())
						{
							/*Element actor = doc.createElement("actor");
							actionStatus.appendChild(actor);*/
							ActorType act = new ActorType();
							
							act.setName(asr.getActor().getName());
							act.setRole(asr.getActor().getRole());
							
							as.setActorOrActionName(act);
							//actor.setAttribute("name", asr.getActor().getName());
							//System.out.print(asr.getActor().getName()+"\t\t");
							/*Element role = doc.createElement("role");
							role.appendChild(doc.createTextNode(asr.getActor().getRole()));
							actor.appendChild(role);*/
						}
						
						/*Element actionName = doc.createElement("actionName");
						actionName.appendChild(doc.createTextNode(asr.getActionName()));
						actionStatus.appendChild(actionName);*/
		
						if (asr.isTerminated())
							as.setTerminatedAt(String.valueOf(asr.getTerminationTime().getTimeInMillis()));
							//as.setTerminatedAt(String.valueOf(dateFormat.format(asr.getTerminationTime().getTime())));
							//actionStatus.setAttribute("terminatedAt", String.valueOf(dateFormat.format(asr.getTerminationTime().getTime())));
							//System.out.println(dateFormat.format(asr.getTerminationTime().getTime()));
						prc.setActionStatus(as);
					}
					ret.setProcess(prc);
				}
			}
			return ret;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}


	private WfInfoType printWorkflows() {
		try
		{
			WfInfoType ret = new WfInfoType();

			Set<WorkflowReader> set = monitor.getWorkflows();
			WorkflowType wf = new WorkflowType();
			
			//ret.setXmlns("http://www.w3schools.com");
			
			for (WorkflowReader wfr: set)
			{
				/*Element workflow = doc.createElement("workflow");
				rootElement.appendChild(workflow);*/
				
				
				//workflow.setAttribute("name", wfr.getName());
				wf.setName(wfr.getName());
				for(ProcessType pt:printProcesses(wfr.getName()).getProcess())
					wf.setActionOrProcess(pt);
				
				// Print actions
				//System.out.println("Actions:");
				Set<ActionReader> setAct = wfr.getActions();
				//printHeader("Action Name\tRole\t\tAutom.Inst.\tSimple/Process\tWorkflow\tNext Possible Actions");
				for (ActionReader ar: setAct)
				{
					/*Element action = doc.createElement("action");
					workflow.appendChild(action);*/
					ActionType act = new ActionType();
					
					/*Element role = doc.createElement("role");
					role.appendChild(doc.createTextNode(ar.getRole()));
					action.appendChild(role);*/
					act.setRoleOrFollowingActionsOrNestedWorkflow(ar.getRole());
					
					//action.setAttribute("name", ar.getName());
					act.setName(ar.getName());
					//action.setAttribute("automInst", String.valueOf(ar.isAutomaticallyInstantiated()));
					act.setAutomInst(ar.isAutomaticallyInstantiated());
					
					if (ar instanceof SimpleActionReader)
					{
						//action.setAttribute("type", "simple");
						//TypeEnumType tet = TypeEnumType.valueOf("simple");
						
						//act.setType(tet);
						
						Set<ActionReader> setNxt = ((SimpleActionReader)ar).getPossibleNextActions();
						if(!setNxt.isEmpty())
						{
							/*Element followingActions = doc.createElement("followingActions");
							action.appendChild(followingActions);*/
							FollowingActionsType fan = new FollowingActionsType();
							
							for (ActionReader nAct: setNxt)
								fan.setActionName(nAct.getName());
								/*Element actionName = doc.createElement("actionName");
								actionName.appendChild(doc.createTextNode(nAct.getName()));
								followingActions.appendChild(actionName);*/
							act.setRoleOrFollowingActionsOrNestedWorkflow(fan);
						}
					}
					else if (ar instanceof ProcessActionReader)
					{
						//action.setAttribute("type", "process");
						//TypeEnumType tet = TypeEnumType.valueOf("process");
						
						//act.setType(tet);

						act.setRoleOrFollowingActionsOrNestedWorkflow(((ProcessActionReader)ar).getActionWorkflow());
						
						/*Element nestedWorkflow = doc.createElement("nestedWorkflow");
						nestedWorkflow.setAttribute("workflowName", ((ProcessActionReader)ar).getActionWorkflow().getName());
						action.appendChild(nestedWorkflow);*/
					}
					wf.setActionOrProcess(act);
				}
			}
			ret.setWorkflow(wf);
			return ret;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

}
