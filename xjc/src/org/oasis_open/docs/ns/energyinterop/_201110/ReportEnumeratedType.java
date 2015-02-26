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
 * <p>Java class for ReportEnumeratedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportEnumeratedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="reading"/>
 *     &lt;enumeration value="usage"/>
 *     &lt;enumeration value="demand"/>
 *     &lt;enumeration value="setPoint"/>
 *     &lt;enumeration value="deltaUsage"/>
 *     &lt;enumeration value="deltaSetPoint"/>
 *     &lt;enumeration value="deltaDemand"/>
 *     &lt;enumeration value="baseline"/>
 *     &lt;enumeration value="deviation"/>
 *     &lt;enumeration value="avgUsage"/>
 *     &lt;enumeration value="avgDemand"/>
 *     &lt;enumeration value="operatingState"/>
 *     &lt;enumeration value="upRegulationCapacityAvailable"/>
 *     &lt;enumeration value="downRegulationCapacityAvailable"/>
 *     &lt;enumeration value="regulationSetpoint"/>
 *     &lt;enumeration value="storedEnergy"/>
 *     &lt;enumeration value="targetEnergyStorage"/>
 *     &lt;enumeration value="availableEnergyStorage"/>
 *     &lt;enumeration value="price"/>
 *     &lt;enumeration value="level"/>
 *     &lt;enumeration value="powerFactor"/>
 *     &lt;enumeration value="percentUsage"/>
 *     &lt;enumeration value="percentDemand"/>
 *     &lt;enumeration value="x-resourceStatus"/>
 *     &lt;enumeration value="x-CalenderStatus"/>
 *     &lt;enumeration value="x-SystemInfo"/>
 *     &lt;enumeration value="x-BatteryInfo"/>
 *     &lt;enumeration value="x-BatteryHist"/>
 *     &lt;enumeration value="x-ErrDevice"/>
 *     &lt;enumeration value="x-DRResult"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportEnumeratedType")
@XmlEnum
public enum ReportEnumeratedType {


    /**
     * Report indicates a reading, as from a meter. Readings are moments in time-changes over time can be computed from the difference between successive readings. Payload type is float
     * 
     */
    @XmlEnumValue("reading")
    READING("reading"),

    /**
     * Report indicates an amount of units (denominated in ItemBase or in the EMIX Product) over a period. Payload type is Quantity. A typical ItemBase is Real Energy.
     * 
     */
    @XmlEnumValue("usage")
    USAGE("usage"),

    /**
     * Report indicates an amount of units (denominated in ItemBase or in the EMIX Product). Payload type is Quantity. A typical ItemBase is Real Power.
     * 
     */
    @XmlEnumValue("demand")
    DEMAND("demand"),

    /**
     * Report indicates the amount (denominated in ItemBase or in the EMIX Product) currently set. May be a confirmation/return of the setpoint control value sent from the VTN. Payload type is Quantity. A typical ItemBase is Real Power.
     * 
     */
    @XmlEnumValue("setPoint")
    SET_POINT("setPoint"),

    /**
     * Change in usage as compared to the baseline. See usage for more information
     * 
     */
    @XmlEnumValue("deltaUsage")
    DELTA_USAGE("deltaUsage"),

    /**
     * Changes in setpoint from previous schedule.
     * 
     */
    @XmlEnumValue("deltaSetPoint")
    DELTA_SET_POINT("deltaSetPoint"),

    /**
     * Change in demand as compared to the baseline. See demand for more information
     * 
     */
    @XmlEnumValue("deltaDemand")
    DELTA_DEMAND("deltaDemand"),

    /**
     * Can be demand or usage, as indicated by ItemBase. Indicates what [measurement] would be if not for the event or regulation. Report is of the format Baseline.
     * 
     */
    @XmlEnumValue("baseline")
    BASELINE("baseline"),

    /**
     * Difference between some instruction and actual state.
     * 
     */
    @XmlEnumValue("deviation")
    DEVIATION("deviation"),

    /**
     * Average usage over the duration indicated by the Granularity. See usage for more information.
     * 
     */
    @XmlEnumValue("avgUsage")
    AVG_USAGE("avgUsage"),

    /**
     * Average usage over the duration indicated by the Granularity. See demand for more information.
     * 
     */
    @XmlEnumValue("avgDemand")
    AVG_DEMAND("avgDemand"),

