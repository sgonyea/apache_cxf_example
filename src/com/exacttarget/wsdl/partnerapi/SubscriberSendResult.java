
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubscriberSendResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberSendResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="Send" type="{http://exacttarget.com/wsdl/partnerAPI}Send" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://exacttarget.com/wsdl/partnerAPI}Email" minOccurs="0"/>
 *         &lt;element name="Subscriber" type="{http://exacttarget.com/wsdl/partnerAPI}Subscriber" minOccurs="0"/>
 *         &lt;element name="ClickDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BounceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnsubscribeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalClicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UniqueClicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViewSentEmailURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardBounces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SoftBounces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OtherBounces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberSendResult", propOrder = {
    "send",
    "email",
    "subscriber",
    "clickDate",
    "bounceDate",
    "openDate",
    "sentDate",
    "lastAction",
    "unsubscribeDate",
    "fromAddress",
    "fromName",
    "totalClicks",
    "uniqueClicks",
    "subject",
    "viewSentEmailURL",
    "hardBounces",
    "softBounces",
    "otherBounces"
})
public class SubscriberSendResult
    extends APIObject
{

    @XmlElement(name = "Send", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Send send;
    @XmlElement(name = "Email", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Email email;
    @XmlElement(name = "Subscriber", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Subscriber subscriber;
    @XmlElement(name = "ClickDate", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar clickDate;
    @XmlElement(name = "BounceDate", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar bounceDate;
    @XmlElement(name = "OpenDate", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar openDate;
    @XmlElement(name = "SentDate", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar sentDate;
    @XmlElement(name = "LastAction", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String lastAction;
    @XmlElement(name = "UnsubscribeDate", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar unsubscribeDate;
    @XmlElement(name = "FromAddress", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String fromAddress;
    @XmlElement(name = "FromName", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String fromName;
    @XmlElement(name = "TotalClicks", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer totalClicks;
    @XmlElement(name = "UniqueClicks", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer uniqueClicks;
    @XmlElement(name = "Subject", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String subject;
    @XmlElement(name = "ViewSentEmailURL", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String viewSentEmailURL;
    @XmlElement(name = "HardBounces", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer hardBounces;
    @XmlElement(name = "SoftBounces", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer softBounces;
    @XmlElement(name = "OtherBounces", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer otherBounces;

    /**
     * Gets the value of the send property.
     * 
     * @return
     *     possible object is
     *     {@link Send }
     *     
     */
    public Send getSend() {
        return send;
    }

    /**
     * Sets the value of the send property.
     * 
     * @param value
     *     allowed object is
     *     {@link Send }
     *     
     */
    public void setSend(Send value) {
        this.send = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link Subscriber }
     *     
     */
    public Subscriber getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscriber }
     *     
     */
    public void setSubscriber(Subscriber value) {
        this.subscriber = value;
    }

    /**
     * Gets the value of the clickDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClickDate() {
        return clickDate;
    }

    /**
     * Sets the value of the clickDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClickDate(XMLGregorianCalendar value) {
        this.clickDate = value;
    }

    /**
     * Gets the value of the bounceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBounceDate() {
        return bounceDate;
    }

    /**
     * Sets the value of the bounceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBounceDate(XMLGregorianCalendar value) {
        this.bounceDate = value;
    }

    /**
     * Gets the value of the openDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDate() {
        return openDate;
    }

    /**
     * Sets the value of the openDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenDate(XMLGregorianCalendar value) {
        this.openDate = value;
    }

    /**
     * Gets the value of the sentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentDate() {
        return sentDate;
    }

    /**
     * Sets the value of the sentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentDate(XMLGregorianCalendar value) {
        this.sentDate = value;
    }

    /**
     * Gets the value of the lastAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastAction() {
        return lastAction;
    }

    /**
     * Sets the value of the lastAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAction(String value) {
        this.lastAction = value;
    }

    /**
     * Gets the value of the unsubscribeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnsubscribeDate() {
        return unsubscribeDate;
    }

    /**
     * Sets the value of the unsubscribeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnsubscribeDate(XMLGregorianCalendar value) {
        this.unsubscribeDate = value;
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
     * Gets the value of the totalClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalClicks() {
        return totalClicks;
    }

    /**
     * Sets the value of the totalClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalClicks(Integer value) {
        this.totalClicks = value;
    }

    /**
     * Gets the value of the uniqueClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueClicks() {
        return uniqueClicks;
    }

    /**
     * Sets the value of the uniqueClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueClicks(Integer value) {
        this.uniqueClicks = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the viewSentEmailURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewSentEmailURL() {
        return viewSentEmailURL;
    }

    /**
     * Sets the value of the viewSentEmailURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewSentEmailURL(String value) {
        this.viewSentEmailURL = value;
    }

    /**
     * Gets the value of the hardBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHardBounces() {
        return hardBounces;
    }

    /**
     * Sets the value of the hardBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHardBounces(Integer value) {
        this.hardBounces = value;
    }

    /**
     * Gets the value of the softBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSoftBounces() {
        return softBounces;
    }

    /**
     * Sets the value of the softBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSoftBounces(Integer value) {
        this.softBounces = value;
    }

    /**
     * Gets the value of the otherBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOtherBounces() {
        return otherBounces;
    }

    /**
     * Sets the value of the otherBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOtherBounces(Integer value) {
        this.otherBounces = value;
    }

}
