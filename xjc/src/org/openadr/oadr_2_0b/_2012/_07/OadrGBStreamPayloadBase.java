//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.25 at 01:54:11 PM SGT 
//


package org.openadr.oadr_2_0b._2012._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2_0.stream.StreamPayloadBaseType;
import org.w3._2005.atom.FeedType;


/**
 * <p>Java class for oadrGBStreamPayloadBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrGBStreamPayloadBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0:stream}StreamPayloadBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}feed"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrGBStreamPayloadBase", propOrder = {
    "feed"
})
public class OadrGBStreamPayloadBase
    extends StreamPayloadBaseType
{

    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    protected FeedType feed;

    /**
     * Gets the value of the feed property.
     * 
     * @return
     *     possible object is
     *     {@link FeedType }
     *     
     */
    public FeedType getFeed() {
        return feed;
    }

    /**
     * Sets the value of the feed property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedType }
     *     
     */
    public void setFeed(FeedType value) {
        this.feed = value;
    }

}
