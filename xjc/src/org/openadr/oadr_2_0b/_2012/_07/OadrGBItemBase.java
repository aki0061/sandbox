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
import org.oasis_open.docs.ns.emix._2011._06.ItemBaseType;
import org.w3._2005.atom.FeedType;


/**
 * <p>Java class for oadrGBItemBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrGBItemBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06}ItemBaseType">
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
@XmlType(name = "oadrGBItemBase", propOrder = {
    "feed"
})
public class OadrGBItemBase
    extends ItemBaseType
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
