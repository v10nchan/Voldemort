
package com.sesengine.wsdl.client.publicdirectorysearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStateLicense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStateLicense">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StateLicense" type="{http://schemas.datacontract.org/2004/07/Ses.Directory.Model}StateLicense" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStateLicense", namespace = "http://schemas.datacontract.org/2004/07/Ses.Directory.Model", propOrder = {
    "stateLicense"
})
public class ArrayOfStateLicense {

    @XmlElement(name = "StateLicense", nillable = true)
    protected List<StateLicense> stateLicense;

    /**
     * Gets the value of the stateLicense property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateLicense property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateLicense }
     * 
     * 
     */
    public List<StateLicense> getStateLicense() {
        if (stateLicense == null) {
            stateLicense = new ArrayList<StateLicense>();
        }
        return this.stateLicense;
    }

}
