
package com.sesengine.wsdl.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiveRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiveRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArchiveMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AuthenticationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="DeleteMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MessageUid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StateFlag" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}State" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiveRequest", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", propOrder = {
    "archiveMessage",
    "authenticationType",
    "certificate",
    "deleteMessage",
    "email",
    "messageId",
    "messageUid",
    "password",
    "sizeLimit",
    "stateFlag",
    "userName"
})
public class ReceiveRequest {

    @XmlElement(name = "ArchiveMessage")
    protected Boolean archiveMessage;
    @XmlElementRef(name = "AuthenticationType", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", type = JAXBElement.class)
    protected JAXBElement<String> authenticationType;
    @XmlElementRef(name = "Certificate", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", type = JAXBElement.class)
    protected JAXBElement<byte[]> certificate;
    @XmlElement(name = "DeleteMessage")
    protected Boolean deleteMessage;
    @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", type = JAXBElement.class)
    protected JAXBElement<String> email;
    @XmlElement(name = "MessageId")
    protected Integer messageId;
    @XmlElement(name = "MessageUid")
    protected Long messageUid;
    @XmlElementRef(name = "Password", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", type = JAXBElement.class)
    protected JAXBElement<String> password;
    @XmlElement(name = "SizeLimit")
    protected Long sizeLimit;
    @XmlElement(name = "StateFlag")
    protected State stateFlag;
    @XmlElementRef(name = "UserName", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", type = JAXBElement.class)
    protected JAXBElement<String> userName;

    /**
     * Gets the value of the archiveMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchiveMessage() {
        return archiveMessage;
    }

    /**
     * Sets the value of the archiveMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchiveMessage(Boolean value) {
        this.archiveMessage = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthenticationType(JAXBElement<String> value) {
        this.authenticationType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setCertificate(JAXBElement<byte[]> value) {
        this.certificate = ((JAXBElement<byte[]> ) value);
    }

    /**
     * Gets the value of the deleteMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteMessage() {
        return deleteMessage;
    }

    /**
     * Sets the value of the deleteMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteMessage(Boolean value) {
        this.deleteMessage = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMessageId(Integer value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the messageUid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMessageUid() {
        return messageUid;
    }

    /**
     * Sets the value of the messageUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMessageUid(Long value) {
        this.messageUid = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sizeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSizeLimit() {
        return sizeLimit;
    }

    /**
     * Sets the value of the sizeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSizeLimit(Long value) {
        this.sizeLimit = value;
    }

    /**
     * Gets the value of the stateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getStateFlag() {
        return stateFlag;
    }

    /**
     * Sets the value of the stateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setStateFlag(State value) {
        this.stateFlag = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = ((JAXBElement<String> ) value);
    }

}
