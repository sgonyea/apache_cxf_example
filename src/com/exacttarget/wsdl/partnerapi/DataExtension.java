
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.exacttarget.wsdl.partnerapi.DataExtension.Fields;


/**
 * <p>Java class for DataExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSendable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTestable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendableDataExtensionField" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionField" minOccurs="0"/>
 *         &lt;element name="SendableSubscriberField" type="{http://exacttarget.com/wsdl/partnerAPI}Attribute" minOccurs="0"/>
 *         &lt;element name="Template" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionTemplate" minOccurs="0"/>
 *         &lt;element name="DataRetentionPeriodLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DataRetentionPeriodUnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RowBasedRetention" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ResetRetentionPeriodOnImport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeleteAtEndOfRetentionPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RetainUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Field" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionField" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DataRetentionPeriod" type="{http://exacttarget.com/wsdl/partnerAPI}DateTimeUnitOfMeasure" minOccurs="0"/>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataExtension", propOrder = {
    "name",
    "description",
    "isSendable",
    "isTestable",
    "sendableDataExtensionField",
    "sendableSubscriberField",
    "template",
    "dataRetentionPeriodLength",
    "dataRetentionPeriodUnitOfMeasure",
    "rowBasedRetention",
    "resetRetentionPeriodOnImport",
    "deleteAtEndOfRetentionPeriod",
    "retainUntil",
    "fields",
    "dataRetentionPeriod",
    "categoryID"
})
public class DataExtension
    extends APIObject
{

    @XmlElement(name = "Name", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String name;
    @XmlElement(name = "Description", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String description;
    @XmlElement(name = "IsSendable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isSendable;
    @XmlElement(name = "IsTestable", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isTestable;
    @XmlElement(name = "SendableDataExtensionField", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected DataExtensionField sendableDataExtensionField;
    @XmlElement(name = "SendableSubscriberField", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Attribute sendableSubscriberField;
    @XmlElement(name = "Template", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected DataExtensionTemplate template;
    @XmlElement(name = "DataRetentionPeriodLength", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer dataRetentionPeriodLength;
    @XmlElement(name = "DataRetentionPeriodUnitOfMeasure", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer dataRetentionPeriodUnitOfMeasure;
    @XmlElement(name = "RowBasedRetention", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean rowBasedRetention;
    @XmlElement(name = "ResetRetentionPeriodOnImport", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean resetRetentionPeriodOnImport;
    @XmlElement(name = "DeleteAtEndOfRetentionPeriod", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean deleteAtEndOfRetentionPeriod;
    @XmlElement(name = "RetainUntil", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String retainUntil;
    @XmlElement(name = "Fields", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Fields fields;
    @XmlElement(name = "DataRetentionPeriod", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected DateTimeUnitOfMeasure dataRetentionPeriod;
    @XmlElement(name = "CategoryID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Long categoryID;

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
     * Gets the value of the isSendable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSendable() {
        return isSendable;
    }

    /**
     * Sets the value of the isSendable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSendable(Boolean value) {
        this.isSendable = value;
    }

    /**
     * Gets the value of the isTestable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTestable() {
        return isTestable;
    }

    /**
     * Sets the value of the isTestable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTestable(Boolean value) {
        this.isTestable = value;
    }

    /**
     * Gets the value of the sendableDataExtensionField property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtensionField }
     *     
     */
    public DataExtensionField getSendableDataExtensionField() {
        return sendableDataExtensionField;
    }

    /**
     * Sets the value of the sendableDataExtensionField property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtensionField }
     *     
     */
    public void setSendableDataExtensionField(DataExtensionField value) {
        this.sendableDataExtensionField = value;
    }

    /**
     * Gets the value of the sendableSubscriberField property.
     * 
     * @return
     *     possible object is
     *     {@link Attribute }
     *     
     */
    public Attribute getSendableSubscriberField() {
        return sendableSubscriberField;
    }

    /**
     * Sets the value of the sendableSubscriberField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attribute }
     *     
     */
    public void setSendableSubscriberField(Attribute value) {
        this.sendableSubscriberField = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtensionTemplate }
     *     
     */
    public DataExtensionTemplate getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtensionTemplate }
     *     
     */
    public void setTemplate(DataExtensionTemplate value) {
        this.template = value;
    }

    /**
     * Gets the value of the dataRetentionPeriodLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataRetentionPeriodLength() {
        return dataRetentionPeriodLength;
    }

    /**
     * Sets the value of the dataRetentionPeriodLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataRetentionPeriodLength(Integer value) {
        this.dataRetentionPeriodLength = value;
    }

    /**
     * Gets the value of the dataRetentionPeriodUnitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataRetentionPeriodUnitOfMeasure() {
        return dataRetentionPeriodUnitOfMeasure;
    }

    /**
     * Sets the value of the dataRetentionPeriodUnitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataRetentionPeriodUnitOfMeasure(Integer value) {
        this.dataRetentionPeriodUnitOfMeasure = value;
    }

    /**
     * Gets the value of the rowBasedRetention property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRowBasedRetention() {
        return rowBasedRetention;
    }

    /**
     * Sets the value of the rowBasedRetention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRowBasedRetention(Boolean value) {
        this.rowBasedRetention = value;
    }

    /**
     * Gets the value of the resetRetentionPeriodOnImport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResetRetentionPeriodOnImport() {
        return resetRetentionPeriodOnImport;
    }

    /**
     * Sets the value of the resetRetentionPeriodOnImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResetRetentionPeriodOnImport(Boolean value) {
        this.resetRetentionPeriodOnImport = value;
    }

    /**
     * Gets the value of the deleteAtEndOfRetentionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteAtEndOfRetentionPeriod() {
        return deleteAtEndOfRetentionPeriod;
    }

    /**
     * Sets the value of the deleteAtEndOfRetentionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteAtEndOfRetentionPeriod(Boolean value) {
        this.deleteAtEndOfRetentionPeriod = value;
    }

    /**
     * Gets the value of the retainUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetainUntil() {
        return retainUntil;
    }

    /**
     * Sets the value of the retainUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetainUntil(String value) {
        this.retainUntil = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link Fields }
     *     
     */
    public Fields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fields }
     *     
     */
    public void setFields(Fields value) {
        this.fields = value;
    }

    /**
     * Gets the value of the dataRetentionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeUnitOfMeasure }
     *     
     */
    public DateTimeUnitOfMeasure getDataRetentionPeriod() {
        return dataRetentionPeriod;
    }

    /**
     * Sets the value of the dataRetentionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeUnitOfMeasure }
     *     
     */
    public void setDataRetentionPeriod(DateTimeUnitOfMeasure value) {
        this.dataRetentionPeriod = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCategoryID(Long value) {
        this.categoryID = value;
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
     *         &lt;element name="Field" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionField" maxOccurs="unbounded" minOccurs="0"/>
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
        "field"
    })
    public static class Fields {

        @XmlElement(name = "Field", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<DataExtensionField> field;

        /**
         * Gets the value of the field property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the field property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataExtensionField }
         * 
         * 
         */
        public List<DataExtensionField> getField() {
            if (field == null) {
                field = new ArrayList<DataExtensionField>();
            }
            return this.field;
        }

    }

}
