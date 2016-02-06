package it.polito.dp2.WF.sol4.server;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import it.polito.dp2.WF.lab4.gen.server.ProcessType;
import it.polito.dp2.WF.lab4.gen.server.SystemError_Exception;
import it.polito.dp2.WF.lab4.gen.server.WorkflowSearching;
import it.polito.dp2.WF.lab4.gen.server.WorkflowType;

@WebService(serviceName="WorkflowSearching", portName="WorkflowSearchingPort", targetNamespace="http://pad.polito.it/ws/Workflow/", endpointInterface="it.polito.dp2.WF.lab4.gen.server.WorkflowSearching")
public class WorkflowSearchingImpl implements WorkflowSearching {

	private WorkflowManager manager;
	
	public WorkflowSearchingImpl(WorkflowManager manager) {
		super();
		this.manager = manager;
	}
	
	@Override
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getWorkflows", targetNamespace = "http://pad.polito.it/ws/Workflow/", className = "it.polito.dp2.WF.lab4.gen.GetWorkflows")
	@ResponseWrapper(localName = "getWorkflowsResponse", targetNamespace = "http://pad.polito.it/ws/Workflow/", className = "it.polito.dp2.WF.lab4.gen.GetWorkflowsResponse")
	public List<WorkflowType> getWorkflows() throws SystemError_Exception {
		// TODO Auto-generated method stub
		return manager.getWorkflows();
	}

	@Override
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getProcesses", targetNamespace = "http://pad.polito.it/ws/Workflow/", className = "it.polito.dp2.WF.lab4.gen.GetProcesses")
	@ResponseWrapper(localName = "getProcessesResponse", targetNamespace = "http://pad.polito.it/ws/Workflow/", className = "it.polito.dp2.WF.lab4.gen.GetProcessesResponse")
	public List<ProcessType> getProcesses() throws SystemError_Exception {
		// TODO Auto-generated method stub
		return manager.getProcesses();
	}

}
