
package com.sesengine.wsdl.client.publicdirectorysearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPublicSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPublicSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublicSearchResponse" type="{http://schemas.datacontract.org/2004/07/Ses.Directory.Model}PublicSearchResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPublicSearchResponse", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", propOrder = {
    "publicSearchResponse"
})
public class ArrayOfPublicSearchResponse {

    @XmlElement(name = "PublicSearchResponse", nillable = true)
    protected List<PublicSearchResponse> publicSearchResponse;

    /**
     * Gets the value of the publicSearchResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicSearchResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicSearchResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicSearchResponse }
     * 
     * 
     */
    public List<PublicSearchResponse> getPublicSearchResponse() {
        if (publicSearchResponse == null) {
            publicSearchResponse = new ArrayList<PublicSearchResponse>();
        }
        return this.publicSearchResponse;
    }

}
