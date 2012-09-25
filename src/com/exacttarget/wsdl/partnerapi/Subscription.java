
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Subscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EmailsPurchased" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccountsPurchased" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdvAccountsPurchased" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LPAccountsPurchased" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DOTOAccountsPurchased" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BUAccountsPurchased" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Period" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NotificationTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotificationMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotificationFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotificationExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ForAccounting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasPurchasedEmails" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractModifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsRenewal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = {
    "subscriptionID",
    "emailsPurchased",
    "accountsPurchased",
    "advAccountsPurchased",
    "lpAccountsPurchased",
    "dotoAccountsPurchased",
    "buAccountsPurchased",
    "beginDate",
    "endDate",
    "notes",
    "period",
    "notificationTitle",
    "notificationMessage",
    "notificationFlag",
    "notificationExpDate",
    "forAccounting",
    "hasPurchasedEmails",
    "contractNumber",
    "contractModifier",
    "isRenewal"
})
public class Subscription {

    @XmlElementRef(name = "SubscriptionID", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<Integer> subscriptionID;
    @XmlElement(name = "EmailsPurchased", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected int emailsPurchased;
    @XmlElement(name = "AccountsPurchased", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected int accountsPurchased;
    @XmlElement(name = "AdvAccountsPurchased", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected int advAccountsPurchased;
    @XmlElement(name = "LPAccountsPurchased", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected int lpAccountsPurchased;
    @XmlElement(name = "DOTOAccountsPurchased", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected int dotoAccountsPurchased;
    @XmlElement(name = "BUAccountsPurchased", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected int buAccountsPurchased;
    @XmlElement(name = "BeginDate", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "EndDate", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected XMLGregorianCalendar endDate;
    @XmlElementRef(name = "Notes", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<String> notes;
    @XmlElement(name = "Period", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String period;
    @XmlElementRef(name = "NotificationTitle", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<String> notificationTitle;
    @XmlElementRef(name = "NotificationMessage", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<String> notificationMessage;
    @XmlElementRef(name = "NotificationFlag", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<String> notificationFlag;
    @XmlElementRef(name = "NotificationExpDate", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> notificationExpDate;
    @XmlElementRef(name = "ForAccounting", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<String> forAccounting;
    @XmlElement(name = "HasPurchasedEmails", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected boolean hasPurchasedEmails;
    @XmlElement(name = "ContractNumber", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String contractNumber;
    @XmlElement(name = "ContractModifier", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String contractModifier;
    @XmlElement(name = "IsRenewal", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isRenewal;

    /**
     * Gets the value of the subscriptionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Sets the value of the subscriptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSubscriptionID(JAXBElement<Integer> value) {
        this.subscriptionID = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the emailsPurchased property.
     * 
     */
    public int getEmailsPurchased() {
        return emailsPurchased;
    }

    /**
     * Sets the value of the emailsPurchased property.
     * 
     */
    public void setEmailsPurchased(int value) {
        this.emailsPurchased = value;
    }

    /**
     * Gets the value of the accountsPurchased property.
     * 
     */
    public int getAccountsPurchased() {
        return accountsPurchased;
    }

    /**
     * Sets the value of the accountsPurchased property.
     * 
     */
    public void setAccountsPurchased(int value) {
        this.accountsPurchased = value;
    }

    /**
     * Gets the value of the advAccountsPurchased property.
     * 
     */
    public int getAdvAccountsPurchased() {
        return advAccountsPurchased;
    }

    /**
     * Sets the value of the advAccountsPurchased property.
     * 
     */
    public void setAdvAccountsPurchased(int value) {
        this.advAccountsPurchased = value;
    }

    /**
     * Gets the value of the lpAccountsPurchased property.
     * 
     */
    public int getLPAccountsPurchased() {
        return lpAccountsPurchased;
    }

    /**
     * Sets the value of the lpAccountsPurchased property.
     * 
     */
    public void setLPAccountsPurchased(int value) {
        this.lpAccountsPurchased = value;
    }

    /**
     * Gets the value of the dotoAccountsPurchased property.
     * 
     */
    public int getDOTOAccountsPurchased() {
        return dotoAccountsPurchased;
    }

    /**
     * Sets the value of the dotoAccountsPurchased property.
     * 
     */
    public void setDOTOAccountsPurchased(int value) {
        this.dotoAccountsPurchased = value;
    }

    /**
     * Gets the value of the buAccountsPurchased property.
     * 
     */
    public int getBUAccountsPurchased() {
        return buAccountsPurchased;
    }

    /**
     * Sets the value of the buAccountsPurchased property.
     * 
     */
    public void setBUAccountsPurchased(int value) {
        this.buAccountsPurchased = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the notificationTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationTitle() {
        return notificationTitle;
    }

    /**
     * Sets the value of the notificationTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationTitle(JAXBElement<String> value) {
        this.notificationTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the notificationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationMessage() {
        return notificationMessage;
    }

    /**
     * Sets the value of the notificationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationMessage(JAXBElement<String> value) {
        this.notificationMessage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the notificationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationFlag() {
        return notificationFlag;
    }

    /**
     * Sets the value of the notificationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationFlag(JAXBElement<String> value) {
        this.notificationFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the notificationExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNotificationExpDate() {
        return notificationExpDate;
    }

    /**
     * Sets the value of the notificationExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNotificationExpDate(JAXBElement<XMLGregorianCalendar> value) {
        this.notificationExpDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the forAccounting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForAccounting() {
        return forAccounting;
    }

    /**
     * Sets the value of the forAccounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForAccounting(JAXBElement<String> value) {
        this.forAccounting = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hasPurchasedEmails property.
     * 
     */
    public boolean isHasPurchasedEmails() {
        return hasPurchasedEmails;
    }

    /**
     * Sets the value of the hasPurchasedEmails property.
     * 
     */
    public void setHasPurchasedEmails(boolean value) {
        this.hasPurchasedEmails = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the contractModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractModifier() {
        return contractModifier;
    }

    /**
     * Sets the value of the contractModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractModifier(String value) {
        this.contractModifier = value;
    }

    /**
     * Gets the value of the isRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRenewal() {
        return isRenewal;
    }

    /**
     * Sets the value of the isRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRenewal(Boolean value) {
        this.isRenewal = value;
    }

}
