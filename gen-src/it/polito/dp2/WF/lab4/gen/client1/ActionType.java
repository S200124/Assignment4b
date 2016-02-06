
package it.polito.dp2.WF.lab4.gen.client1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="followingActions" type="{http://pad.polito.it/xsd/Workflow}followingActionsType" form="qualified"/>
 *         &lt;element name="nestedWorkflow" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="automInst" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionType", namespace = "http://pad.polito.it/xsd/Workflow", propOrder = {
    "role",
    "followingActions",
    "nestedWorkflow"
})
public class ActionType {

    @XmlElement(required = true)
    protected String role;
    @XmlElement(required = true)
    protected FollowingActionsType followingActions;
    @XmlElement(required = true)
    protected String nestedWorkflow;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "automInst", required = true)
    protected boolean automInst;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the followingActions property.
     * 
     * @return
     *     possible object is
     *     {@link FollowingActionsType }
     *     
     */
    public FollowingActionsType getFollowingActions() {
        return followingActions;
    }

    /**
     * Sets the value of the followingActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FollowingActionsType }
     *     
     */
    public void setFollowingActions(FollowingActionsType value) {
        this.followingActions = value;
    }

    /**
     * Gets the value of the nestedWorkflow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNestedWorkflow() {
        return nestedWorkflow;
    }

    /**
     * Sets the value of the nestedWorkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNestedWorkflow(String value) {
        this.nestedWorkflow = value;
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
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
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
