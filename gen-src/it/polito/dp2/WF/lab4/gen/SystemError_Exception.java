
package it.polito.dp2.WF.lab4.gen;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "systemError", targetNamespace = "http://pad.polito.it/ws/Workflow/")
public class SystemError_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SystemError faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public SystemError_Exception(String message, SystemError faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public SystemError_Exception(String message, SystemError faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: it.polito.dp2.WF.lab4.gen.SystemError
     */
    public SystemError getFaultInfo() {
        return faultInfo;
    }

}