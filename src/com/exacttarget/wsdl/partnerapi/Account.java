
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="AccountType" type="{http://exacttarget.com/wsdl/partnerAPI}AccountTypeEnum"/>
 *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BrandID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrivateLabelID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReportingParentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsTestAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DBID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DeletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EditionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Children" type="{http://exacttarget.com/wsdl/partnerAPI}AccountDataItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Subscription" type="{http://exacttarget.com/wsdl/partnerAPI}Subscription" minOccurs="0"/>
 *         &lt;element name="PrivateLabels" type="{http://exacttarget.com/wsdl/partnerAPI}PrivateLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusinessRules" type="{http://exacttarget.com/wsdl/partnerAPI}BusinessRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AccountUsers" type="{http://exacttarget.com/wsdl/partnerAPI}AccountUser" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InheritAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTrialAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "Account", propOrder = {
    "accountType",
    "parentID",
    "brandID",
    "privateLabelID",
    "reportingParentID",
    "name",
    "email",
    "fromName",
    "businessName",
    "phone",
    "address",
    "fax",
    "city",
    "state",
    "zip",
    "country",
    "isActive",
    "isTestAccount",
    "orgID",
    "dbid",
    "parentName",
    "customerID",
    "deletedDate",
    "editionID",
    "children",
    "subscription",
    "privateLabels",
    "businessRules",
    "accountUsers",
    "inheritAddress",
    "isTrialAccount",
    "locale"
})
public class Account
    extends APIObject
{

    @XmlElement(name = "AccountType", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected AccountTypeEnum accountType;
    @XmlElement(name = "ParentID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer parentID;
    @XmlElement(name = "BrandID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer brandID;
    @XmlElement(name = "PrivateLabelID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer privateLabelID;
    @XmlElement(name = "ReportingParentID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer reportingParentID;
    @XmlElement(name = "Name", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String name;
    @XmlElement(name = "Email", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String email;
    @XmlElement(name = "FromName", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String fromName;
    @XmlElement(name = "BusinessName", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String businessName;
    @XmlElement(name = "Phone", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String phone;
    @XmlElement(name = "Address", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String address;
    @XmlElement(name = "Fax", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String fax;
    @XmlElement(name = "City", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String city;
    @XmlElement(name = "State", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String state;
    @XmlElement(name = "Zip", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String zip;
    @XmlElement(name = "Country", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String country;
    @XmlElement(name = "IsActive", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer isActive;
    @XmlElement(name = "IsTestAccount", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isTestAccount;
    @XmlElement(name = "OrgID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer orgID;
    @XmlElement(name = "DBID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer dbid;
    @XmlElement(name = "ParentName", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String parentName;
    @XmlElement(name = "CustomerID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Long customerID;
    @XmlElement(name = "DeletedDate", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar deletedDate;
    @XmlElement(name = "EditionID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer editionID;
    @XmlElement(name = "Children", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true, nillable = true)
    protected List<AccountDataItem> children;
    @XmlElementRef(name = "Subscription", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<Subscription> subscription;
    @XmlElement(name = "PrivateLabels", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true, nillable = true)
    protected List<PrivateLabel> privateLabels;
    @XmlElement(name = "BusinessRules", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true, nillable = true)
    protected List<BusinessRule> businessRules;
    @XmlElement(name = "AccountUsers", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true, nillable = true)
    protected List<AccountUser> accountUsers;
    @XmlElement(name = "InheritAddress", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean inheritAddress;
    @XmlElement(name = "IsTrialAccount", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isTrialAccount;
    @XmlElement(name = "Locale", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Locale locale;

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypeEnum }
     *     
     */
    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypeEnum }
     *     
     */
    public void setAccountType(AccountTypeEnum value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the parentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentID(Integer value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the brandID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBrandID() {
        return brandID;
    }

    /**
     * Sets the value of the brandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBrandID(Integer value) {
        this.brandID = value;
    }

    /**
     * Gets the value of the privateLabelID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrivateLabelID() {
        return privateLabelID;
    }

    /**
     * Sets the value of the privateLabelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrivateLabelID(Integer value) {
        this.privateLabelID = value;
    }

    /**
     * Gets the value of the reportingParentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportingParentID() {
        return reportingParentID;
    }

    /**
     * Sets the value of the reportingParentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportingParentID(Integer value) {
        this.reportingParentID = value;
    }

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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsActive(Integer value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isTestAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTestAccount() {
        return isTestAccount;
    }

    /**
     * Sets the value of the isTestAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTestAccount(Boolean value) {
        this.isTestAccount = value;
    }

    /**
     * Gets the value of the orgID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrgID() {
        return orgID;
    }

    /**
     * Sets the value of the orgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrgID(Integer value) {
        this.orgID = value;
    }

    /**
     * Gets the value of the dbid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDBID() {
        return dbid;
    }

    /**
     * Sets the value of the dbid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDBID(Integer value) {
        this.dbid = value;
    }

    /**
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentName(String value) {
        this.parentName = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerID(Long value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the deletedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeletedDate() {
        return deletedDate;
    }

    /**
     * Sets the value of the deletedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeletedDate(XMLGregorianCalendar value) {
        this.deletedDate = value;
    }

    /**
     * Gets the value of the editionID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEditionID() {
        return editionID;
    }

    /**
     * Sets the value of the editionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEditionID(Integer value) {
        this.editionID = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the children property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountDataItem }
     * 
     * 
     */
    public List<AccountDataItem> getChildren() {
        if (children == null) {
            children = new ArrayList<AccountDataItem>();
        }
        return this.children;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     *     
     */
    public JAXBElement<Subscription> getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     *     
     */
    public void setSubscription(JAXBElement<Subscription> value) {
        this.subscription = ((JAXBElement<Subscription> ) value);
    }

    /**
     * Gets the value of the privateLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privateLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivateLabel }
     * 
     * 
     */
    public List<PrivateLabel> getPrivateLabels() {
        if (privateLabels == null) {
            privateLabels = new ArrayList<PrivateLabel>();
        }
        return this.privateLabels;
    }

    /**
     * Gets the value of the businessRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessRule }
     * 
     * 
     */
    public List<BusinessRule> getBusinessRules() {
        if (businessRules == null) {
            businessRules = new ArrayList<BusinessRule>();
        }
        return this.businessRules;
    }

    /**
     * Gets the value of the accountUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountUser }
     * 
     * 
     */
    public List<AccountUser> getAccountUsers() {
        if (accountUsers == null) {
            accountUsers = new ArrayList<AccountUser>();
        }
        return this.accountUsers;
    }

    /**
     * Gets the value of the inheritAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritAddress() {
        return inheritAddress;
    }

    /**
     * Sets the value of the inheritAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritAddress(Boolean value) {
        this.inheritAddress = value;
    }

    /**
     * Gets the value of the isTrialAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTrialAccount() {
        return isTrialAccount;
    }

    /**
     * Sets the value of the isTrialAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTrialAccount(Boolean value) {
        this.isTrialAccount = value;
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

}
