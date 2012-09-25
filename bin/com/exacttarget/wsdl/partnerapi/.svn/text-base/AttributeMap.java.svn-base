
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeMap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIProperty">
 *       &lt;sequence>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColumnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColumnNameMappedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityNameMappedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalData" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeMap", propOrder = {
    "entityName",
    "columnName",
    "columnNameMappedTo",
    "entityNameMappedTo",
    "additionalData"
})
public class AttributeMap
    extends APIProperty
{

    @XmlElement(name = "EntityName", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String entityName;
    @XmlElement(name = "ColumnName", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String columnName;
    @XmlElement(name = "ColumnNameMappedTo", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String columnNameMappedTo;
    @XmlElement(name = "EntityNameMappedTo", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String entityNameMappedTo;
    @XmlElement(name = "AdditionalData", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<APIProperty> additionalData;

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the columnNameMappedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnNameMappedTo() {
        return columnNameMappedTo;
    }

    /**
     * Sets the value of the columnNameMappedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnNameMappedTo(String value) {
        this.columnNameMappedTo = value;
    }

    /**
     * Gets the value of the entityNameMappedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityNameMappedTo() {
        return entityNameMappedTo;
    }

    /**
     * Sets the value of the entityNameMappedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityNameMappedTo(String value) {
        this.entityNameMappedTo = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIProperty }
     * 
     * 
     */
    public List<APIProperty> getAdditionalData() {
        if (additionalData == null) {
            additionalData = new ArrayList<APIProperty>();
        }
        return this.additionalData;
    }

}
