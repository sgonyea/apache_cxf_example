
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignPerformOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignPerformOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}PerformOptions">
 *       &lt;sequence>
 *         &lt;element name="OccurrenceIDs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OccurrenceIDsIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignPerformOptions", propOrder = {
    "occurrenceIDs",
    "occurrenceIDsIndex"
})
public class CampaignPerformOptions
    extends PerformOptions
{

    @XmlElement(name = "OccurrenceIDs", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<String> occurrenceIDs;
    @XmlElement(name = "OccurrenceIDsIndex", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer occurrenceIDsIndex;

    /**
     * Gets the value of the occurrenceIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occurrenceIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccurrenceIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOccurrenceIDs() {
        if (occurrenceIDs == null) {
            occurrenceIDs = new ArrayList<String>();
        }
        return this.occurrenceIDs;
    }

    /**
     * Gets the value of the occurrenceIDsIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOccurrenceIDsIndex() {
        return occurrenceIDsIndex;
    }

    /**
     * Sets the value of the occurrenceIDsIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOccurrenceIDsIndex(Integer value) {
        this.occurrenceIDsIndex = value;
    }

}
