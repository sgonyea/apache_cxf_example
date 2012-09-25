
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands;


/**
 * <p>Java class for ComplexFilterPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexFilterPart">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}FilterPart">
 *       &lt;sequence>
 *         &lt;element name="LeftOperand" type="{http://exacttarget.com/wsdl/partnerAPI}FilterPart"/>
 *         &lt;element name="LogicalOperator" type="{http://exacttarget.com/wsdl/partnerAPI}LogicalOperators"/>
 *         &lt;element name="RightOperand" type="{http://exacttarget.com/wsdl/partnerAPI}FilterPart" minOccurs="0"/>
 *         &lt;element name="AdditionalOperands" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Operand" type="{http://exacttarget.com/wsdl/partnerAPI}FilterPart" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ComplexFilterPart", propOrder = {
    "leftOperand",
    "logicalOperator",
    "rightOperand",
    "additionalOperands"
})
public class ComplexFilterPart
    extends FilterPart
{

    @XmlElement(name = "LeftOperand", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected FilterPart leftOperand;
    @XmlElement(name = "LogicalOperator", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected LogicalOperators logicalOperator;
    @XmlElement(name = "RightOperand", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected FilterPart rightOperand;
    @XmlElement(name = "AdditionalOperands", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected AdditionalOperands additionalOperands;

    /**
     * Gets the value of the leftOperand property.
     * 
     * @return
     *     possible object is
     *     {@link FilterPart }
     *     
     */
    public FilterPart getLeftOperand() {
        return leftOperand;
    }

    /**
     * Sets the value of the leftOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterPart }
     *     
     */
    public void setLeftOperand(FilterPart value) {
        this.leftOperand = value;
    }

    /**
     * Gets the value of the logicalOperator property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperators }
     *     
     */
    public LogicalOperators getLogicalOperator() {
        return logicalOperator;
    }

    /**
     * Sets the value of the logicalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperators }
     *     
     */
    public void setLogicalOperator(LogicalOperators value) {
        this.logicalOperator = value;
    }

    /**
     * Gets the value of the rightOperand property.
     * 
     * @return
     *     possible object is
     *     {@link FilterPart }
     *     
     */
    public FilterPart getRightOperand() {
        return rightOperand;
    }

    /**
     * Sets the value of the rightOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterPart }
     *     
     */
    public void setRightOperand(FilterPart value) {
        this.rightOperand = value;
    }

    /**
     * Gets the value of the additionalOperands property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalOperands }
     *     
     */
    public AdditionalOperands getAdditionalOperands() {
        return additionalOperands;
    }

    /**
     * Sets the value of the additionalOperands property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalOperands }
     *     
     */
    public void setAdditionalOperands(AdditionalOperands value) {
        this.additionalOperands = value;
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
     *         &lt;element name="Operand" type="{http://exacttarget.com/wsdl/partnerAPI}FilterPart" maxOccurs="unbounded" minOccurs="0"/>
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
        "operand"
    })
    public static class AdditionalOperands {

        @XmlElement(name = "Operand", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<FilterPart> operand;

        /**
         * Gets the value of the operand property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operand property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperand().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FilterPart }
         * 
         * 
         */
        public List<FilterPart> getOperand() {
            if (operand == null) {
                operand = new ArrayList<FilterPart>();
            }
            return this.operand;
        }

    }

}
