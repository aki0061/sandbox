//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.25 at 01:54:11 PM SGT 
//


package org.oasis_open.docs.ns.energyinterop._201110.payloads;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.energyinterop._201110.EiResponseType;
import org.oasis_open.docs.ns.energyinterop._201110.EiTargetType;
import org.oasis_open.docs.ns.energyinterop._201110.EventResponses;


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
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiResponse"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eventResponses" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}venID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiTarget" minOccurs="0"/>
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
    "eiResponse",
    "eventResponses",
    "venID",
    "eiTarget"
})
@XmlRootElement(name = "eiCreatedEvent")
public class EiCreatedEvent {

    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected EiResponseType eiResponse;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected EventResponses eventResponses;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected List<String> venID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected EiTargetType eiTarget;

    /**
     * Gets the value of the eiResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EiResponseType }
     *     
     */
    public EiResponseType getEiResponse() {
        return eiResponse;
    }

    /**
     * Sets the value of the eiResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiResponseType }
     *     
     */
    public void setEiResponse(EiResponseType value) {
        this.eiResponse = value;
    }

    /**
     * Gets the value of the eventResponses property.
     * 
     * @return
     *     possible object is
     *     {@link EventResponses }
     *     
     */
    public EventResponses getEventResponses() {
        return eventResponses;
    }

    /**
     * Sets the value of the eventResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResponses }
     *     
     */
    public void setEventResponses(EventResponses value) {
        this.eventResponses = value;
    }

    /**
     * Gets the value of the venID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the venID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVenID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVenID() {
        if (venID == null) {
            venID = new ArrayList<String>();
        }
        return this.venID;
    }

    /**
     * Gets the value of the eiTarget property.
     * 
     * @return
     *     possible object is
     *     {@link EiTargetType }
     *     
     */
    public EiTargetType getEiTarget() {
        return eiTarget;
    }

    /**
     * Sets the value of the eiTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiTargetType }
     *     
     */
    public void setEiTarget(EiTargetType value) {
        this.eiTarget = value;
    }

}
