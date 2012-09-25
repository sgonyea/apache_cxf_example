
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HourlyRecurrence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HourlyRecurrence">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Recurrence">
 *       &lt;sequence>
 *         &lt;element name="HourlyRecurrencePatternType" type="{http://exacttarget.com/wsdl/partnerAPI}HourlyRecurrencePatternTypeEnum" minOccurs="0"/>
 *         &lt;element name="HourInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HourlyRecurrence", propOrder = {
    "hourlyRecurrencePatternType",
    "hourInterval"
})
public class HourlyRecurrence
    extends Recurrence
{

    @XmlElement(name = "HourlyRecurrencePatternType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected HourlyRecurrencePatternTypeEnum hourlyRecurrencePatternType;
    @XmlElement(name = "HourInterval", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer hourInterval;

    /**
     * Gets the value of the hourlyRecurrencePatternType property.
     * 
     * @return
     *     possible object is
     *     {@link HourlyRecurrencePatternTypeEnum }
     *     
     */
    public HourlyRecurrencePatternTypeEnum getHourlyRecurrencePatternType() {
        return hourlyRecurrencePatternType;
    }

    /**
     * Sets the value of the hourlyRecurrencePatternType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HourlyRecurrencePatternTypeEnum }
     *     
     */
    public void setHourlyRecurrencePatternType(HourlyRecurrencePatternTypeEnum value) {
        this.hourlyRecurrencePatternType = value;
    }

    /**
     * Gets the value of the hourInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHourInterval() {
        return hourInterval;
    }

    /**
     * Sets the value of the hourInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHourInterval(Integer value) {
        this.hourInterval = value;
    }

}
