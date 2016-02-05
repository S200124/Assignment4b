
package it.polito.dp2.WF.lab4.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="actor" type="{http://pad.polito.it/Workflow}actorType" minOccurs="0"/>
 *         &lt;element ref="{http://pad.polito.it/Workflow}actionName"/>
 *       &lt;/choice>
 *       &lt;attribute name="terminatedAt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionStatusType", propOrder = {
    "actorOrActionName"
})
public class ActionStatusType {

    @XmlElements({
        @XmlElement(name = "actor", type = ActorType.class),
        @XmlElement(name = "actionName", namespace = "http://pad.polito.it/Workflow", type = String.class)
    })
    protected List<Object> actorOrActionName;
    @XmlAttribute(name = "terminatedAt")
    protected String terminatedAt;
    
    public ActionStatusType() {
        if (actorOrActionName == null) {
            actorOrActionName = new ArrayList<Object>();
        }
    }

    /**
     * Gets the value of the actorOrActionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actorOrActionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActorOrActionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActorType }
     * {@link String }
     * 
     * 
     */
    public List<Object> getActorOrActionName() {
        return this.actorOrActionName;
    }
    
    public void setActorOrActionName(Object obj) {
    	if(obj != null)
    		this.actorOrActionName.add(obj);
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
