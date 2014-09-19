
package com.sesengine.wsdl.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for State.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="State">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Received"/>
 *     &lt;enumeration value="Sending"/>
 *     &lt;enumeration value="Sent"/>
 *     &lt;enumeration value="MDNReceived"/>
 *     &lt;enumeration value="Draft"/>
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Read"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "State", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model")
@XmlEnum
public enum State {

    @XmlEnumValue("Received")
    RECEIVED("Received"),
    @XmlEnumValue("Sending")
    SENDING("Sending"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("MDNReceived")
    MDN_RECEIVED("MDNReceived"),
    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Read")
    READ("Read");
    private final String value;

    State(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static State fromValue(String v) {
        for (State c: State.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
