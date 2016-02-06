package it.polito.dp2.WF.sol4.client1;

import it.polito.dp2.WF.ProcessReader;
import it.polito.dp2.WF.WorkflowReader;
import it.polito.dp2.WF.lab4.gen.client1.*;

import java.net.*;


public class Client {

	public static void main(String[] args) {
		System.setProperty("it.polito.dp2.WF.lab4.URL","http://localhost:7071/wfinfo");
		
		WorkflowMonitor wfm = new WorkflowMonitor();
		
		System.out.println("Ready to invoke remote operation 1...");
		for(WorkflowReader wf:wfm.getWorkflows())
			System.out.println(wf.getName());
		
		System.out.println("Ready to invoke remote operation 2...");
		for(ProcessReader pt:wfm.getProcesses())
			System.out.println(pt.getStartTime().getTime());
	}
}
