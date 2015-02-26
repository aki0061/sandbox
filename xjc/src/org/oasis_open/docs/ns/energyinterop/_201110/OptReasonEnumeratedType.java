//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.25 at 01:54:11 PM SGT 
//


package org.oasis_open.docs.ns.energyinterop._201110;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptReasonEnumeratedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptReasonEnumeratedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="economic"/>
 *     &lt;enumeration value="emergency"/>
 *     &lt;enumeration value="mustRun"/>
 *     &lt;enumeration value="notParticipating"/>
 *     &lt;enumeration value="outageRunStatus"/>
 *     &lt;enumeration value="overrideStatus"/>
 *     &lt;enumeration value="participating"/>
 *     &lt;enumeration value="x-schedule"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptReasonEnumeratedType")
@XmlEnum
public enum OptReasonEnumeratedType {

    @XmlEnumValue("economic")
    ECONOMIC("economic"),
    @XmlEnumValue("emergency")
    EMERGENCY("emergency"),
    @XmlEnumValue("mustRun")
    MUST_RUN("mustRun"),
    @XmlEnumValue("notParticipating")
    NOT_PARTICIPATING("notParticipating"),
    @XmlEnumValue("outageRunStatus")
    OUTAGE_RUN_STATUS("outageRunStatus"),
    @XmlEnumValue("overrideStatus")
    OVERRIDE_STATUS("overrideStatus"),
    @XmlEnumValue("participating")
    PARTICIPATING("participating"),
    @XmlEnumValue("x-schedule")
    X_SCHEDULE("x-schedule");
    private final String value;

    OptReasonEnumeratedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptReasonEnumeratedType fromValue(String v) {
        for (OptReasonEnumeratedType c: OptReasonEnumeratedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
