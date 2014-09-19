
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
 *         &lt;element name="DNSCertLookupResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "dnsCertLookupResult"
})
@XmlRootElement(name = "DNSCertLookupResponse")
public class DNSCertLookupResponse {

    @XmlElementRef(name = "DNSCertLookupResult", namespace = "http://secureexchangesolutions.com/2011/Directory/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> dnsCertLookupResult;

    /**
     * Gets the value of the dnsCertLookupResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getDNSCertLookupResult() {
        return dnsCertLookupResult;
    }

    /**
     * Sets the value of the dnsCertLookupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setDNSCertLookupResult(JAXBElement<byte[]> value) {
        this.dnsCertLookupResult = value;
    }

}
