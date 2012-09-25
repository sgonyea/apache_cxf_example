
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters;


/**
 * <p>Java class for SendDefinitionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendDefinitionList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}AudienceItem">
 *       &lt;sequence>
 *         &lt;element name="FilterDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}FilterDefinition" minOccurs="0"/>
 *         &lt;element name="IsTestObject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesForceObjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Parameter" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SendDefinitionList", propOrder = {
    "filterDefinition",
    "isTestObject",
    "salesForceObjectID",
    "name",
    "parameters"
})
public class SendDefinitionList
    extends AudienceItem
{

    @XmlElement(name = "FilterDefinition", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected FilterDefinition filterDefinition;
    @XmlElement(name = "IsTestObject", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean isTestObject;
    @XmlElement(name = "SalesForceObjectID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String salesForceObjectID;
    @XmlElement(name = "Name", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String name;
    @XmlElement(name = "Parameters", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Parameters parameters;

    /**
     * Gets the value of the filterDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link FilterDefinition }
     *     
     */
    public FilterDefinition getFilterDefinition() {
        return filterDefinition;
    }

    /**
     * Sets the value of the filterDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterDefinition }
     *     
     */
    public void setFilterDefinition(FilterDefinition value) {
        this.filterDefinition = value;
    }

    /**
     * Gets the value of the isTestObject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTestObject() {
        return isTestObject;
    }

    /**
     * Sets the value of the isTestObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTestObject(Boolean value) {
        this.isTestObject = value;
    }

    /**
     * Gets the value of the salesForceObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesForceObjectID() {
        return salesForceObjectID;
    }

    /**
     * Sets the value of the salesForceObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesForceObjectID(String value) {
        this.salesForceObjectID = value;
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
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Parameters }
     *     
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters }
     *     
     */
    public void setParameters(Parameters value) {
        this.parameters = value;
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
     *         &lt;element name="Parameter" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/>
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
        "parameter"
    })
    public static class Parameters {

        @XmlElement(name = "Parameter", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<APIProperty> parameter;

        /**
         * Gets the value of the parameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APIProperty }
         * 
         * 
         */
        public List<APIProperty> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<APIProperty>();
            }
            return this.parameter;
        }

    }

}
