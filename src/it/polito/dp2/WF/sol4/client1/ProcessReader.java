package it.polito.dp2.WF.sol4.client1;

import java.util.*;

public class ProcessReader implements it.polito.dp2.WF.ProcessReader {
	
	@Override
	public Calendar getStartTime() {
		return null;
	}

	@Override
	public List<it.polito.dp2.WF.ActionStatusReader> getStatus() {
		return (new ArrayList<it.polito.dp2.WF.ActionStatusReader>());
	}

	@Override
	public WorkflowReader getWorkflow() {
		return null;
	}

}
