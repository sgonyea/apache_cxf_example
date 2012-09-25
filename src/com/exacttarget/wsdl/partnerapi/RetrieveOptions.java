
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Options">
 *       &lt;sequence>
 *         &lt;element name="BatchSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IncludeObjects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OnlyIncludeBase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveOptions", propOrder = {
    "batchSize",
    "includeObjects",
    "onlyIncludeBase"
})
public class RetrieveOptions
    extends Options
{

    @XmlElement(name = "BatchSize", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer batchSize;
    @XmlElement(name = "IncludeObjects", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean includeObjects;
    @XmlElement(name = "OnlyIncludeBase", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean onlyIncludeBase;

    /**
     * Gets the value of the batchSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Sets the value of the batchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchSize(Integer value) {
        this.batchSize = value;
    }

    /**
     * Gets the value of the includeObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeObjects() {
        return includeObjects;
    }

    /**
     * Sets the value of the includeObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeObjects(Boolean value) {
        this.includeObjects = value;
    }

    /**
     * Gets the value of the onlyIncludeBase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyIncludeBase() {
        return onlyIncludeBase;
    }

    /**
     * Sets the value of the onlyIncludeBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyIncludeBase(Boolean value) {
        this.onlyIncludeBase = value;
    }

}
