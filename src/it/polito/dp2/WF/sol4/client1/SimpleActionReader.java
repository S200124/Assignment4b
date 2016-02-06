package it.polito.dp2.WF.sol4.client1;

import java.util.*;

public class SimpleActionReader extends ActionReader {

	private Action action;
	private Workflow workflow;
	
	public SimpleActionReader(Action act, Workflow wf) {
		super(act, wf);
		action = act;
		workflow = wf;
	}

	public Set<ActionReader> getPossibleNextActions() {
		Set<ActionReader> ret = new HashSet<ActionReader>();
		
		for(String name:action.getNextAction())
			for(Action act:WorkFlowModel.allActions(workflow))
				if(act.getName().trim().equals(name))
					ret.add(new ActionReader(act, workflow));
		
		return ret;
	}

}
