package com.github.somi92.hsms.webservice.provider;

import java.util.LinkedList;
import java.util.List;

public class HSMSDatabase {

	private List<HSMS> actionList;
	
	public void connectToDatabase() {
		
		if (actionList == null)
        {
            actionList = new LinkedList<HSMS>();
        }

        if (actionList.size() == 0)
        {
            actionList.add(new HSMS(200, "Pomoc ugrozenima u poplavama", "1003", "100 din", "Vlada Republike Srbije", 1));
            actionList.add(new HSMS(201, "Humanitarna akcija za pomoc u lecenju Sare Zivkovic", "5045", "100 din", "Humanitarna organizacija Decje srce", 1));
            actionList.add(new HSMS(202, "Humanitarna akcija za pomoc u lecenju Vuka Lojkovica", "7553", "100 din", "Humanitarna organizacija Decje srce", 1));
            actionList.add(new HSMS(203, "Humanitarna akcija za pomoc u lecenju Une Savic", "2205", "100 din", "Humanitarna organizacija Decje srce", 1));
            actionList.add(new HSMS(204, "Humanitarna akcija Jedan u milion", "2112", "100 din", "Fondacija Ana i Vlade Divac", 2));
            actionList.add(new HSMS(205, "Humanitarna akcija Bitka za bebe", "3100", "100 din", "Fond B92", 2));
            actionList.add(new HSMS(206, "Humanitarna akcija Srce za decu", "2552", "100 din", "Blic fondacija", 2));
            actionList.add(new HSMS(207, "Humanitarna akcija 65+ Pokret za brigu o starima", "1651", "100 din", "Fond B92", 3));
        }
	}
	
	public HSMS[] AllActions() {
		
        return actionList.toArray(new HSMS[actionList.size()]);
    }

    public HSMS[] ActionsByPriority(int priority)
    {
        List<HSMS> actionsByPriority = new LinkedList<HSMS>();

        for(HSMS h : actionList) 
        {
            if (h.getPriority() == priority)
            {
                actionsByPriority.add(h);
            }
        }

        return actionsByPriority.toArray(new HSMS[actionsByPriority.size()]);
    }
}
