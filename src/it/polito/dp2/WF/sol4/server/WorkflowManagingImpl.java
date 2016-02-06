package it.polito.dp2.WF.sol4.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import it.polito.dp2.WF.lab4.gen.server.ActionStatusType;
import it.polito.dp2.WF.lab4.gen.server.AlreadyTakenOrDifferentRoleError_Exception;
import it.polito.dp2.WF.lab4.gen.server.SystemError_Exception;
import it.polito.dp2.WF.lab4.gen.server.TakenOverActionType;
import it.polito.dp2.WF.lab4.gen.server.WorkflowManaging;
import it.polito.dp2.WF.lab4.gen.server.WorkflowType;

@WebService(serviceName="WorkflowManaging", portName="WorkflowManagingPort", targetNamespace="http://pad.polito.it/ws/Workflow/", endpointInterface="it.polito.dp2.WF.lab4.gen.server.WorkflowManaging")
public class WorkflowManagingImpl implements WorkflowManaging {

	private WorkflowManager manager;
	
	public WorkflowManagingImpl(WorkflowManager manager) {
		super();
		this.manager = manager;
	}
	
	@Override
	@WebMethod
	@RequestWrapper(localName = "createProcess", targetNamespace = "http://pad.polito.it/ws/Workflow/", className = "it.polito.dp2.WF.lab4.gen.CreateProcess")
	@ResponseWrapper(localName = "createProcessResponse", targetNamespace = "http://pad.polito.it/ws/Workflow/", className = "it.polito.dp2.WF.lab4.gen.CreateProcessResponse")
	public void createProcess(
			@WebParam(name = "workflow", targetNamespace = "") String workflow)
			throws SystemError_Exception {
		manager.createProcessInWorkflow(workflow);
	}

	@Override
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "takeAction", targetNamespace = "http://pad.polito.it/ws/Workflow/", className = "it.polito.dp2.WF.lab4.gen.TakeAction")
	@ResponseWrapper(localName = "takeActionResponse", targetNamespace = "http://pad.polito.it/ws/Workflow/", className = "it.polito.dp2.WF.lab4.gen.TakeActionResponse")
	public ActionStatusType takeAction(
			@WebParam(name = "takenOverAction", targetNamespace = "") TakenOverActionType takenOverAction)
			throws AlreadyTakenOrDifferentRoleError_Exception,
			SystemError_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@WebMethod
	@RequestWrapper(localName = "completeAction", targetNamespace = "http://pad.polito.it/ws/Workflow/", className = "it.polito.dp2.WF.lab4.gen.CompleteAction")
	@ResponseWrapper(localName = "completeActionResponse", targetNamespace = "http://pad.polito.it/ws/Workflow/", className = "it.polito.dp2.WF.lab4.gen.CompleteActionResponse")
	public void completeAction(
			@WebParam(name = "completedAction", targetNamespace = "") ActionStatusType completedAction)
			throws SystemError_Exception {
		// TODO Auto-generated method stub
		
	}

}
