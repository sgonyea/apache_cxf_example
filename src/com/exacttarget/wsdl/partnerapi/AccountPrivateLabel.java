
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountPrivateLabel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountPrivateLabel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OwnerMemberID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ColorPaletteXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountPrivateLabel", propOrder = {
    "name",
    "ownerMemberID",
    "colorPaletteXML"
})
public class AccountPrivateLabel
    extends APIObject
{

    @XmlElement(name = "Name", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String name;
    @XmlElement(name = "OwnerMemberID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected int ownerMemberID;
    @XmlElement(name = "ColorPaletteXML", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String colorPaletteXML;

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
     * Gets the value of the ownerMemberID property.
     * 
     */
    public int getOwnerMemberID() {
        return ownerMemberID;
    }

    /**
     * Sets the value of the ownerMemberID property.
     * 
     */
    public void setOwnerMemberID(int value) {
        this.ownerMemberID = value;
    }

    /**
     * Gets the value of the colorPaletteXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorPaletteXML() {
        return colorPaletteXML;
    }

    /**
     * Sets the value of the colorPaletteXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorPaletteXML(String value) {
        this.colorPaletteXML = value;
    }

}
