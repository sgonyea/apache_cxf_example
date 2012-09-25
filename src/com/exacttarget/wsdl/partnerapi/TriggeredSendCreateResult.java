
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggeredSendCreateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggeredSendCreateResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}CreateResult">
 *       &lt;sequence>
 *         &lt;element name="SubscriberFailures" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggeredSendCreateResult", propOrder = {
    "subscriberFailures"
})
public class TriggeredSendCreateResult
    extends CreateResult
{

    @XmlElement(name = "SubscriberFailures", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<SubscriberResult> subscriberFailures;

    /**
     * Gets the value of the subscriberFailures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberFailures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberFailures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberResult }
     * 
     * 
     */
    public List<SubscriberResult> getSubscriberFailures() {
        if (subscriberFailures == null) {
            subscriberFailures = new ArrayList<SubscriberResult>();
        }
        return this.subscriberFailures;
    }

}
