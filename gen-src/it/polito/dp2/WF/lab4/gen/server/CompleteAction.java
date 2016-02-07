
package it.polito.dp2.WF.lab4.gen.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for completeAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="completeAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="completedAction" type="{http://pad.polito.it/xsd/Workflow}completedActionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "completeAction", propOrder = {
    "completedAction"
})
public class CompleteAction {

    @XmlElement(namespace = "", required = true)
    protected CompletedActionType completedAction;

    /**
     * Gets the value of the completedAction property.
     * 
     * @return
     *     possible object is
     *     {@link CompletedActionType }
     *     
     */
    public CompletedActionType getCompletedAction() {
        return completedAction;
    }

    /**
     * Sets the value of the completedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedActionType }
     *     
     */
    public void setCompletedAction(CompletedActionType value) {
        this.completedAction = value;
    }

}
