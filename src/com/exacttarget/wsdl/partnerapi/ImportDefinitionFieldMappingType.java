
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for ImportDefinitionFieldMappingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportDefinitionFieldMappingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InferFromColumnHeadings"/>
 *     &lt;enumeration value="MapByOrdinal"/>
 *     &lt;enumeration value="ManualMap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ImportDefinitionFieldMappingType {

    @XmlEnumValue("InferFromColumnHeadings")
    INFER_FROM_COLUMN_HEADINGS("InferFromColumnHeadings"),
    @XmlEnumValue("ManualMap")
    MANUAL_MAP("ManualMap"),
    @XmlEnumValue("MapByOrdinal")
    MAP_BY_ORDINAL("MapByOrdinal");
    private final String value;

    ImportDefinitionFieldMappingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportDefinitionFieldMappingType fromValue(String v) {
        for (ImportDefinitionFieldMappingType c: ImportDefinitionFieldMappingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
