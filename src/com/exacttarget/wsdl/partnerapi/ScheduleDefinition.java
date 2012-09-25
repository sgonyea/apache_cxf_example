
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ScheduleDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recurrence" type="{http://exacttarget.com/wsdl/partnerAPI}Recurrence"/>
 *         &lt;element name="RecurrenceType" type="{http://exacttarget.com/wsdl/partnerAPI}RecurrenceTypeEnum" minOccurs="0"/>
 *         &lt;element name="RecurrenceRangeType" type="{http://exacttarget.com/wsdl/partnerAPI}RecurrenceRangeTypeEnum" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Occurrences" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleDefinition", propOrder = {
    "name",
    "description",
    "recurrence",
    "recurrenceType",
    "recurrenceRangeType",
    "startDateTime",
    "endDateTime",
    "occurrences",
    "keyword"
})
public class ScheduleDefinition
    extends APIObject
{

    @XmlElement(name = "Name", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String name;
    @XmlElement(name = "Description", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String description;
    @XmlElement(name = "Recurrence", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected Recurrence recurrence;
    @XmlElement(name = "RecurrenceType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected RecurrenceTypeEnum recurrenceType;
    @XmlElement(name = "RecurrenceRangeType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected RecurrenceRangeTypeEnum recurrenceRangeType;
    @XmlElement(name = "StartDateTime", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "EndDateTime", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "Occurrences", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer occurrences;
    @XmlElement(name = "Keyword", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String keyword;

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
     * Gets the value of the recurrence property.
     * 
     * @return
     *     possible object is
     *     {@link Recurrence }
     *     
     */
    public Recurrence getRecurrence() {
        return recurrence;
    }

    /**
     * Sets the value of the recurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recurrence }
     *     
     */
    public void setRecurrence(Recurrence value) {
        this.recurrence = value;
    }

    /**
     * Gets the value of the recurrenceType property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceTypeEnum }
     *     
     */
    public RecurrenceTypeEnum getRecurrenceType() {
        return recurrenceType;
    }

    /**
     * Sets the value of the recurrenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceTypeEnum }
     *     
     */
    public void setRecurrenceType(RecurrenceTypeEnum value) {
        this.recurrenceType = value;
    }

    /**
     * Gets the value of the recurrenceRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceRangeTypeEnum }
     *     
     */
    public RecurrenceRangeTypeEnum getRecurrenceRangeType() {
        return recurrenceRangeType;
    }

    /**
     * Sets the value of the recurrenceRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceRangeTypeEnum }
     *     
     */
    public void setRecurrenceRangeType(RecurrenceRangeTypeEnum value) {
        this.recurrenceRangeType = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the occurrences property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOccurrences() {
        return occurrences;
    }

    /**
     * Sets the value of the occurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOccurrences(Integer value) {
        this.occurrences = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

}
