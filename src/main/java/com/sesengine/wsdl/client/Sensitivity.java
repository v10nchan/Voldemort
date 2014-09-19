
package com.sesengine.wsdl.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sensitivity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Sensitivity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Confidential"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Sensitivity", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model")
@XmlEnum
public enum Sensitivity {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Confidential")
    CONFIDENTIAL("Confidential");
    private final String value;

    Sensitivity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Sensitivity fromValue(String v) {
        for (Sensitivity c: Sensitivity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
