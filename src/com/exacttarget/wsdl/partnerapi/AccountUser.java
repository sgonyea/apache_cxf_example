
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
 * <p>Java class for AccountUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="AccountUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MustChangePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ChallengePhrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChallengeAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserPermissions" type="{http://exacttarget.com/wsdl/partnerAPI}UserAccess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastSuccessfulLogin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsAPIUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NotificationEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Unlock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BusinessUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DefaultBusinessUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountUser", propOrder = {
    "accountUserID",
    "userID",
    "password",
    "name",
    "email",
    "mustChangePassword",
    "activeFlag",
    "challengePhrase",
    "challengeAnswer",
    "userPermissions",
    "delete",
    "lastSuccessfulLogin",
    "isAPIUser",
    "notificationEmailAddress",
    "isLocked",
    "unlock",
    "businessUnit",
    "defaultBusinessUnit"
})
public class AccountUser
    extends APIObject
{

    @XmlElementRef(name = "AccountUserID", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<Integer> accountUserID;
    @XmlElement(name = "UserID", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String userID;
    @XmlElement(name = "Password", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String password;
    @XmlElement(name = "Name", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String name;
    @XmlElement(name = "Email", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String email;
    @XmlElement(name = "MustChangePassword", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean mustChangePassword;
    @XmlElement(name = "ActiveFlag", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean activeFlag;
    @XmlElement(name = "ChallengePhrase", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String challengePhrase;
    @XmlElement(name = "ChallengeAnswer", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String challengeAnswer;
    @XmlElement(name = "UserPermissions", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true, nillable = true)
    protected List<UserAccess> userPermissions;
    @XmlElement(name = "Delete", namespace = "http://exacttarget.com/wsdl/partnerAPI", defaultValue = "0")
    protected int delete;
    @XmlElement(name = "LastSuccessfulLogin", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar lastSuccessfulLogin;
    @XmlElement(name = "IsAPIUser", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isAPIUser;
    @XmlElement(name = "NotificationEmailAddress", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String notificationEmailAddress;
    @XmlElement(name = "IsLocked", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isLocked;
    @XmlElement(name = "Unlock", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean unlock;
    @XmlElement(name = "BusinessUnit", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer businessUnit;
    @XmlElement(name = "DefaultBusinessUnit", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer defaultBusinessUnit;

    /**
     * Gets the value of the accountUserID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAccountUserID() {
        return accountUserID;
    }

    /**
     * Sets the value of the accountUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAccountUserID(JAXBElement<Integer> value) {
        this.accountUserID = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
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
     * Gets the value of the mustChangePassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustChangePassword() {
        return mustChangePassword;
    }

    /**
     * Sets the value of the mustChangePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustChangePassword(Boolean value) {
        this.mustChangePassword = value;
    }

    /**
     * Gets the value of the activeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveFlag(Boolean value) {
        this.activeFlag = value;
    }

    /**
     * Gets the value of the challengePhrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengePhrase() {
        return challengePhrase;
    }

    /**
     * Sets the value of the challengePhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengePhrase(String value) {
        this.challengePhrase = value;
    }

    /**
     * Gets the value of the challengeAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeAnswer() {
        return challengeAnswer;
    }

    /**
     * Sets the value of the challengeAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeAnswer(String value) {
        this.challengeAnswer = value;
    }

    /**
     * Gets the value of the userPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAccess }
     * 
     * 
     */
    public List<UserAccess> getUserPermissions() {
        if (userPermissions == null) {
            userPermissions = new ArrayList<UserAccess>();
        }
        return this.userPermissions;
    }

    /**
     * Gets the value of the delete property.
     * 
     */
    public int getDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     */
    public void setDelete(int value) {
        this.delete = value;
    }

    /**
     * Gets the value of the lastSuccessfulLogin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSuccessfulLogin() {
        return lastSuccessfulLogin;
    }

    /**
     * Sets the value of the lastSuccessfulLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSuccessfulLogin(XMLGregorianCalendar value) {
        this.lastSuccessfulLogin = value;
    }

    /**
     * Gets the value of the isAPIUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAPIUser() {
        return isAPIUser;
    }

    /**
     * Sets the value of the isAPIUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAPIUser(Boolean value) {
        this.isAPIUser = value;
    }

    /**
     * Gets the value of the notificationEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEmailAddress() {
        return notificationEmailAddress;
    }

    /**
     * Sets the value of the notificationEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEmailAddress(String value) {
        this.notificationEmailAddress = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLocked(Boolean value) {
        this.isLocked = value;
    }

    /**
     * Gets the value of the unlock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlock() {
        return unlock;
    }

    /**
     * Sets the value of the unlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlock(Boolean value) {
        this.unlock = value;
    }

    /**
     * Gets the value of the businessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the value of the businessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusinessUnit(Integer value) {
        this.businessUnit = value;
    }

    /**
     * Gets the value of the defaultBusinessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultBusinessUnit() {
        return defaultBusinessUnit;
    }

    /**
     * Sets the value of the defaultBusinessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultBusinessUnit(Integer value) {
        this.defaultBusinessUnit = value;
    }

}
