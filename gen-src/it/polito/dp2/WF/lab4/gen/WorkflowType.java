
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
 * <p>Java class for workflowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workflowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="action" type="{http://pad.polito.it/Workflow}actionType" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://pad.polito.it/Workflow}process"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workflowType", propOrder = {
    "actionOrProcess"
})
public class WorkflowType {

    @XmlElements({
        @XmlElement(name = "action", type = ActionType.class),
        @XmlElement(name = "process", namespace = "http://pad.polito.it/Workflow", type = ProcessType.class)
    })
    protected List<Object> actionOrProcess;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    
    public WorkflowType() {
        if (actionOrProcess == null) {
            actionOrProcess = new ArrayList<Object>();
        }
    }

    /**
     * Gets the value of the actionOrProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionOrProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionOrProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionType }
     * {@link ProcessType }
     * 
     * 
     */
    public List<Object> getActionOrProcess() {
        return this.actionOrProcess;
    }
    
    public void setActionOrProcess(Object obj) {
        if (obj != null) 
        	this.actionOrProcess.add(obj);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
