
package it.polito.dp2.WF.lab4.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="simple"/>
 *     &lt;enumeration value="process"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeEnumType")
@XmlEnum
public enum TypeEnumType {

    @XmlEnumValue("simple")
    SIMPLE("simple"),
    @XmlEnumValue("process")
    PROCESS("process");
    private String value;

    TypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeEnumType fromValue(String v) {
        for (TypeEnumType c: TypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
