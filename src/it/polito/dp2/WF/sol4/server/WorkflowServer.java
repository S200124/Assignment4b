package it.polito.dp2.WF.sol4.server;

import it.polito.dp2.WF.lab4.gen.ProcessType;
import it.polito.dp2.WF.lab4.gen.WfInfoType;
import it.polito.dp2.WF.lab4.gen.WorkflowType;

import javax.xml.ws.Endpoint;

public class WorkflowServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			WorkflowSearchingImpl wsi = new WorkflowSearchingImpl();
			//Endpoint.publish("http://localhost:7070/wfcontrol", wsi);
			WfInfoType wfit = wsi.getWorkflows(null);
			for(WorkflowType wft:wfit.getWorkflow())
			{
				System.out.println(wft.getName());
				for(ProcessType pt:wsi.getProcesses(wft.getName()).getProcess())
					System.out.println(pt.getStartAt());
			}
		}
		catch(Exception ex)
		{
			System.err.println("Initialization Failed!!!");
			ex.printStackTrace();
			System.exit(-1);
		}
		
	}

}
