
package com.sesengine.wsdl.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="GetMessageHeaderResult" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}SesHeader" minOccurs="0"/>
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
    "getMessageHeaderResult"
})
@XmlRootElement(name = "GetMessageHeaderResponse")
public class GetMessageHeaderResponse {

    @XmlElementRef(name = "GetMessageHeaderResult", namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", type = JAXBElement.class)
    protected JAXBElement<SesHeader> getMessageHeaderResult;

    /**
     * Gets the value of the getMessageHeaderResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SesHeader }{@code >}
     *     
     */
    public JAXBElement<SesHeader> getGetMessageHeaderResult() {
        return getMessageHeaderResult;
    }

    /**
     * Sets the value of the getMessageHeaderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SesHeader }{@code >}
     *     
     */
    public void setGetMessageHeaderResult(JAXBElement<SesHeader> value) {
        this.getMessageHeaderResult = ((JAXBElement<SesHeader> ) value);
    }

}
