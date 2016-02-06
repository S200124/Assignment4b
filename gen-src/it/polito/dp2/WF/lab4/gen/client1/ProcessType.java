
package it.polito.dp2.WF.lab4.gen.client1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionStatus" type="{http://pad.polito.it/xsd/Workflow}actionStatusType" maxOccurs="unbounded" form="qualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="startAt" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processType", namespace = "http://pad.polito.it/xsd/Workflow", propOrder = {
    "actionStatus"
})
public class ProcessType {

    @XmlElement(required = true)
    protected List<ActionStatusType> actionStatus;
    @XmlAttribute(name = "startAt", required = true)
    protected String startAt;

    /**
     * Gets the value of the actionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionStatusType }
     * 
     * 
     */
    public List<ActionStatusType> getActionStatus() {
        if (actionStatus == null) {
            actionStatus = new ArrayList<ActionStatusType>();
        }
        return this.actionStatus;
    }

    /**
     * Gets the value of the startAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAt() {
        return startAt;
    }

    /**
     * Sets the value of the startAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAt(String value) {
        this.startAt = value;
    }

}
