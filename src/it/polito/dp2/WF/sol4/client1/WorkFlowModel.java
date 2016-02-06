package it.polito.dp2.WF.sol4.client1;

import java.net.*;
import java.util.*;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

public final class WorkFlowModel {
	
	private WorkFlowModel() {}
	
	public static List<Workflow> allWorkflow()
	{
		URL url;
		try {
			url = new URL(System.getProperty("it.polito.dp2.WF.lab4.URL"));
		} catch (MalformedURLException e) {
			url = null;
		}
		
		if(url != null)
		{
			WorkflowInfoService service = new WorkflowInfoService(url);
			WorkflowInfo proxy = service.getWorkflowInfoPort();
			
			Holder<XMLGregorianCalendar> hx = new Holder<XMLGregorianCalendar>();
			List<String> ls = new ArrayList<String>();
			Holder<List<Workflow>> hlw = new Holder<List<Workflow>>();
			Holder<List<String>> hls = new Holder<List<String>>();
			
			proxy.getWorkflowNames(hx, hls);
			for(String name:hls.value)
				ls.add(name);
			
			try {
				proxy.getWorkflows(ls, hx, hlw);
				return hlw.value;
			} catch (UnknownNames_Exception e) {
				
			}
		}
		return null;
	}
	
	public static List<Process> allProcesses()
	{	
		return (new ArrayList<Process>());
	}
	
	public static List<Process> whereProcesses(String workflowName)
	{
		return (new ArrayList<Process>());
	}
	
	public static Workflow findWorkflow(List<Workflow> allWF, String name)
	{	
		for(Workflow wf:allWF)
			if(wf.getName().trim().equals(name))
				return wf;
		
		return null;
	}

	public static List<Action> allActions(Workflow wf)
	{
		return wf.getAction();
	}

	public static Action findAction(Workflow wf, String name)
	{	
		if(wf != null)
			for(Action act:allActions(wf))
				if(act.getName().trim().equals(name))
					return act;
		
		return null;
	}
}
