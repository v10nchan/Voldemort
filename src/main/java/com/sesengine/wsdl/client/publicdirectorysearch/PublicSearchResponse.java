
package com.sesengine.wsdl.client.publicdirectorysearch;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="KeyWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NPINumber" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://schemas.datacontract.org/2004/07/Ses.Directory.Model}Address" minOccurs="0"/>
 *         &lt;element name="RegistrationType" type="{http://schemas.datacontract.org/2004/07/Ses.Directory.Model}RegistrationType" minOccurs="0"/>
 *         &lt;element name="SecureEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Specialty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateLicenses" type="{http://schemas.datacontract.org/2004/07/Ses.Directory.Model}ArrayOfStateLicense" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicSearchResponse", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", propOrder = {
    "id",
    "keyWord",
    "npiNumber",
    "name",
    "primaryAddress",
    "registrationType",
    "secureEmail",
    "specialty",
    "stateLicenses",
    "title"
})
public class PublicSearchResponse {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "KeyWord", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keyWord;
    @XmlElementRef(name = "NPINumber", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> npiNumber;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "PrimaryAddress", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> primaryAddress;
    @XmlElement(name = "RegistrationType")
    protected RegistrationType registrationType;
    @XmlElementRef(name = "SecureEmail", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secureEmail;
    @XmlElementRef(name = "Specialty", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialty;
    @XmlElementRef(name = "StateLicenses", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStateLicense> stateLicenses;
    @XmlElementRef(name = "Title", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;

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
     * Gets the value of the keyWord property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeyWord() {
        return keyWord;
    }

    /**
     * Sets the value of the keyWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeyWord(JAXBElement<String> value) {
        this.keyWord = value;
    }

    /**
     * Gets the value of the npiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getNPINumber() {
        return npiNumber;
    }

    /**
     * Sets the value of the npiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setNPINumber(JAXBElement<ArrayOfstring> value) {
        this.npiNumber = value;
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
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setPrimaryAddress(JAXBElement<Address> value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationType }
     *     
     */
    public RegistrationType getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationType }
     *     
     */
    public void setRegistrationType(RegistrationType value) {
        this.registrationType = value;
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
     * Gets the value of the specialty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialty() {
        return specialty;
    }

    /**
     * Sets the value of the specialty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialty(JAXBElement<String> value) {
        this.specialty = value;
    }

    /**
     * Gets the value of the stateLicenses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStateLicense }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStateLicense> getStateLicenses() {
        return stateLicenses;
    }

    /**
     * Sets the value of the stateLicenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStateLicense }{@code >}
     *     
     */
    public void setStateLicenses(JAXBElement<ArrayOfStateLicense> value) {
        this.stateLicenses = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

}
