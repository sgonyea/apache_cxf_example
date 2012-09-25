
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for SendClassificationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SendClassificationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Operational"/>
 *     &lt;enumeration value="Marketing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum SendClassificationTypeEnum {

    @XmlEnumValue("Marketing")
    MARKETING("Marketing"),
    @XmlEnumValue("Operational")
    OPERATIONAL("Operational");
    private final String value;

    SendClassificationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SendClassificationTypeEnum fromValue(String v) {
        for (SendClassificationTypeEnum c: SendClassificationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
