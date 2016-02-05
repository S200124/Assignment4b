package it.polito.dp2.WF.sol4.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import it.polito.dp2.WF.lab4.gen.*;

@WebService(serviceName="WorkflowService", portName="WorkflowPort", targetNamespace="http://pad.polito.it/Workflow", endpointInterface="it.polito.dp2.WF.lab4.gen.JoinWorkflow")
public class JoinWorkflowImpl implements JoinWorkflow {

	@Override
	@WebMethod
	@WebResult(name = "processID", targetNamespace = "http://pad.polito.it/Workflow", partName = "processID")
	public String createProcess(
			@WebParam(name = "workflowName", targetNamespace = "http://pad.polito.it/Workflow", partName = "workflowName") String workflowName)
			throws SystemFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@WebMethod
	@WebResult(name = "process", targetNamespace = "http://pad.polito.it/Workflow", partName = "processInfo")
	public ProcessType getProcess(
			@WebParam(name = "processID", targetNamespace = "http://pad.polito.it/Workflow", partName = "processID") String processID)
			throws UnknownProcessFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@WebMethod
	@WebResult(name = "out", targetNamespace = "http://pad.polito.it/Workflow", partName = "out")
	public String takeAction(
			@WebParam(name = "takeActionType", targetNamespace = "http://pad.polito.it/Workflow", partName = "params") TakeActionType params)
			throws AlreadyTakenFault, DifferentRoleFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@WebMethod
	@WebResult(name = "out", targetNamespace = "http://pad.polito.it/Workflow", partName = "out")
	public String completeAction(
			@WebParam(name = "nextActionType", targetNamespace = "http://pad.polito.it/Workflow", partName = "nextAction") NextActionType nextAction) {
		// TODO Auto-generated method stub
		return null;
	}

}
