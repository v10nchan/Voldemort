
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
 *         &lt;element name="GetMessageResult" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}SesMessage" minOccurs="0"/>
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
    "getMessageResult"
})
@XmlRootElement(name = "GetMessageResponse")
public class GetMessageResponse {

    @XmlElementRef(name = "GetMessageResult", namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", type = JAXBElement.class)
    protected JAXBElement<SesMessage> getMessageResult;

    /**
     * Gets the value of the getMessageResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SesMessage }{@code >}
     *     
     */
    public JAXBElement<SesMessage> getGetMessageResult() {
        return getMessageResult;
    }

    /**
     * Sets the value of the getMessageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SesMessage }{@code >}
     *     
     */
    public void setGetMessageResult(JAXBElement<SesMessage> value) {
        this.getMessageResult = ((JAXBElement<SesMessage> ) value);
    }

}
