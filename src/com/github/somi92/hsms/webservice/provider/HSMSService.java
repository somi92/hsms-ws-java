package com.github.somi92.hsms.webservice.provider;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface HSMSService {

	@WebMethod public HSMS[] getAllActions();
	@WebMethod public HSMS[] getActionsByPriority(int priority);
}
