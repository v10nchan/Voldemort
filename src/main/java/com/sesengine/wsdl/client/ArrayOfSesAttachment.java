
package com.sesengine.wsdl.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSesAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSesAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SesAttachment" type="{http://schemas.datacontract.org/2004/07/Ses.Core.Model}SesAttachment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSesAttachment", namespace = "http://schemas.datacontract.org/2004/07/Ses.Core.Model", propOrder = {
    "sesAttachment"
})
public class ArrayOfSesAttachment {

    @XmlElement(name = "SesAttachment", nillable = true)
    protected List<SesAttachment> sesAttachment;

    /**
     * Gets the value of the sesAttachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sesAttachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSesAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SesAttachment }
     * 
     * 
     */
    public List<SesAttachment> getSesAttachment() {
        if (sesAttachment == null) {
            sesAttachment = new ArrayList<SesAttachment>();
        }
        return this.sesAttachment;
    }

}
