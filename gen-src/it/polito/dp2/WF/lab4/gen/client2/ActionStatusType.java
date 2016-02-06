
package it.polito.dp2.WF.lab4.gen.client2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actionStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actor" type="{http://pad.polito.it/xsd/Workflow}actorType" minOccurs="0" form="qualified"/>
 *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="terminatedAt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionStatusType", namespace = "http://pad.polito.it/xsd/Workflow", propOrder = {
    "actor",
    "actionName"
})
public class ActionStatusType {

    protected ActorType actor;
    @XmlElement(required = true)
    protected String actionName;
    @XmlAttribute(name = "terminatedAt")
    protected String terminatedAt;

    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link ActorType }
     *     
     */
    public ActorType getActor() {
        return actor;
    }

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActorType }
     *     
     */
    public void setActor(ActorType value) {
        this.actor = value;
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

    /**
     * Gets the value of the terminatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminatedAt() {
        return terminatedAt;
    }

    /**
     * Sets the value of the terminatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminatedAt(String value) {
        this.terminatedAt = value;
    }

}
