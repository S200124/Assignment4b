
package it.polito.dp2.WF.lab4.gen.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.polito.dp2.WF.lab4.gen.server package. 
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

    private final static QName _TakeAction_QNAME = new QName("http://pad.polito.it/ws/Workflow/", "takeAction");
    private final static QName _TakeActionResponse_QNAME = new QName("http://pad.polito.it/ws/Workflow/", "takeActionResponse");
    private final static QName _GetProcesses_QNAME = new QName("http://pad.polito.it/ws/Workflow/", "getProcesses");
    private final static QName _GetWorkflowsResponse_QNAME = new QName("http://pad.polito.it/ws/Workflow/", "getWorkflowsResponse");
    private final static QName _GetWorkflows_QNAME = new QName("http://pad.polito.it/ws/Workflow/", "getWorkflows");
    private final static QName _CreateProcess_QNAME = new QName("http://pad.polito.it/ws/Workflow/", "createProcess");
    private final static QName _AlreadyTakenOrDifferentRoleError_QNAME = new QName("http://pad.polito.it/ws/Workflow/", "AlreadyTakenOrDifferentRoleError");
    private final static QName _CompleteAction_QNAME = new QName("http://pad.polito.it/ws/Workflow/", "completeAction");
    private final static QName _CreateProcessResponse_QNAME = new QName("http://pad.polito.it/ws/Workflow/", "createProcessResponse");
    private final static QName _GetProcessesResponse_QNAME = new QName("http://pad.polito.it/ws/Workflow/", "getProcessesResponse");
    private final static QName _CompleteActionResponse_QNAME = new QName("http://pad.polito.it/ws/Workflow/", "completeActionResponse");
    private final static QName _SystemError_QNAME = new QName("http://pad.polito.it/ws/Workflow/", "systemError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.polito.dp2.WF.lab4.gen.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SystemError }
     * 
     */
    public SystemError createSystemError() {
        return new SystemError();
    }

    /**
     * Create an instance of {@link CompleteActionResponse }
     * 
     */
    public CompleteActionResponse createCompleteActionResponse() {
        return new CompleteActionResponse();
    }

    /**
     * Create an instance of {@link GetProcessesResponse }
     * 
     */
    public GetProcessesResponse createGetProcessesResponse() {
        return new GetProcessesResponse();
    }

    /**
     * Create an instance of {@link CompleteAction }
     * 
     */
    public CompleteAction createCompleteAction() {
        return new CompleteAction();
    }

    /**
     * Create an instance of {@link CreateProcessResponse }
     * 
     */
    public CreateProcessResponse createCreateProcessResponse() {
        return new CreateProcessResponse();
    }

    /**
     * Create an instance of {@link GetWorkflows }
     * 
     */
    public GetWorkflows createGetWorkflows() {
        return new GetWorkflows();
    }

    /**
     * Create an instance of {@link AlreadyTakenOrDifferentRoleError }
     * 
     */
    public AlreadyTakenOrDifferentRoleError createAlreadyTakenOrDifferentRoleError() {
        return new AlreadyTakenOrDifferentRoleError();
    }

    /**
     * Create an instance of {@link CreateProcess }
     * 
     */
    public CreateProcess createCreateProcess() {
        return new CreateProcess();
    }

    /**
     * Create an instance of {@link GetWorkflowsResponse }
     * 
     */
    public GetWorkflowsResponse createGetWorkflowsResponse() {
        return new GetWorkflowsResponse();
    }

    /**
     * Create an instance of {@link TakeActionResponse }
     * 
     */
    public TakeActionResponse createTakeActionResponse() {
        return new TakeActionResponse();
    }

    /**
     * Create an instance of {@link TakeAction }
     * 
     */
    public TakeAction createTakeAction() {
        return new TakeAction();
    }

    /**
     * Create an instance of {@link GetProcesses }
     * 
     */
    public GetProcesses createGetProcesses() {
        return new GetProcesses();
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
     * Create an instance of {@link ProcessType }
     * 
     */
    public ProcessType createProcessType() {
        return new ProcessType();
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
     * Create an instance of {@link TakenOverActionType }
     * 
     */
    public TakenOverActionType createTakenOverActionType() {
        return new TakenOverActionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TakeAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/ws/Workflow/", name = "takeAction")
    public JAXBElement<TakeAction> createTakeAction(TakeAction value) {
        return new JAXBElement<TakeAction>(_TakeAction_QNAME, TakeAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TakeActionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/ws/Workflow/", name = "takeActionResponse")
    public JAXBElement<TakeActionResponse> createTakeActionResponse(TakeActionResponse value) {
        return new JAXBElement<TakeActionResponse>(_TakeActionResponse_QNAME, TakeActionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProcesses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/ws/Workflow/", name = "getProcesses")
    public JAXBElement<GetProcesses> createGetProcesses(GetProcesses value) {
        return new JAXBElement<GetProcesses>(_GetProcesses_QNAME, GetProcesses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkflowsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/ws/Workflow/", name = "getWorkflowsResponse")
    public JAXBElement<GetWorkflowsResponse> createGetWorkflowsResponse(GetWorkflowsResponse value) {
        return new JAXBElement<GetWorkflowsResponse>(_GetWorkflowsResponse_QNAME, GetWorkflowsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkflows }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/ws/Workflow/", name = "getWorkflows")
    public JAXBElement<GetWorkflows> createGetWorkflows(GetWorkflows value) {
        return new JAXBElement<GetWorkflows>(_GetWorkflows_QNAME, GetWorkflows.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/ws/Workflow/", name = "createProcess")
    public JAXBElement<CreateProcess> createCreateProcess(CreateProcess value) {
        return new JAXBElement<CreateProcess>(_CreateProcess_QNAME, CreateProcess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlreadyTakenOrDifferentRoleError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/ws/Workflow/", name = "AlreadyTakenOrDifferentRoleError")
    public JAXBElement<AlreadyTakenOrDifferentRoleError> createAlreadyTakenOrDifferentRoleError(AlreadyTakenOrDifferentRoleError value) {
        return new JAXBElement<AlreadyTakenOrDifferentRoleError>(_AlreadyTakenOrDifferentRoleError_QNAME, AlreadyTakenOrDifferentRoleError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/ws/Workflow/", name = "completeAction")
    public JAXBElement<CompleteAction> createCompleteAction(CompleteAction value) {
        return new JAXBElement<CompleteAction>(_CompleteAction_QNAME, CompleteAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/ws/Workflow/", name = "createProcessResponse")
    public JAXBElement<CreateProcessResponse> createCreateProcessResponse(CreateProcessResponse value) {
        return new JAXBElement<CreateProcessResponse>(_CreateProcessResponse_QNAME, CreateProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProcessesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/ws/Workflow/", name = "getProcessesResponse")
    public JAXBElement<GetProcessesResponse> createGetProcessesResponse(GetProcessesResponse value) {
        return new JAXBElement<GetProcessesResponse>(_GetProcessesResponse_QNAME, GetProcessesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteActionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/ws/Workflow/", name = "completeActionResponse")
    public JAXBElement<CompleteActionResponse> createCompleteActionResponse(CompleteActionResponse value) {
        return new JAXBElement<CompleteActionResponse>(_CompleteActionResponse_QNAME, CompleteActionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/ws/Workflow/", name = "systemError")
    public JAXBElement<SystemError> createSystemError(SystemError value) {
        return new JAXBElement<SystemError>(_SystemError_QNAME, SystemError.class, null, value);
    }

}
