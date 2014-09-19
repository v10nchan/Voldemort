
package com.sesengine.wsdl.client.publicdirectorysearch;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DirectorySource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HISPOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://schemas.datacontract.org/2004/07/Ses.Directory.Model}AddressDetail" minOccurs="0"/>
 *         &lt;element name="SecureEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speciality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalSearchResponse", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", propOrder = {
    "directorySource",
    "emailContact",
    "hispOrganization",
    "id",
    "npi",
    "name",
    "organization",
    "primaryAddress",
    "secureEmail",
    "speciality"
})
public class ExternalSearchResponse {

    @XmlElementRef(name = "DirectorySource", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> directorySource;
    @XmlElementRef(name = "EmailContact", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailContact;
    @XmlElementRef(name = "HISPOrganization", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hispOrganization;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "NPI", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> npi;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Organization", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organization;
    @XmlElementRef(name = "PrimaryAddress", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressDetail> primaryAddress;
    @XmlElementRef(name = "SecureEmail", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secureEmail;
    @XmlElementRef(name = "Speciality", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> speciality;

    /**
     * Gets the value of the directorySource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirectorySource() {
        return directorySource;
    }

    /**
     * Sets the value of the directorySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirectorySource(JAXBElement<String> value) {
        this.directorySource = value;
    }

    /**
     * Gets the value of the emailContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailContact() {
        return emailContact;
    }

    /**
     * Sets the value of the emailContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailContact(JAXBElement<String> value) {
        this.emailContact = value;
    }

    /**
     * Gets the value of the hispOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHISPOrganization() {
        return hispOrganization;
    }

    /**
     * Sets the value of the hispOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHISPOrganization(JAXBElement<String> value) {
        this.hispOrganization = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the npi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNPI() {
        return npi;
    }

    /**
     * Sets the value of the npi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNPI(JAXBElement<String> value) {
        this.npi = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganization(JAXBElement<String> value) {
        this.organization = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressDetail }{@code >}
     *     
     */
    public JAXBElement<AddressDetail> getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressDetail }{@code >}
     *     
     */
    public void setPrimaryAddress(JAXBElement<AddressDetail> value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the secureEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecureEmail() {
        return secureEmail;
    }

    /**
     * Sets the value of the secureEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecureEmail(JAXBElement<String> value) {
        this.secureEmail = value;
    }

    /**
     * Gets the value of the speciality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpeciality() {
        return speciality;
    }

    /**
     * Sets the value of the speciality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpeciality(JAXBElement<String> value) {
        this.speciality = value;
    }

}
