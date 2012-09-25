
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for DeliveryProfileDomainTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryProfileDomainTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DefaultDomain"/>
 *     &lt;enumeration value="CustomDomain"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum DeliveryProfileDomainTypeEnum {

    @XmlEnumValue("CustomDomain")
    CUSTOM_DOMAIN("CustomDomain"),
    @XmlEnumValue("DefaultDomain")
    DEFAULT_DOMAIN("DefaultDomain");
    private final String value;

    DeliveryProfileDomainTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryProfileDomainTypeEnum fromValue(String v) {
        for (DeliveryProfileDomainTypeEnum c: DeliveryProfileDomainTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
