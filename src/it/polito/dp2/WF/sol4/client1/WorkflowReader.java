package it.polito.dp2.WF.sol4.client1;

import it.polito.dp2.WF.lab4.gen.client1.ActionType;
import it.polito.dp2.WF.lab4.gen.client1.ProcessType;
import it.polito.dp2.WF.lab4.gen.client1.WorkflowType;

import java.util.*;


public class WorkflowReader implements it.polito.dp2.WF.WorkflowReader {

	private WorkflowType workflow;
	
	public WorkflowReader(WorkflowType wf)
	{
		workflow = wf;
	}
	@Override
	public ActionReader getAction(String arg0) {
		return (new ActionReader(WorkFlowModel.findAction(workflow, arg0), workflow));
	}

	@Override
	public Set<it.polito.dp2.WF.ActionReader> getActions() {
		Set<it.polito.dp2.WF.ActionReader> ret = new HashSet<it.polito.dp2.WF.ActionReader>();
		
		for(ActionType act:WorkFlowModel.allActions(workflow))
			ret.add(new ActionReader(act, workflow));
		
		return ret;
	}

	@Override
	public String getName() {
		return workflow.getName();
	}

	@Override
	public Set<it.polito.dp2.WF.ProcessReader> getProcesses() {
		Set<it.polito.dp2.WF.ProcessReader> ret = new HashSet<it.polito.dp2.WF.ProcessReader>();
		
		for(ProcessType pr:workflow.getProcess())
			ret.add(new ProcessReader(pr, workflow));
		
		return ret;
	}

}
