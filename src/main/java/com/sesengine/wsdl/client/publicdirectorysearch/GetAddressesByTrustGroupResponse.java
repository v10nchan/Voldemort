
package com.sesengine.wsdl.client.publicdirectorysearch;

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
 *         &lt;element name="GetAddressesByTrustGroupResult" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}ArrayOfSesAddress" minOccurs="0"/>
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
    "getAddressesByTrustGroupResult"
})
@XmlRootElement(name = "GetAddressesByTrustGroupResponse")
public class GetAddressesByTrustGroupResponse {

    @XmlElementRef(name = "GetAddressesByTrustGroupResult", namespace = "http://secureexchangesolutions.com/2011/Directory/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSesAddress> getAddressesByTrustGroupResult;

    /**
     * Gets the value of the getAddressesByTrustGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSesAddress> getGetAddressesByTrustGroupResult() {
        return getAddressesByTrustGroupResult;
    }

    /**
     * Sets the value of the getAddressesByTrustGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}
     *     
     */
    public void setGetAddressesByTrustGroupResult(JAXBElement<ArrayOfSesAddress> value) {
        this.getAddressesByTrustGroupResult = value;
    }

}
