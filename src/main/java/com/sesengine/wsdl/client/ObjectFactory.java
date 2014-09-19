
package com.sesengine.wsdl.client;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sesengine.wsdl.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _SesMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "SesMessage");
    private final static QName _SesHeader_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "SesHeader");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ArrayOfSesAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "ArrayOfSesAddress");
    private final static QName _ArrayOfSesAttachment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "ArrayOfSesAttachment");
    private final static QName _Importance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "Importance");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _SesAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "SesAddress");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _State_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "State");
    private final static QName _ArrayOfMessageSummary_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.model", "ArrayOfMessageSummary");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _DispositionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "DispositionType");
    private final static QName _MessageSummary_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.model", "MessageSummary");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Sensitivity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "Sensitivity");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ReceiveRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.model", "ReceiveRequest");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _SesAttachment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "SesAttachment");
    private final static QName _SesAddressAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "Address");
    private final static QName _SesAddressDisplayName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "DisplayName");
    private final static QName _GetMessageNumberRequest_QNAME = new QName("http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", "request");
    private final static QName _GetMessageListResponseGetMessageListResult_QNAME = new QName("http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", "GetMessageListResult");
    private final static QName _GetMessageResponseGetMessageResult_QNAME = new QName("http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", "GetMessageResult");
    private final static QName _SesMessageBodyText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "BodyText");
    private final static QName _SesMessageMessageId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "MessageId");
    private final static QName _SesMessageBodyHTML_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "BodyHTML");
    private final static QName _SesMessageFromAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "FromAddress");
    private final static QName _SesMessageSESMessageId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "SESMessageId");
    private final static QName _SesMessageAttachments_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "Attachments");
    private final static QName _SesMessageSecureSubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "SecureSubject");
    private final static QName _SesMessageCcAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "CcAddress");
    private final static QName _SesMessagePublicSubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "PublicSubject");
    private final static QName _SesMessageToAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "ToAddress");
    private final static QName _GetMessageHeaderResponseGetMessageHeaderResult_QNAME = new QName("http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", "GetMessageHeaderResult");
    private final static QName _ReceiveRequestEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.model", "Email");
    private final static QName _ReceiveRequestPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.model", "Password");
    private final static QName _ReceiveRequestAuthenticationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.model", "AuthenticationType");
    private final static QName _ReceiveRequestCertificate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.model", "Certificate");
    private final static QName _ReceiveRequestUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.model", "UserName");
    private final static QName _SesAttachmentData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "Data");
    private final static QName _SesAttachmentFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "FileName");
    private final static QName _SesAttachmentContentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "ContentType");
    private final static QName _SendMessageResponseSendMessageResult_QNAME = new QName("http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", "SendMessageResult");
    private final static QName _SendMDNResponseSendMDNResult_QNAME = new QName("http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", "SendMDNResult");
    private final static QName _SesHeaderSender_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "Sender");
    private final static QName _SesHeaderReturnPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "ReturnPath");
    private final static QName _SesHeaderReplyTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "ReplyTo");
    private final static QName _SendMDNFromAddress_QNAME = new QName("http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", "FromAddress");
    private final static QName _SendMDNReturnAddress_QNAME = new QName("http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", "ReturnAddress");
    private final static QName _SendMDNMessageId_QNAME = new QName("http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", "MessageId");
    private final static QName _SendMDNText_QNAME = new QName("http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", "Text");
    private final static QName _SendMessageMessage_QNAME = new QName("http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", "message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sesengine.wsdl.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfSesAttachment }
     * 
     */
    public ArrayOfSesAttachment createArrayOfSesAttachment() {
        return new ArrayOfSesAttachment();
    }

    /**
     * Create an instance of {@link GetMessageNumber }
     * 
     */
    public GetMessageNumber createGetMessageNumber() {
        return new GetMessageNumber();
    }

    /**
     * Create an instance of {@link SesAddress }
     * 
     */
    public SesAddress createSesAddress() {
        return new SesAddress();
    }

    /**
     * Create an instance of {@link GetMessageListResponse }
     * 
     */
    public GetMessageListResponse createGetMessageListResponse() {
        return new GetMessageListResponse();
    }

    /**
     * Create an instance of {@link MessageSummary }
     * 
     */
    public MessageSummary createMessageSummary() {
        return new MessageSummary();
    }

    /**
     * Create an instance of {@link SesMessage }
     * 
     */
    public SesMessage createSesMessage() {
        return new SesMessage();
    }

    /**
     * Create an instance of {@link GetMessageHeaderResponse }
     * 
     */
    public GetMessageHeaderResponse createGetMessageHeaderResponse() {
        return new GetMessageHeaderResponse();
    }

    /**
     * Create an instance of {@link ReceiveRequest }
     * 
     */
    public ReceiveRequest createReceiveRequest() {
        return new ReceiveRequest();
    }

    /**
     * Create an instance of {@link GetReadMessageNumberResponse }
     * 
     */
    public GetReadMessageNumberResponse createGetReadMessageNumberResponse() {
        return new GetReadMessageNumberResponse();
    }

    /**
     * Create an instance of {@link GetMessageHeader }
     * 
     */
    public GetMessageHeader createGetMessageHeader() {
        return new GetMessageHeader();
    }

    /**
     * Create an instance of {@link GetReadMessageNumber }
     * 
     */
    public GetReadMessageNumber createGetReadMessageNumber() {
        return new GetReadMessageNumber();
    }

    /**
     * Create an instance of {@link SendMessage }
     * 
     */
    public SendMessage createSendMessage() {
        return new SendMessage();
    }

    /**
     * Create an instance of {@link ArrayOfMessageSummary }
     * 
     */
    public ArrayOfMessageSummary createArrayOfMessageSummary() {
        return new ArrayOfMessageSummary();
    }

    /**
     * Create an instance of {@link GetMessageList }
     * 
     */
    public GetMessageList createGetMessageList() {
        return new GetMessageList();
    }

    /**
     * Create an instance of {@link GetMessageResponse }
     * 
     */
    public GetMessageResponse createGetMessageResponse() {
        return new GetMessageResponse();
    }

    /**
     * Create an instance of {@link DeleteMessage }
     * 
     */
    public DeleteMessage createDeleteMessage() {
        return new DeleteMessage();
    }

    /**
     * Create an instance of {@link SesAttachment }
     * 
     */
    public SesAttachment createSesAttachment() {
        return new SesAttachment();
    }

    /**
     * Create an instance of {@link ArrayOfSesAddress }
     * 
     */
    public ArrayOfSesAddress createArrayOfSesAddress() {
        return new ArrayOfSesAddress();
    }

    /**
     * Create an instance of {@link UpdateMessageStatus }
     * 
     */
    public UpdateMessageStatus createUpdateMessageStatus() {
        return new UpdateMessageStatus();
    }

    /**
     * Create an instance of {@link UpdateMessageStatusResponse }
     * 
     */
    public UpdateMessageStatusResponse createUpdateMessageStatusResponse() {
        return new UpdateMessageStatusResponse();
    }

    /**
     * Create an instance of {@link SendMessageResponse }
     * 
     */
    public SendMessageResponse createSendMessageResponse() {
        return new SendMessageResponse();
    }

    /**
     * Create an instance of {@link SendMDNResponse }
     * 
     */
    public SendMDNResponse createSendMDNResponse() {
        return new SendMDNResponse();
    }

    /**
     * Create an instance of {@link SendMDN }
     * 
     */
    public SendMDN createSendMDN() {
        return new SendMDN();
    }

    /**
     * Create an instance of {@link GetMessage }
     * 
     */
    public GetMessage createGetMessage() {
        return new GetMessage();
    }

    /**
     * Create an instance of {@link SesHeader }
     * 
     */
    public SesHeader createSesHeader() {
        return new SesHeader();
    }

    /**
     * Create an instance of {@link DeleteMessageResponse }
     * 
     */
    public DeleteMessageResponse createDeleteMessageResponse() {
        return new DeleteMessageResponse();
    }

    /**
     * Create an instance of {@link GetMessageNumberResponse }
     * 
     */
    public GetMessageNumberResponse createGetMessageNumberResponse() {
        return new GetMessageNumberResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SesMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "SesMessage")
    public JAXBElement<SesMessage> createSesMessage(SesMessage value) {
        return new JAXBElement<SesMessage>(_SesMessage_QNAME, SesMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SesHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "SesHeader")
    public JAXBElement<SesHeader> createSesHeader(SesHeader value) {
        return new JAXBElement<SesHeader>(_SesHeader_QNAME, SesHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "ArrayOfSesAddress")
    public JAXBElement<ArrayOfSesAddress> createArrayOfSesAddress(ArrayOfSesAddress value) {
        return new JAXBElement<ArrayOfSesAddress>(_ArrayOfSesAddress_QNAME, ArrayOfSesAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSesAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "ArrayOfSesAttachment")
    public JAXBElement<ArrayOfSesAttachment> createArrayOfSesAttachment(ArrayOfSesAttachment value) {
        return new JAXBElement<ArrayOfSesAttachment>(_ArrayOfSesAttachment_QNAME, ArrayOfSesAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Importance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "Importance")
    public JAXBElement<Importance> createImportance(Importance value) {
        return new JAXBElement<Importance>(_Importance_QNAME, Importance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SesAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "SesAddress")
    public JAXBElement<SesAddress> createSesAddress(SesAddress value) {
        return new JAXBElement<SesAddress>(_SesAddress_QNAME, SesAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "State")
    public JAXBElement<State> createState(State value) {
        return new JAXBElement<State>(_State_QNAME, State.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessageSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", name = "ArrayOfMessageSummary")
    public JAXBElement<ArrayOfMessageSummary> createArrayOfMessageSummary(ArrayOfMessageSummary value) {
        return new JAXBElement<ArrayOfMessageSummary>(_ArrayOfMessageSummary_QNAME, ArrayOfMessageSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DispositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "DispositionType")
    public JAXBElement<DispositionType> createDispositionType(DispositionType value) {
        return new JAXBElement<DispositionType>(_DispositionType_QNAME, DispositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", name = "MessageSummary")
    public JAXBElement<MessageSummary> createMessageSummary(MessageSummary value) {
        return new JAXBElement<MessageSummary>(_MessageSummary_QNAME, MessageSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sensitivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "Sensitivity")
    public JAXBElement<Sensitivity> createSensitivity(Sensitivity value) {
        return new JAXBElement<Sensitivity>(_Sensitivity_QNAME, Sensitivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", name = "ReceiveRequest")
    public JAXBElement<ReceiveRequest> createReceiveRequest(ReceiveRequest value) {
        return new JAXBElement<ReceiveRequest>(_ReceiveRequest_QNAME, ReceiveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SesAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "SesAttachment")
    public JAXBElement<SesAttachment> createSesAttachment(SesAttachment value) {
        return new JAXBElement<SesAttachment>(_SesAttachment_QNAME, SesAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "Address", scope = SesAddress.class)
    public JAXBElement<String> createSesAddressAddress(String value) {
        return new JAXBElement<String>(_SesAddressAddress_QNAME, String.class, SesAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "DisplayName", scope = SesAddress.class)
    public JAXBElement<String> createSesAddressDisplayName(String value) {
        return new JAXBElement<String>(_SesAddressDisplayName_QNAME, String.class, SesAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "request", scope = GetMessageNumber.class)
    public JAXBElement<ReceiveRequest> createGetMessageNumberRequest(ReceiveRequest value) {
        return new JAXBElement<ReceiveRequest>(_GetMessageNumberRequest_QNAME, ReceiveRequest.class, GetMessageNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessageSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "GetMessageListResult", scope = GetMessageListResponse.class)
    public JAXBElement<ArrayOfMessageSummary> createGetMessageListResponseGetMessageListResult(ArrayOfMessageSummary value) {
        return new JAXBElement<ArrayOfMessageSummary>(_GetMessageListResponseGetMessageListResult_QNAME, ArrayOfMessageSummary.class, GetMessageListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SesMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "GetMessageResult", scope = GetMessageResponse.class)
    public JAXBElement<SesMessage> createGetMessageResponseGetMessageResult(SesMessage value) {
        return new JAXBElement<SesMessage>(_GetMessageResponseGetMessageResult_QNAME, SesMessage.class, GetMessageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "request", scope = GetMessageList.class)
    public JAXBElement<ReceiveRequest> createGetMessageListRequest(ReceiveRequest value) {
        return new JAXBElement<ReceiveRequest>(_GetMessageNumberRequest_QNAME, ReceiveRequest.class, GetMessageList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "BodyText", scope = SesMessage.class)
    public JAXBElement<String> createSesMessageBodyText(String value) {
        return new JAXBElement<String>(_SesMessageBodyText_QNAME, String.class, SesMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "MessageId", scope = SesMessage.class)
    public JAXBElement<String> createSesMessageMessageId(String value) {
        return new JAXBElement<String>(_SesMessageMessageId_QNAME, String.class, SesMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "BodyHTML", scope = SesMessage.class)
    public JAXBElement<String> createSesMessageBodyHTML(String value) {
        return new JAXBElement<String>(_SesMessageBodyHTML_QNAME, String.class, SesMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SesAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "FromAddress", scope = SesMessage.class)
    public JAXBElement<SesAddress> createSesMessageFromAddress(SesAddress value) {
        return new JAXBElement<SesAddress>(_SesMessageFromAddress_QNAME, SesAddress.class, SesMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "SESMessageId", scope = SesMessage.class)
    public JAXBElement<String> createSesMessageSESMessageId(String value) {
        return new JAXBElement<String>(_SesMessageSESMessageId_QNAME, String.class, SesMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSesAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "Attachments", scope = SesMessage.class)
    public JAXBElement<ArrayOfSesAttachment> createSesMessageAttachments(ArrayOfSesAttachment value) {
        return new JAXBElement<ArrayOfSesAttachment>(_SesMessageAttachments_QNAME, ArrayOfSesAttachment.class, SesMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "SecureSubject", scope = SesMessage.class)
    public JAXBElement<String> createSesMessageSecureSubject(String value) {
        return new JAXBElement<String>(_SesMessageSecureSubject_QNAME, String.class, SesMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "CcAddress", scope = SesMessage.class)
    public JAXBElement<ArrayOfSesAddress> createSesMessageCcAddress(ArrayOfSesAddress value) {
        return new JAXBElement<ArrayOfSesAddress>(_SesMessageCcAddress_QNAME, ArrayOfSesAddress.class, SesMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "PublicSubject", scope = SesMessage.class)
    public JAXBElement<String> createSesMessagePublicSubject(String value) {
        return new JAXBElement<String>(_SesMessagePublicSubject_QNAME, String.class, SesMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "ToAddress", scope = SesMessage.class)
    public JAXBElement<ArrayOfSesAddress> createSesMessageToAddress(ArrayOfSesAddress value) {
        return new JAXBElement<ArrayOfSesAddress>(_SesMessageToAddress_QNAME, ArrayOfSesAddress.class, SesMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SesHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "GetMessageHeaderResult", scope = GetMessageHeaderResponse.class)
    public JAXBElement<SesHeader> createGetMessageHeaderResponseGetMessageHeaderResult(SesHeader value) {
        return new JAXBElement<SesHeader>(_GetMessageHeaderResponseGetMessageHeaderResult_QNAME, SesHeader.class, GetMessageHeaderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", name = "Email", scope = ReceiveRequest.class)
    public JAXBElement<String> createReceiveRequestEmail(String value) {
        return new JAXBElement<String>(_ReceiveRequestEmail_QNAME, String.class, ReceiveRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", name = "Password", scope = ReceiveRequest.class)
    public JAXBElement<String> createReceiveRequestPassword(String value) {
        return new JAXBElement<String>(_ReceiveRequestPassword_QNAME, String.class, ReceiveRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", name = "AuthenticationType", scope = ReceiveRequest.class)
    public JAXBElement<String> createReceiveRequestAuthenticationType(String value) {
        return new JAXBElement<String>(_ReceiveRequestAuthenticationType_QNAME, String.class, ReceiveRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", name = "Certificate", scope = ReceiveRequest.class)
    public JAXBElement<byte[]> createReceiveRequestCertificate(byte[] value) {
        return new JAXBElement<byte[]>(_ReceiveRequestCertificate_QNAME, byte[].class, ReceiveRequest.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.model", name = "UserName", scope = ReceiveRequest.class)
    public JAXBElement<String> createReceiveRequestUserName(String value) {
        return new JAXBElement<String>(_ReceiveRequestUserName_QNAME, String.class, ReceiveRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "request", scope = DeleteMessage.class)
    public JAXBElement<ReceiveRequest> createDeleteMessageRequest(ReceiveRequest value) {
        return new JAXBElement<ReceiveRequest>(_GetMessageNumberRequest_QNAME, ReceiveRequest.class, DeleteMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "Data", scope = SesAttachment.class)
    public JAXBElement<byte[]> createSesAttachmentData(byte[] value) {
        return new JAXBElement<byte[]>(_SesAttachmentData_QNAME, byte[].class, SesAttachment.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "FileName", scope = SesAttachment.class)
    public JAXBElement<String> createSesAttachmentFileName(String value) {
        return new JAXBElement<String>(_SesAttachmentFileName_QNAME, String.class, SesAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "ContentType", scope = SesAttachment.class)
    public JAXBElement<String> createSesAttachmentContentType(String value) {
        return new JAXBElement<String>(_SesAttachmentContentType_QNAME, String.class, SesAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "request", scope = GetMessageHeader.class)
    public JAXBElement<ReceiveRequest> createGetMessageHeaderRequest(ReceiveRequest value) {
        return new JAXBElement<ReceiveRequest>(_GetMessageNumberRequest_QNAME, ReceiveRequest.class, GetMessageHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "request", scope = GetReadMessageNumber.class)
    public JAXBElement<ReceiveRequest> createGetReadMessageNumberRequest(ReceiveRequest value) {
        return new JAXBElement<ReceiveRequest>(_GetMessageNumberRequest_QNAME, ReceiveRequest.class, GetReadMessageNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "request", scope = UpdateMessageStatus.class)
    public JAXBElement<ReceiveRequest> createUpdateMessageStatusRequest(ReceiveRequest value) {
        return new JAXBElement<ReceiveRequest>(_GetMessageNumberRequest_QNAME, ReceiveRequest.class, UpdateMessageStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "SendMessageResult", scope = SendMessageResponse.class)
    public JAXBElement<String> createSendMessageResponseSendMessageResult(String value) {
        return new JAXBElement<String>(_SendMessageResponseSendMessageResult_QNAME, String.class, SendMessageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "SendMDNResult", scope = SendMDNResponse.class)
    public JAXBElement<String> createSendMDNResponseSendMDNResult(String value) {
        return new JAXBElement<String>(_SendMDNResponseSendMDNResult_QNAME, String.class, SendMDNResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SesAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "Sender", scope = SesHeader.class)
    public JAXBElement<SesAddress> createSesHeaderSender(SesAddress value) {
        return new JAXBElement<SesAddress>(_SesHeaderSender_QNAME, SesAddress.class, SesHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "MessageId", scope = SesHeader.class)
    public JAXBElement<String> createSesHeaderMessageId(String value) {
        return new JAXBElement<String>(_SesMessageMessageId_QNAME, String.class, SesHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SesAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "ReturnPath", scope = SesHeader.class)
    public JAXBElement<SesAddress> createSesHeaderReturnPath(SesAddress value) {
        return new JAXBElement<SesAddress>(_SesHeaderReturnPath_QNAME, SesAddress.class, SesHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SesAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "FromAddress", scope = SesHeader.class)
    public JAXBElement<SesAddress> createSesHeaderFromAddress(SesAddress value) {
        return new JAXBElement<SesAddress>(_SesMessageFromAddress_QNAME, SesAddress.class, SesHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "ReplyTo", scope = SesHeader.class)
    public JAXBElement<ArrayOfSesAddress> createSesHeaderReplyTo(ArrayOfSesAddress value) {
        return new JAXBElement<ArrayOfSesAddress>(_SesHeaderReplyTo_QNAME, ArrayOfSesAddress.class, SesHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "SESMessageId", scope = SesHeader.class)
    public JAXBElement<String> createSesHeaderSESMessageId(String value) {
        return new JAXBElement<String>(_SesMessageSESMessageId_QNAME, String.class, SesHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "SecureSubject", scope = SesHeader.class)
    public JAXBElement<String> createSesHeaderSecureSubject(String value) {
        return new JAXBElement<String>(_SesMessageSecureSubject_QNAME, String.class, SesHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "CcAddress", scope = SesHeader.class)
    public JAXBElement<ArrayOfSesAddress> createSesHeaderCcAddress(ArrayOfSesAddress value) {
        return new JAXBElement<ArrayOfSesAddress>(_SesMessageCcAddress_QNAME, ArrayOfSesAddress.class, SesHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "PublicSubject", scope = SesHeader.class)
    public JAXBElement<String> createSesHeaderPublicSubject(String value) {
        return new JAXBElement<String>(_SesMessagePublicSubject_QNAME, String.class, SesHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", name = "ToAddress", scope = SesHeader.class)
    public JAXBElement<ArrayOfSesAddress> createSesHeaderToAddress(ArrayOfSesAddress value) {
        return new JAXBElement<ArrayOfSesAddress>(_SesMessageToAddress_QNAME, ArrayOfSesAddress.class, SesHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "FromAddress", scope = SendMDN.class)
    public JAXBElement<String> createSendMDNFromAddress(String value) {
        return new JAXBElement<String>(_SendMDNFromAddress_QNAME, String.class, SendMDN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "ReturnAddress", scope = SendMDN.class)
    public JAXBElement<String> createSendMDNReturnAddress(String value) {
        return new JAXBElement<String>(_SendMDNReturnAddress_QNAME, String.class, SendMDN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "MessageId", scope = SendMDN.class)
    public JAXBElement<String> createSendMDNMessageId(String value) {
        return new JAXBElement<String>(_SendMDNMessageId_QNAME, String.class, SendMDN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "Text", scope = SendMDN.class)
    public JAXBElement<String> createSendMDNText(String value) {
        return new JAXBElement<String>(_SendMDNText_QNAME, String.class, SendMDN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "request", scope = GetMessage.class)
    public JAXBElement<ReceiveRequest> createGetMessageRequest(ReceiveRequest value) {
        return new JAXBElement<ReceiveRequest>(_GetMessageNumberRequest_QNAME, ReceiveRequest.class, GetMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SesMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2012/SecureIntegrationServiceImap/v1", name = "message", scope = SendMessage.class)
    public JAXBElement<SesMessage> createSendMessageMessage(SesMessage value) {
        return new JAXBElement<SesMessage>(_SendMessageMessage_QNAME, SesMessage.class, SendMessage.class, value);
    }

}
