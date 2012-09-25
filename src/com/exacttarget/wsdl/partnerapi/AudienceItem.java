
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudienceItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="List" type="{http://exacttarget.com/wsdl/partnerAPI}List" minOccurs="0"/>
 *         &lt;element name="SendDefinitionListType" type="{http://exacttarget.com/wsdl/partnerAPI}SendDefinitionListTypeEnum" minOccurs="0"/>
 *         &lt;element name="CustomObjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataSourceTypeID" type="{http://exacttarget.com/wsdl/partnerAPI}DataSourceTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceItem", propOrder = {
    "list",
    "sendDefinitionListType",
    "customObjectID",
    "dataSourceTypeID"
})
public class AudienceItem
    extends APIObject
{

    @XmlElement(name = "List", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected List list;
    @XmlElement(name = "SendDefinitionListType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected SendDefinitionListTypeEnum sendDefinitionListType;
    @XmlElement(name = "CustomObjectID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String customObjectID;
    @XmlElement(name = "DataSourceTypeID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected DataSourceTypeEnum dataSourceTypeID;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link List }
     *     
     */
    public List getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link List }
     *     
     */
    public void setList(List value) {
        this.list = value;
    }

    /**
     * Gets the value of the sendDefinitionListType property.
     * 
     * @return
     *     possible object is
     *     {@link SendDefinitionListTypeEnum }
     *     
     */
    public SendDefinitionListTypeEnum getSendDefinitionListType() {
        return sendDefinitionListType;
    }

    /**
     * Sets the value of the sendDefinitionListType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendDefinitionListTypeEnum }
     *     
     */
    public void setSendDefinitionListType(SendDefinitionListTypeEnum value) {
        this.sendDefinitionListType = value;
    }

    /**
     * Gets the value of the customObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomObjectID() {
        return customObjectID;
    }

    /**
     * Sets the value of the customObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomObjectID(String value) {
        this.customObjectID = value;
    }

    /**
     * Gets the value of the dataSourceTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceTypeEnum }
     *     
     */
    public DataSourceTypeEnum getDataSourceTypeID() {
        return dataSourceTypeID;
    }

    /**
     * Sets the value of the dataSourceTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceTypeEnum }
     *     
     */
    public void setDataSourceTypeID(DataSourceTypeEnum value) {
        this.dataSourceTypeID = value;
    }

}
