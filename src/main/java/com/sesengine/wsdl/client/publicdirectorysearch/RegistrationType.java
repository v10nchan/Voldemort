
package com.sesengine.wsdl.client.publicdirectorysearch;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegistrationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="Professional"/>
 *     &lt;enumeration value="Organization"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegistrationType", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model")
@XmlEnum
public enum RegistrationType {

    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("Professional")
    PROFESSIONAL("Professional"),
    @XmlEnumValue("Organization")
    ORGANIZATION("Organization");
    private final String value;

    RegistrationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegistrationType fromValue(String v) {
        for (RegistrationType c: RegistrationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
