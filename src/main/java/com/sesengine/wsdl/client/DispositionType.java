
package com.sesengine.wsdl.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DispositionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DispositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dispatched"/>
 *     &lt;enumeration value="Displayed"/>
 *     &lt;enumeration value="Processed"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DispositionType", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model")
@XmlEnum
public enum DispositionType {

    @XmlEnumValue("Dispatched")
    DISPATCHED("Dispatched"),
    @XmlEnumValue("Displayed")
    DISPLAYED("Displayed"),
    @XmlEnumValue("Processed")
    PROCESSED("Processed"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    DispositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DispositionType fromValue(String v) {
        for (DispositionType c: DispositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
