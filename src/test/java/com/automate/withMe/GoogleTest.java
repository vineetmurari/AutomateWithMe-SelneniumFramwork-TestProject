package com.automate.withMe;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GoogleTest extends BeforeAfterTest {
	
  @Test
  @Parameters({"URL"})
  public void f(String URL) throws InterruptedException {
	//naviagte to URL
		driver.get(URL);
		
		//Maxzimize 
		driver.manage().window().maximize();
		
		WebElement Alerts_Link=driver.findElement(By.linkText("JavaScript Alerts"));
		Alerts_Link.click();
		
		WebElement Button_JS_Alert =driver.findElement(By.xpath("//li[1]//button[1]"));
		Button_JS_Alert.click();
		Thread.sleep(3000);
		
		// Handle alert
		driver.switchTo().alert().accept(); //dismmiss
//		driver.switchTo().alert().dismiss();
		
		//comparing the Results
		String Expected="You successfuly clicked an alert";
		
		String Actual=driver.findElement(By.id("result")).getText();
		
		if(Expected.equalsIgnoreCase(Actual)){    
			System.out.println("PASS: The Results are matching");
		}
		else{
			System.out.println("Fail: Your results are not matching");
		}
		
		
		
		//BACK
		driver.navigate().back();
		Thread.sleep(3000);
		//Forward
		driver.navigate().forward();
		Thread.sleep(3000);
		//Reload
		driver.navigate().refresh();
		Thread.sleep(3000);
		 
	 
  }
 

  

 






}
