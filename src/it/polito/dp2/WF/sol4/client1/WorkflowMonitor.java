package it.polito.dp2.WF.sol4.client1;

import it.polito.dp2.WF.lab4.gen.client1.ProcessType;
import it.polito.dp2.WF.lab4.gen.client1.WorkflowType;

import java.util.*;


public class WorkflowMonitor implements it.polito.dp2.WF.WorkflowMonitor {
	
	private List<WorkflowType> wfl;
	
	public WorkflowMonitor() {
		wfl = WorkFlowModel.allWorkflow();
	}

	@Override
	public Set<it.polito.dp2.WF.ProcessReader> getProcesses() {
		Set<it.polito.dp2.WF.ProcessReader> ret = new HashSet<it.polito.dp2.WF.ProcessReader>();
		
		for(WorkflowType wf:wfl)
			for(ProcessType pr:wf.getProcess())
				ret.add(new ProcessReader(pr, wf));
		
		return ret;
	}

	@Override
	public WorkflowReader getWorkflow(String arg0) {
		for(WorkflowType wf:wfl)
			if(wf.getName().trim().equals(arg0))
				return (new WorkflowReader(wf));
		return null;
	}

	@Override
	public Set<it.polito.dp2.WF.WorkflowReader> getWorkflows() {
		Set<it.polito.dp2.WF.WorkflowReader> ret = new HashSet<it.polito.dp2.WF.WorkflowReader>();
		
		for(WorkflowType wf:wfl)
			ret.add(new WorkflowReader(wf));
		
		return ret;
	}
	
}
