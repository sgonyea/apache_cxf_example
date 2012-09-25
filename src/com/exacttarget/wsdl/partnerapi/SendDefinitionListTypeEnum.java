
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for SendDefinitionListTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SendDefinitionListTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SourceList"/>
 *     &lt;enumeration value="ExclusionList"/>
 *     &lt;enumeration value="DomainExclusion"/>
 *     &lt;enumeration value="OptOutList"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum SendDefinitionListTypeEnum {

    @XmlEnumValue("DomainExclusion")
    DOMAIN_EXCLUSION("DomainExclusion"),
    @XmlEnumValue("ExclusionList")
    EXCLUSION_LIST("ExclusionList"),
    @XmlEnumValue("OptOutList")
    OPT_OUT_LIST("OptOutList"),
    @XmlEnumValue("SourceList")
    SOURCE_LIST("SourceList");
    private final String value;

    SendDefinitionListTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SendDefinitionListTypeEnum fromValue(String v) {
        for (SendDefinitionListTypeEnum c: SendDefinitionListTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
