
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
 *         &lt;element name="GetMessageListResult" type="{http://schemas.datacontract.org/2004/07/Ses.Core.model}ArrayOfMessageSummary" minOccurs="0"/>
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
    "getMessageListResult"
})
@XmlRootElement(name = "GetMessageListResponse")
public class GetMessageListResponse {

    @XmlElementRef(name = "GetMessageListResult", namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfMessageSummary> getMessageListResult;

    /**
     * Gets the value of the getMessageListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMessageSummary }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMessageSummary> getGetMessageListResult() {
        return getMessageListResult;
    }

    /**
     * Sets the value of the getMessageListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMessageSummary }{@code >}
     *     
     */
    public void setGetMessageListResult(JAXBElement<ArrayOfMessageSummary> value) {
        this.getMessageListResult = ((JAXBElement<ArrayOfMessageSummary> ) value);
    }

}
