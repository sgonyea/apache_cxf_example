
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListSend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListSend">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="SendID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="List" type="{http://exacttarget.com/wsdl/partnerAPI}List" minOccurs="0"/>
 *         &lt;element name="Duplicates" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvalidAddresses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExistingUndeliverables" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExistingUnsubscribes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HardBounces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SoftBounces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OtherBounces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ForwardedEmails" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UniqueClicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UniqueOpens" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberSent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberDelivered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Unsubscribes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MissingAddresses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreviewURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Links" type="{http://exacttarget.com/wsdl/partnerAPI}Link" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://exacttarget.com/wsdl/partnerAPI}TrackingEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListSend", propOrder = {
    "sendID",
    "list",
    "duplicates",
    "invalidAddresses",
    "existingUndeliverables",
    "existingUnsubscribes",
    "hardBounces",
    "softBounces",
    "otherBounces",
    "forwardedEmails",
    "uniqueClicks",
    "uniqueOpens",
    "numberSent",
    "numberDelivered",
    "unsubscribes",
    "missingAddresses",
    "previewURL",
    "links",
    "events"
})
public class ListSend
    extends APIObject
{

    @XmlElement(name = "SendID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer sendID;
    @XmlElement(name = "List", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected com.exacttarget.wsdl.partnerapi.List list;
    @XmlElement(name = "Duplicates", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer duplicates;
    @XmlElement(name = "InvalidAddresses", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer invalidAddresses;
    @XmlElement(name = "ExistingUndeliverables", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer existingUndeliverables;
    @XmlElement(name = "ExistingUnsubscribes", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer existingUnsubscribes;
    @XmlElement(name = "HardBounces", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer hardBounces;
    @XmlElement(name = "SoftBounces", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer softBounces;
    @XmlElement(name = "OtherBounces", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer otherBounces;
    @XmlElement(name = "ForwardedEmails", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer forwardedEmails;
    @XmlElement(name = "UniqueClicks", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer uniqueClicks;
    @XmlElement(name = "UniqueOpens", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer uniqueOpens;
    @XmlElementRef(name = "NumberSent", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<Integer> numberSent;
    @XmlElementRef(name = "NumberDelivered", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<Integer> numberDelivered;
    @XmlElement(name = "Unsubscribes", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer unsubscribes;
    @XmlElement(name = "MissingAddresses", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer missingAddresses;
    @XmlElement(name = "PreviewURL", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String previewURL;
    @XmlElement(name = "Links", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected java.util.List<Link> links;
    @XmlElement(name = "Events", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected java.util.List<TrackingEvent> events;

    /**
     * Gets the value of the sendID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendID() {
        return sendID;
    }

    /**
     * Sets the value of the sendID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendID(Integer value) {
        this.sendID = value;
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
     * Gets the value of the duplicates property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuplicates() {
        return duplicates;
    }

    /**
     * Sets the value of the duplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuplicates(Integer value) {
        this.duplicates = value;
    }

    /**
     * Gets the value of the invalidAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvalidAddresses() {
        return invalidAddresses;
    }

    /**
     * Sets the value of the invalidAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvalidAddresses(Integer value) {
        this.invalidAddresses = value;
    }

    /**
     * Gets the value of the existingUndeliverables property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExistingUndeliverables() {
        return existingUndeliverables;
    }

    /**
     * Sets the value of the existingUndeliverables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExistingUndeliverables(Integer value) {
        this.existingUndeliverables = value;
    }

    /**
     * Gets the value of the existingUnsubscribes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExistingUnsubscribes() {
        return existingUnsubscribes;
    }

    /**
     * Sets the value of the existingUnsubscribes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExistingUnsubscribes(Integer value) {
        this.existingUnsubscribes = value;
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

    /**
     * Gets the value of the forwardedEmails property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getForwardedEmails() {
        return forwardedEmails;
    }

    /**
     * Sets the value of the forwardedEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setForwardedEmails(Integer value) {
        this.forwardedEmails = value;
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
     * Gets the value of the uniqueOpens property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueOpens() {
        return uniqueOpens;
    }

    /**
     * Sets the value of the uniqueOpens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueOpens(Integer value) {
        this.uniqueOpens = value;
    }

    /**
     * Gets the value of the numberSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberSent() {
        return numberSent;
    }

    /**
     * Sets the value of the numberSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberSent(JAXBElement<Integer> value) {
        this.numberSent = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the numberDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberDelivered() {
        return numberDelivered;
    }

    /**
     * Sets the value of the numberDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberDelivered(JAXBElement<Integer> value) {
        this.numberDelivered = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the unsubscribes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnsubscribes() {
        return unsubscribes;
    }

    /**
     * Sets the value of the unsubscribes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnsubscribes(Integer value) {
        this.unsubscribes = value;
    }

    /**
     * Gets the value of the missingAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMissingAddresses() {
        return missingAddresses;
    }

    /**
     * Sets the value of the missingAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMissingAddresses(Integer value) {
        this.missingAddresses = value;
    }

    /**
     * Gets the value of the previewURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewURL() {
        return previewURL;
    }

    /**
     * Sets the value of the previewURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewURL(String value) {
        this.previewURL = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the links property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Link }
     * 
     * 
     */
    public java.util.List<Link> getLinks() {
        if (links == null) {
            links = new ArrayList<Link>();
        }
        return this.links;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingEvent }
     * 
     * 
     */
    public java.util.List<TrackingEvent> getEvents() {
        if (events == null) {
            events = new ArrayList<TrackingEvent>();
        }
        return this.events;
    }

}
