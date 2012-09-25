
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems;
import com.exacttarget.wsdl.partnerapi.PropertyDefinition.References;


/**
 * <p>Java class for PropertyDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueType" type="{http://exacttarget.com/wsdl/partnerAPI}SoapType" minOccurs="0"/>
 *         &lt;element name="PropertyType" type="{http://exacttarget.com/wsdl/partnerAPI}PropertyType" minOccurs="0"/>
 *         &lt;element name="IsCreatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUpdatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRetrievable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsQueryable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFilterable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPartnerProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAccountProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartnerMap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeMaps" type="{http://exacttarget.com/wsdl/partnerAPI}AttributeMap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Markups" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Precision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Scale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNillable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRestrictedPicklist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PicklistItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PicklistItem" type="{http://exacttarget.com/wsdl/partnerAPI}PicklistItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IsSendTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="References" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Reference" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelationshipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsContextSpecific" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyDefinition", propOrder = {
    "name",
    "dataType",
    "valueType",
    "propertyType",
    "isCreatable",
    "isUpdatable",
    "isRetrievable",
    "isQueryable",
    "isFilterable",
    "isPartnerProperty",
    "isAccountProperty",
    "partnerMap",
    "attributeMaps",
    "markups",
    "precision",
    "scale",
    "label",
    "description",
    "defaultValue",
    "minLength",
    "maxLength",
    "minValue",
    "maxValue",
    "isRequired",
    "isViewable",
    "isEditable",
    "isNillable",
    "isRestrictedPicklist",
    "picklistItems",
    "isSendTime",
    "displayOrder",
    "references",
    "relationshipName",
    "status",
    "isContextSpecific"
})
public class PropertyDefinition
    extends APIObject
{

    @XmlElement(name = "Name", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String name;
    @XmlElement(name = "DataType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String dataType;
    @XmlElement(name = "ValueType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected SoapType valueType;
    @XmlElement(name = "PropertyType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected PropertyType propertyType;
    @XmlElement(name = "IsCreatable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isCreatable;
    @XmlElement(name = "IsUpdatable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isUpdatable;
    @XmlElement(name = "IsRetrievable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isRetrievable;
    @XmlElement(name = "IsQueryable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isQueryable;
    @XmlElement(name = "IsFilterable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isFilterable;
    @XmlElement(name = "IsPartnerProperty", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isPartnerProperty;
    @XmlElement(name = "IsAccountProperty", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isAccountProperty;
    @XmlElement(name = "PartnerMap", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String partnerMap;
    @XmlElement(name = "AttributeMaps", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<AttributeMap> attributeMaps;
    @XmlElement(name = "Markups", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<APIProperty> markups;
    @XmlElement(name = "Precision", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer precision;
    @XmlElement(name = "Scale", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer scale;
    @XmlElement(name = "Label", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String label;
    @XmlElement(name = "Description", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String description;
    @XmlElement(name = "DefaultValue", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String defaultValue;
    @XmlElement(name = "MinLength", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer minLength;
    @XmlElement(name = "MaxLength", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer maxLength;
    @XmlElement(name = "MinValue", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String minValue;
    @XmlElement(name = "MaxValue", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String maxValue;
    @XmlElement(name = "IsRequired", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isRequired;
    @XmlElement(name = "IsViewable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isViewable;
    @XmlElement(name = "IsEditable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isEditable;
    @XmlElement(name = "IsNillable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isNillable;
    @XmlElement(name = "IsRestrictedPicklist", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isRestrictedPicklist;
    @XmlElement(name = "PicklistItems", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected PicklistItems picklistItems;
    @XmlElement(name = "IsSendTime", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isSendTime;
    @XmlElement(name = "DisplayOrder", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer displayOrder;
    @XmlElement(name = "References", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected References references;
    @XmlElement(name = "RelationshipName", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String relationshipName;
    @XmlElement(name = "Status", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String status;
    @XmlElement(name = "IsContextSpecific", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isContextSpecific;

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
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link SoapType }
     *     
     */
    public SoapType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapType }
     *     
     */
    public void setValueType(SoapType value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setPropertyType(PropertyType value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the isCreatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCreatable() {
        return isCreatable;
    }

    /**
     * Sets the value of the isCreatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCreatable(Boolean value) {
        this.isCreatable = value;
    }

    /**
     * Gets the value of the isUpdatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUpdatable() {
        return isUpdatable;
    }

    /**
     * Sets the value of the isUpdatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUpdatable(Boolean value) {
        this.isUpdatable = value;
    }

    /**
     * Gets the value of the isRetrievable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRetrievable() {
        return isRetrievable;
    }

    /**
     * Sets the value of the isRetrievable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRetrievable(Boolean value) {
        this.isRetrievable = value;
    }

    /**
     * Gets the value of the isQueryable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQueryable() {
        return isQueryable;
    }

    /**
     * Sets the value of the isQueryable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQueryable(Boolean value) {
        this.isQueryable = value;
    }

    /**
     * Gets the value of the isFilterable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFilterable() {
        return isFilterable;
    }

    /**
     * Sets the value of the isFilterable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFilterable(Boolean value) {
        this.isFilterable = value;
    }

    /**
     * Gets the value of the isPartnerProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartnerProperty() {
        return isPartnerProperty;
    }

    /**
     * Sets the value of the isPartnerProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartnerProperty(Boolean value) {
        this.isPartnerProperty = value;
    }

    /**
     * Gets the value of the isAccountProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAccountProperty() {
        return isAccountProperty;
    }

    /**
     * Sets the value of the isAccountProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAccountProperty(Boolean value) {
        this.isAccountProperty = value;
    }

    /**
     * Gets the value of the partnerMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerMap() {
        return partnerMap;
    }

    /**
     * Sets the value of the partnerMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerMap(String value) {
        this.partnerMap = value;
    }

    /**
     * Gets the value of the attributeMaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeMaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeMaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeMap }
     * 
     * 
     */
    public List<AttributeMap> getAttributeMaps() {
        if (attributeMaps == null) {
            attributeMaps = new ArrayList<AttributeMap>();
        }
        return this.attributeMaps;
    }

    /**
     * Gets the value of the markups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIProperty }
     * 
     * 
     */
    public List<APIProperty> getMarkups() {
        if (markups == null) {
            markups = new ArrayList<APIProperty>();
        }
        return this.markups;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScale(Integer value) {
        this.scale = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the minLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinLength(Integer value) {
        this.minLength = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinValue(String value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxValue(String value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequired(Boolean value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the isViewable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsViewable() {
        return isViewable;
    }

    /**
     * Sets the value of the isViewable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsViewable(Boolean value) {
        this.isViewable = value;
    }

    /**
     * Gets the value of the isEditable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEditable() {
        return isEditable;
    }

    /**
     * Sets the value of the isEditable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEditable(Boolean value) {
        this.isEditable = value;
    }

    /**
     * Gets the value of the isNillable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNillable() {
        return isNillable;
    }

    /**
     * Sets the value of the isNillable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNillable(Boolean value) {
        this.isNillable = value;
    }

    /**
     * Gets the value of the isRestrictedPicklist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRestrictedPicklist() {
        return isRestrictedPicklist;
    }

    /**
     * Sets the value of the isRestrictedPicklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRestrictedPicklist(Boolean value) {
        this.isRestrictedPicklist = value;
    }

    /**
     * Gets the value of the picklistItems property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistItems }
     *     
     */
    public PicklistItems getPicklistItems() {
        return picklistItems;
    }

    /**
     * Sets the value of the picklistItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistItems }
     *     
     */
    public void setPicklistItems(PicklistItems value) {
        this.picklistItems = value;
    }

    /**
     * Gets the value of the isSendTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSendTime() {
        return isSendTime;
    }

    /**
     * Sets the value of the isSendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSendTime(Boolean value) {
        this.isSendTime = value;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link References }
     *     
     */
    public References getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link References }
     *     
     */
    public void setReferences(References value) {
        this.references = value;
    }

    /**
     * Gets the value of the relationshipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipName() {
        return relationshipName;
    }

    /**
     * Sets the value of the relationshipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipName(String value) {
        this.relationshipName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the isContextSpecific property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsContextSpecific() {
        return isContextSpecific;
    }

    /**
     * Sets the value of the isContextSpecific property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsContextSpecific(Boolean value) {
        this.isContextSpecific = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PicklistItem" type="{http://exacttarget.com/wsdl/partnerAPI}PicklistItem" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "picklistItem"
    })
    public static class PicklistItems {

        @XmlElement(name = "PicklistItem", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<PicklistItem> picklistItem;

        /**
         * Gets the value of the picklistItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the picklistItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPicklistItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PicklistItem }
         * 
         * 
         */
        public List<PicklistItem> getPicklistItem() {
            if (picklistItem == null) {
                picklistItem = new ArrayList<PicklistItem>();
            }
            return this.picklistItem;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Reference" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reference"
    })
    public static class References {

        @XmlElement(name = "Reference", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<APIObject> reference;

        /**
         * Gets the value of the reference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APIObject }
         * 
         * 
         */
        public List<APIObject> getReference() {
            if (reference == null) {
                reference = new ArrayList<APIObject>();
            }
            return this.reference;
        }

    }

}
