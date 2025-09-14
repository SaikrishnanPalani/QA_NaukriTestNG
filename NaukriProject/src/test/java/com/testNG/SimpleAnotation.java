package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnotation  {
	
	@BeforeSuite
	
	private void  propertySetting() {
		
		
		System.out.println("PropertySetting");
		
		
	}
	
	@BeforeTest
	
	private void launchBrowser() {
		
		System.out.println("Launch Browser");
		
		
	}
	
	@BeforeClass
	
	private void getURL() {
		
		System.out.println("LaunchURL");
		
	}
	
	@BeforeMethod
	
	
	private void Login(){
		
		System.out.println("Login");
		
	}
	
	@Test
	
	private void Men() {
		System.out.println("Men");
		
	}
	@Test
	private void Women() {
		
		System.out.println("Women products");
		
	}
	@Test
	private void Kids() {
		
		System.out.println("Kids Product");
		
	}
	@Test
	
private void Screenshots() {
		
		System.out.println("Take Screen Shot");
	}
	
	
	@AfterMethod
	
	private void Logout() {
		System.out.println("Log out ");
	
	}
	
	@AfterClass
	
	private void Screenshot() {
		
		System.out.println("Take Screen Shot");
	}
	
	@AfterTest
	
	private void close() {
		
		System.out.println("Close");
	}
	
	@AfterSuite
	private void Terminate() {
		
		System.out.println("Terminate");
	}
	
	

}
