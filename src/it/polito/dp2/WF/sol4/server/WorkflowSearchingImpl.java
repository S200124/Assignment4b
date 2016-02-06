package it.polito.dp2.WF.sol4.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import it.polito.dp2.WF.lab4.gen.*;

@WebService(serviceName="WorkflowSearchingService", portName="WorkflowSearchingImplPort", targetNamespace="http://pad.polito.it/Workflow", endpointInterface="it.polito.dp2.WF.lab4.gen.WorkflowSearching")
public class WorkflowSearchingImpl implements WorkflowSearching {
	
	private WfInfoType workflows;

	public WorkflowSearchingImpl(WfInfoType wf) throws Exception {
		super();
		this.workflows = wf;
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

}
