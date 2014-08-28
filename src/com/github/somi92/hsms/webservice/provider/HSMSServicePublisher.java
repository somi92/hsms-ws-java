package com.github.somi92.hsms.webservice.provider;

import javax.xml.ws.Endpoint;


public class HSMSServicePublisher {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8080/ws/hsms/service",new HSMSProvider());
	}
}
