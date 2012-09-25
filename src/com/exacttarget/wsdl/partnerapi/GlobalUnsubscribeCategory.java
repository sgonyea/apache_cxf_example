
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalUnsubscribeCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalUnsubscribeCategory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IgnorableByPartners" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Ignore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalUnsubscribeCategory", propOrder = {
    "name",
    "ignorableByPartners",
    "ignore"
})
public class GlobalUnsubscribeCategory
    extends APIObject
{

    @XmlElement(name = "Name", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String name;
    @XmlElement(name = "IgnorableByPartners", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected boolean ignorableByPartners;
    @XmlElement(name = "Ignore", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected boolean ignore;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the ignorableByPartners property.
     * 
     */
    public boolean isIgnorableByPartners() {
        return ignorableByPartners;
    }

    /**
     * Sets the value of the ignorableByPartners property.
     * 
     */
    public void setIgnorableByPartners(boolean value) {
        this.ignorableByPartners = value;
    }

    /**
     * Gets the value of the ignore property.
     * 
     */
    public boolean isIgnore() {
        return ignore;
    }

    /**
     * Sets the value of the ignore property.
     * 
     */
    public void setIgnore(boolean value) {
        this.ignore = value;
    }

}
