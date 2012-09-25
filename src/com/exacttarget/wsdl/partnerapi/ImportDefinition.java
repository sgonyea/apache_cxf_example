
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.exacttarget.wsdl.partnerapi.ImportDefinition.FieldMaps;


/**
 * <p>Java class for ImportDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}InteractionDefinition">
 *       &lt;sequence>
 *         &lt;element name="AllowErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DestinationObject" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" minOccurs="0"/>
 *         &lt;element name="FieldMappingType" type="{http://exacttarget.com/wsdl/partnerAPI}ImportDefinitionFieldMappingType" minOccurs="0"/>
 *         &lt;element name="FieldMaps" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FieldMap" type="{http://exacttarget.com/wsdl/partnerAPI}FieldMap" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FileSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileType" type="{http://exacttarget.com/wsdl/partnerAPI}FileType" minOccurs="0"/>
 *         &lt;element name="Notification" type="{http://exacttarget.com/wsdl/partnerAPI}AsyncResponse" minOccurs="0"/>
 *         &lt;element name="RetrieveFileTransferLocation" type="{http://exacttarget.com/wsdl/partnerAPI}FileTransferLocation" minOccurs="0"/>
 *         &lt;element name="SubscriberImportType" type="{http://exacttarget.com/wsdl/partnerAPI}ImportDefinitionSubscriberImportType" minOccurs="0"/>
 *         &lt;element name="UpdateType" type="{http://exacttarget.com/wsdl/partnerAPI}ImportDefinitionUpdateType" minOccurs="0"/>
 *         &lt;element name="MaxFileAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxFileAgeScheduleOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxImportFrequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Delimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeaderLines" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportDefinition", propOrder = {
    "allowErrors",
    "destinationObject",
    "fieldMappingType",
    "fieldMaps",
    "fileSpec",
    "fileType",
    "notification",
    "retrieveFileTransferLocation",
    "subscriberImportType",
    "updateType",
    "maxFileAge",
    "maxFileAgeScheduleOffset",
    "maxImportFrequency",
    "delimiter",
    "headerLines"
})
public class ImportDefinition
    extends InteractionDefinition
{

    @XmlElement(name = "AllowErrors", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean allowErrors;
    @XmlElement(name = "DestinationObject", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected APIObject destinationObject;
    @XmlElement(name = "FieldMappingType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ImportDefinitionFieldMappingType fieldMappingType;
    @XmlElement(name = "FieldMaps", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected FieldMaps fieldMaps;
    @XmlElement(name = "FileSpec", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String fileSpec;
    @XmlElement(name = "FileType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected FileType fileType;
    @XmlElement(name = "Notification", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected AsyncResponse notification;
    @XmlElement(name = "RetrieveFileTransferLocation", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected FileTransferLocation retrieveFileTransferLocation;
    @XmlElement(name = "SubscriberImportType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ImportDefinitionSubscriberImportType subscriberImportType;
    @XmlElement(name = "UpdateType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ImportDefinitionUpdateType updateType;
    @XmlElement(name = "MaxFileAge", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer maxFileAge;
    @XmlElement(name = "MaxFileAgeScheduleOffset", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer maxFileAgeScheduleOffset;
    @XmlElement(name = "MaxImportFrequency", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer maxImportFrequency;
    @XmlElement(name = "Delimiter", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String delimiter;
    @XmlElement(name = "HeaderLines", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer headerLines;

    /**
     * Gets the value of the allowErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowErrors() {
        return allowErrors;
    }

    /**
     * Sets the value of the allowErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowErrors(Boolean value) {
        this.allowErrors = value;
    }

    /**
     * Gets the value of the destinationObject property.
     * 
     * @return
     *     possible object is
     *     {@link APIObject }
     *     
     */
    public APIObject getDestinationObject() {
        return destinationObject;
    }

    /**
     * Sets the value of the destinationObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIObject }
     *     
     */
    public void setDestinationObject(APIObject value) {
        this.destinationObject = value;
    }

    /**
     * Gets the value of the fieldMappingType property.
     * 
     * @return
     *     possible object is
     *     {@link ImportDefinitionFieldMappingType }
     *     
     */
    public ImportDefinitionFieldMappingType getFieldMappingType() {
        return fieldMappingType;
    }

    /**
     * Sets the value of the fieldMappingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDefinitionFieldMappingType }
     *     
     */
    public void setFieldMappingType(ImportDefinitionFieldMappingType value) {
        this.fieldMappingType = value;
    }

    /**
     * Gets the value of the fieldMaps property.
     * 
     * @return
     *     possible object is
     *     {@link FieldMaps }
     *     
     */
    public FieldMaps getFieldMaps() {
        return fieldMaps;
    }

    /**
     * Sets the value of the fieldMaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldMaps }
     *     
     */
    public void setFieldMaps(FieldMaps value) {
        this.fieldMaps = value;
    }

    /**
     * Gets the value of the fileSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSpec() {
        return fileSpec;
    }

    /**
     * Sets the value of the fileSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSpec(String value) {
        this.fileSpec = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link FileType }
     *     
     */
    public FileType getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileType }
     *     
     */
    public void setFileType(FileType value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncResponse }
     *     
     */
    public AsyncResponse getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncResponse }
     *     
     */
    public void setNotification(AsyncResponse value) {
        this.notification = value;
    }

    /**
     * Gets the value of the retrieveFileTransferLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FileTransferLocation }
     *     
     */
    public FileTransferLocation getRetrieveFileTransferLocation() {
        return retrieveFileTransferLocation;
    }

    /**
     * Sets the value of the retrieveFileTransferLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTransferLocation }
     *     
     */
    public void setRetrieveFileTransferLocation(FileTransferLocation value) {
        this.retrieveFileTransferLocation = value;
    }

    /**
     * Gets the value of the subscriberImportType property.
     * 
     * @return
     *     possible object is
     *     {@link ImportDefinitionSubscriberImportType }
     *     
     */
    public ImportDefinitionSubscriberImportType getSubscriberImportType() {
        return subscriberImportType;
    }

    /**
     * Sets the value of the subscriberImportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDefinitionSubscriberImportType }
     *     
     */
    public void setSubscriberImportType(ImportDefinitionSubscriberImportType value) {
        this.subscriberImportType = value;
    }

    /**
     * Gets the value of the updateType property.
     * 
     * @return
     *     possible object is
     *     {@link ImportDefinitionUpdateType }
     *     
     */
    public ImportDefinitionUpdateType getUpdateType() {
        return updateType;
    }

    /**
     * Sets the value of the updateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDefinitionUpdateType }
     *     
     */
    public void setUpdateType(ImportDefinitionUpdateType value) {
        this.updateType = value;
    }

    /**
     * Gets the value of the maxFileAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFileAge() {
        return maxFileAge;
    }

    /**
     * Sets the value of the maxFileAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFileAge(Integer value) {
        this.maxFileAge = value;
    }

    /**
     * Gets the value of the maxFileAgeScheduleOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFileAgeScheduleOffset() {
        return maxFileAgeScheduleOffset;
    }

    /**
     * Sets the value of the maxFileAgeScheduleOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFileAgeScheduleOffset(Integer value) {
        this.maxFileAgeScheduleOffset = value;
    }

    /**
     * Gets the value of the maxImportFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxImportFrequency() {
        return maxImportFrequency;
    }

    /**
     * Sets the value of the maxImportFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxImportFrequency(Integer value) {
        this.maxImportFrequency = value;
    }

    /**
     * Gets the value of the delimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the value of the delimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * Gets the value of the headerLines property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeaderLines() {
        return headerLines;
    }

    /**
     * Sets the value of the headerLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeaderLines(Integer value) {
        this.headerLines = value;
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
     *         &lt;element name="FieldMap" type="{http://exacttarget.com/wsdl/partnerAPI}FieldMap" maxOccurs="unbounded" minOccurs="0"/>
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
        "fieldMap"
    })
    public static class FieldMaps {

        @XmlElement(name = "FieldMap", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<FieldMap> fieldMap;

        /**
         * Gets the value of the fieldMap property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fieldMap property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFieldMap().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FieldMap }
         * 
         * 
         */
        public List<FieldMap> getFieldMap() {
            if (fieldMap == null) {
                fieldMap = new ArrayList<FieldMap>();
            }
            return this.fieldMap;
        }

    }

}
