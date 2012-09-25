
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Deprecated.
 * 
 * <p>Java class for MessagingVendorKind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessagingVendorKind">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Kind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsUsernameRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPasswordRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsProfileRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessagingVendorKind", propOrder = {
    "vendor",
    "kind",
    "isUsernameRequired",
    "isPasswordRequired",
    "isProfileRequired"
})
public class MessagingVendorKind
    extends APIObject
{

    @XmlElement(name = "Vendor", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String vendor;
    @XmlElement(name = "Kind", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String kind;
    @XmlElement(name = "IsUsernameRequired", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected boolean isUsernameRequired;
    @XmlElement(name = "IsPasswordRequired", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected boolean isPasswordRequired;
    @XmlElement(name = "IsProfileRequired", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected boolean isProfileRequired;

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the isUsernameRequired property.
     * 
     */
    public boolean isIsUsernameRequired() {
        return isUsernameRequired;
    }

    /**
     * Sets the value of the isUsernameRequired property.
     * 
     */
    public void setIsUsernameRequired(boolean value) {
        this.isUsernameRequired = value;
    }

    /**
     * Gets the value of the isPasswordRequired property.
     * 
     */
    public boolean isIsPasswordRequired() {
        return isPasswordRequired;
    }

    /**
     * Sets the value of the isPasswordRequired property.
     * 
     */
    public void setIsPasswordRequired(boolean value) {
        this.isPasswordRequired = value;
    }

    /**
     * Gets the value of the isProfileRequired property.
     * 
     */
    public boolean isIsProfileRequired() {
        return isProfileRequired;
    }

    /**
     * Sets the value of the isProfileRequired property.
     * 
     */
    public void setIsProfileRequired(boolean value) {
        this.isProfileRequired = value;
    }

}
