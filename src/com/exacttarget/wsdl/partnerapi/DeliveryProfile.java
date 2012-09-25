
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceAddressType" type="{http://exacttarget.com/wsdl/partnerAPI}DeliveryProfileSourceAddressTypeEnum" minOccurs="0"/>
 *         &lt;element name="PrivateIP" type="{http://exacttarget.com/wsdl/partnerAPI}PrivateIP" minOccurs="0"/>
 *         &lt;element name="DomainType" type="{http://exacttarget.com/wsdl/partnerAPI}DeliveryProfileDomainTypeEnum" minOccurs="0"/>
 *         &lt;element name="PrivateDomain" type="{http://exacttarget.com/wsdl/partnerAPI}PrivateDomain" minOccurs="0"/>
 *         &lt;element name="HeaderSalutationSource" type="{http://exacttarget.com/wsdl/partnerAPI}SalutationSourceEnum" minOccurs="0"/>
 *         &lt;element name="HeaderContentArea" type="{http://exacttarget.com/wsdl/partnerAPI}ContentArea" minOccurs="0"/>
 *         &lt;element name="FooterSalutationSource" type="{http://exacttarget.com/wsdl/partnerAPI}SalutationSourceEnum" minOccurs="0"/>
 *         &lt;element name="FooterContentArea" type="{http://exacttarget.com/wsdl/partnerAPI}ContentArea" minOccurs="0"/>
 *         &lt;element name="SubscriberLevelPrivateDomain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryProfile", propOrder = {
    "name",
    "description",
    "sourceAddressType",
    "privateIP",
    "domainType",
    "privateDomain",
    "headerSalutationSource",
    "headerContentArea",
    "footerSalutationSource",
    "footerContentArea",
    "subscriberLevelPrivateDomain"
})
public class DeliveryProfile
    extends APIObject
{

    @XmlElement(name = "Name", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String name;
    @XmlElement(name = "Description", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String description;
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
    @XmlElement(name = "SubscriberLevelPrivateDomain", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean subscriberLevelPrivateDomain;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the subscriberLevelPrivateDomain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscriberLevelPrivateDomain() {
        return subscriberLevelPrivateDomain;
    }

    /**
     * Sets the value of the subscriberLevelPrivateDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscriberLevelPrivateDomain(Boolean value) {
        this.subscriberLevelPrivateDomain = value;
    }

}
