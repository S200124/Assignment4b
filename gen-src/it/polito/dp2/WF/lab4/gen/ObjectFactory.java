
package it.polito.dp2.WF.lab4.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.polito.dp2.WF.lab4.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActionTypeFollowingActions_QNAME = new QName("", "followingActions");
    private final static QName _ActionTypeNestedWorkflow_QNAME = new QName("", "nestedWorkflow");
    private final static QName _ActionName_QNAME = new QName("http://pad.polito.it/Workflow", "actionName");
    private final static QName _Role_QNAME = new QName("http://pad.polito.it/Workflow", "role");
    private final static QName _Fault_QNAME = new QName("http://pad.polito.it/Workflow", "fault");
    private final static QName _Out_QNAME = new QName("http://pad.polito.it/Workflow", "out");
    private final static QName _WfInfo_QNAME = new QName("http://pad.polito.it/Workflow", "wfInfo");
    private final static QName _Process_QNAME = new QName("http://pad.polito.it/Workflow", "process");
    private final static QName _WorkflowName_QNAME = new QName("http://pad.polito.it/Workflow", "workflowName");
    private final static QName _ProcessID_QNAME = new QName("http://pad.polito.it/Workflow", "processID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.polito.dp2.WF.lab4.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessType }
     * 
     */
    public ProcessType createProcessType() {
        return new ProcessType();
    }

    /**
     * Create an instance of {@link GetProcessesType }
     * 
     */
    public GetProcessesType createGetProcessesType() {
        return new GetProcessesType();
    }

    /**
     * Create an instance of {@link GetWorkflowsType }
     * 
     */
    public GetWorkflowsType createGetWorkflowsType() {
        return new GetWorkflowsType();
    }

    /**
     * Create an instance of {@link NextActionType }
     * 
     */
    public NextActionType createNextActionType() {
        return new NextActionType();
    }

    /**
     * Create an instance of {@link TakeActionType }
     * 
     */
    public TakeActionType createTakeActionType() {
        return new TakeActionType();
    }

    /**
     * Create an instance of {@link WfInfoType }
     * 
     */
    public WfInfoType createWfInfoType() {
        return new WfInfoType();
    }

    /**
     * Create an instance of {@link FollowingActionsType }
     * 
     */
    public FollowingActionsType createFollowingActionsType() {
        return new FollowingActionsType();
    }

    /**
     * Create an instance of {@link ActionStatusType }
     * 
     */
    public ActionStatusType createActionStatusType() {
        return new ActionStatusType();
    }

    /**
     * Create an instance of {@link ActorType }
     * 
     */
    public ActorType createActorType() {
        return new ActorType();
    }

    /**
     * Create an instance of {@link ActionType }
     * 
     */
    public ActionType createActionType() {
        return new ActionType();
    }

    /**
     * Create an instance of {@link WorkflowType }
     * 
     */
    public WorkflowType createWorkflowType() {
        return new WorkflowType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FollowingActionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "followingActions", scope = ActionType.class)
    public JAXBElement<FollowingActionsType> createActionTypeFollowingActions(FollowingActionsType value) {
        return new JAXBElement<FollowingActionsType>(_ActionTypeFollowingActions_QNAME, FollowingActionsType.class, ActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nestedWorkflow", scope = ActionType.class)
    public JAXBElement<String> createActionTypeNestedWorkflow(String value) {
        return new JAXBElement<String>(_ActionTypeNestedWorkflow_QNAME, String.class, ActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/Workflow", name = "actionName")
    public JAXBElement<String> createActionName(String value) {
        return new JAXBElement<String>(_ActionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/Workflow", name = "role")
    public JAXBElement<String> createRole(String value) {
        return new JAXBElement<String>(_Role_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/Workflow", name = "fault")
    public JAXBElement<String> createFault(String value) {
        return new JAXBElement<String>(_Fault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/Workflow", name = "out")
    public JAXBElement<String> createOut(String value) {
        return new JAXBElement<String>(_Out_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WfInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/Workflow", name = "wfInfo")
    public JAXBElement<WfInfoType> createWfInfo(WfInfoType value) {
        return new JAXBElement<WfInfoType>(_WfInfo_QNAME, WfInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/Workflow", name = "process")
    public JAXBElement<ProcessType> createProcess(ProcessType value) {
        return new JAXBElement<ProcessType>(_Process_QNAME, ProcessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/Workflow", name = "workflowName")
    public JAXBElement<String> createWorkflowName(String value) {
        return new JAXBElement<String>(_WorkflowName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/Workflow", name = "processID")
    public JAXBElement<String> createProcessID(String value) {
        return new JAXBElement<String>(_ProcessID_QNAME, String.class, null, value);
    }

}
