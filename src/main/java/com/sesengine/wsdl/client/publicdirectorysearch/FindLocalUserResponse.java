
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
 *         &lt;element name="FindLocalUserResult" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}ArrayOfSesAddress" minOccurs="0"/>
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
    "findLocalUserResult"
})
@XmlRootElement(name = "FindLocalUserResponse")
public class FindLocalUserResponse {

    @XmlElementRef(name = "FindLocalUserResult", namespace = "http://secureexchangesolutions.com/2011/Directory/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSesAddress> findLocalUserResult;

    /**
     * Gets the value of the findLocalUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSesAddress> getFindLocalUserResult() {
        return findLocalUserResult;
    }

    /**
     * Sets the value of the findLocalUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}
     *     
     */
    public void setFindLocalUserResult(JAXBElement<ArrayOfSesAddress> value) {
        this.findLocalUserResult = value;
    }

}
