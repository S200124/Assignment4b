package it.polito.dp2.WF.sol4.client1;

import it.polito.dp2.WF.lab4.gen.*;

import java.net.*;
import java.util.*;
import javax.xml.ws.*;
import javax.xml.datatype.XMLGregorianCalendar;



public class Client {

	public static void main(String[] args) {

		URL url;
		try {
			url = new URL("http://localhost:7071/wfinfo");
		} catch (MalformedURLException e) {
			url = null;
		}
		
		if(url != null)
		{
			WorkflowSearching_Service service = new WorkflowSearching_Service(url);
			WorkflowSearching proxy = service.getWorkflowSearchingPort();
			
			/*Holder<XMLGregorianCalendar> hx = new Holder<XMLGregorianCalendar>();
			List<String> ls = new ArrayList<String>();
			Holder<List<Workflow>> hlw = new Holder<List<Workflow>>();
			Holder<List<String>> hls = new Holder<List<String>>();*/
			
			System.out.println("Ready to invoke remote operation 1...");
			try {
				for(WorkflowType wf:proxy.getWorkflows())
					System.out.println(wf.getName());
			} catch (SystemError_Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Ready to invoke remote operation 2...");
			try {
				
				for(ProcessType pt:proxy.getProcesses())
					System.out.println(pt.getStartAt());
			} catch (SystemError_Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
