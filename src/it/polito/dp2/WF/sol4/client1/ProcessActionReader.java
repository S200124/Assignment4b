package it.polito.dp2.WF.sol4.client1;


public class ProcessActionReader extends ActionReader {

	private Workflow workflow;
	
	public ProcessActionReader(Action act, Workflow wf) {
		super(act, wf);
		workflow = wf;
	}

	public WorkflowReader getActionWorkflow() {
		return (new WorkflowReader(workflow));
	}

}
