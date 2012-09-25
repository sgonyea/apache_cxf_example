
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DailyRecurrence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DailyRecurrence">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Recurrence">
 *       &lt;sequence>
 *         &lt;element name="DailyRecurrencePatternType" type="{http://exacttarget.com/wsdl/partnerAPI}DailyRecurrencePatternTypeEnum" minOccurs="0"/>
 *         &lt;element name="DayInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyRecurrence", propOrder = {
    "dailyRecurrencePatternType",
    "dayInterval"
})
public class DailyRecurrence
    extends Recurrence
{

    @XmlElement(name = "DailyRecurrencePatternType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected DailyRecurrencePatternTypeEnum dailyRecurrencePatternType;
    @XmlElement(name = "DayInterval", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer dayInterval;

    /**
     * Gets the value of the dailyRecurrencePatternType property.
     * 
     * @return
     *     possible object is
     *     {@link DailyRecurrencePatternTypeEnum }
     *     
     */
    public DailyRecurrencePatternTypeEnum getDailyRecurrencePatternType() {
        return dailyRecurrencePatternType;
    }

    /**
     * Sets the value of the dailyRecurrencePatternType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyRecurrencePatternTypeEnum }
     *     
     */
    public void setDailyRecurrencePatternType(DailyRecurrencePatternTypeEnum value) {
        this.dailyRecurrencePatternType = value;
    }

    /**
     * Gets the value of the dayInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayInterval() {
        return dayInterval;
    }

    /**
     * Sets the value of the dayInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayInterval(Integer value) {
        this.dayInterval = value;
    }

}
