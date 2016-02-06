package it.polito.dp2.WF.sol4.client1;

import it.polito.dp2.WF.lab4.gen.client1.ActionType;
import it.polito.dp2.WF.lab4.gen.client1.WorkflowType;

import java.util.*;

public class SimpleActionReader extends ActionReader {

	private ActionType action;
	private WorkflowType workflow;
	
	public SimpleActionReader(ActionType act, WorkflowType wf) {
		super(act, wf);
		action = act;
		workflow = wf;
	}

	public Set<ActionReader> getPossibleNextActions() {
		Set<ActionReader> ret = new HashSet<ActionReader>();
		
		for(String name:action.getFollowingActions().getActionName())
			for(ActionType act:WorkFlowModel.allActions(workflow))
				if(act.getName().trim().equals(name))
					ret.add(new ActionReader(act, workflow));
		
		return ret;
	}

}
