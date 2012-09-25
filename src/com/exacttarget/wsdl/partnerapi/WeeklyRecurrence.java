
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeeklyRecurrence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeeklyRecurrence">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Recurrence">
 *       &lt;sequence>
 *         &lt;element name="WeeklyRecurrencePatternType" type="{http://exacttarget.com/wsdl/partnerAPI}WeeklyRecurrencePatternTypeEnum" minOccurs="0"/>
 *         &lt;element name="WeekInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Sunday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Monday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Tuesday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Wednesday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Thursday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Friday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Saturday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeeklyRecurrence", propOrder = {
    "weeklyRecurrencePatternType",
    "weekInterval",
    "sunday",
    "monday",
    "tuesday",
    "wednesday",
    "thursday",
    "friday",
    "saturday"
})
public class WeeklyRecurrence
    extends Recurrence
{

    @XmlElement(name = "WeeklyRecurrencePatternType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected WeeklyRecurrencePatternTypeEnum weeklyRecurrencePatternType;
    @XmlElement(name = "WeekInterval", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer weekInterval;
    @XmlElement(name = "Sunday", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean sunday;
    @XmlElement(name = "Monday", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean monday;
    @XmlElement(name = "Tuesday", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean tuesday;
    @XmlElement(name = "Wednesday", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean wednesday;
    @XmlElement(name = "Thursday", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean thursday;
    @XmlElement(name = "Friday", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean friday;
    @XmlElement(name = "Saturday", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean saturday;

    /**
     * Gets the value of the weeklyRecurrencePatternType property.
     * 
     * @return
     *     possible object is
     *     {@link WeeklyRecurrencePatternTypeEnum }
     *     
     */
    public WeeklyRecurrencePatternTypeEnum getWeeklyRecurrencePatternType() {
        return weeklyRecurrencePatternType;
    }

    /**
     * Sets the value of the weeklyRecurrencePatternType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeeklyRecurrencePatternTypeEnum }
     *     
     */
    public void setWeeklyRecurrencePatternType(WeeklyRecurrencePatternTypeEnum value) {
        this.weeklyRecurrencePatternType = value;
    }

    /**
     * Gets the value of the weekInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeekInterval() {
        return weekInterval;
    }

    /**
     * Sets the value of the weekInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeekInterval(Integer value) {
        this.weekInterval = value;
    }

    /**
     * Gets the value of the sunday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSunday() {
        return sunday;
    }

    /**
     * Sets the value of the sunday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSunday(Boolean value) {
        this.sunday = value;
    }

    /**
     * Gets the value of the monday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonday() {
        return monday;
    }

    /**
     * Sets the value of the monday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonday(Boolean value) {
        this.monday = value;
    }

    /**
     * Gets the value of the tuesday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTuesday() {
        return tuesday;
    }

    /**
     * Sets the value of the tuesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTuesday(Boolean value) {
        this.tuesday = value;
    }

    /**
     * Gets the value of the wednesday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWednesday() {
        return wednesday;
    }

    /**
     * Sets the value of the wednesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWednesday(Boolean value) {
        this.wednesday = value;
    }

    /**
     * Gets the value of the thursday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThursday() {
        return thursday;
    }

    /**
     * Sets the value of the thursday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThursday(Boolean value) {
        this.thursday = value;
    }

    /**
     * Gets the value of the friday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFriday() {
        return friday;
    }

    /**
     * Sets the value of the friday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFriday(Boolean value) {
        this.friday = value;
    }

    /**
     * Gets the value of the saturday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaturday() {
        return saturday;
    }

    /**
     * Sets the value of the saturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaturday(Boolean value) {
        this.saturday = value;
    }

}
