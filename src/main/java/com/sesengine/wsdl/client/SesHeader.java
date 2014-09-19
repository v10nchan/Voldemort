
package com.sesengine.wsdl.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SesHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SesHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CcAddress" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}ArrayOfSesAddress" minOccurs="0"/>
 *         &lt;element name="DateComposed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DateReceived" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DateSent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FromAddress" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}SesAddress" minOccurs="0"/>
 *         &lt;element name="ImportanceFlag" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}Importance" minOccurs="0"/>
 *         &lt;element name="IsMDN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReplyTo" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}ArrayOfSesAddress" minOccurs="0"/>
 *         &lt;element name="ReturnPath" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}SesAddress" minOccurs="0"/>
 *         &lt;element name="SESMessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecureSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sender" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}SesAddress" minOccurs="0"/>
 *         &lt;element name="SensitivityFlag" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}Sensitivity" minOccurs="0"/>
 *         &lt;element name="StateFlag" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}State" minOccurs="0"/>
 *         &lt;element name="ToAddress" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}ArrayOfSesAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SesHeader", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", propOrder = {
    "ccAddress",
    "dateComposed",
    "dateReceived",
    "dateSent",
    "fromAddress",
    "importanceFlag",
    "isMDN",
    "messageId",
    "publicSubject",
    "replyTo",
    "returnPath",
    "sesMessageId",
    "secureSubject",
    "sender",
    "sensitivityFlag",
    "stateFlag",
    "toAddress"
})
public class SesHeader {

    @XmlElementRef(name = "CcAddress", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", type = JAXBElement.class)
    protected JAXBElement<ArrayOfSesAddress> ccAddress;
    @XmlElement(name = "DateComposed")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateComposed;
    @XmlElement(name = "DateReceived")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReceived;
    @XmlElement(name = "DateSent")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateSent;
    @XmlElementRef(name = "FromAddress", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", type = JAXBElement.class)
    protected JAXBElement<SesAddress> fromAddress;
    @XmlElement(name = "ImportanceFlag")
    protected Importance importanceFlag;
    @XmlElement(name = "IsMDN")
    protected Boolean isMDN;
    @XmlElementRef(name = "MessageId", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", type = JAXBElement.class)
    protected JAXBElement<String> messageId;
    @XmlElementRef(name = "PublicSubject", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", type = JAXBElement.class)
    protected JAXBElement<String> publicSubject;
    @XmlElementRef(name = "ReplyTo", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", type = JAXBElement.class)
    protected JAXBElement<ArrayOfSesAddress> replyTo;
    @XmlElementRef(name = "ReturnPath", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", type = JAXBElement.class)
    protected JAXBElement<SesAddress> returnPath;
    @XmlElementRef(name = "SESMessageId", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", type = JAXBElement.class)
    protected JAXBElement<String> sesMessageId;
    @XmlElementRef(name = "SecureSubject", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", type = JAXBElement.class)
    protected JAXBElement<String> secureSubject;
    @XmlElementRef(name = "Sender", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", type = JAXBElement.class)
    protected JAXBElement<SesAddress> sender;
    @XmlElement(name = "SensitivityFlag")
    protected Sensitivity sensitivityFlag;
    @XmlElement(name = "StateFlag")
    protected State stateFlag;
    @XmlElementRef(name = "ToAddress", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", type = JAXBElement.class)
    protected JAXBElement<ArrayOfSesAddress> toAddress;

    /**
     * Gets the value of the ccAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSesAddress> getCcAddress() {
        return ccAddress;
    }

    /**
     * Sets the value of the ccAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}
     *     
     */
    public void setCcAddress(JAXBElement<ArrayOfSesAddress> value) {
        this.ccAddress = ((JAXBElement<ArrayOfSesAddress> ) value);
    }

    /**
     * Gets the value of the dateComposed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateComposed() {
        return dateComposed;
    }

    /**
     * Sets the value of the dateComposed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateComposed(XMLGregorianCalendar value) {
        this.dateComposed = value;
    }

    /**
     * Gets the value of the dateReceived property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReceived() {
        return dateReceived;
    }

    /**
     * Sets the value of the dateReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReceived(XMLGregorianCalendar value) {
        this.dateReceived = value;
    }

    /**
     * Gets the value of the dateSent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSent() {
        return dateSent;
    }

    /**
     * Sets the value of the dateSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSent(XMLGregorianCalendar value) {
        this.dateSent = value;
    }

    /**
     * Gets the value of the fromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SesAddress }{@code >}
     *     
     */
    public JAXBElement<SesAddress> getFromAddress() {
        return fromAddress;
    }

    /**
     * Sets the value of the fromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SesAddress }{@code >}
     *     
     */
    public void setFromAddress(JAXBElement<SesAddress> value) {
        this.fromAddress = ((JAXBElement<SesAddress> ) value);
    }

    /**
     * Gets the value of the importanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Importance }
     *     
     */
    public Importance getImportanceFlag() {
        return importanceFlag;
    }

    /**
     * Sets the value of the importanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Importance }
     *     
     */
    public void setImportanceFlag(Importance value) {
        this.importanceFlag = value;
    }

    /**
     * Gets the value of the isMDN property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMDN() {
        return isMDN;
    }

    /**
     * Sets the value of the isMDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMDN(Boolean value) {
        this.isMDN = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageId(JAXBElement<String> value) {
        this.messageId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the publicSubject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublicSubject() {
        return publicSubject;
    }

    /**
     * Sets the value of the publicSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublicSubject(JAXBElement<String> value) {
        this.publicSubject = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSesAddress> getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}
     *     
     */
    public void setReplyTo(JAXBElement<ArrayOfSesAddress> value) {
        this.replyTo = ((JAXBElement<ArrayOfSesAddress> ) value);
    }

    /**
     * Gets the value of the returnPath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SesAddress }{@code >}
     *     
     */
    public JAXBElement<SesAddress> getReturnPath() {
        return returnPath;
    }

    /**
     * Sets the value of the returnPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SesAddress }{@code >}
     *     
     */
    public void setReturnPath(JAXBElement<SesAddress> value) {
        this.returnPath = ((JAXBElement<SesAddress> ) value);
    }

    /**
     * Gets the value of the sesMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSESMessageId() {
        return sesMessageId;
    }

    /**
     * Sets the value of the sesMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSESMessageId(JAXBElement<String> value) {
        this.sesMessageId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the secureSubject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecureSubject() {
        return secureSubject;
    }

    /**
     * Sets the value of the secureSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecureSubject(JAXBElement<String> value) {
        this.secureSubject = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SesAddress }{@code >}
     *     
     */
    public JAXBElement<SesAddress> getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SesAddress }{@code >}
     *     
     */
    public void setSender(JAXBElement<SesAddress> value) {
        this.sender = ((JAXBElement<SesAddress> ) value);
    }

    /**
     * Gets the value of the sensitivityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Sensitivity }
     *     
     */
    public Sensitivity getSensitivityFlag() {
        return sensitivityFlag;
    }

    /**
     * Sets the value of the sensitivityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sensitivity }
     *     
     */
    public void setSensitivityFlag(Sensitivity value) {
        this.sensitivityFlag = value;
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
     * Gets the value of the toAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSesAddress> getToAddress() {
        return toAddress;
    }

    /**
     * Sets the value of the toAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}
     *     
     */
    public void setToAddress(JAXBElement<ArrayOfSesAddress> value) {
        this.toAddress = ((JAXBElement<ArrayOfSesAddress> ) value);
    }

}
