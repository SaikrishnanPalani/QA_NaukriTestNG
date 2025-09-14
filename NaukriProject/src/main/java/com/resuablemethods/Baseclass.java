package com.resuablemethods;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Baseclass {
	public static WebDriver  driver;
	
	//launching browser
	protected static void Browserlaunch(String browsername) {
		
		try {
			if(browsername.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}else if(browsername.equalsIgnoreCase("edge")) {
				
				driver = new EdgeDriver();
				
			}else if(browsername.equalsIgnoreCase("safari")) {
				
				driver = new SafariDriver();
				
			}
		} catch (Exception e) {
			Assert.fail("Error: Occurede during launch");
		}
	
		driver.manage().window().maximize();
	}
		//launching url
	
	protected static void Gettingurl(String url) {
		
		try {
			driver.get(url);
		} catch (Exception e) {
			Assert.fail("Error:URL is mismatch");
		}
		
		
	}
	
	protected static void Navigatetourl(String url) {
		
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			Assert.fail("Error:Navigate to correct url");
		}
	}
	
	protected static void Navigationsmethods(String types) {
		
		try {
			if(types.equalsIgnoreCase("back")) {
				
				driver.navigate().back();
			}else if(types.equalsIgnoreCase("forward")) {
				
				driver.navigate().forward();
			}else if(types.equalsIgnoreCase("refresh")) {
				
				driver.navigate().refresh();
			}
		} catch (Exception e) {
			Assert.fail("Error");
		}
		
		
	}
	
	protected static void inputvalue(WebElement element, String value ) {
		
		
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			Assert.fail("Error:happened");
		}
		

	}
	
	protected static void inputvaluepass(WebElement elementone, String pass ) {
		
		
		try {
			elementone.sendKeys(pass);
		} catch (Exception e) {
			Assert.fail("Error:occured");
		}
		
	}
	
	protected static void Checks(WebElement element) {
	
		try {
			boolean enable = element.isEnabled();
			System.out.println("the element is enabled"+enable);
			
			boolean display = element.isDisplayed();
			System.out.println("the element is diaplayed "+display);
			
			boolean select = element.isSelected();
			System.out.println("The element is selected"+select);
		} catch (Exception e) {
			Assert.fail("Error");
		}
		
	}
	protected static void  currenturl() {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Curent url is:"+" "+currentUrl);
		} catch (Exception e) {
			Assert.fail("Error:");
		}
		
	}
	protected static void retrivetext(String Element) {
		
		try {
			String text = driver.findElement(By.linkText(Element)).getText();
			System.out.println("The text is"+text);
		} catch (Exception e) {
			Assert.fail("Error:Enter correct passo");
		}
		
		
	}
	
	protected static void Titleretrive() {
		
		
		try {
			String title = driver.getTitle();
			System.out.println("The title of the page is:"+title);
		} catch (Exception e) {
			Assert.fail("Error:Fetch correctly");
		}
	}
	
	protected static void Attributeget() {
		
		try {
			String attribute = driver.findElement(By.id("email")).getAttribute("id");
			System.out.println("The attribute is"+attribute);
		} catch (Exception e) {
			Assert.fail("Error: get correct attrbute");
		}
	}
		
		protected static void getDropdownOptionsById(String elementId) {
	        WebElement dropdown = driver.findElement(By.id(elementId));
	        Select select = new Select(dropdown);
	        boolean multiple = select.isMultiple();
	       // WebElement firstSelectedOption = select.getFirstSelectedOption();
	        System.out.println(multiple);
	        

	        List<WebElement> options = select.getOptions();

	        System.out.println("Dropdown options are:");
	        for (WebElement option : options) {
	            System.out.println(option.getText());
	        }

		}
		
		protected static void terminate() {
			
			driver.quit();
		}
		
		protected static void closewindow() {
			
			driver.close();
		}
		
		protected static void Acttionsmethod(String Visibletext) {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	             //Wait for element with matching visible text
	            WebElement element = wait.until(ExpectedConditions
	                    .visibilityOfElementLocated(By.xpath("//*[normalize-space(text())='" + Visibletext + "']")));

	            // Scroll into view (sometimes hover fails otherwise)
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

//			
			Actions action = new Actions(driver);
			WebElement element1 = driver.findElement(By.xpath(Visibletext));
			action.moveToElement(element1).perform();
			//action.click(element1);
			
			
		}
		
		
		protected static void ElementClick(WebElement element ) {
			
			try {
				element.click();
			} catch (Exception e) {
				
				
				Assert.fail("Error:");
			}
			
			}
		
		
		protected static void getelement(WebElement element, String type, String value) {
			
			Select select = new Select(element);
			if(type.equalsIgnoreCase("index")) {
				
				int num = Integer.parseInt(value);
				select.selectByIndex(num);
				
			}else if(type.equalsIgnoreCase("value")) {
				select.selectByValue(value);
				
			}else if(type.equalsIgnoreCase("text")) {
				
				select.selectByVisibleText(value);
			}
			
			
			
		}
		
		protected static void holdimplicit(int sec) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
			
		}
		
		protected static void staywait(int sec) throws InterruptedException {
			
			Thread.sleep(sec);
		}
}
		
		
	
	  
