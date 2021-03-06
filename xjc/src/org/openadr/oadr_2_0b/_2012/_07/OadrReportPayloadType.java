//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.25 at 01:54:11 PM SGT 
//


package org.openadr.oadr_2_0b._2012._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.energyinterop._201110.ReportPayloadType;


/**
 * Report payload for use in reports.
 * 
 * <p>Java class for oadrReportPayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrReportPayloadType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/energyinterop/201110}ReportPayloadType">
 *       &lt;sequence>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrDataQuality" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrReportPayloadType", propOrder = {
    "oadrDataQuality"
})
public class OadrReportPayloadType
    extends ReportPayloadType
{

    protected String oadrDataQuality;

    /**
     * Enumerated value for the quality of this data item
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOadrDataQuality() {
        return oadrDataQuality;
    }

    /**
     * Sets the value of the oadrDataQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOadrDataQuality(String value) {
        this.oadrDataQuality = value;
    }

}
