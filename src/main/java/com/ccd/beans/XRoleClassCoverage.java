//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.22 at 05:14:23 PM IST 
//


package com.ccd.beans;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for x_RoleClassCoverage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassCoverage">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="COVPTY"/>
 *     &lt;enumeration value="POLHOLD"/>
 *     &lt;enumeration value="SPNSR"/>
 *     &lt;enumeration value="UNDWRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum XRoleClassCoverage {

    COVPTY,
    POLHOLD,
    SPNSR,
    UNDWRT;

    public String value() {
        return name();
    }

    public static XRoleClassCoverage fromValue(String v) {
        return valueOf(v);
    }

}
