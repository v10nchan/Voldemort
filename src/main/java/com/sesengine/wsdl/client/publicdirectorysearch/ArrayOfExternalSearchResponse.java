
package com.sesengine.wsdl.client.publicdirectorysearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExternalSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExternalSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalSearchResponse" type="{http://schemas.datacontract.org/2004/07/Ses.Directory.Model}ExternalSearchResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExternalSearchResponse", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", propOrder = {
    "externalSearchResponse"
})
public class ArrayOfExternalSearchResponse {

    @XmlElement(name = "ExternalSearchResponse", nillable = true)
    protected List<ExternalSearchResponse> externalSearchResponse;

    /**
     * Gets the value of the externalSearchResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalSearchResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalSearchResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalSearchResponse }
     * 
     * 
     */
    public List<ExternalSearchResponse> getExternalSearchResponse() {
        if (externalSearchResponse == null) {
            externalSearchResponse = new ArrayList<ExternalSearchResponse>();
        }
        return this.externalSearchResponse;
    }

}
