
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportResultsSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportResultsSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="ImportDefinitionCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberSuccessful" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberDuplicated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberErrors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalRows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ImportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImportStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskResultID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportResultsSummary", propOrder = {
    "importDefinitionCustomerKey",
    "startDate",
    "endDate",
    "destinationID",
    "numberSuccessful",
    "numberDuplicated",
    "numberErrors",
    "totalRows",
    "importType",
    "importStatus",
    "taskResultID"
})
public class ImportResultsSummary
    extends APIObject
{

    @XmlElement(name = "ImportDefinitionCustomerKey", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String importDefinitionCustomerKey;
    @XmlElement(name = "StartDate", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String startDate;
    @XmlElement(name = "EndDate", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String endDate;
    @XmlElement(name = "DestinationID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String destinationID;
    @XmlElement(name = "NumberSuccessful", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer numberSuccessful;
    @XmlElement(name = "NumberDuplicated", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer numberDuplicated;
    @XmlElement(name = "NumberErrors", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer numberErrors;
    @XmlElement(name = "TotalRows", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer totalRows;
    @XmlElement(name = "ImportType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String importType;
    @XmlElement(name = "ImportStatus", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String importStatus;
    @XmlElement(name = "TaskResultID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer taskResultID;

    /**
     * Gets the value of the importDefinitionCustomerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportDefinitionCustomerKey() {
        return importDefinitionCustomerKey;
    }

    /**
     * Sets the value of the importDefinitionCustomerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportDefinitionCustomerKey(String value) {
        this.importDefinitionCustomerKey = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the destinationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationID() {
        return destinationID;
    }

    /**
     * Sets the value of the destinationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationID(String value) {
        this.destinationID = value;
    }

    /**
     * Gets the value of the numberSuccessful property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberSuccessful() {
        return numberSuccessful;
    }

    /**
     * Sets the value of the numberSuccessful property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberSuccessful(Integer value) {
        this.numberSuccessful = value;
    }

    /**
     * Gets the value of the numberDuplicated property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberDuplicated() {
        return numberDuplicated;
    }

    /**
     * Sets the value of the numberDuplicated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberDuplicated(Integer value) {
        this.numberDuplicated = value;
    }

    /**
     * Gets the value of the numberErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberErrors() {
        return numberErrors;
    }

    /**
     * Sets the value of the numberErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberErrors(Integer value) {
        this.numberErrors = value;
    }

    /**
     * Gets the value of the totalRows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRows() {
        return totalRows;
    }

    /**
     * Sets the value of the totalRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRows(Integer value) {
        this.totalRows = value;
    }

    /**
     * Gets the value of the importType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportType() {
        return importType;
    }

    /**
     * Sets the value of the importType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportType(String value) {
        this.importType = value;
    }

    /**
     * Gets the value of the importStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportStatus() {
        return importStatus;
    }

    /**
     * Sets the value of the importStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportStatus(String value) {
        this.importStatus = value;
    }

    /**
     * Gets the value of the taskResultID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskResultID() {
        return taskResultID;
    }

    /**
     * Sets the value of the taskResultID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskResultID(Integer value) {
        this.taskResultID = value;
    }

}
