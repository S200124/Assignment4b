package it.polito.dp2.WF.sol4.client1;

import it.polito.dp2.WF.lab4.gen.WorkflowType;

import java.util.*;


public class WorkflowMonitor implements it.polito.dp2.WF.WorkflowMonitor {
	
	private List<WorkflowType> wfl;
	
	public WorkflowMonitor() {
		wfl = WorkFlowModel.allWorkflow();
	}

	@Override
	public Set<it.polito.dp2.WF.ProcessReader> getProcesses() {
		return (new HashSet<it.polito.dp2.WF.ProcessReader>());
	}

	@Override
	public WorkflowReader getWorkflow(String arg0) {
		return (new WorkflowReader(WorkFlowModel.findWorkflow(wfl, arg0)));
	}

	@Override
	public Set<it.polito.dp2.WF.WorkflowReader> getWorkflows() {
		Set<it.polito.dp2.WF.WorkflowReader> ret = new HashSet<it.polito.dp2.WF.WorkflowReader>();
		
		for(WorkflowType wf:wfl)
			ret.add(new WorkflowReader(wf));
		
		return ret;
	}
	
}
