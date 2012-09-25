
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for DataExtensionFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataExtensionFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Number"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="Boolean"/>
 *     &lt;enumeration value="EmailAddress"/>
 *     &lt;enumeration value="Phone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum DataExtensionFieldType {

    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("EmailAddress")
    EMAIL_ADDRESS("EmailAddress"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    DataExtensionFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataExtensionFieldType fromValue(String v) {
        for (DataExtensionFieldType c: DataExtensionFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
