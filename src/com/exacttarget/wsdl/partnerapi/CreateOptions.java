
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Options">
 *       &lt;sequence>
 *         &lt;element name="Container" type="{http://exacttarget.com/wsdl/partnerAPI}ContainerID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOptions", propOrder = {
    "container"
})
public class CreateOptions
    extends Options
{

    @XmlElement(name = "Container", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ContainerID container;

    /**
     * Gets the value of the container property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerID }
     *     
     */
    public ContainerID getContainer() {
        return container;
    }

    /**
     * Sets the value of the container property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerID }
     *     
     */
    public void setContainer(ContainerID value) {
        this.container = value;
    }

}
