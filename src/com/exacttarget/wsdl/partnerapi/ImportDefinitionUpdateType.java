
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for ImportDefinitionUpdateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportDefinitionUpdateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AddAndUpdate"/>
 *     &lt;enumeration value="AddAndDoNotUpdate"/>
 *     &lt;enumeration value="UpdateButDoNotAdd"/>
 *     &lt;enumeration value="Merge"/>
 *     &lt;enumeration value="Overwrite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ImportDefinitionUpdateType {

    @XmlEnumValue("AddAndDoNotUpdate")
    ADD_AND_DO_NOT_UPDATE("AddAndDoNotUpdate"),
    @XmlEnumValue("AddAndUpdate")
    ADD_AND_UPDATE("AddAndUpdate"),
    @XmlEnumValue("Merge")
    MERGE("Merge"),
    @XmlEnumValue("Overwrite")
    OVERWRITE("Overwrite"),
    @XmlEnumValue("UpdateButDoNotAdd")
    UPDATE_BUT_DO_NOT_ADD("UpdateButDoNotAdd");
    private final String value;

    ImportDefinitionUpdateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportDefinitionUpdateType fromValue(String v) {
        for (ImportDefinitionUpdateType c: ImportDefinitionUpdateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
