
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.exacttarget.wsdl.partnerapi.Subscriber.Addresses;


/**
 * <p>Java class for Subscriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscriber">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://exacttarget.com/wsdl/partnerAPI}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnsubscribedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberStatus" minOccurs="0"/>
 *         &lt;element name="PartnerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailTypePreference" type="{http://exacttarget.com/wsdl/partnerAPI}EmailType" minOccurs="0"/>
 *         &lt;element name="Lists" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GlobalUnsubscribeCategory" type="{http://exacttarget.com/wsdl/partnerAPI}GlobalUnsubscribeCategory" minOccurs="0"/>
 *         &lt;element name="SubscriberTypeDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberTypeDefinition" minOccurs="0"/>
 *         &lt;element name="Addresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Address" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberAddress" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrimarySMSAddress" type="{http://exacttarget.com/wsdl/partnerAPI}SMSAddress" minOccurs="0"/>
 *         &lt;element name="PrimarySMSPublicationStatus" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberAddressStatus" minOccurs="0"/>
 *         &lt;element name="PrimaryEmailAddress" type="{http://exacttarget.com/wsdl/partnerAPI}EmailAddress" minOccurs="0"/>
 *         &lt;element name="Locale" type="{http://exacttarget.com/wsdl/partnerAPI}Locale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscriber", propOrder = {
    "emailAddress",
    "attributes",
    "subscriberKey",
    "unsubscribedDate",
    "status",
    "partnerType",
    "emailTypePreference",
    "lists",
    "globalUnsubscribeCategory",
    "subscriberTypeDefinition",
    "addresses",
    "primarySMSAddress",
    "primarySMSPublicationStatus",
    "primaryEmailAddress",
    "locale"
})
public class Subscriber
    extends APIObject
{

    @XmlElement(name = "EmailAddress", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String emailAddress;
    @XmlElement(name = "Attributes", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<Attribute> attributes;
    @XmlElement(name = "SubscriberKey", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String subscriberKey;
    @XmlElement(name = "UnsubscribedDate", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar unsubscribedDate;
    @XmlElement(name = "Status", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected SubscriberStatus status;
    @XmlElement(name = "PartnerType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String partnerType;
    @XmlElement(name = "EmailTypePreference", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected EmailType emailTypePreference;
    @XmlElement(name = "Lists", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<SubscriberList> lists;
    @XmlElement(name = "GlobalUnsubscribeCategory", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected GlobalUnsubscribeCategory globalUnsubscribeCategory;
    @XmlElement(name = "SubscriberTypeDefinition", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected SubscriberTypeDefinition subscriberTypeDefinition;
    @XmlElement(name = "Addresses", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Addresses addresses;
    @XmlElement(name = "PrimarySMSAddress", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected SMSAddress primarySMSAddress;
    @XmlElement(name = "PrimarySMSPublicationStatus", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected SubscriberAddressStatus primarySMSPublicationStatus;
    @XmlElement(name = "PrimaryEmailAddress", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected EmailAddress primaryEmailAddress;
    @XmlElement(name = "Locale", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Locale locale;

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * 
     * 
     */
    public List<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<Attribute>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the subscriberKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberKey() {
        return subscriberKey;
    }

    /**
     * Sets the value of the subscriberKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberKey(String value) {
        this.subscriberKey = value;
    }

    /**
     * Gets the value of the unsubscribedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnsubscribedDate() {
        return unsubscribedDate;
    }

    /**
     * Sets the value of the unsubscribedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnsubscribedDate(XMLGregorianCalendar value) {
        this.unsubscribedDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberStatus }
     *     
     */
    public SubscriberStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberStatus }
     *     
     */
    public void setStatus(SubscriberStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the partnerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerType() {
        return partnerType;
    }

    /**
     * Sets the value of the partnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerType(String value) {
        this.partnerType = value;
    }

    /**
     * Gets the value of the emailTypePreference property.
     * 
     * @return
     *     possible object is
     *     {@link EmailType }
     *     
     */
    public EmailType getEmailTypePreference() {
        return emailTypePreference;
    }

    /**
     * Sets the value of the emailTypePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *     
     */
    public void setEmailTypePreference(EmailType value) {
        this.emailTypePreference = value;
    }

    /**
     * Gets the value of the lists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberList }
     * 
     * 
     */
    public List<SubscriberList> getLists() {
        if (lists == null) {
            lists = new ArrayList<SubscriberList>();
        }
        return this.lists;
    }

    /**
     * Gets the value of the globalUnsubscribeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalUnsubscribeCategory }
     *     
     */
    public GlobalUnsubscribeCategory getGlobalUnsubscribeCategory() {
        return globalUnsubscribeCategory;
    }

    /**
     * Sets the value of the globalUnsubscribeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalUnsubscribeCategory }
     *     
     */
    public void setGlobalUnsubscribeCategory(GlobalUnsubscribeCategory value) {
        this.globalUnsubscribeCategory = value;
    }

    /**
     * Gets the value of the subscriberTypeDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberTypeDefinition }
     *     
     */
    public SubscriberTypeDefinition getSubscriberTypeDefinition() {
        return subscriberTypeDefinition;
    }

    /**
     * Sets the value of the subscriberTypeDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberTypeDefinition }
     *     
     */
    public void setSubscriberTypeDefinition(SubscriberTypeDefinition value) {
        this.subscriberTypeDefinition = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link Addresses }
     *     
     */
    public Addresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Addresses }
     *     
     */
    public void setAddresses(Addresses value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the primarySMSAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SMSAddress }
     *     
     */
    public SMSAddress getPrimarySMSAddress() {
        return primarySMSAddress;
    }

    /**
     * Sets the value of the primarySMSAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSAddress }
     *     
     */
    public void setPrimarySMSAddress(SMSAddress value) {
        this.primarySMSAddress = value;
    }

    /**
     * Gets the value of the primarySMSPublicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberAddressStatus }
     *     
     */
    public SubscriberAddressStatus getPrimarySMSPublicationStatus() {
        return primarySMSPublicationStatus;
    }

    /**
     * Sets the value of the primarySMSPublicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberAddressStatus }
     *     
     */
    public void setPrimarySMSPublicationStatus(SubscriberAddressStatus value) {
        this.primarySMSPublicationStatus = value;
    }

    /**
     * Gets the value of the primaryEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddress }
     *     
     */
    public EmailAddress getPrimaryEmailAddress() {
        return primaryEmailAddress;
    }

    /**
     * Sets the value of the primaryEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setPrimaryEmailAddress(EmailAddress value) {
        this.primaryEmailAddress = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link Locale }
     *     
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locale }
     *     
     */
    public void setLocale(Locale value) {
        this.locale = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Address" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberAddress" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "address"
    })
    public static class Addresses {

        @XmlElement(name = "Address", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<SubscriberAddress> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubscriberAddress }
         * 
         * 
         */
        public List<SubscriberAddress> getAddress() {
            if (address == null) {
                address = new ArrayList<SubscriberAddress>();
            }
            return this.address;
        }

    }

}
