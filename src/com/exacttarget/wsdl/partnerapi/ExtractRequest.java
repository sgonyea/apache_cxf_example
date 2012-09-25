
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters;


/**
 * <p>Java class for ExtractRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtractRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Request">
 *       &lt;sequence>
 *         &lt;element name="Client" type="{http://exacttarget.com/wsdl/partnerAPI}ClientID" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Options" type="{http://exacttarget.com/wsdl/partnerAPI}ExtractOptions"/>
 *         &lt;element name="Parameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Parameter" type="{http://exacttarget.com/wsdl/partnerAPI}ExtractParameter" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Description" type="{http://exacttarget.com/wsdl/partnerAPI}ExtractDescription"/>
 *           &lt;element name="Definition" type="{http://exacttarget.com/wsdl/partnerAPI}ExtractDefinition"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtractRequest", propOrder = {
    "client",
    "id",
    "options",
    "parameters",
    "description",
    "definition"
})
public class ExtractRequest
    extends Request
{

    @XmlElement(name = "Client", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ClientID client;
    @XmlElement(name = "ID", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String id;
    @XmlElement(name = "Options", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected ExtractOptions options;
    @XmlElement(name = "Parameters", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Parameters parameters;
    @XmlElement(name = "Description", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ExtractDescription description;
    @XmlElement(name = "Definition", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ExtractDefinition definition;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link ClientID }
     *     
     */
    public ClientID getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientID }
     *     
     */
    public void setClient(ClientID value) {
        this.client = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractOptions }
     *     
     */
    public ExtractOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractOptions }
     *     
     */
    public void setOptions(ExtractOptions value) {
        this.options = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractDescription }
     *     
     */
    public ExtractDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractDescription }
     *     
     */
    public void setDescription(ExtractDescription value) {
        this.description = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractDefinition }
     *     
     */
    public ExtractDefinition getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractDefinition }
     *     
     */
    public void setDefinition(ExtractDefinition value) {
        this.definition = value;
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
     *         &lt;element name="Parameter" type="{http://exacttarget.com/wsdl/partnerAPI}ExtractParameter" maxOccurs="unbounded" minOccurs="0"/>
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
        protected List<ExtractParameter> parameter;

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
         * {@link ExtractParameter }
         * 
         * 
         */
        public List<ExtractParameter> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<ExtractParameter>();
            }
            return this.parameter;
        }

    }

}
