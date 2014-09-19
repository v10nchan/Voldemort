
package com.sesengine.wsdl.client.publicdirectorysearch;

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
 * generated in the com.ses.wsdl.client.publicdirectorysearch package. 
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

    private final static QName _AddressDetailCounty_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "County");
    private final static QName _AddressDetailFax_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "Fax");
    private final static QName _AddressDetailTelephone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "Telephone");
    private final static QName _AddressDetailState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "State");
    private final static QName _AddressDetailStreetAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "StreetAddress");
    private final static QName _AddressDetailCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "City");
    private final static QName _AddressDetailZipCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "ZipCode");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfExternalSearchResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "ArrayOfExternalSearchResponse");
    private final static QName _ArrayOfSesAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "ArrayOfSesAddress");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _AddressDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "AddressDetail");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfStateLicense_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "ArrayOfStateLicense");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Address_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "Address");
    private final static QName _ArrayOfPublicSearchResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "ArrayOfPublicSearchResponse");
    private final static QName _SesAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "SesAddress");
    private final static QName _ExternalSearchResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "ExternalSearchResponse");
    private final static QName _SearchOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "SearchOption");
    private final static QName _ExternalSearchRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "ExternalSearchRequest");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _PublicSearchResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "PublicSearchResponse");
    private final static QName _ArrayOfSearchParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "ArrayOfSearchParameter");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _RegistrationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "RegistrationType");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _PublicSearchRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "PublicSearchRequest");
    private final static QName _StateLicense_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "StateLicense");
    private final static QName _SearchParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "SearchParameter");
    private final static QName _ExternalDirectorySearchRequest_QNAME = new QName("http://secureexchangesolutions.com/2011/Directory/v2", "request");
    private final static QName _ExternalDirectorySearchResponseExternalDirectorySearchResult_QNAME = new QName("http://secureexchangesolutions.com/2011/Directory/v2", "ExternalDirectorySearchResult");
    private final static QName _PublicSearchRequestKeyword_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "Keyword");
    private final static QName _PublicSearchRequestName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "Name");
    private final static QName _PublicSearchRequestSecureEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "SecureEmail");
    private final static QName _PublicSearchRequestContactEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "ContactEmail");
    private final static QName _PublicSearchRequestNPINumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "NPINumber");
    private final static QName _PublicSearchRequestState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "state");
    private final static QName _PublicSearchRequestSpecialty_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "Specialty");
    private final static QName _PublicSearchResponseKeyWord_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "KeyWord");
    private final static QName _PublicSearchResponseTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "Title");
    private final static QName _PublicSearchResponseStateLicenses_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "StateLicenses");
    private final static QName _PublicSearchResponsePrimaryAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "PrimaryAddress");
    private final static QName _DNSCertLookupResponseDNSCertLookupResult_QNAME = new QName("http://secureexchangesolutions.com/2011/Directory/v2", "DNSCertLookupResult");
    private final static QName _GetAddressesByTrustGroupResponseGetAddressesByTrustGroupResult_QNAME = new QName("http://secureexchangesolutions.com/2011/Directory/v2", "GetAddressesByTrustGroupResult");
    private final static QName _GetAddressesByTrustGroupDomain_QNAME = new QName("http://secureexchangesolutions.com/2011/Directory/v2", "domain");
    private final static QName _FindLocalUserParameters_QNAME = new QName("http://secureexchangesolutions.com/2011/Directory/v2", "parameters");
    private final static QName _SearchParameterSearchValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "SearchValue");
    private final static QName _DNSCertLookupEmail_QNAME = new QName("http://secureexchangesolutions.com/2011/Directory/v2", "email");
    private final static QName _PublicDirectorySearchResponsePublicDirectorySearchResult_QNAME = new QName("http://secureexchangesolutions.com/2011/Directory/v2", "PublicDirectorySearchResult");
    private final static QName _StateLicenseStateLicNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "StateLicNumber");
    private final static QName _ExternalSearchRequestNPInumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "NPInumber");
    private final static QName _ExternalSearchRequestDirectorySource_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "DirectorySource");
    private final static QName _ExternalSearchRequestOrganization_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "Organization");
    private final static QName _ExternalSearchRequestSpeciality_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "Speciality");
    private final static QName _ExternalSearchRequestHISPOrganization_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "HISPOrganization");
    private final static QName _ExternalSearchRequestEmailContact_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "EmailContact");
    private final static QName _ExternalSearchResponseNPI_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "NPI");
    private final static QName _SesAddressAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "Address");
    private final static QName _SesAddressDisplayName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Core.Model", "DisplayName");
    private final static QName _GetFullDirectoryListResponseGetFullDirectoryListResult_QNAME = new QName("http://secureexchangesolutions.com/2011/Directory/v2", "getFullDirectoryListResult");
    private final static QName _AddressStreet_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "Street");
    private final static QName _AddressPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "Phone");
    private final static QName _AddressZIP_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ses.Directory.Model", "ZIP");
    private final static QName _FindLocalUserResponseFindLocalUserResult_QNAME = new QName("http://secureexchangesolutions.com/2011/Directory/v2", "FindLocalUserResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ses.wsdl.client.publicdirectorysearch
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFullDirectoryListResponse }
     * 
     */
    public GetFullDirectoryListResponse createGetFullDirectoryListResponse() {
        return new GetFullDirectoryListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfExternalSearchResponse }
     * 
     */
    public ArrayOfExternalSearchResponse createArrayOfExternalSearchResponse() {
        return new ArrayOfExternalSearchResponse();
    }

    /**
     * Create an instance of {@link PublicSearchResponse }
     * 
     */
    public PublicSearchResponse createPublicSearchResponse() {
        return new PublicSearchResponse();
    }

    /**
     * Create an instance of {@link AddressDetail }
     * 
     */
    public AddressDetail createAddressDetail() {
        return new AddressDetail();
    }

    /**
     * Create an instance of {@link ExternalSearchResponse }
     * 
     */
    public ExternalSearchResponse createExternalSearchResponse() {
        return new ExternalSearchResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSearchParameter }
     * 
     */
    public ArrayOfSearchParameter createArrayOfSearchParameter() {
        return new ArrayOfSearchParameter();
    }

    /**
     * Create an instance of {@link ArrayOfStateLicense }
     * 
     */
    public ArrayOfStateLicense createArrayOfStateLicense() {
        return new ArrayOfStateLicense();
    }

    /**
     * Create an instance of {@link ArrayOfPublicSearchResponse }
     * 
     */
    public ArrayOfPublicSearchResponse createArrayOfPublicSearchResponse() {
        return new ArrayOfPublicSearchResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link PublicSearchRequest }
     * 
     */
    public PublicSearchRequest createPublicSearchRequest() {
        return new PublicSearchRequest();
    }

    /**
     * Create an instance of {@link ExternalSearchRequest }
     * 
     */
    public ExternalSearchRequest createExternalSearchRequest() {
        return new ExternalSearchRequest();
    }

    /**
     * Create an instance of {@link StateLicense }
     * 
     */
    public StateLicense createStateLicense() {
        return new StateLicense();
    }

    /**
     * Create an instance of {@link SearchParameter }
     * 
     */
    public SearchParameter createSearchParameter() {
        return new SearchParameter();
    }

    /**
     * Create an instance of {@link SesAddress }
     * 
     */
    public SesAddress createSesAddress() {
        return new SesAddress();
    }

    /**
     * Create an instance of {@link ArrayOfSesAddress }
     * 
     */
    public ArrayOfSesAddress createArrayOfSesAddress() {
        return new ArrayOfSesAddress();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link DNSCertLookupResponse }
     * 
     */
    public DNSCertLookupResponse createDNSCertLookupResponse() {
        return new DNSCertLookupResponse();
    }

    /**
     * Create an instance of {@link UpdateDirectoryCache }
     * 
     */
    public UpdateDirectoryCache createUpdateDirectoryCache() {
        return new UpdateDirectoryCache();
    }

    /**
     * Create an instance of {@link GetFullDirectoryListResponse.GetFullDirectoryListResult }
     * 
     */
    public GetFullDirectoryListResponse.GetFullDirectoryListResult createGetFullDirectoryListResponseGetFullDirectoryListResult() {
        return new GetFullDirectoryListResponse.GetFullDirectoryListResult();
    }

    /**
     * Create an instance of {@link ExternalDirectorySearchResponse }
     * 
     */
    public ExternalDirectorySearchResponse createExternalDirectorySearchResponse() {
        return new ExternalDirectorySearchResponse();
    }

    /**
     * Create an instance of {@link FindLocalUserResponse }
     * 
     */
    public FindLocalUserResponse createFindLocalUserResponse() {
        return new FindLocalUserResponse();
    }

    /**
     * Create an instance of {@link UpdateDirectoryCacheResponse }
     * 
     */
    public UpdateDirectoryCacheResponse createUpdateDirectoryCacheResponse() {
        return new UpdateDirectoryCacheResponse();
    }

    /**
     * Create an instance of {@link GetFullDirectoryList }
     * 
     */
    public GetFullDirectoryList createGetFullDirectoryList() {
        return new GetFullDirectoryList();
    }

    /**
     * Create an instance of {@link FindLocalUser }
     * 
     */
    public FindLocalUser createFindLocalUser() {
        return new FindLocalUser();
    }

    /**
     * Create an instance of {@link GetAddressesByTrustGroupResponse }
     * 
     */
    public GetAddressesByTrustGroupResponse createGetAddressesByTrustGroupResponse() {
        return new GetAddressesByTrustGroupResponse();
    }

    /**
     * Create an instance of {@link GetAddressesByTrustGroup }
     * 
     */
    public GetAddressesByTrustGroup createGetAddressesByTrustGroup() {
        return new GetAddressesByTrustGroup();
    }

    /**
     * Create an instance of {@link PublicDirectorySearchResponse }
     * 
     */
    public PublicDirectorySearchResponse createPublicDirectorySearchResponse() {
        return new PublicDirectorySearchResponse();
    }

    /**
     * Create an instance of {@link DNSCertLookup }
     * 
     */
    public DNSCertLookup createDNSCertLookup() {
        return new DNSCertLookup();
    }

    /**
     * Create an instance of {@link PublicDirectorySearch }
     * 
     */
    public PublicDirectorySearch createPublicDirectorySearch() {
        return new PublicDirectorySearch();
    }

    /**
     * Create an instance of {@link ExternalDirectorySearch }
     * 
     */
    public ExternalDirectorySearch createExternalDirectorySearch() {
        return new ExternalDirectorySearch();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "County", scope = AddressDetail.class)
    public JAXBElement<String> createAddressDetailCounty(String value) {
        return new JAXBElement<String>(_AddressDetailCounty_QNAME, String.class, AddressDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Fax", scope = AddressDetail.class)
    public JAXBElement<String> createAddressDetailFax(String value) {
        return new JAXBElement<String>(_AddressDetailFax_QNAME, String.class, AddressDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Telephone", scope = AddressDetail.class)
    public JAXBElement<String> createAddressDetailTelephone(String value) {
        return new JAXBElement<String>(_AddressDetailTelephone_QNAME, String.class, AddressDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "State", scope = AddressDetail.class)
    public JAXBElement<String> createAddressDetailState(String value) {
        return new JAXBElement<String>(_AddressDetailState_QNAME, String.class, AddressDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "StreetAddress", scope = AddressDetail.class)
    public JAXBElement<String> createAddressDetailStreetAddress(String value) {
        return new JAXBElement<String>(_AddressDetailStreetAddress_QNAME, String.class, AddressDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "City", scope = AddressDetail.class)
    public JAXBElement<String> createAddressDetailCity(String value) {
        return new JAXBElement<String>(_AddressDetailCity_QNAME, String.class, AddressDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "ZipCode", scope = AddressDetail.class)
    public JAXBElement<String> createAddressDetailZipCode(String value) {
        return new JAXBElement<String>(_AddressDetailZipCode_QNAME, String.class, AddressDetail.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExternalSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "ArrayOfExternalSearchResponse")
    public JAXBElement<ArrayOfExternalSearchResponse> createArrayOfExternalSearchResponse(ArrayOfExternalSearchResponse value) {
        return new JAXBElement<ArrayOfExternalSearchResponse>(_ArrayOfExternalSearchResponse_QNAME, ArrayOfExternalSearchResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "AddressDetail")
    public JAXBElement<AddressDetail> createAddressDetail(AddressDetail value) {
        return new JAXBElement<AddressDetail>(_AddressDetail_QNAME, AddressDetail.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStateLicense }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "ArrayOfStateLicense")
    public JAXBElement<ArrayOfStateLicense> createArrayOfStateLicense(ArrayOfStateLicense value) {
        return new JAXBElement<ArrayOfStateLicense>(_ArrayOfStateLicense_QNAME, ArrayOfStateLicense.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPublicSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "ArrayOfPublicSearchResponse")
    public JAXBElement<ArrayOfPublicSearchResponse> createArrayOfPublicSearchResponse(ArrayOfPublicSearchResponse value) {
        return new JAXBElement<ArrayOfPublicSearchResponse>(_ArrayOfPublicSearchResponse_QNAME, ArrayOfPublicSearchResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "ExternalSearchResponse")
    public JAXBElement<ExternalSearchResponse> createExternalSearchResponse(ExternalSearchResponse value) {
        return new JAXBElement<ExternalSearchResponse>(_ExternalSearchResponse_QNAME, ExternalSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "SearchOption")
    public JAXBElement<SearchOption> createSearchOption(SearchOption value) {
        return new JAXBElement<SearchOption>(_SearchOption_QNAME, SearchOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "ExternalSearchRequest")
    public JAXBElement<ExternalSearchRequest> createExternalSearchRequest(ExternalSearchRequest value) {
        return new JAXBElement<ExternalSearchRequest>(_ExternalSearchRequest_QNAME, ExternalSearchRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "PublicSearchResponse")
    public JAXBElement<PublicSearchResponse> createPublicSearchResponse(PublicSearchResponse value) {
        return new JAXBElement<PublicSearchResponse>(_PublicSearchResponse_QNAME, PublicSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "ArrayOfSearchParameter")
    public JAXBElement<ArrayOfSearchParameter> createArrayOfSearchParameter(ArrayOfSearchParameter value) {
        return new JAXBElement<ArrayOfSearchParameter>(_ArrayOfSearchParameter_QNAME, ArrayOfSearchParameter.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "RegistrationType")
    public JAXBElement<RegistrationType> createRegistrationType(RegistrationType value) {
        return new JAXBElement<RegistrationType>(_RegistrationType_QNAME, RegistrationType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "PublicSearchRequest")
    public JAXBElement<PublicSearchRequest> createPublicSearchRequest(PublicSearchRequest value) {
        return new JAXBElement<PublicSearchRequest>(_PublicSearchRequest_QNAME, PublicSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateLicense }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "StateLicense")
    public JAXBElement<StateLicense> createStateLicense(StateLicense value) {
        return new JAXBElement<StateLicense>(_StateLicense_QNAME, StateLicense.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "SearchParameter")
    public JAXBElement<SearchParameter> createSearchParameter(SearchParameter value) {
        return new JAXBElement<SearchParameter>(_SearchParameter_QNAME, SearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2011/Directory/v2", name = "request", scope = ExternalDirectorySearch.class)
    public JAXBElement<ExternalSearchRequest> createExternalDirectorySearchRequest(ExternalSearchRequest value) {
        return new JAXBElement<ExternalSearchRequest>(_ExternalDirectorySearchRequest_QNAME, ExternalSearchRequest.class, ExternalDirectorySearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExternalSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2011/Directory/v2", name = "ExternalDirectorySearchResult", scope = ExternalDirectorySearchResponse.class)
    public JAXBElement<ArrayOfExternalSearchResponse> createExternalDirectorySearchResponseExternalDirectorySearchResult(ArrayOfExternalSearchResponse value) {
        return new JAXBElement<ArrayOfExternalSearchResponse>(_ExternalDirectorySearchResponseExternalDirectorySearchResult_QNAME, ArrayOfExternalSearchResponse.class, ExternalDirectorySearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Keyword", scope = PublicSearchRequest.class)
    public JAXBElement<String> createPublicSearchRequestKeyword(String value) {
        return new JAXBElement<String>(_PublicSearchRequestKeyword_QNAME, String.class, PublicSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Name", scope = PublicSearchRequest.class)
    public JAXBElement<String> createPublicSearchRequestName(String value) {
        return new JAXBElement<String>(_PublicSearchRequestName_QNAME, String.class, PublicSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "SecureEmail", scope = PublicSearchRequest.class)
    public JAXBElement<String> createPublicSearchRequestSecureEmail(String value) {
        return new JAXBElement<String>(_PublicSearchRequestSecureEmail_QNAME, String.class, PublicSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "ContactEmail", scope = PublicSearchRequest.class)
    public JAXBElement<String> createPublicSearchRequestContactEmail(String value) {
        return new JAXBElement<String>(_PublicSearchRequestContactEmail_QNAME, String.class, PublicSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "NPINumber", scope = PublicSearchRequest.class)
    public JAXBElement<String> createPublicSearchRequestNPINumber(String value) {
        return new JAXBElement<String>(_PublicSearchRequestNPINumber_QNAME, String.class, PublicSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "state", scope = PublicSearchRequest.class)
    public JAXBElement<String> createPublicSearchRequestState(String value) {
        return new JAXBElement<String>(_PublicSearchRequestState_QNAME, String.class, PublicSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "StreetAddress", scope = PublicSearchRequest.class)
    public JAXBElement<String> createPublicSearchRequestStreetAddress(String value) {
        return new JAXBElement<String>(_AddressDetailStreetAddress_QNAME, String.class, PublicSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "City", scope = PublicSearchRequest.class)
    public JAXBElement<String> createPublicSearchRequestCity(String value) {
        return new JAXBElement<String>(_AddressDetailCity_QNAME, String.class, PublicSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "ZipCode", scope = PublicSearchRequest.class)
    public JAXBElement<String> createPublicSearchRequestZipCode(String value) {
        return new JAXBElement<String>(_AddressDetailZipCode_QNAME, String.class, PublicSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Specialty", scope = PublicSearchRequest.class)
    public JAXBElement<String> createPublicSearchRequestSpecialty(String value) {
        return new JAXBElement<String>(_PublicSearchRequestSpecialty_QNAME, String.class, PublicSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Name", scope = PublicSearchResponse.class)
    public JAXBElement<String> createPublicSearchResponseName(String value) {
        return new JAXBElement<String>(_PublicSearchRequestName_QNAME, String.class, PublicSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "SecureEmail", scope = PublicSearchResponse.class)
    public JAXBElement<String> createPublicSearchResponseSecureEmail(String value) {
        return new JAXBElement<String>(_PublicSearchRequestSecureEmail_QNAME, String.class, PublicSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "KeyWord", scope = PublicSearchResponse.class)
    public JAXBElement<String> createPublicSearchResponseKeyWord(String value) {
        return new JAXBElement<String>(_PublicSearchResponseKeyWord_QNAME, String.class, PublicSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "NPINumber", scope = PublicSearchResponse.class)
    public JAXBElement<ArrayOfstring> createPublicSearchResponseNPINumber(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_PublicSearchRequestNPINumber_QNAME, ArrayOfstring.class, PublicSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Title", scope = PublicSearchResponse.class)
    public JAXBElement<String> createPublicSearchResponseTitle(String value) {
        return new JAXBElement<String>(_PublicSearchResponseTitle_QNAME, String.class, PublicSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStateLicense }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "StateLicenses", scope = PublicSearchResponse.class)
    public JAXBElement<ArrayOfStateLicense> createPublicSearchResponseStateLicenses(ArrayOfStateLicense value) {
        return new JAXBElement<ArrayOfStateLicense>(_PublicSearchResponseStateLicenses_QNAME, ArrayOfStateLicense.class, PublicSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "PrimaryAddress", scope = PublicSearchResponse.class)
    public JAXBElement<Address> createPublicSearchResponsePrimaryAddress(Address value) {
        return new JAXBElement<Address>(_PublicSearchResponsePrimaryAddress_QNAME, Address.class, PublicSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Specialty", scope = PublicSearchResponse.class)
    public JAXBElement<String> createPublicSearchResponseSpecialty(String value) {
        return new JAXBElement<String>(_PublicSearchRequestSpecialty_QNAME, String.class, PublicSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2011/Directory/v2", name = "DNSCertLookupResult", scope = DNSCertLookupResponse.class)
    public JAXBElement<byte[]> createDNSCertLookupResponseDNSCertLookupResult(byte[] value) {
        return new JAXBElement<byte[]>(_DNSCertLookupResponseDNSCertLookupResult_QNAME, byte[].class, DNSCertLookupResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2011/Directory/v2", name = "request", scope = PublicDirectorySearch.class)
    public JAXBElement<PublicSearchRequest> createPublicDirectorySearchRequest(PublicSearchRequest value) {
        return new JAXBElement<PublicSearchRequest>(_ExternalDirectorySearchRequest_QNAME, PublicSearchRequest.class, PublicDirectorySearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2011/Directory/v2", name = "GetAddressesByTrustGroupResult", scope = GetAddressesByTrustGroupResponse.class)
    public JAXBElement<ArrayOfSesAddress> createGetAddressesByTrustGroupResponseGetAddressesByTrustGroupResult(ArrayOfSesAddress value) {
        return new JAXBElement<ArrayOfSesAddress>(_GetAddressesByTrustGroupResponseGetAddressesByTrustGroupResult_QNAME, ArrayOfSesAddress.class, GetAddressesByTrustGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2011/Directory/v2", name = "domain", scope = GetAddressesByTrustGroup.class)
    public JAXBElement<String> createGetAddressesByTrustGroupDomain(String value) {
        return new JAXBElement<String>(_GetAddressesByTrustGroupDomain_QNAME, String.class, GetAddressesByTrustGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2011/Directory/v2", name = "parameters", scope = FindLocalUser.class)
    public JAXBElement<ArrayOfSearchParameter> createFindLocalUserParameters(ArrayOfSearchParameter value) {
        return new JAXBElement<ArrayOfSearchParameter>(_FindLocalUserParameters_QNAME, ArrayOfSearchParameter.class, FindLocalUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "SearchValue", scope = SearchParameter.class)
    public JAXBElement<String> createSearchParameterSearchValue(String value) {
        return new JAXBElement<String>(_SearchParameterSearchValue_QNAME, String.class, SearchParameter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2011/Directory/v2", name = "email", scope = DNSCertLookup.class)
    public JAXBElement<String> createDNSCertLookupEmail(String value) {
        return new JAXBElement<String>(_DNSCertLookupEmail_QNAME, String.class, DNSCertLookup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPublicSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2011/Directory/v2", name = "PublicDirectorySearchResult", scope = PublicDirectorySearchResponse.class)
    public JAXBElement<ArrayOfPublicSearchResponse> createPublicDirectorySearchResponsePublicDirectorySearchResult(ArrayOfPublicSearchResponse value) {
        return new JAXBElement<ArrayOfPublicSearchResponse>(_PublicDirectorySearchResponsePublicDirectorySearchResult_QNAME, ArrayOfPublicSearchResponse.class, PublicDirectorySearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "State", scope = StateLicense.class)
    public JAXBElement<String> createStateLicenseState(String value) {
        return new JAXBElement<String>(_AddressDetailState_QNAME, String.class, StateLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "StateLicNumber", scope = StateLicense.class)
    public JAXBElement<String> createStateLicenseStateLicNumber(String value) {
        return new JAXBElement<String>(_StateLicenseStateLicNumber_QNAME, String.class, StateLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "NPInumber", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestNPInumber(String value) {
        return new JAXBElement<String>(_ExternalSearchRequestNPInumber_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Fax", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestFax(String value) {
        return new JAXBElement<String>(_AddressDetailFax_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Telephone", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestTelephone(String value) {
        return new JAXBElement<String>(_AddressDetailTelephone_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "DirectorySource", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestDirectorySource(String value) {
        return new JAXBElement<String>(_ExternalSearchRequestDirectorySource_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Organization", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestOrganization(String value) {
        return new JAXBElement<String>(_ExternalSearchRequestOrganization_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Speciality", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestSpeciality(String value) {
        return new JAXBElement<String>(_ExternalSearchRequestSpeciality_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "City", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestCity(String value) {
        return new JAXBElement<String>(_AddressDetailCity_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "HISPOrganization", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestHISPOrganization(String value) {
        return new JAXBElement<String>(_ExternalSearchRequestHISPOrganization_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "ZipCode", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestZipCode(String value) {
        return new JAXBElement<String>(_AddressDetailZipCode_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "County", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestCounty(String value) {
        return new JAXBElement<String>(_AddressDetailCounty_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Name", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestName(String value) {
        return new JAXBElement<String>(_PublicSearchRequestName_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "SecureEmail", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestSecureEmail(String value) {
        return new JAXBElement<String>(_PublicSearchRequestSecureEmail_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "State", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestState(String value) {
        return new JAXBElement<String>(_AddressDetailState_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "StreetAddress", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestStreetAddress(String value) {
        return new JAXBElement<String>(_AddressDetailStreetAddress_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "EmailContact", scope = ExternalSearchRequest.class)
    public JAXBElement<String> createExternalSearchRequestEmailContact(String value) {
        return new JAXBElement<String>(_ExternalSearchRequestEmailContact_QNAME, String.class, ExternalSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Name", scope = ExternalSearchResponse.class)
    public JAXBElement<String> createExternalSearchResponseName(String value) {
        return new JAXBElement<String>(_PublicSearchRequestName_QNAME, String.class, ExternalSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "SecureEmail", scope = ExternalSearchResponse.class)
    public JAXBElement<String> createExternalSearchResponseSecureEmail(String value) {
        return new JAXBElement<String>(_PublicSearchRequestSecureEmail_QNAME, String.class, ExternalSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "NPI", scope = ExternalSearchResponse.class)
    public JAXBElement<String> createExternalSearchResponseNPI(String value) {
        return new JAXBElement<String>(_ExternalSearchResponseNPI_QNAME, String.class, ExternalSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "DirectorySource", scope = ExternalSearchResponse.class)
    public JAXBElement<String> createExternalSearchResponseDirectorySource(String value) {
        return new JAXBElement<String>(_ExternalSearchRequestDirectorySource_QNAME, String.class, ExternalSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Speciality", scope = ExternalSearchResponse.class)
    public JAXBElement<String> createExternalSearchResponseSpeciality(String value) {
        return new JAXBElement<String>(_ExternalSearchRequestSpeciality_QNAME, String.class, ExternalSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Organization", scope = ExternalSearchResponse.class)
    public JAXBElement<String> createExternalSearchResponseOrganization(String value) {
        return new JAXBElement<String>(_ExternalSearchRequestOrganization_QNAME, String.class, ExternalSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "HISPOrganization", scope = ExternalSearchResponse.class)
    public JAXBElement<String> createExternalSearchResponseHISPOrganization(String value) {
        return new JAXBElement<String>(_ExternalSearchRequestHISPOrganization_QNAME, String.class, ExternalSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "PrimaryAddress", scope = ExternalSearchResponse.class)
    public JAXBElement<AddressDetail> createExternalSearchResponsePrimaryAddress(AddressDetail value) {
        return new JAXBElement<AddressDetail>(_PublicSearchResponsePrimaryAddress_QNAME, AddressDetail.class, ExternalSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "EmailContact", scope = ExternalSearchResponse.class)
    public JAXBElement<String> createExternalSearchResponseEmailContact(String value) {
        return new JAXBElement<String>(_ExternalSearchRequestEmailContact_QNAME, String.class, ExternalSearchResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullDirectoryListResponse.GetFullDirectoryListResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2011/Directory/v2", name = "getFullDirectoryListResult", scope = GetFullDirectoryListResponse.class)
    public JAXBElement<GetFullDirectoryListResponse.GetFullDirectoryListResult> createGetFullDirectoryListResponseGetFullDirectoryListResult(GetFullDirectoryListResponse.GetFullDirectoryListResult value) {
        return new JAXBElement<GetFullDirectoryListResponse.GetFullDirectoryListResult>(_GetFullDirectoryListResponseGetFullDirectoryListResult_QNAME, GetFullDirectoryListResponse.GetFullDirectoryListResult.class, GetFullDirectoryListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Street", scope = Address.class)
    public JAXBElement<String> createAddressStreet(String value) {
        return new JAXBElement<String>(_AddressStreet_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Phone", scope = Address.class)
    public JAXBElement<String> createAddressPhone(String value) {
        return new JAXBElement<String>(_AddressPhone_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "ZIP", scope = Address.class)
    public JAXBElement<String> createAddressZIP(String value) {
        return new JAXBElement<String>(_AddressZIP_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "County", scope = Address.class)
    public JAXBElement<String> createAddressCounty(String value) {
        return new JAXBElement<String>(_AddressDetailCounty_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "Fax", scope = Address.class)
    public JAXBElement<String> createAddressFax(String value) {
        return new JAXBElement<String>(_AddressDetailFax_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "State", scope = Address.class)
    public JAXBElement<String> createAddressState(String value) {
        return new JAXBElement<String>(_AddressDetailState_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", name = "City", scope = Address.class)
    public JAXBElement<String> createAddressCity(String value) {
        return new JAXBElement<String>(_AddressDetailCity_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSesAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://secureexchangesolutions.com/2011/Directory/v2", name = "FindLocalUserResult", scope = FindLocalUserResponse.class)
    public JAXBElement<ArrayOfSesAddress> createFindLocalUserResponseFindLocalUserResult(ArrayOfSesAddress value) {
        return new JAXBElement<ArrayOfSesAddress>(_FindLocalUserResponseFindLocalUserResult_QNAME, ArrayOfSesAddress.class, FindLocalUserResponse.class, value);
    }

}
