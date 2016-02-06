package it.polito.dp2.WF.sol4.client1;

import it.polito.dp2.WF.lab4.gen.ActionType;
import it.polito.dp2.WF.lab4.gen.WorkflowType;


public class ProcessActionReader extends ActionReader {

	private WorkflowType workflow;
	
	public ProcessActionReader(ActionType act, WorkflowType wf) {
		super(act, wf);
		workflow = wf;
	}

	public WorkflowReader getActionWorkflow() {
		return (new WorkflowReader(workflow));
	}

}
