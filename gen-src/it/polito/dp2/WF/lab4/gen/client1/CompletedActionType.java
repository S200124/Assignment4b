
package it.polito.dp2.WF.lab4.gen.client1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for completedActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="completedActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionStatus" type="{http://pad.polito.it/xsd/Workflow}actionStatusType" form="qualified"/>
 *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "completedActionType", namespace = "http://pad.polito.it/xsd/Workflow", propOrder = {
    "actionStatus",
    "actionName"
})
public class CompletedActionType {

    @XmlElement(required = true)
    protected ActionStatusType actionStatus;
    @XmlElement(required = true)
    protected String actionName;

    /**
     * Gets the value of the actionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatusType }
     *     
     */
    public ActionStatusType getActionStatus() {
        return actionStatus;
    }

    /**
     * Sets the value of the actionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatusType }
     *     
     */
    public void setActionStatus(ActionStatusType value) {
        this.actionStatus = value;
    }

    /**
     * Gets the value of the actionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Sets the value of the actionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

}
