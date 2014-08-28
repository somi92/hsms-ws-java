package com.github.somi92.hsms.webservice.provider;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="com.github.somi92.hsms.webservice.provider.HSMSService")
public class HSMSProvider implements HSMSService {

	private HSMSDatabase database = new HSMSDatabase();

	@Override
	@WebMethod
    public HSMS[] getAllActions() {
        
    	database.connectToDatabase();
        return database.AllActions();
    }

	@Override
	@WebMethod
    public HSMS[] getActionsByPriority(int priority) {
    	
        database.connectToDatabase();
        return database.ActionsByPriority(priority);
    }
}
