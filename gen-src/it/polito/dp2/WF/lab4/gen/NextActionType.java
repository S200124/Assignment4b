
package it.polito.dp2.WF.lab4.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NextActionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nextActionName"
})
@XmlRootElement(name = "nextActionType")
public class NextActionType {

    @XmlElement(name = "NextActionName", required = true)
    protected String nextActionName;

    /**
     * Gets the value of the nextActionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextActionName() {
        return nextActionName;
    }

    /**
     * Sets the value of the nextActionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextActionName(String value) {
        this.nextActionName = value;
    }

}
