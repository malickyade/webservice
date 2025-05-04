package com.biblio.rest.soap;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

@Component
public class SoapConnector {

    private final WebServiceTemplate webServiceTemplate;

    public SoapConnector(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public Object callWebService(String url, Object request) {
        return webServiceTemplate.marshalSendAndReceive(url, request);
    }
}
