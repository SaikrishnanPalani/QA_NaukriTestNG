package com.interfaceelement;

public interface SearchPageInterfaceElements {

	//For men arrow 
	String Men_xpath = "(//*[@class= 'ui-menu-icon ui-icon ui-icon-carat-1-e'])[4]";
	// For top 
	String TopJacket_xpath = "//a[text() ='Jackets']";
	//for the jacket image
	String MontanaJacket_xpath = "(//span[@class ='product-image-wrapper'])[3]";
	//For Size
	String Size_xpath = "(//div[text() = 'M'])[1]";
	//for color (red)
	String Redcolor_xpath = "(//div[@class = 'swatch-option color'])[3]";
	//add to cart
	String Addtocart_xpath = "(//*[@type= 'submit'])[2]";
	//Cart option
	String cart_xpath = "(//*[@class= 'action showcart'])";
	//Proceed to checkout
	String ProceedCheckout_xpath = "(//*[@type= 'button'])[3]";
	
	
	
	
	
	
	
	
}
