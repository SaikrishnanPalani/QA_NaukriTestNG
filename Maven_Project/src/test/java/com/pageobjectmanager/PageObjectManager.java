package com.pageobjectmanager;

import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.SearchPage;
import com.pageobjectmodel.ShipmentPage;
import com.reusablemethods.Baseclass;
import com.utility.FileReaderManager;

public class PageObjectManager  extends Baseclass{
	

	private LoginPage loginpage;
	private FileReaderManager fileReader;
	private static PageObjectManager pageobjectmanager;
	private SearchPage searchpage;
	private ShipmentPage shipmentpage;
	
	
	public LoginPage getLoginpage() {	
		if(loginpage == null) {
			loginpage = new LoginPage();
		}
		return loginpage;
	}
	public FileReaderManager getFileReader() {
		if(fileReader == null) {
			fileReader = new FileReaderManager();
		}
		return fileReader;
	}
	public static PageObjectManager  getPageobjectmanager() {
		if(pageobjectmanager ==null) {
			
			pageobjectmanager = new PageObjectManager();
		}
		return pageobjectmanager;
		
	}
	public SearchPage getSearchpage() {
		if(searchpage ==null) {
			searchpage = new SearchPage();
			 
		}
		
		return searchpage;
	}
	
	public ShipmentPage getShipmentpage() {
		
		if(shipmentpage ==null) {
			shipmentpage = new ShipmentPage();
			
		}
		return shipmentpage;
	}
	
	
	


	
	
	

}
