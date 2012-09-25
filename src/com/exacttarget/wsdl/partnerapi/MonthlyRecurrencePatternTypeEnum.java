
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for MonthlyRecurrencePatternTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonthlyRecurrencePatternTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ByDay"/>
 *     &lt;enumeration value="ByWeek"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum MonthlyRecurrencePatternTypeEnum {

    @XmlEnumValue("ByDay")
    BY_DAY("ByDay"),
    @XmlEnumValue("ByWeek")
    BY_WEEK("ByWeek");
    private final String value;

    MonthlyRecurrencePatternTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthlyRecurrencePatternTypeEnum fromValue(String v) {
        for (MonthlyRecurrencePatternTypeEnum c: MonthlyRecurrencePatternTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
