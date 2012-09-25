
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for DeliveryProfileSourceAddressTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryProfileSourceAddressTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DefaultPrivateIPAddress"/>
 *     &lt;enumeration value="CustomPrivateIPAddress"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum DeliveryProfileSourceAddressTypeEnum {

    @XmlEnumValue("CustomPrivateIPAddress")
    CUSTOM_PRIVATE_IP_ADDRESS("CustomPrivateIPAddress"),
    @XmlEnumValue("DefaultPrivateIPAddress")
    DEFAULT_PRIVATE_IP_ADDRESS("DefaultPrivateIPAddress");
    private final String value;

    DeliveryProfileSourceAddressTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryProfileSourceAddressTypeEnum fromValue(String v) {
        for (DeliveryProfileSourceAddressTypeEnum c: DeliveryProfileSourceAddressTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
