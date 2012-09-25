
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for DailyRecurrencePatternTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DailyRecurrencePatternTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Interval"/>
 *     &lt;enumeration value="EveryWeekDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum DailyRecurrencePatternTypeEnum {

    @XmlEnumValue("EveryWeekDay")
    EVERY_WEEK_DAY("EveryWeekDay"),
    @XmlEnumValue("Interval")
    INTERVAL("Interval");
    private final String value;

    DailyRecurrencePatternTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DailyRecurrencePatternTypeEnum fromValue(String v) {
        for (DailyRecurrencePatternTypeEnum c: DailyRecurrencePatternTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
