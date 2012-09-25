
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.exacttarget.wsdl.partnerapi.ObjectDefinition.ExtendedProperties;


/**
 * <p>Java class for ObjectDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCreatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUpdatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRetrievable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsQueryable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsReference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReferencedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPropertyCollection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsObjectCollection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://exacttarget.com/wsdl/partnerAPI}PropertyDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtendedProperties" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExtendedProperty" type="{http://exacttarget.com/wsdl/partnerAPI}PropertyDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ChildObjects" type="{http://exacttarget.com/wsdl/partnerAPI}ObjectDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectDefinition", propOrder = {
    "objectType",
    "name",
    "isCreatable",
    "isUpdatable",
    "isRetrievable",
    "isQueryable",
    "isReference",
    "referencedType",
    "isPropertyCollection",
    "isObjectCollection",
    "properties",
    "extendedProperties",
    "childObjects"
})
public class ObjectDefinition {

    @XmlElement(name = "ObjectType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String objectType;
    @XmlElement(name = "Name", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String name;
    @XmlElement(name = "IsCreatable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isCreatable;
    @XmlElement(name = "IsUpdatable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isUpdatable;
    @XmlElement(name = "IsRetrievable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isRetrievable;
    @XmlElement(name = "IsQueryable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isQueryable;
    @XmlElement(name = "IsReference", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isReference;
    @XmlElement(name = "ReferencedType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String referencedType;
    @XmlElement(name = "IsPropertyCollection", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String isPropertyCollection;
    @XmlElement(name = "IsObjectCollection", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isObjectCollection;
    @XmlElement(name = "Properties", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<PropertyDefinition> properties;
    @XmlElement(name = "ExtendedProperties", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ExtendedProperties extendedProperties;
    @XmlElement(name = "ChildObjects", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<ObjectDefinition> childObjects;

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

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
     * Gets the value of the isReference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReference() {
        return isReference;
    }

    /**
     * Sets the value of the isReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReference(Boolean value) {
        this.isReference = value;
    }

    /**
     * Gets the value of the referencedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedType() {
        return referencedType;
    }

    /**
     * Sets the value of the referencedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedType(String value) {
        this.referencedType = value;
    }

    /**
     * Gets the value of the isPropertyCollection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPropertyCollection() {
        return isPropertyCollection;
    }

    /**
     * Sets the value of the isPropertyCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPropertyCollection(String value) {
        this.isPropertyCollection = value;
    }

    /**
     * Gets the value of the isObjectCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsObjectCollection() {
        return isObjectCollection;
    }

    /**
     * Sets the value of the isObjectCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsObjectCollection(Boolean value) {
        this.isObjectCollection = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyDefinition }
     * 
     * 
     */
    public List<PropertyDefinition> getProperties() {
        if (properties == null) {
            properties = new ArrayList<PropertyDefinition>();
        }
        return this.properties;
    }

    /**
     * Gets the value of the extendedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedProperties }
     *     
     */
    public ExtendedProperties getExtendedProperties() {
        return extendedProperties;
    }

    /**
     * Sets the value of the extendedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedProperties }
     *     
     */
    public void setExtendedProperties(ExtendedProperties value) {
        this.extendedProperties = value;
    }

    /**
     * Gets the value of the childObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectDefinition }
     * 
     * 
     */
    public List<ObjectDefinition> getChildObjects() {
        if (childObjects == null) {
            childObjects = new ArrayList<ObjectDefinition>();
        }
        return this.childObjects;
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
     *         &lt;element name="ExtendedProperty" type="{http://exacttarget.com/wsdl/partnerAPI}PropertyDefinition" maxOccurs="unbounded" minOccurs="0"/>
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
        "extendedProperty"
    })
    public static class ExtendedProperties {

        @XmlElement(name = "ExtendedProperty", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<PropertyDefinition> extendedProperty;

        /**
         * Gets the value of the extendedProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extendedProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtendedProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropertyDefinition }
         * 
         * 
         */
        public List<PropertyDefinition> getExtendedProperty() {
            if (extendedProperty == null) {
                extendedProperty = new ArrayList<PropertyDefinition>();
            }
            return this.extendedProperty;
        }

    }

}
