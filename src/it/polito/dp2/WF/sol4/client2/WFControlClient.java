package it.polito.dp2.WF.sol4.client2;

import it.polito.dp2.WF.lab4.gen.client2.*;

import java.net.MalformedURLException;
import java.net.URL;

public class WFControlClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		URL url;
		Integer statusCode = 2;
		
		try {
			url = new URL(args[0]);
		} catch (MalformedURLException e) {
			url = null;
		}
		
		if(url != null)
		{	
			WorkflowManaging proxy;
			try {
				WorkflowManaging_Service service = new WorkflowManaging_Service(url);
				proxy = service.getWorkflowManagingPort();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				proxy = null;
			}
			
			if(proxy != null)
			{
				System.out.println("Ready to invoke remote operation...");
				try {
					proxy.createProcess(args[1]);
				} catch (SystemErrorException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					statusCode = 1;
				}
				statusCode = 0;
				System.out.println("...done!");
			}
		}
		System.exit(statusCode);
	}

}
