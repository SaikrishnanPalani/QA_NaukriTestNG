package com.runnerClasses;
import org.openqa.selenium.By;

import com.reusablemethods.Baseclass;
import com.utility.ExcelReader;

public class TestRunner extends Baseclass{

	public static void main(String[] args) {
		
		Browserlaunch("chrome");
		//Gettingurl("https:www.amazon.in/")
		Gettingurl("https://www.youtube.com/"); 
//		Navigatetourl("https://www.facebook.com/");
//		Navigationsmethods("back");
//		Navigationsmethods("forward");
//		Navigationsmethods("refresh");
////		WebElement element = driver.findElement(By.id("email")).sendKeys("Saikrishnan");
//		//inputvalue((WebElement) By.id("email"),"saikrihshsh");
//		WebElement element =driver.findElement(By.id("email"));
//	
//		inputvalue(element,"Saikrishnan");
//		WebElement elementone =driver.findElement(By.id("pass"));
//		inputvaluepass(elementone,"Saikrishnan");
//
//		Checks(driver.findElement(By.id("email")));
//		
//		//Checks(driver.findElement(By.id("email")));\
//		currenturl();
//		retrivetext("Forgotten password?");
//		
//		String title = driver.getTitle();
//		Titleretrive();
//		
//		Attributeget();
		//getDropdownOptionsById("superheros");
		//closewindow();
		
		//terminate();
		//Acttionsmethod("Playwright");//div[text() = ' Kurimurai ']
		driver.findElement(By.xpath("//*[@name='search_query']"));
	
	
	}
		
	}

