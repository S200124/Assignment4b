package it.polito.dp2.WF.sol4.server;

import it.polito.dp2.WF.lab4.gen.ProcessType;

import java.util.concurrent.Executors;

import javax.xml.ws.Endpoint;

public class WorkflowServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WorkflowManager wfm;
		try {
			wfm = new WorkflowManager();
			WorkflowSearchingImpl wsi = new WorkflowSearchingImpl(wfm);
			WorkflowManagingImpl wmi = new WorkflowManagingImpl(wfm);
			
			wmi.createProcess(wsi.getWorkflows().get(0));
			for(ProcessType pt:wsi.getProcesses())
				System.out.println(pt.getStartAt() + ", " + pt.getActionStatus().get(0).getActionName());
			
			/*System.out.println("Publishing http://localhost:7071/wfinfo");
	        Endpoint endpoint = Endpoint.create(new WorkflowSearchingImpl(wfm));
	        endpoint.setExecutor(Executors.newFixedThreadPool(10));
	   	    endpoint.publish("http://localhost:7071/wfinfo");
	        
	        System.out.println("Publishing http://localhost:7070/wfcontrol");
	        Endpoint endpoint2 = Endpoint.create(new WorkflowManagingImpl(wfm));
	        endpoint2.setExecutor(Executors.newFixedThreadPool(10));
	   	    endpoint2.publish("http://localhost:7070/wfcontrol");*/
		} catch (Exception e) {
			System.err.println("Unable to start service: "+e.getMessage());
			e.printStackTrace();
		}

	}

}
