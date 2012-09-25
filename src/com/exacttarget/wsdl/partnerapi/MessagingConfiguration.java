
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Deprecated.
 * 
 * <p>Java class for MessagingConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessagingConfiguration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MessagingVendorKind" type="{http://exacttarget.com/wsdl/partnerAPI}MessagingVendorKind"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProfileID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CallbackUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MediaTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessagingConfiguration", propOrder = {
    "code",
    "messagingVendorKind",
    "isActive",
    "url",
    "userName",
    "password",
    "profileID",
    "callbackUrl",
    "mediaTypes"
})
public class MessagingConfiguration
    extends APIObject
{

    @XmlElement(name = "Code", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String code;
    @XmlElement(name = "MessagingVendorKind", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected MessagingVendorKind messagingVendorKind;
    @XmlElement(name = "IsActive", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected boolean isActive;
    @XmlElement(name = "Url", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String url;
    @XmlElement(name = "UserName", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String userName;
    @XmlElement(name = "Password", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String password;
    @XmlElement(name = "ProfileID", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String profileID;
    @XmlElement(name = "CallbackUrl", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String callbackUrl;
    @XmlElement(name = "MediaTypes", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String mediaTypes;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the messagingVendorKind property.
     * 
     * @return
     *     possible object is
     *     {@link MessagingVendorKind }
     *     
     */
    public MessagingVendorKind getMessagingVendorKind() {
        return messagingVendorKind;
    }

    /**
     * Sets the value of the messagingVendorKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagingVendorKind }
     *     
     */
    public void setMessagingVendorKind(MessagingVendorKind value) {
        this.messagingVendorKind = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the callbackUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * Sets the value of the callbackUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackUrl(String value) {
        this.callbackUrl = value;
    }

    /**
     * Gets the value of the mediaTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTypes() {
        return mediaTypes;
    }

    /**
     * Sets the value of the mediaTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTypes(String value) {
        this.mediaTypes = value;
    }

}
