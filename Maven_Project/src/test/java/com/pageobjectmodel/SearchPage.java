package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelement.SearchPageInterfaceElements;
import com.reusablemethods.Baseclass;

public class SearchPage extends Baseclass implements SearchPageInterfaceElements {
	
	@FindBy(xpath = Men_xpath)
	private WebElement men;
	
	@FindBy(xpath = TopJacket_xpath)
	private WebElement top;
	
	@FindBy(xpath = MontanaJacket_xpath)
	private WebElement montana;
	
	@FindBy(xpath = Size_xpath)
	private WebElement size;
	
	@FindBy(xpath = Redcolor_xpath)
	private WebElement color;
	
	@FindBy(xpath =Addtocart_xpath)
	private WebElement cart;
	
	@FindBy(xpath = cart_xpath)
	private WebElement cartoption;
	
	@FindBy(xpath = ProceedCheckout_xpath)
	private WebElement checkout;
	
	
	public SearchPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void validSearch() throws InterruptedException {
		staywait(2000);
		ElementClick(men);
		staywait(2000);
		ElementClick(top);
		staywait(1000);
		ElementClick(montana);
		staywait(2000);
		ElementClick(size);
		staywait(2000);
		ElementClick(color);
		staywait(2000);
		ElementClick(cart);
		staywait(2000);
		ElementClick(cartoption);
		ElementClick(checkout);
		
	}
	
	

}
