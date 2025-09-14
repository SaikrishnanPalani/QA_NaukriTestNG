package com.runnerClasses;

import java.io.IOException;

import com.pageobjectmanager.PageObjectManager;
import com.reusablemethods.Baseclass;

public class LumaRunner extends Baseclass {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		Browserlaunch(PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("Browser"));
		Gettingurl(PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("url"));
		staywait(3000);
		PageObjectManager.getPageobjectmanager().getLoginpage().validLogin();
		//staywait(3000);
		PageObjectManager.getPageobjectmanager().getSearchpage().validSearch();
		//staywait(3000);
		PageObjectManager.getPageobjectmanager().getShipmentpage().validShipmentPage();
		
		
		
	}
	

}
