package com.panasonic.cisc.ciscap.drms.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.oasis_open.docs.ns.energyinterop._201110.EiResponseType;
import org.oasis_open.docs.ns.energyinterop._201110.EiTargetType;
import org.openadr.oadr_2_0b._2012._07.OadrCreatedPartyRegistrationType;
import org.openadr.oadr_2_0b._2012._07.OadrProfiles;
import org.openadr.oadr_2_0b._2012._07.OadrProfiles.OadrProfile;
import org.openadr.oadr_2_0b._2012._07.OadrTransportType;
import org.openadr.oadr_2_0b._2012._07.OadrTransports;
import org.openadr.oadr_2_0b._2012._07.OadrTransports.OadrTransport;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

import javax.xml.bind.util.JAXBSource;
@Component
public class OadrCreatedPartyRegistrationBuilder {
	OadrCreatedPartyRegistrationType oadrCreatedPartyRegistrationType;
	FileOutputStream fos = null; 	
	String baseXSDDirectory = "./xsd/";

	@SuppressWarnings("restriction")
	public void MessageBuilder(){

		try {
			//						System.setProperty("http.proxySet", "true");
			//						System.setProperty("http.proxyHost", "proxy.mei.co.jp");
			//						System.setProperty("http.proxyPort", "8080");	
			//						System.setProperty("https.proxySet", "true");
			//						System.setProperty("https.proxyHost", "proxy.mei.co.jp");
			//						System.setProperty("https.proxyPort", "8080");	

			@SuppressWarnings("restriction")
			JAXBContext jc = JAXBContext.newInstance(
					ietf.params.xml.ns.icalendar_2.ObjectFactory.class,
					ietf.params.xml.ns.icalendar_2_0.stream.ObjectFactory.class,
					net.opengis.gml._3.ObjectFactory.class,
					org.naesb.espi.ObjectFactory.class,
					org.oasis_open.docs.ns.emix._2011._06.ObjectFactory.class,
					org.oasis_open.docs.ns.emix._2011._06.power.ObjectFactory.class,
					org.oasis_open.docs.ns.emix._2011._06.siscale.ObjectFactory.class,
					org.oasis_open.docs.ns.energyinterop._201110.ObjectFactory.class,
					org.oasis_open.docs.ns.energyinterop._201110.payloads.ObjectFactory.class,
					org.oasis_open.docs.ns.energyinterop._201110.payloads.ObjectFactory.class,
					org.openadr.oadr_2_0b._2012._07.ObjectFactory.class,
					un.unece.uncefact.codelist.standard._5.iso42173a._2010_04_07.ObjectFactory.class);

			//			ObjectFactory of = new ObjectFactory(); 

			EiResponseType eiResponseType = new EiResponseType();
			EiTargetType eiTargetType = new EiTargetType();

			eiResponseType.setResponseCode("200");
			eiResponseType.setResponseDescription("OK"); // follow response code spec.
			eiResponseType.setRequestID("VEN_REQ_2014-09-01-15-00_0"); // input a value of oadrCreatePartyRegistration

			oadrCreatedPartyRegistrationType = new OadrCreatedPartyRegistrationType();
			oadrCreatedPartyRegistrationType.setEiResponse(eiResponseType);
			oadrCreatedPartyRegistrationType.setRegistrationID("123"); // refer ven name in oadrCreatedPartyRegistration
			oadrCreatedPartyRegistrationType.setVenID("123");; // same as registration ID(panasonic spec)

			List<String> listGroupID= eiTargetType.getGroupID();
			listGroupID.add("Group 1");
			listGroupID.add("Group 2");
			oadrCreatedPartyRegistrationType.setEiTarget(eiTargetType);

			//			List<String> groupList = new ArrayList<String>();
			//			groupList.add("group1"); 
			//			eiTargetType
			oadrCreatedPartyRegistrationType.setEiTarget(eiTargetType);

			String VTN_ID="DRMS_01"; // VTN-ID with 16 digit
			oadrCreatedPartyRegistrationType.setVtnID(VTN_ID);// input a value of oadrCreatePartyRegistration

			OadrProfiles oadrProfiles = new OadrProfiles();

			List<OadrProfile> listOadrProfile = oadrProfiles.getOadrProfile();
			OadrProfiles.OadrProfile oadrProfile = new OadrProfiles.OadrProfile();
			oadrProfile.setOadrProfileName("2.0b_pana");

			OadrTransports oadrTransports = new OadrTransports();
			List<OadrTransport> listOadrTransport = oadrTransports.getOadrTransport();
			OadrTransports.OadrTransport oadrTransport = new OadrTransports.OadrTransport();
			oadrTransport.setOadrTransportName(OadrTransportType.XMPP);
			listOadrTransport.add(oadrTransport);

			oadrProfile.setOadrTransports(oadrTransports);
			listOadrProfile.add(oadrProfile);

			oadrCreatedPartyRegistrationType.setOadrProfiles(oadrProfiles);

			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty("com.sun.xml.internal.bind.namespacePrefixMapper", new MyNsPrefixMapper());
//			marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, baseXSDDirectory+"oadr_20b.xsd");
			marshaller.marshal(new JAXBElement<OadrCreatedPartyRegistrationType>(new QName(""), OadrCreatedPartyRegistrationType.class, oadrCreatedPartyRegistrationType), System.out);
//			marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", myNsPrefixMapper);
//			marshaller.marshal(oadrCreatedPartyRegistrationType, System.out);

			//validation 
//			JAXBSource source = new JAXBSource(jc, oadrCreatedPartyRegistrationType);
//			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
//			try {
//
//				Schema schema;
//				try {
//					schema = sf.newSchema(new Source[] {
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_20b.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_atom.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_ei_20b.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_emix_20b.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_gml_20b.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_greenbutton.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_ISO_ISO3AlphaCurrencyCode_20100407.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_power_20b.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_pyld_20b.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_siscale_20b.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_strm_20b.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_xcal_20b.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_xml.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_xmldsig.xsd"))),
//							new StreamSource(new FileInputStream(new File(baseXSDDirectory+"oadr_xmldsig11.xsd"))),
//					});
//
//					Validator validator = schema.newValidator();
//					validator.setErrorHandler(new OadrErrorHandler());
//					try {
//						validator.validate(source);
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//
//
//
//				} catch (FileNotFoundException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//
//
//
//
//			} catch (SAXException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 


		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	

	}
}
