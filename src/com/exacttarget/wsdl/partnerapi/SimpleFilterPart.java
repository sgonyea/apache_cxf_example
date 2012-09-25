
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SimpleFilterPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleFilterPart">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}FilterPart">
 *       &lt;sequence>
 *         &lt;element name="Property" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SimpleOperator" type="{http://exacttarget.com/wsdl/partnerAPI}SimpleOperators"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DateValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleFilterPart", propOrder = {
    "property",
    "simpleOperator",
    "value",
    "dateValue"
})
public class SimpleFilterPart
    extends FilterPart
{

    @XmlElement(name = "Property", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String property;
    @XmlElement(name = "SimpleOperator", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected SimpleOperators simpleOperator;
    @XmlElement(name = "Value", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<String> value;
    @XmlElement(name = "DateValue", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<XMLGregorianCalendar> dateValue;

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * Gets the value of the simpleOperator property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleOperators }
     *     
     */
    public SimpleOperators getSimpleOperator() {
        return simpleOperator;
    }

    /**
     * Sets the value of the simpleOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleOperators }
     *     
     */
    public void setSimpleOperator(SimpleOperators value) {
        this.simpleOperator = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getDateValue() {
        if (dateValue == null) {
            dateValue = new ArrayList<XMLGregorianCalendar>();
        }
        return this.dateValue;
    }

}
