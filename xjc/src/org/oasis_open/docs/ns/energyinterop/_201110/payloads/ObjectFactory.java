//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.25 at 01:54:11 PM SGT 
//


package org.oasis_open.docs.ns.energyinterop._201110.payloads;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.ns.energyinterop._201110.payloads package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReplyLimit_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110/payloads", "replyLimit");
    private final static QName _RequestID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110/payloads", "requestID");
    private final static QName _ReportToFollow_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110/payloads", "reportToFollow");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.ns.energyinterop._201110.payloads
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EiCreatedEvent }
     * 
     */
    public EiCreatedEvent createEiCreatedEvent() {
        return new EiCreatedEvent();
    }

    /**
     * Create an instance of {@link EiRequestEvent }
     * 
     */
    public EiRequestEvent createEiRequestEvent() {
        return new EiRequestEvent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", name = "replyLimit")
    public JAXBElement<Long> createReplyLimit(Long value) {
        return new JAXBElement<Long>(_ReplyLimit_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", name = "requestID")
    public JAXBElement<String> createRequestID(String value) {
        return new JAXBElement<String>(_RequestID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", name = "reportToFollow")
    public JAXBElement<Boolean> createReportToFollow(Boolean value) {
        return new JAXBElement<Boolean>(_ReportToFollow_QNAME, Boolean.class, null, value);
    }

}
