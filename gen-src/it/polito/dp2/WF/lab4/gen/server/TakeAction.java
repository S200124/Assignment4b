
package it.polito.dp2.WF.lab4.gen.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for takeAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="takeAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="takenOverAction" type="{http://pad.polito.it/xsd/Workflow}takenOverActionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "takeAction", propOrder = {
    "takenOverAction"
})
public class TakeAction {

    @XmlElement(namespace = "", required = true)
    protected TakenOverActionType takenOverAction;

    /**
     * Gets the value of the takenOverAction property.
     * 
     * @return
     *     possible object is
     *     {@link TakenOverActionType }
     *     
     */
    public TakenOverActionType getTakenOverAction() {
        return takenOverAction;
    }

    /**
     * Sets the value of the takenOverAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakenOverActionType }
     *     
     */
    public void setTakenOverAction(TakenOverActionType value) {
        this.takenOverAction = value;
    }

}
