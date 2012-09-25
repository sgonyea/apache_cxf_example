
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YearlyRecurrence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YearlyRecurrence">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Recurrence">
 *       &lt;sequence>
 *         &lt;element name="YearlyRecurrencePatternType" type="{http://exacttarget.com/wsdl/partnerAPI}YearlyRecurrencePatternTypeEnum" minOccurs="0"/>
 *         &lt;element name="ScheduledDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScheduledWeek" type="{http://exacttarget.com/wsdl/partnerAPI}WeekOfMonthEnum" minOccurs="0"/>
 *         &lt;element name="ScheduledMonth" type="{http://exacttarget.com/wsdl/partnerAPI}MonthOfYearEnum" minOccurs="0"/>
 *         &lt;element name="ScheduledDayOfWeek" type="{http://exacttarget.com/wsdl/partnerAPI}DayOfWeekEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YearlyRecurrence", propOrder = {
    "yearlyRecurrencePatternType",
    "scheduledDay",
    "scheduledWeek",
    "scheduledMonth",
    "scheduledDayOfWeek"
})
public class YearlyRecurrence
    extends Recurrence
{

    @XmlElement(name = "YearlyRecurrencePatternType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected YearlyRecurrencePatternTypeEnum yearlyRecurrencePatternType;
    @XmlElement(name = "ScheduledDay", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer scheduledDay;
    @XmlElement(name = "ScheduledWeek", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected WeekOfMonthEnum scheduledWeek;
    @XmlElement(name = "ScheduledMonth", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected MonthOfYearEnum scheduledMonth;
    @XmlElement(name = "ScheduledDayOfWeek", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected DayOfWeekEnum scheduledDayOfWeek;

    /**
     * Gets the value of the yearlyRecurrencePatternType property.
     * 
     * @return
     *     possible object is
     *     {@link YearlyRecurrencePatternTypeEnum }
     *     
     */
    public YearlyRecurrencePatternTypeEnum getYearlyRecurrencePatternType() {
        return yearlyRecurrencePatternType;
    }

    /**
     * Sets the value of the yearlyRecurrencePatternType property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearlyRecurrencePatternTypeEnum }
     *     
     */
    public void setYearlyRecurrencePatternType(YearlyRecurrencePatternTypeEnum value) {
        this.yearlyRecurrencePatternType = value;
    }

    /**
     * Gets the value of the scheduledDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduledDay() {
        return scheduledDay;
    }

    /**
     * Sets the value of the scheduledDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduledDay(Integer value) {
        this.scheduledDay = value;
    }

    /**
     * Gets the value of the scheduledWeek property.
     * 
     * @return
     *     possible object is
     *     {@link WeekOfMonthEnum }
     *     
     */
    public WeekOfMonthEnum getScheduledWeek() {
        return scheduledWeek;
    }

    /**
     * Sets the value of the scheduledWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeekOfMonthEnum }
     *     
     */
    public void setScheduledWeek(WeekOfMonthEnum value) {
        this.scheduledWeek = value;
    }

    /**
     * Gets the value of the scheduledMonth property.
     * 
     * @return
     *     possible object is
     *     {@link MonthOfYearEnum }
     *     
     */
    public MonthOfYearEnum getScheduledMonth() {
        return scheduledMonth;
    }

    /**
     * Sets the value of the scheduledMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthOfYearEnum }
     *     
     */
    public void setScheduledMonth(MonthOfYearEnum value) {
        this.scheduledMonth = value;
    }

    /**
     * Gets the value of the scheduledDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekEnum }
     *     
     */
    public DayOfWeekEnum getScheduledDayOfWeek() {
        return scheduledDayOfWeek;
    }

    /**
     * Sets the value of the scheduledDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekEnum }
     *     
     */
    public void setScheduledDayOfWeek(DayOfWeekEnum value) {
        this.scheduledDayOfWeek = value;
    }

}
