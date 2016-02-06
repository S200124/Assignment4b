package it.polito.dp2.WF.sol4.client1;

import java.util.*;


public class WorkflowReader implements it.polito.dp2.WF.WorkflowReader {

	private Workflow workflow;
	
	public WorkflowReader(Workflow wf)
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
		
		for(Action act:WorkFlowModel.allActions(workflow))
			ret.add(new ActionReader(act, workflow));
		
		return ret;
	}

	@Override
	public String getName() {
		return workflow.getName();
	}

	@Override
	public Set<it.polito.dp2.WF.ProcessReader> getProcesses() {
		return (new HashSet<it.polito.dp2.WF.ProcessReader>());
	}

}
