package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelement.ShippingPageInterfaceElement;
import com.pageobjectmanager.PageObjectManager;
import com.reusablemethods.Baseclass;

public class ShipmentPage extends Baseclass implements ShippingPageInterfaceElement{
	
	@FindBy(xpath = Firstname_xpath)
	private WebElement firstname;
	
	@FindBy(xpath = Lastname_xpath)
	private WebElement lastname;
	
	@FindBy(xpath = company_xpath)
	private WebElement company;
	
	@FindBy(xpath = Address_xpath)
	private WebElement address;
	
	@FindBy(xpath = City_xpath)
	private WebElement city;
	
	@FindBy(xpath = Country_xpath)
	private WebElement country;
	
	@FindBy(xpath = State_xpath)
	private WebElement state;
	
	@FindBy(xpath = Code_xpath)
	private WebElement code;
	
	@FindBy(xpath = Phone_xpath)
	private WebElement phone;
	
	public ShipmentPage () {
		PageFactory.initElements(driver, this);
			
	}
	
	public void  validShipmentPage() throws IOException, InterruptedException {
		
		//inputvalue(firstname,PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("firstname"));
		//staywait(3000);
		//inputvalue(lastname,PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("lastname"));
		//staywait(3000);
		staywait(3000);
		inputvalue(company,PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("company"));
		staywait(3000);
		inputvalue(address,PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("address"));
		staywait(3000);
		inputvalue(city,PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("city"));
		staywait(3000);
		inputvalue(code,PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("postalcode"));
		staywait(3000);
		getelement(country,PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("country"));
		staywait(3000);
		getelement(state,PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("state"));
		staywait(3000);
		inputvalue(phone,PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("phone"));
		staywait(3000);
		//inputvalue(code,PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("postalcode"));
		
	}

	private void getelement(WebElement country2, String dataProperty) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
