//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.22 at 05:14:23 PM IST 
//


package com.ccd.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A name for a person, organization, place or thing. A
 *             sequence of name parts, such as given name or family
 *             name, prefix, suffix, etc. Examples for entity name
 *             values are "Jim Bob Walton, Jr.", "Health Level Seven,
 *             Inc.", "Lake Tahoe", etc. An entity name may be as simple
 *             as a character string or may consist of several entity name
 *             parts, such as, "Jim", "Bob", "Walton", and "Jr.", "Health
 *             Level Seven" and "Inc.", "Lake" and "Tahoe".
 *          
 * 
 * <p>Java class for EN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EN">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}ANY">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="delimiter" type="{urn:hl7-org:v3}en.delimiter"/>
 *           &lt;element name="family" type="{urn:hl7-org:v3}en.family"/>
 *           &lt;element name="given" type="{urn:hl7-org:v3}en.given"/>
 *           &lt;element name="prefix" type="{urn:hl7-org:v3}en.prefix"/>
 *           &lt;element name="suffix" type="{urn:hl7-org:v3}en.suffix"/>
 *         &lt;/choice>
 *         &lt;element name="validTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="use" type="{urn:hl7-org:v3}set_EntityNameUse" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EN", propOrder = {
    "delimiterOrFamilyOrGiven",
    "validTime"
})
public class EN
    extends ANY
{

    @XmlElements({
        @XmlElement(name = "family", namespace = "urn:hl7-org:v3", required = true, type = EnFamily.class),
        @XmlElement(name = "delimiter", namespace = "urn:hl7-org:v3", required = true, type = EnDelimiter.class),
        @XmlElement(name = "suffix", namespace = "urn:hl7-org:v3", required = true, type = EnSuffix.class),
        @XmlElement(name = "prefix", namespace = "urn:hl7-org:v3", required = true, type = EnPrefix.class),
        @XmlElement(name = "given", namespace = "urn:hl7-org:v3", required = true, type = EnGiven.class)
    })
    protected List<ENXP> delimiterOrFamilyOrGiven;
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected IVLTS validTime;
    @XmlAttribute
    protected List<String> use;

    /**
     * Gets the value of the delimiterOrFamilyOrGiven property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delimiterOrFamilyOrGiven property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelimiterOrFamilyOrGiven().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnFamily }
     * {@link EnDelimiter }
     * {@link EnSuffix }
     * {@link EnPrefix }
     * {@link EnGiven }
     * 
     * 
     */
    public List<ENXP> getDelimiterOrFamilyOrGiven() {
        if (delimiterOrFamilyOrGiven == null) {
            delimiterOrFamilyOrGiven = new ArrayList<ENXP>();
        }
        return this.delimiterOrFamilyOrGiven;
    }

    /**
     * Gets the value of the validTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getValidTime() {
        return validTime;
    }

    /**
     * Sets the value of the validTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setValidTime(IVLTS value) {
        this.validTime = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the use property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUse() {
        if (use == null) {
            use = new ArrayList<String>();
        }
        return this.use;
    }

}
