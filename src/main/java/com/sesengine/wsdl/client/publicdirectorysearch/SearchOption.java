
package com.sesengine.wsdl.client.publicdirectorysearch;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FullName"/>
 *     &lt;enumeration value="NPI"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="AccountType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchOption", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model")
@XmlEnum
public enum SearchOption {

    @XmlEnumValue("FullName")
    FULL_NAME("FullName"),
    NPI("NPI"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("AccountType")
    ACCOUNT_TYPE("AccountType");
    private final String value;

    SearchOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchOption fromValue(String v) {
        for (SearchOption c: SearchOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
