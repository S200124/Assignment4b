
package it.polito.dp2.WF.lab4.gen.client1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WorkflowSearching", targetNamespace = "http://pad.polito.it/ws/Workflow/", wsdlLocation = "http://localhost:7071/wfinfo?wsdl")
public class WorkflowSearching_Service
    extends Service
{

    private final static URL WORKFLOWSEARCHING_WSDL_LOCATION;
    private final static WebServiceException WORKFLOWSEARCHING_EXCEPTION;
    private final static QName WORKFLOWSEARCHING_QNAME = new QName("http://pad.polito.it/ws/Workflow/", "WorkflowSearching");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7071/wfinfo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WORKFLOWSEARCHING_WSDL_LOCATION = url;
        WORKFLOWSEARCHING_EXCEPTION = e;
    }

    public WorkflowSearching_Service() {
        super(__getWsdlLocation(), WORKFLOWSEARCHING_QNAME);
    }

    public WorkflowSearching_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WORKFLOWSEARCHING_QNAME, features);
    }

    public WorkflowSearching_Service(URL wsdlLocation) {
        super(wsdlLocation, WORKFLOWSEARCHING_QNAME);
    }

    public WorkflowSearching_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WORKFLOWSEARCHING_QNAME, features);
    }

    public WorkflowSearching_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WorkflowSearching_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WorkflowSearching
     */
    @WebEndpoint(name = "WorkflowSearchingPort")
    public WorkflowSearching getWorkflowSearchingPort() {
        return super.getPort(new QName("http://pad.polito.it/ws/Workflow/", "WorkflowSearchingPort"), WorkflowSearching.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WorkflowSearching
     */
    @WebEndpoint(name = "WorkflowSearchingPort")
    public WorkflowSearching getWorkflowSearchingPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://pad.polito.it/ws/Workflow/", "WorkflowSearchingPort"), WorkflowSearching.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WORKFLOWSEARCHING_EXCEPTION!= null) {
            throw WORKFLOWSEARCHING_EXCEPTION;
        }
        return WORKFLOWSEARCHING_WSDL_LOCATION;
    }

}
