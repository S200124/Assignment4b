
package it.polito.dp2.WF.lab4.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="followingActions" type="{http://pad.polito.it/xsd/Workflow}followingActionsType"/>
 *         &lt;element name="nestedWorkflow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
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

}
