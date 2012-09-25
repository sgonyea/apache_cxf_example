
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.exacttarget.wsdl.partnerapi.SystemStatusResult.Outages;


/**
 * <p>Java class for SystemStatusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemStatusResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Result">
 *       &lt;sequence>
 *         &lt;element name="SystemStatus" type="{http://exacttarget.com/wsdl/partnerAPI}SystemStatusType"/>
 *         &lt;element name="Outages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Outage" type="{http://exacttarget.com/wsdl/partnerAPI}SystemOutage" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemStatusResult", propOrder = {
    "systemStatus",
    "outages"
})
public class SystemStatusResult
    extends Result
{

    @XmlElement(name = "SystemStatus", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected SystemStatusType systemStatus;
    @XmlElement(name = "Outages", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Outages outages;

    /**
     * Gets the value of the systemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatusType }
     *     
     */
    public SystemStatusType getSystemStatus() {
        return systemStatus;
    }

    /**
     * Sets the value of the systemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatusType }
     *     
     */
    public void setSystemStatus(SystemStatusType value) {
        this.systemStatus = value;
    }

    /**
     * Gets the value of the outages property.
     * 
     * @return
     *     possible object is
     *     {@link Outages }
     *     
     */
    public Outages getOutages() {
        return outages;
    }

    /**
     * Sets the value of the outages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Outages }
     *     
     */
    public void setOutages(Outages value) {
        this.outages = value;
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
     *         &lt;element name="Outage" type="{http://exacttarget.com/wsdl/partnerAPI}SystemOutage" maxOccurs="unbounded" minOccurs="0"/>
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
        "outage"
    })
    public static class Outages {

        @XmlElement(name = "Outage", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<SystemOutage> outage;

        /**
         * Gets the value of the outage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOutage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SystemOutage }
         * 
         * 
         */
        public List<SystemOutage> getOutage() {
            if (outage == null) {
                outage = new ArrayList<SystemOutage>();
            }
            return this.outage;
        }

    }

}
