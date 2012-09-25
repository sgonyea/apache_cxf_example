
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers;


/**
 * <p>Java class for EmailSendDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailSendDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}SendDefinition">
 *       &lt;sequence>
 *         &lt;element name="SendDefinitionList" type="{http://exacttarget.com/wsdl/partnerAPI}SendDefinitionList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://exacttarget.com/wsdl/partnerAPI}Email" minOccurs="0"/>
 *         &lt;element name="BccEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoBccEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TestEmailAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DynamicEmailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsMultipart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWrapped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SendWindowOpen" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="SendWindowClose" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="SendWindowDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeduplicateByEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExclusionFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingUsers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TrackingUser" type="{http://exacttarget.com/wsdl/partnerAPI}TrackingUser" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Additional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailSendDefinition", propOrder = {
    "sendDefinitionList",
    "email",
    "bccEmail",
    "autoBccEmail",
    "testEmailAddr",
    "emailSubject",
    "dynamicEmailSubject",
    "isMultipart",
    "isWrapped",
    "sendLimit",
    "sendWindowOpen",
    "sendWindowClose",
    "sendWindowDelete",
    "deduplicateByEmail",
    "exclusionFilter",
    "trackingUsers",
    "additional",
    "ccEmail"
})
public class EmailSendDefinition
    extends SendDefinition
{

    @XmlElement(name = "SendDefinitionList", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<SendDefinitionList> sendDefinitionList;
    @XmlElement(name = "Email", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Email email;
    @XmlElement(name = "BccEmail", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String bccEmail;
    @XmlElement(name = "AutoBccEmail", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String autoBccEmail;
    @XmlElement(name = "TestEmailAddr", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String testEmailAddr;
    @XmlElement(name = "EmailSubject", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String emailSubject;
    @XmlElement(name = "DynamicEmailSubject", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String dynamicEmailSubject;
    @XmlElement(name = "IsMultipart", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isMultipart;
    @XmlElement(name = "IsWrapped", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isWrapped;
    @XmlElement(name = "SendLimit", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer sendLimit;
    @XmlElement(name = "SendWindowOpen", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar sendWindowOpen;
    @XmlElement(name = "SendWindowClose", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar sendWindowClose;
    @XmlElement(name = "SendWindowDelete", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean sendWindowDelete;
    @XmlElement(name = "DeduplicateByEmail", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean deduplicateByEmail;
    @XmlElement(name = "ExclusionFilter", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String exclusionFilter;
    @XmlElement(name = "TrackingUsers", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected TrackingUsers trackingUsers;
    @XmlElement(name = "Additional", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String additional;
    @XmlElement(name = "CCEmail", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String ccEmail;

    /**
     * Gets the value of the sendDefinitionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sendDefinitionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSendDefinitionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SendDefinitionList }
     * 
     * 
     */
    public List<SendDefinitionList> getSendDefinitionList() {
        if (sendDefinitionList == null) {
            sendDefinitionList = new ArrayList<SendDefinitionList>();
        }
        return this.sendDefinitionList;
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
     * Gets the value of the bccEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBccEmail() {
        return bccEmail;
    }

    /**
     * Sets the value of the bccEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBccEmail(String value) {
        this.bccEmail = value;
    }

    /**
     * Gets the value of the autoBccEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoBccEmail() {
        return autoBccEmail;
    }

    /**
     * Sets the value of the autoBccEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoBccEmail(String value) {
        this.autoBccEmail = value;
    }

    /**
     * Gets the value of the testEmailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestEmailAddr() {
        return testEmailAddr;
    }

    /**
     * Sets the value of the testEmailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestEmailAddr(String value) {
        this.testEmailAddr = value;
    }

    /**
     * Gets the value of the emailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * Sets the value of the emailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSubject(String value) {
        this.emailSubject = value;
    }

    /**
     * Gets the value of the dynamicEmailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicEmailSubject() {
        return dynamicEmailSubject;
    }

    /**
     * Sets the value of the dynamicEmailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicEmailSubject(String value) {
        this.dynamicEmailSubject = value;
    }

    /**
     * Gets the value of the isMultipart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultipart() {
        return isMultipart;
    }

    /**
     * Sets the value of the isMultipart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultipart(Boolean value) {
        this.isMultipart = value;
    }

    /**
     * Gets the value of the isWrapped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWrapped() {
        return isWrapped;
    }

    /**
     * Sets the value of the isWrapped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWrapped(Boolean value) {
        this.isWrapped = value;
    }

    /**
     * Gets the value of the sendLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendLimit() {
        return sendLimit;
    }

    /**
     * Sets the value of the sendLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendLimit(Integer value) {
        this.sendLimit = value;
    }

    /**
     * Gets the value of the sendWindowOpen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendWindowOpen() {
        return sendWindowOpen;
    }

    /**
     * Sets the value of the sendWindowOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendWindowOpen(XMLGregorianCalendar value) {
        this.sendWindowOpen = value;
    }

    /**
     * Gets the value of the sendWindowClose property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendWindowClose() {
        return sendWindowClose;
    }

    /**
     * Sets the value of the sendWindowClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendWindowClose(XMLGregorianCalendar value) {
        this.sendWindowClose = value;
    }

    /**
     * Gets the value of the sendWindowDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendWindowDelete() {
        return sendWindowDelete;
    }

    /**
     * Sets the value of the sendWindowDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendWindowDelete(Boolean value) {
        this.sendWindowDelete = value;
    }

    /**
     * Gets the value of the deduplicateByEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeduplicateByEmail() {
        return deduplicateByEmail;
    }

    /**
     * Sets the value of the deduplicateByEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeduplicateByEmail(Boolean value) {
        this.deduplicateByEmail = value;
    }

    /**
     * Gets the value of the exclusionFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionFilter() {
        return exclusionFilter;
    }

    /**
     * Sets the value of the exclusionFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionFilter(String value) {
        this.exclusionFilter = value;
    }

    /**
     * Gets the value of the trackingUsers property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingUsers }
     *     
     */
    public TrackingUsers getTrackingUsers() {
        return trackingUsers;
    }

    /**
     * Sets the value of the trackingUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingUsers }
     *     
     */
    public void setTrackingUsers(TrackingUsers value) {
        this.trackingUsers = value;
    }

    /**
     * Gets the value of the additional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditional() {
        return additional;
    }

    /**
     * Sets the value of the additional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditional(String value) {
        this.additional = value;
    }

    /**
     * Gets the value of the ccEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCEmail() {
        return ccEmail;
    }

    /**
     * Sets the value of the ccEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCEmail(String value) {
        this.ccEmail = value;
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
     *         &lt;element name="TrackingUser" type="{http://exacttarget.com/wsdl/partnerAPI}TrackingUser" maxOccurs="unbounded" minOccurs="0"/>
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
        "trackingUser"
    })
    public static class TrackingUsers {

        @XmlElement(name = "TrackingUser", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<TrackingUser> trackingUser;

        /**
         * Gets the value of the trackingUser property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trackingUser property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrackingUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrackingUser }
         * 
         * 
         */
        public List<TrackingUser> getTrackingUser() {
            if (trackingUser == null) {
                trackingUser = new ArrayList<TrackingUser>();
            }
            return this.trackingUser;
        }

    }

}
