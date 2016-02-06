package it.polito.dp2.WF.sol4.client1;

import it.polito.dp2.WF.Actor;
import it.polito.dp2.WF.lab4.gen.client1.ActionStatusType;
import it.polito.dp2.WF.lab4.gen.client1.ActorType;

import java.util.Calendar;

public class ActionStatusReader implements it.polito.dp2.WF.ActionStatusReader {
	
	private ActionStatusType actionStat;
	
	public ActionStatusReader(ActionStatusType as)
	{
		actionStat = as;
	}
	
	@Override
	public String getActionName() {
		return actionStat.getActionName();
	}

	@Override
	public Actor getActor() {
		ActorType act = actionStat.getActor();
		if(act != null)
		{
			String name = act.getName();
			String role = act.getRole();
	
			if((name != null && !name.isEmpty()) && (role != null && !role.isEmpty()))
				return (new Actor(name, role));
		}
		
		return null;
	}

	@Override
	public Calendar getTerminationTime() {
		Calendar cal  = Calendar.getInstance();
		cal.setTimeInMillis(Long.parseLong(actionStat.getTerminatedAt()));
		return cal;
	}

	@Override
	public boolean isTakenInCharge() {
		if(getActor() != null)
			return true;
		else
			return false;
	}

	@Override
	public boolean isTerminated() {
		if(actionStat.getTerminatedAt() != null && !actionStat.getTerminatedAt().isEmpty())
			return true;
		else
			return false;
	}

}
