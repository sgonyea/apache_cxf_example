
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for RecurrenceRangeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecurrenceRangeTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EndAfter"/>
 *     &lt;enumeration value="EndOn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum RecurrenceRangeTypeEnum {

    @XmlEnumValue("EndAfter")
    END_AFTER("EndAfter"),
    @XmlEnumValue("EndOn")
    END_ON("EndOn");
    private final String value;

    RecurrenceRangeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecurrenceRangeTypeEnum fromValue(String v) {
        for (RecurrenceRangeTypeEnum c: RecurrenceRangeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
