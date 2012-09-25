
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.exacttarget.wsdl.partnerapi.ScheduleRequestMsg.Interactions;


/**
 * <p>Java class for ScheduleRequestMsg element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="ScheduleRequestMsg">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="Options" type="{http://exacttarget.com/wsdl/partnerAPI}ScheduleOptions" minOccurs="0"/>
 *           &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="Schedule" type="{http://exacttarget.com/wsdl/partnerAPI}ScheduleDefinition" minOccurs="0"/>
 *           &lt;element name="Interactions" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Interaction" type="{http://exacttarget.com/wsdl/partnerAPI}InteractionBaseObject" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "options",
    "action",
    "schedule",
    "interactions"
})
@XmlRootElement(name = "ScheduleRequestMsg")
public class ScheduleRequestMsg {

    @XmlElement(name = "Options", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ScheduleOptions options;
    @XmlElement(name = "Action", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String action;
    @XmlElement(name = "Schedule", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ScheduleDefinition schedule;
    @XmlElement(name = "Interactions", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Interactions interactions;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleOptions }
     *     
     */
    public ScheduleOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleOptions }
     *     
     */
    public void setOptions(ScheduleOptions value) {
        this.options = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDefinition }
     *     
     */
    public ScheduleDefinition getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDefinition }
     *     
     */
    public void setSchedule(ScheduleDefinition value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the interactions property.
     * 
     * @return
     *     possible object is
     *     {@link Interactions }
     *     
     */
    public Interactions getInteractions() {
        return interactions;
    }

    /**
     * Sets the value of the interactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interactions }
     *     
     */
    public void setInteractions(Interactions value) {
        this.interactions = value;
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
     *         &lt;element name="Interaction" type="{http://exacttarget.com/wsdl/partnerAPI}InteractionBaseObject" maxOccurs="unbounded" minOccurs="0"/>
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
        "interaction"
    })
    public static class Interactions {

        @XmlElement(name = "Interaction", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<InteractionBaseObject> interaction;

        /**
         * Gets the value of the interaction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interaction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInteraction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InteractionBaseObject }
         * 
         * 
         */
        public List<InteractionBaseObject> getInteraction() {
            if (interaction == null) {
                interaction = new ArrayList<InteractionBaseObject>();
            }
            return this.interaction;
        }

    }

}
