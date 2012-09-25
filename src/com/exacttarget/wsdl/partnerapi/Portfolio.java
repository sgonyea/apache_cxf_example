
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Portfolio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Portfolio">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://exacttarget.com/wsdl/partnerAPI}ResourceSpecification" minOccurs="0"/>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsUploaded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FileSizeKB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ThumbSizeKB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FileWidthPX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FileHeightPX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FileURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThumbURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CacheClearTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CategoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Portfolio", propOrder = {
    "source",
    "categoryID",
    "fileName",
    "displayName",
    "description",
    "typeDescription",
    "isUploaded",
    "isActive",
    "fileSizeKB",
    "thumbSizeKB",
    "fileWidthPX",
    "fileHeightPX",
    "fileURL",
    "thumbURL",
    "cacheClearTime",
    "categoryType"
})
public class Portfolio
    extends APIObject
{

    @XmlElement(name = "Source", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ResourceSpecification source;
    @XmlElement(name = "CategoryID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer categoryID;
    @XmlElement(name = "FileName", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String fileName;
    @XmlElement(name = "DisplayName", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String displayName;
    @XmlElement(name = "Description", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String description;
    @XmlElement(name = "TypeDescription", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String typeDescription;
    @XmlElement(name = "IsUploaded", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isUploaded;
    @XmlElement(name = "IsActive", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isActive;
    @XmlElement(name = "FileSizeKB", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer fileSizeKB;
    @XmlElement(name = "ThumbSizeKB", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer thumbSizeKB;
    @XmlElement(name = "FileWidthPX", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer fileWidthPX;
    @XmlElement(name = "FileHeightPX", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer fileHeightPX;
    @XmlElement(name = "FileURL", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String fileURL;
    @XmlElement(name = "ThumbURL", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String thumbURL;
    @XmlElement(name = "CacheClearTime", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar cacheClearTime;
    @XmlElement(name = "CategoryType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String categoryType;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceSpecification }
     *     
     */
    public ResourceSpecification getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceSpecification }
     *     
     */
    public void setSource(ResourceSpecification value) {
        this.source = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryID(Integer value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
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
     * Gets the value of the typeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDescription() {
        return typeDescription;
    }

    /**
     * Sets the value of the typeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDescription(String value) {
        this.typeDescription = value;
    }

    /**
     * Gets the value of the isUploaded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUploaded() {
        return isUploaded;
    }

    /**
     * Sets the value of the isUploaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUploaded(Boolean value) {
        this.isUploaded = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the fileSizeKB property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFileSizeKB() {
        return fileSizeKB;
    }

    /**
     * Sets the value of the fileSizeKB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFileSizeKB(Integer value) {
        this.fileSizeKB = value;
    }

    /**
     * Gets the value of the thumbSizeKB property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThumbSizeKB() {
        return thumbSizeKB;
    }

    /**
     * Sets the value of the thumbSizeKB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThumbSizeKB(Integer value) {
        this.thumbSizeKB = value;
    }

    /**
     * Gets the value of the fileWidthPX property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFileWidthPX() {
        return fileWidthPX;
    }

    /**
     * Sets the value of the fileWidthPX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFileWidthPX(Integer value) {
        this.fileWidthPX = value;
    }

    /**
     * Gets the value of the fileHeightPX property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFileHeightPX() {
        return fileHeightPX;
    }

    /**
     * Sets the value of the fileHeightPX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFileHeightPX(Integer value) {
        this.fileHeightPX = value;
    }

    /**
     * Gets the value of the fileURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileURL() {
        return fileURL;
    }

    /**
     * Sets the value of the fileURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileURL(String value) {
        this.fileURL = value;
    }

    /**
     * Gets the value of the thumbURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbURL() {
        return thumbURL;
    }

    /**
     * Sets the value of the thumbURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbURL(String value) {
        this.thumbURL = value;
    }

    /**
     * Gets the value of the cacheClearTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCacheClearTime() {
        return cacheClearTime;
    }

    /**
     * Sets the value of the cacheClearTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCacheClearTime(XMLGregorianCalendar value) {
        this.cacheClearTime = value;
    }

    /**
     * Gets the value of the categoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * Sets the value of the categoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryType(String value) {
        this.categoryType = value;
    }

}
