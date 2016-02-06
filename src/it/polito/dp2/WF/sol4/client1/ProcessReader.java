package it.polito.dp2.WF.sol4.client1;

import it.polito.dp2.WF.lab4.gen.client1.ProcessType;
import it.polito.dp2.WF.lab4.gen.client1.WorkflowType;
import it.polito.dp2.WF.lab4.gen.client1.ActionStatusType;

import java.text.*;
import java.util.*;

public class ProcessReader implements it.polito.dp2.WF.ProcessReader {
	
	private ProcessType process;
	private WorkflowType workflow;
	
	public ProcessReader(ProcessType pr, WorkflowType wfn)
	{
		process = pr;
		workflow = wfn;
	}
	
	@Override
	public Calendar getStartTime() {
		try
		{
			//"yyyy.MM.dd G 'at' HH:mm:ss z"	2001.07.04 AD at 12:08:56 PDT
			DateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
			Calendar cal  = Calendar.getInstance();
			cal.setTime(df.parse(process.getStartAt()));
			return cal;
		}
		catch (ParseException e)
		{
			return null;
		}	
	}

	@Override
	public List<it.polito.dp2.WF.ActionStatusReader> getStatus() {
		List<it.polito.dp2.WF.ActionStatusReader> ret = new ArrayList<it.polito.dp2.WF.ActionStatusReader>();
		
		for(ActionStatusType as:process.getActionStatus())
			ret.add(new ActionStatusReader(as));
		
		return ret;
	}

	@Override
	public WorkflowReader getWorkflow() {
		return (new WorkflowReader(workflow));
	}

}
