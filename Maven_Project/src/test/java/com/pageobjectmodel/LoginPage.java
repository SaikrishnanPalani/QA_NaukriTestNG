package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelement.LoginPageInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import com.reusablemethods.Baseclass;

public class LoginPage extends Baseclass implements LoginPageInterfaceElements {
	
	@FindBy(xpath = signin_xpath)
	private WebElement signin;
	
	@FindBy(id =username_id)
	private WebElement email;
	
	@FindBy(id = password_id)
	private WebElement password;
	
	@FindBy(xpath =Login_xpath)
	private WebElement login;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
		
	public void validLogin() throws IOException {
		
		ElementClick(signin);
		inputvalue(email,PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("username"));
		inputvalue(password,PageObjectManager.getPageobjectmanager().getFileReader().getDataProperty("password"));
		ElementClick(login);
		
	
	
	
	}
	
	

}
