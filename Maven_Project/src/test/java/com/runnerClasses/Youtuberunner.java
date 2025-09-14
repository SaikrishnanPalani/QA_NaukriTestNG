package com.runnerClasses;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import com.reusablemethods.Baseclass;
import com.utility.ExcelReader;

public class Youtuberunner extends Baseclass{
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		Browserlaunch("chrome");
		
		Gettingurl("https://www.youtube.com/"); 
		
		
		
		String name = ExcelReader.readParticularCellData(2,0);
		driver.findElement(By.xpath("//*[@name='search_query']")).sendKeys(name);
		
		driver.findElement(By.xpath("//*[@title='Search']")).click();
		
	}

}
