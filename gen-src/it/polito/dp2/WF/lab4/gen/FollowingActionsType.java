
package it.polito.dp2.WF.lab4.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for followingActionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="followingActionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://pad.polito.it/Workflow}actionName" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "followingActionsType", propOrder = {
    "actionName"
})
public class FollowingActionsType {

    @XmlElement(namespace = "http://pad.polito.it/Workflow", required = true)
    protected List<String> actionName;
    
    public FollowingActionsType(){
        if (actionName == null) {
            actionName = new ArrayList<String>();
        }
    }

    /**
     * Gets the value of the actionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActionName() {
        return this.actionName;
    }
    
    public void setActionName(String str) {
    	if(str != null)
    		this.actionName.add(str);
    }

}
