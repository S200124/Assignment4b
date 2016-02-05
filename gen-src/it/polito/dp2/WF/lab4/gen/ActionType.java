
package it.polito.dp2.WF.lab4.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://pad.polito.it/Workflow}role"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="followingActions" type="{http://pad.polito.it/Workflow}followingActionsType"/>
 *           &lt;element name="nestedWorkflow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://pad.polito.it/Workflow}typeEnumType" />
 *       &lt;attribute name="automInst" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionType", propOrder = {
    "roleOrFollowingActionsOrNestedWorkflow"
})
public class ActionType {

    @XmlElements({
        @XmlElement(name = "nestedWorkflow", type = String.class, required = false),
        @XmlElement(name = "followingActions", type = FollowingActionsType.class, required = false),
        @XmlElement(name = "role", namespace = "http://pad.polito.it/Workflow", type = String.class, required = false)
    })
    protected List<Object> roleOrFollowingActionsOrNestedWorkflow;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "type", required = true)
    protected TypeEnumType type;
    @XmlAttribute(name = "automInst", required = true)
    protected boolean automInst;
    
    public ActionType() {
        if (roleOrFollowingActionsOrNestedWorkflow == null) {
            roleOrFollowingActionsOrNestedWorkflow = new ArrayList<Object>();
        }
    }

    /**
     * Gets the value of the roleOrFollowingActionsOrNestedWorkflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleOrFollowingActionsOrNestedWorkflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleOrFollowingActionsOrNestedWorkflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FollowingActionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Object> getRoleOrFollowingActionsOrNestedWorkflow() {
        return this.roleOrFollowingActionsOrNestedWorkflow;
    }
    
    public void setRoleOrFollowingActionsOrNestedWorkflow(Object obj) {
        if (obj != null)
        	this.roleOrFollowingActionsOrNestedWorkflow.add(obj);
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

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeEnumType }
     *     
     */
    public TypeEnumType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEnumType }
     *     
     */
    public void setType(TypeEnumType value) {
        this.type = value;
    }

    /**
     * Gets the value of the automInst property.
     * 
     */
    public boolean isAutomInst() {
        return automInst;
    }

    /**
     * Sets the value of the automInst property.
     * 
     */
    public void setAutomInst(boolean value) {
        this.automInst = value;
    }

}
