
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtractParameterDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtractParameterDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}ParameterDescription">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataType" type="{http://exacttarget.com/wsdl/partnerAPI}ExtractParameterDataType"/>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsOptional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtractParameterDescription", propOrder = {
    "name",
    "dataType",
    "defaultValue",
    "isOptional"
})
public class ExtractParameterDescription
    extends ParameterDescription
{

    @XmlElement(name = "Name", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String name;
    @XmlElement(name = "DataType", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected ExtractParameterDataType dataType;
    @XmlElement(name = "DefaultValue", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String defaultValue;
    @XmlElement(name = "IsOptional", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected boolean isOptional;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractParameterDataType }
     *     
     */
    public ExtractParameterDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractParameterDataType }
     *     
     */
    public void setDataType(ExtractParameterDataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the isOptional property.
     * 
     */
    public boolean isIsOptional() {
        return isOptional;
    }

    /**
     * Sets the value of the isOptional property.
     * 
     */
    public void setIsOptional(boolean value) {
        this.isOptional = value;
    }

}
