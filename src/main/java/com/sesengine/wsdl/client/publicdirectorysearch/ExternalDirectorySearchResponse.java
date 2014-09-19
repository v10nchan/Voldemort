
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
 *         &lt;element name="ExternalDirectorySearchResult" type="{http://schemas.datacontract.org/2004/07/Ses.Directory.Model}ArrayOfExternalSearchResponse" minOccurs="0"/>
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
    "externalDirectorySearchResult"
})
@XmlRootElement(name = "ExternalDirectorySearchResponse")
public class ExternalDirectorySearchResponse {

    @XmlElementRef(name = "ExternalDirectorySearchResult", namespace = "http://secureexchangesolutions.com/2011/Directory/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExternalSearchResponse> externalDirectorySearchResult;

    /**
     * Gets the value of the externalDirectorySearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExternalSearchResponse }{@code >}
     *     
     */
    public JAXBElement<ArrayOfExternalSearchResponse> getExternalDirectorySearchResult() {
        return externalDirectorySearchResult;
    }

    /**
     * Sets the value of the externalDirectorySearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExternalSearchResponse }{@code >}
     *     
     */
    public void setExternalDirectorySearchResult(JAXBElement<ArrayOfExternalSearchResponse> value) {
        this.externalDirectorySearchResult = value;
    }

}
