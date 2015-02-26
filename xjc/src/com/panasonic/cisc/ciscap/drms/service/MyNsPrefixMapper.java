package com.panasonic.cisc.ciscap.drms.service;

import com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper;
//import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
 
@SuppressWarnings("restriction")
public class MyNsPrefixMapper extends NamespacePrefixMapper {
 
    private static final String FOO_PREFIX = "ei"; // DEFAULT NAMESPACE
    private static final String FOO_URI = "http://docs.oasis-open.org/ns/energyinterop/201110";
 
    private static final String BAR_PREFIX = "oadr";
    private static final String BAR_URI = "http://openadr.org/oadr-2.0b/2012/07";

    private static final String BOO_PREFIX = "pyld";
    private static final String BOO_URI = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads";

    
    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        if(FOO_URI.equals(namespaceUri)) {
            return FOO_PREFIX;
        } else if(BAR_URI.equals(namespaceUri)) {
            return BAR_PREFIX;
        } else if(BOO_URI.equals(namespaceUri)) {
            return BOO_PREFIX;
        }
        return suggestion;
    }
 
    @Override
    public String[] getPreDeclaredNamespaceUris() {
        return new String[] { FOO_URI, BAR_URI ,BOO_URI};
    }
 
}
