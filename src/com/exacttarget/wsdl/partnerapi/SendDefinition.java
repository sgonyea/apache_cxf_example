
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}InteractionDefinition">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SendClassification" type="{http://exacttarget.com/wsdl/partnerAPI}SendClassification" minOccurs="0"/>
 *         &lt;element name="SenderProfile" type="{http://exacttarget.com/wsdl/partnerAPI}SenderProfile" minOccurs="0"/>
 *         &lt;element name="FromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryProfile" type="{http://exacttarget.com/wsdl/partnerAPI}DeliveryProfile" minOccurs="0"/>
 *         &lt;element name="SourceAddressType" type="{http://exacttarget.com/wsdl/partnerAPI}DeliveryProfileSourceAddressTypeEnum" minOccurs="0"/>
 *         &lt;element name="PrivateIP" type="{http://exacttarget.com/wsdl/partnerAPI}PrivateIP" minOccurs="0"/>
 *         &lt;element name="DomainType" type="{http://exacttarget.com/wsdl/partnerAPI}DeliveryProfileDomainTypeEnum" minOccurs="0"/>
 *         &lt;element name="PrivateDomain" type="{http://exacttarget.com/wsdl/partnerAPI}PrivateDomain" minOccurs="0"/>
 *         &lt;element name="HeaderSalutationSource" type="{http://exacttarget.com/wsdl/partnerAPI}SalutationSourceEnum" minOccurs="0"/>
 *         &lt;element name="HeaderContentArea" type="{http://exacttarget.com/wsdl/partnerAPI}ContentArea" minOccurs="0"/>
 *         &lt;element name="FooterSalutationSource" type="{http://exacttarget.com/wsdl/partnerAPI}SalutationSourceEnum" minOccurs="0"/>
 *         &lt;element name="FooterContentArea" type="{http://exacttarget.com/wsdl/partnerAPI}ContentArea" minOccurs="0"/>
 *         &lt;element name="SuppressTracking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSendLogging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendDefinition", propOrder = {
    "categoryID",
    "sendClassification",
    "senderProfile",
    "fromName",
    "fromAddress",
    "deliveryProfile",
    "sourceAddressType",
    "privateIP",
    "domainType",
    "privateDomain",
    "headerSalutationSource",
    "headerContentArea",
    "footerSalutationSource",
    "footerContentArea",
    "suppressTracking",
    "isSendLogging"
})
public class SendDefinition
    extends InteractionDefinition
{

    @XmlElement(name = "CategoryID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer categoryID;
    @XmlElement(name = "SendClassification", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected SendClassification sendClassification;
    @XmlElement(name = "SenderProfile", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected SenderProfile senderProfile;
    @XmlElement(name = "FromName", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String fromName;
    @XmlElement(name = "FromAddress", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String fromAddress;
    @XmlElement(name = "DeliveryProfile", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected DeliveryProfile deliveryProfile;
    @XmlElement(name = "SourceAddressType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected DeliveryProfileSourceAddressTypeEnum sourceAddressType;
    @XmlElement(name = "PrivateIP", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected PrivateIP privateIP;
    @XmlElement(name = "DomainType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected DeliveryProfileDomainTypeEnum domainType;
    @XmlElement(name = "PrivateDomain", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected PrivateDomain privateDomain;
    @XmlElement(name = "HeaderSalutationSource", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected SalutationSourceEnum headerSalutationSource;
    @XmlElement(name = "HeaderContentArea", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ContentArea headerContentArea;
    @XmlElement(name = "FooterSalutationSource", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected SalutationSourceEnum footerSalutationSource;
    @XmlElement(name = "FooterContentArea", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ContentArea footerContentArea;
    @XmlElement(name = "SuppressTracking", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean suppressTracking;
    @XmlElement(name = "IsSendLogging", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isSendLogging;

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryID(Integer value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the sendClassification property.
     * 
     * @return
     *     possible object is
     *     {@link SendClassification }
     *     
     */
    public SendClassification getSendClassification() {
        return sendClassification;
    }

    /**
     * Sets the value of the sendClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendClassification }
     *     
     */
    public void setSendClassification(SendClassification value) {
        this.sendClassification = value;
    }

    /**
     * Gets the value of the senderProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SenderProfile }
     *     
     */
    public SenderProfile getSenderProfile() {
        return senderProfile;
    }

    /**
     * Sets the value of the senderProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderProfile }
     *     
     */
    public void setSenderProfile(SenderProfile value) {
        this.senderProfile = value;
    }

    /**
     * Gets the value of the fromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Sets the value of the fromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Gets the value of the fromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * Sets the value of the fromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAddress(String value) {
        this.fromAddress = value;
    }

    /**
     * Gets the value of the deliveryProfile property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryProfile }
     *     
     */
    public DeliveryProfile getDeliveryProfile() {
        return deliveryProfile;
    }

    /**
     * Sets the value of the deliveryProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryProfile }
     *     
     */
    public void setDeliveryProfile(DeliveryProfile value) {
        this.deliveryProfile = value;
    }

    /**
     * Gets the value of the sourceAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryProfileSourceAddressTypeEnum }
     *     
     */
    public DeliveryProfileSourceAddressTypeEnum getSourceAddressType() {
        return sourceAddressType;
    }

    /**
     * Sets the value of the sourceAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryProfileSourceAddressTypeEnum }
     *     
     */
    public void setSourceAddressType(DeliveryProfileSourceAddressTypeEnum value) {
        this.sourceAddressType = value;
    }

    /**
     * Gets the value of the privateIP property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateIP }
     *     
     */
    public PrivateIP getPrivateIP() {
        return privateIP;
    }

    /**
     * Sets the value of the privateIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateIP }
     *     
     */
    public void setPrivateIP(PrivateIP value) {
        this.privateIP = value;
    }

    /**
     * Gets the value of the domainType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryProfileDomainTypeEnum }
     *     
     */
    public DeliveryProfileDomainTypeEnum getDomainType() {
        return domainType;
    }

    /**
     * Sets the value of the domainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryProfileDomainTypeEnum }
     *     
     */
    public void setDomainType(DeliveryProfileDomainTypeEnum value) {
        this.domainType = value;
    }

    /**
     * Gets the value of the privateDomain property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateDomain }
     *     
     */
    public PrivateDomain getPrivateDomain() {
        return privateDomain;
    }

    /**
     * Sets the value of the privateDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateDomain }
     *     
     */
    public void setPrivateDomain(PrivateDomain value) {
        this.privateDomain = value;
    }

    /**
     * Gets the value of the headerSalutationSource property.
     * 
     * @return
     *     possible object is
     *     {@link SalutationSourceEnum }
     *     
     */
    public SalutationSourceEnum getHeaderSalutationSource() {
        return headerSalutationSource;
    }

    /**
     * Sets the value of the headerSalutationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalutationSourceEnum }
     *     
     */
    public void setHeaderSalutationSource(SalutationSourceEnum value) {
        this.headerSalutationSource = value;
    }

    /**
     * Gets the value of the headerContentArea property.
     * 
     * @return
     *     possible object is
     *     {@link ContentArea }
     *     
     */
    public ContentArea getHeaderContentArea() {
        return headerContentArea;
    }

    /**
     * Sets the value of the headerContentArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentArea }
     *     
     */
    public void setHeaderContentArea(ContentArea value) {
        this.headerContentArea = value;
    }

    /**
     * Gets the value of the footerSalutationSource property.
     * 
     * @return
     *     possible object is
     *     {@link SalutationSourceEnum }
     *     
     */
    public SalutationSourceEnum getFooterSalutationSource() {
        return footerSalutationSource;
    }

    /**
     * Sets the value of the footerSalutationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalutationSourceEnum }
     *     
     */
    public void setFooterSalutationSource(SalutationSourceEnum value) {
        this.footerSalutationSource = value;
    }

    /**
     * Gets the value of the footerContentArea property.
     * 
     * @return
     *     possible object is
     *     {@link ContentArea }
     *     
     */
    public ContentArea getFooterContentArea() {
        return footerContentArea;
    }

    /**
     * Sets the value of the footerContentArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentArea }
     *     
     */
    public void setFooterContentArea(ContentArea value) {
        this.footerContentArea = value;
    }

    /**
     * Gets the value of the suppressTracking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressTracking() {
        return suppressTracking;
    }

    /**
     * Sets the value of the suppressTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressTracking(Boolean value) {
        this.suppressTracking = value;
    }

    /**
     * Gets the value of the isSendLogging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSendLogging() {
        return isSendLogging;
    }

    /**
     * Sets the value of the isSendLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSendLogging(Boolean value) {
        this.isSendLogging = value;
    }

}
