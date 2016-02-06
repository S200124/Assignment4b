package it.polito.dp2.WF.sol4.client1;

import it.polito.dp2.WF.WorkflowMonitorException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;


public class Client {

	public static void main(String[] args) throws WorkflowMonitorException {
		System.setProperty("it.polito.dp2.WF.lab4.URL","http://localhost:7071/wfinfo");
		
		WorkflowMonitorFactory factory = new WorkflowMonitorFactory();
		WorkflowMonitor monitor = factory.newWorkflowMonitor();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		// Get the list of workflows
				Set<it.polito.dp2.WF.WorkflowReader> set = monitor.getWorkflows();
				
				/* Print the header of the table */
				System.out.println("#");
				System.out.println("#Number of Workflows: "+set.size());
				System.out.println("#");
				String header = new String("#List of workflows:");
				printHeader(header);	
				
				// For each workflow print related data
				for (it.polito.dp2.WF.WorkflowReader wfr: set) {
					System.out.println();
					System.out.println("Data for Workflow " + wfr.getName());
					System.out.println();

					// Print actions
					System.out.println("Actions:");
					Set<it.polito.dp2.WF.ActionReader> setAct = wfr.getActions();
					printHeader("Action Name\tRole\t\tAutom.Inst.\tSimple/Process\tWorkflow\tNext Possible Actions");
					for (it.polito.dp2.WF.ActionReader ar: setAct) {
						System.out.print(ar.getName()+"\t"+ar.getRole()+"\t"+ar.isAutomaticallyInstantiated()+"\t");
						if (ar instanceof SimpleActionReader) {
							System.out.print("\tSimple\t\t"+"-\t\t");
							// Print next actions
							Set<ActionReader> setNxt = ((SimpleActionReader)ar).getPossibleNextActions();
							for (ActionReader nAct: setNxt)
								System.out.print(nAct.getName()+" ");
							System.out.println();
						}
						else if (ar instanceof ProcessActionReader) {
							System.out.print("\tProcess\t\t");
							// print workflow
							System.out.println(((ProcessActionReader)ar).getActionWorkflow().getName());
						}
					}
					System.out.println("#");
				}	
				System.out.println("#End of Workflows");
				System.out.println("#");
				
				// Get the list of processes
				Set<it.polito.dp2.WF.ProcessReader> set2 = monitor.getProcesses();
				
				/* Print the header of the table */
				System.out.println("#");
				System.out.println("#Number of Processes: "+set.size());
				System.out.println("#");
				header = new String("#List of processes:");
				printHeader(header);
				
				// For each process print related data
				for (it.polito.dp2.WF.ProcessReader wfr: set2) {
					System.out.println("Process started at " + 
										dateFormat.format(wfr.getStartTime().getTime()) +
							            " "+"- Workflow " + wfr.getWorkflow().getName());
					System.out.println("Status:");
					List<it.polito.dp2.WF.ActionStatusReader> statusSet = wfr.getStatus();
					printHeader("Action Name\tTaken in charge by\tTerminated");
					for (it.polito.dp2.WF.ActionStatusReader asr : statusSet) {
						System.out.print(asr.getActionName()+"\t");
						if (asr.isTakenInCharge())
							System.out.print(asr.getActor().getName()+"\t\t");
						else
							System.out.print("-"+"\t\t\t");
						if (asr.isTerminated())
							System.out.println(dateFormat.format(asr.getTerminationTime().getTime()));
						else
							System.out.println("-");
					}
					System.out.println("#");
				}
				System.out.println("#End of Processes");
				System.out.println("#");
	}
	
	private static void printHeader(String header) {
		StringBuffer line = new StringBuffer(132);
		
		for (int i = 0; i < 132; ++i) {
			line.append('-');
		}
		
		System.out.println(header);
		System.out.println(line);
	}
}
