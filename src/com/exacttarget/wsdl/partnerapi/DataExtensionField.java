
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataExtensionField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataExtensionField">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}PropertyDefinition">
 *       &lt;sequence>
 *         &lt;element name="Ordinal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsPrimaryKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FieldType" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionFieldType" minOccurs="0"/>
 *         &lt;element name="DataExtension" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataExtensionField", propOrder = {
    "ordinal",
    "isPrimaryKey",
    "fieldType",
    "dataExtension"
})
public class DataExtensionField
    extends PropertyDefinition
{

    @XmlElement(name = "Ordinal", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer ordinal;
    @XmlElement(name = "IsPrimaryKey", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isPrimaryKey;
    @XmlElement(name = "FieldType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected DataExtensionFieldType fieldType;
    @XmlElement(name = "DataExtension", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected DataExtension dataExtension;

    /**
     * Gets the value of the ordinal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdinal(Integer value) {
        this.ordinal = value;
    }

    /**
     * Gets the value of the isPrimaryKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimaryKey() {
        return isPrimaryKey;
    }

    /**
     * Sets the value of the isPrimaryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimaryKey(Boolean value) {
        this.isPrimaryKey = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtensionFieldType }
     *     
     */
    public DataExtensionFieldType getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtensionFieldType }
     *     
     */
    public void setFieldType(DataExtensionFieldType value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the dataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtension }
     *     
     */
    public DataExtension getDataExtension() {
        return dataExtension;
    }

    /**
     * Sets the value of the dataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtension }
     *     
     */
    public void setDataExtension(DataExtension value) {
        this.dataExtension = value;
    }

}
