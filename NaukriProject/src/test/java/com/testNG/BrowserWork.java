package com.testNG;
import org.testng.annotations.Test;

import com.resuablemethods.Baseclass;

public class BrowserWork extends Baseclass{
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void BrowserChrome() {
		
		Browserlaunch("Chrome");
		Gettingurl("https://www.facebook.com/");
		System.out.println("Browser ID:"+Thread.currentThread().getId());
	}
	
	@SuppressWarnings("deprecation")
	public void edgeLaunch() {
		
		Browserlaunch("edge");
		Gettingurl("https://www.facebook.com/");
		System.out.println("Browser ID:"+Thread.currentThread().getId());
	}
	
	@SuppressWarnings("deprecation")
	public void safariLaunch() {
		
		Browserlaunch("safari");
		Gettingurl("https://www.facebook.com/");
		System.out.println("Browser ID:"+Thread.currentThread().getId());
	}
	
}
 