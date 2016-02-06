package it.polito.dp2.WF.sol4.client1;

public class ActionReader implements it.polito.dp2.WF.ActionReader {
	
	private Action action;
	private Workflow workflow;
	
	public ActionReader(Action act, Workflow wf)
	{
		action = act;
		workflow = wf;
	}

	@Override
	public WorkflowReader getEnclosingWorkflow() {
		return (new WorkflowReader(workflow));
	}

	@Override
	public String getName() {
		return action.getName();
	}

	@Override
	public String getRole() {
		String role = action.getRole();
		if(role != null)
			return role;
		else
			return "";
	}

	@Override
	public boolean isAutomaticallyInstantiated() {
		return action.isAutomaticallyInstantiated();
	}

}