    /**
     * Generalized state of a resource such as on/off, occupancy of building, etc. No ItemBase is relevant. Requires an Application Specific Payload Extension.
     * 
     */
    @XmlEnumValue("operatingState")
    OPERATING_STATE("operatingState"),

    /**
     * Up Regulation capacity available for dispatch, expressed in EMIX Real Power. Payload is always expressed as positive Quantity.
     * 
     */
    @XmlEnumValue("upRegulationCapacityAvailable")
    UP_REGULATION_CAPACITY_AVAILABLE("upRegulationCapacityAvailable"),

    /**
     * Down Regulation capacity available for dispatch, expressed in EMIX Real Power. Payload is always expressed as positive Quantity.
     * 
     */
    @XmlEnumValue("downRegulationCapacityAvailable")
    DOWN_REGULATION_CAPACITY_AVAILABLE("downRegulationCapacityAvailable"),

    /**
     * Regulation setpoint as instructed as part of regulation services
     * 
     */
    @XmlEnumValue("regulationSetpoint")
    REGULATION_SETPOINT("regulationSetpoint"),

    /**
     * Stored Energy is expressed as Real Energy and Payload is expressed as a Quantity.
     * 
     */
    @XmlEnumValue("storedEnergy")
    STORED_ENERGY("storedEnergy"),

    /**
     * Target Energy is expressed as Real Energy and Payload is expressed as a Quantity.
     * 
     */
    @XmlEnumValue("targetEnergyStorage")
    TARGET_ENERGY_STORAGE("targetEnergyStorage"),

    /**
     * Capacity available for further energy storage, perhaps to get to Target Energy Storage
     * 
     */
    @XmlEnumValue("availableEnergyStorage")
    AVAILABLE_ENERGY_STORAGE("availableEnergyStorage"),

    /**
     * Price per ItemBase at each Interval
     * 
     */
    @XmlEnumValue("price")
    PRICE("price"),

    /**
     * Simple level from market at each Interval. Itembase is not relevant.
     * 
     */
    @XmlEnumValue("level")
    LEVEL("level"),

    /**
     * Power factor for the resource.
     * 
     */
    @XmlEnumValue("powerFactor")
    POWER_FACTOR("powerFactor"),

    /**
     * Percentage of usage.
     * 
     */
    @XmlEnumValue("percentUsage")
    PERCENT_USAGE("percentUsage"),

    /**
     * Percentage of demand
     * 
     */
    @XmlEnumValue("percentDemand")
    PERCENT_DEMAND("percentDemand"),

    /**
     * Percentage of demand
     * 
     */
    @XmlEnumValue("x-resourceStatus")
    X_RESOURCE_STATUS("x-resourceStatus"),

    /**
     * \u0083J\u0083\u008c\u0083\u0093\u0083_\u0081[.
     * 
     */
    @XmlEnumValue("x-CalenderStatus")
    X_CALENDER_STATUS("x-CalenderStatus"),

    /**
     * \u0083V\u0083X\u0083e\u0083\u0080\u008aT\u0097v.
     * 
     */
    @XmlEnumValue("x-SystemInfo")
    X_SYSTEM_INFO("x-SystemInfo"),

    /**
     * \u0092~\u0093d\u0092r.
     * 
     */
    @XmlEnumValue("x-BatteryInfo")
    X_BATTERY_INFO("x-BatteryInfo"),

    /**
     * \u0092~\u0093d\u0092r\u0097\u009a\u0097\u00f0.
     * 
     */
    @XmlEnumValue("x-BatteryHist")
    X_BATTERY_HIST("x-BatteryHist"),

    /**
     * \u008b@\u008a\u00ed\u0088\u00d9\u008f\u00ed.
     * 
     */
    @XmlEnumValue("x-ErrDevice")
    X_ERR_DEVICE("x-ErrDevice"),

    /**
     * DR\u008c\u008b\u0089\u00ca.
     * 
     */
    @XmlEnumValue("x-DRResult")
    X_DR_RESULT("x-DRResult");
    private final String value;

    ReportEnumeratedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportEnumeratedType fromValue(String v) {
        for (ReportEnumeratedType c: ReportEnumeratedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
