
package com.sesengine.wsdl.client.publicdirectorysearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSesAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSesAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SesAddress" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}SesAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSesAddress", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", propOrder = {
    "sesAddress"
})
public class ArrayOfSesAddress {

    @XmlElement(name = "SesAddress", nillable = true)
    protected List<SesAddress> sesAddress;

    /**
     * Gets the value of the sesAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sesAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSesAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SesAddress }
     * 
     * 
     */
    public List<SesAddress> getSesAddress() {
        if (sesAddress == null) {
            sesAddress = new ArrayList<SesAddress>();
        }
        return this.sesAddress;
    }

}
