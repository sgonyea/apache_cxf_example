
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TriggeredSendDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggeredSendDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}SendDefinition">
 *       &lt;sequence>
 *         &lt;element name="TriggeredSendType" type="{http://exacttarget.com/wsdl/partnerAPI}TriggeredSendTypeEnum" minOccurs="0"/>
 *         &lt;element name="TriggeredSendStatus" type="{http://exacttarget.com/wsdl/partnerAPI}TriggeredSendStatusEnum" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://exacttarget.com/wsdl/partnerAPI}Email" minOccurs="0"/>
 *         &lt;element name="List" type="{http://exacttarget.com/wsdl/partnerAPI}List" minOccurs="0"/>
 *         &lt;element name="AutoAddSubscribers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoUpdateSubscribers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BatchInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BccEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DynamicEmailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsMultipart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWrapped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowedSlots" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="NewSlotTrigger" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SendLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SendWindowOpen" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="SendWindowClose" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="SendWindowDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RefreshContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExclusionFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendSourceCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExclusionListCollection" type="{http://exacttarget.com/wsdl/partnerAPI}TriggeredSendExclusionList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CCEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendSourceDataExtension" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtension" minOccurs="0"/>
 *         &lt;element name="IsAlwaysOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisableOnEmailBuildError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggeredSendDefinition", propOrder = {
    "triggeredSendType",
    "triggeredSendStatus",
    "email",
    "list",
    "autoAddSubscribers",
    "autoUpdateSubscribers",
    "batchInterval",
    "bccEmail",
    "emailSubject",
    "dynamicEmailSubject",
    "isMultipart",
    "isWrapped",
    "allowedSlots",
    "newSlotTrigger",
    "sendLimit",
    "sendWindowOpen",
    "sendWindowClose",
    "sendWindowDelete",
    "refreshContent",
    "exclusionFilter",
    "priority",
    "sendSourceCustomerKey",
    "exclusionListCollection",
    "ccEmail",
    "sendSourceDataExtension",
    "isAlwaysOn",
    "disableOnEmailBuildError"
})
public class TriggeredSendDefinition
    extends SendDefinition
{

    @XmlElement(name = "TriggeredSendType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected TriggeredSendTypeEnum triggeredSendType;
    @XmlElement(name = "TriggeredSendStatus", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected TriggeredSendStatusEnum triggeredSendStatus;
    @XmlElement(name = "Email", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Email email;
    @XmlElement(name = "List", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected com.exacttarget.wsdl.partnerapi.List list;
    @XmlElement(name = "AutoAddSubscribers", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean autoAddSubscribers;
    @XmlElement(name = "AutoUpdateSubscribers", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean autoUpdateSubscribers;
    @XmlElement(name = "BatchInterval", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer batchInterval;
    @XmlElement(name = "BccEmail", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String bccEmail;
    @XmlElement(name = "EmailSubject", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String emailSubject;
    @XmlElement(name = "DynamicEmailSubject", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String dynamicEmailSubject;
    @XmlElement(name = "IsMultipart", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isMultipart;
    @XmlElement(name = "IsWrapped", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isWrapped;
    @XmlElement(name = "AllowedSlots", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Short allowedSlots;
    @XmlElement(name = "NewSlotTrigger", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer newSlotTrigger;
    @XmlElement(name = "SendLimit", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer sendLimit;
    @XmlElement(name = "SendWindowOpen", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar sendWindowOpen;
    @XmlElement(name = "SendWindowClose", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar sendWindowClose;
    @XmlElement(name = "SendWindowDelete", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean sendWindowDelete;
    @XmlElement(name = "RefreshContent", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean refreshContent;
    @XmlElement(name = "ExclusionFilter", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String exclusionFilter;
    @XmlElement(name = "Priority", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String priority;
    @XmlElement(name = "SendSourceCustomerKey", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String sendSourceCustomerKey;
    @XmlElement(name = "ExclusionListCollection", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected java.util.List<TriggeredSendExclusionList> exclusionListCollection;
    @XmlElement(name = "CCEmail", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String ccEmail;
    @XmlElement(name = "SendSourceDataExtension", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected DataExtension sendSourceDataExtension;
    @XmlElement(name = "IsAlwaysOn", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isAlwaysOn;
    @XmlElement(name = "DisableOnEmailBuildError", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean disableOnEmailBuildError;

    /**
     * Gets the value of the triggeredSendType property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredSendTypeEnum }
     *     
     */
    public TriggeredSendTypeEnum getTriggeredSendType() {
        return triggeredSendType;
    }

    /**
     * Sets the value of the triggeredSendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredSendTypeEnum }
     *     
     */
    public void setTriggeredSendType(TriggeredSendTypeEnum value) {
        this.triggeredSendType = value;
    }

    /**
     * Gets the value of the triggeredSendStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredSendStatusEnum }
     *     
     */
    public TriggeredSendStatusEnum getTriggeredSendStatus() {
        return triggeredSendStatus;
    }

    /**
     * Sets the value of the triggeredSendStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredSendStatusEnum }
     *     
     */
    public void setTriggeredSendStatus(TriggeredSendStatusEnum value) {
        this.triggeredSendStatus = value;
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
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link com.exacttarget.wsdl.partnerapi.List }
     *     
     */
    public com.exacttarget.wsdl.partnerapi.List getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.exacttarget.wsdl.partnerapi.List }
     *     
     */
    public void setList(com.exacttarget.wsdl.partnerapi.List value) {
        this.list = value;
    }

    /**
     * Gets the value of the autoAddSubscribers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoAddSubscribers() {
        return autoAddSubscribers;
    }

    /**
     * Sets the value of the autoAddSubscribers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoAddSubscribers(Boolean value) {
        this.autoAddSubscribers = value;
    }

    /**
     * Gets the value of the autoUpdateSubscribers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoUpdateSubscribers() {
        return autoUpdateSubscribers;
    }

    /**
     * Sets the value of the autoUpdateSubscribers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoUpdateSubscribers(Boolean value) {
        this.autoUpdateSubscribers = value;
    }

    /**
     * Gets the value of the batchInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchInterval() {
        return batchInterval;
    }

    /**
     * Sets the value of the batchInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchInterval(Integer value) {
        this.batchInterval = value;
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
     * Gets the value of the allowedSlots property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAllowedSlots() {
        return allowedSlots;
    }

    /**
     * Sets the value of the allowedSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAllowedSlots(Short value) {
        this.allowedSlots = value;
    }

    /**
     * Gets the value of the newSlotTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewSlotTrigger() {
        return newSlotTrigger;
    }

    /**
     * Sets the value of the newSlotTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewSlotTrigger(Integer value) {
        this.newSlotTrigger = value;
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
     * Gets the value of the refreshContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefreshContent() {
        return refreshContent;
    }

    /**
     * Sets the value of the refreshContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefreshContent(Boolean value) {
        this.refreshContent = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the sendSourceCustomerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendSourceCustomerKey() {
        return sendSourceCustomerKey;
    }

    /**
     * Sets the value of the sendSourceCustomerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendSourceCustomerKey(String value) {
        this.sendSourceCustomerKey = value;
    }

    /**
     * Gets the value of the exclusionListCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionListCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusionListCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TriggeredSendExclusionList }
     * 
     * 
     */
    public java.util.List<TriggeredSendExclusionList> getExclusionListCollection() {
        if (exclusionListCollection == null) {
            exclusionListCollection = new ArrayList<TriggeredSendExclusionList>();
        }
        return this.exclusionListCollection;
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
     * Gets the value of the sendSourceDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtension }
     *     
     */
    public DataExtension getSendSourceDataExtension() {
        return sendSourceDataExtension;
    }

    /**
     * Sets the value of the sendSourceDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtension }
     *     
     */
    public void setSendSourceDataExtension(DataExtension value) {
        this.sendSourceDataExtension = value;
    }

    /**
     * Gets the value of the isAlwaysOn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlwaysOn() {
        return isAlwaysOn;
    }

    /**
     * Sets the value of the isAlwaysOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlwaysOn(Boolean value) {
        this.isAlwaysOn = value;
    }

    /**
     * Gets the value of the disableOnEmailBuildError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableOnEmailBuildError() {
        return disableOnEmailBuildError;
    }

    /**
     * Sets the value of the disableOnEmailBuildError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableOnEmailBuildError(Boolean value) {
        this.disableOnEmailBuildError = value;
    }

}
