package it.polito.dp2.WF.sol4.client2;

import it.polito.dp2.WF.lab4.gen.client1.*;
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
			url = new URL("http://localhost:7070/wfcontrol");
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
				try {/*
					it.polito.dp2.WF.lab4.gen.client2.ActorType act = new it.polito.dp2.WF.lab4.gen.client2.ActorType();
					it.polito.dp2.WF.lab4.gen.client2.TakenOverActionType toat = new it.polito.dp2.WF.lab4.gen.client2.TakenOverActionType();
					
					act.setName("Ciccio Pasticcio");
					act.setRole("Editor");
					
					toat.setProcessID("ArticleProduction-5");
					toat.setActionName("Publication");
					toat.setActor(act);
					try {
						System.out.println(proxy.takeAction(toat).getActionStatusID());
					} catch (AlreadyTakenOrDifferentRoleErrorException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
					
					//Complete Action
					it.polito.dp2.WF.lab4.gen.client2.ActorType act = new it.polito.dp2.WF.lab4.gen.client2.ActorType();
					it.polito.dp2.WF.lab4.gen.client2.ActionStatusType ast = new it.polito.dp2.WF.lab4.gen.client2.ActionStatusType();
					it.polito.dp2.WF.lab4.gen.client2.CompletedActionType cat = new it.polito.dp2.WF.lab4.gen.client2.CompletedActionType();
					
					act.setName("Andrea White");
					act.setRole("Editor");
					
					ast.setActionName("Writing");
					ast.setActionStatusID("ArticleProduction-3");
					ast.setActor(act);
					
					cat.setActionName("");
					cat.setActionStatus(ast);
					
					proxy.completeAction(cat);
				} catch (it.polito.dp2.WF.lab4.gen.client2.SystemErrorException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					statusCode = 1;
				}
				statusCode = 0;
				checkResult();
			}
		}
		System.exit(statusCode);
	}
	
	private static void checkResult() {
		URL url;
		
		try {
			url = new URL("http://localhost:7071/wfinfo");
		} catch (MalformedURLException e) {
			url = null;
		}
		
		if(url != null)
		{	
			WorkflowSearching proxy;
			try {
				WorkflowSearching_Service service = new WorkflowSearching_Service(url);
				proxy = service.getWorkflowSearchingPort();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				proxy = null;
			}
			
			if(proxy != null)
			{
				try {
					for(it.polito.dp2.WF.lab4.gen.client1.ProcessType pt:proxy.getProcesses())
					{
						System.out.println("*************" + pt.getProcessID() + "*************" + pt.getWorkflowName() + "*************");
						for(it.polito.dp2.WF.lab4.gen.client1.ActionStatusType ast:pt.getActionStatus())
						{
							String str;
							try {
								str = ast.getTerminatedAt() + ", " + ast.getActor().getName() + " (" + ast.getActor().getRole() + ")";
							}
							catch(Exception ex) {
								str = "";
							}
							System.out.println(ast.getActionStatusID() + ", " + ast.getActionName() + ", " + str);
						}
						 
						System.out.println("--------------------------------------------------------------");
					}
				} catch (it.polito.dp2.WF.lab4.gen.client1.SystemErrorException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
