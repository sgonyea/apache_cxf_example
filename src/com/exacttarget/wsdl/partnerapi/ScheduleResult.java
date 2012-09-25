
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Result">
 *       &lt;sequence>
 *         &lt;element name="Object" type="{http://exacttarget.com/wsdl/partnerAPI}ScheduleDefinition"/>
 *         &lt;element name="Task" type="{http://exacttarget.com/wsdl/partnerAPI}TaskResult"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleResult", propOrder = {
    "object",
    "task"
})
public class ScheduleResult
    extends Result
{

    @XmlElement(name = "Object", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected ScheduleDefinition object;
    @XmlElement(name = "Task", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected TaskResult task;

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDefinition }
     *     
     */
    public ScheduleDefinition getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDefinition }
     *     
     */
    public void setObject(ScheduleDefinition value) {
        this.object = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link TaskResult }
     *     
     */
    public TaskResult getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskResult }
     *     
     */
    public void setTask(TaskResult value) {
        this.task = value;
    }

}
