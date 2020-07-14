package com.automate.withMe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 extends BeforeAfterTest {
  @Test
  @Parameters({"URL"})
  public void f(String URL) throws InterruptedException {
	//naviagte to URL
			driver.get(URL);
			
			//Maxzimize 
			driver.manage().window().maximize();
			
			//Dropdown Link
			WebElement Dropdown_Link=driver.findElement(By.linkText("Dropdown"));
			Dropdown_Link.click();
			
			//Get Dropdown values
			WebElement drop_down =driver.findElement(By.id("dropdown"));
			Select DropdownValues = new Select(drop_down);
			List<WebElement> options = DropdownValues.getOptions();
			for(WebElement e: options){
				System.out.println(e.getText());
			}
			System.out.println("Get Current Selected Option : ");
			List<WebElement> SelecedOptions =DropdownValues.getAllSelectedOptions();
			for(WebElement e: SelecedOptions){
				System.out.println(e.getText());
			}
			System.out.println("Now Select Other Options...");
			DropdownValues.selectByIndex(2);
			Thread.sleep(3000);
			DropdownValues.selectByVisibleText("Option 2");
			Thread.sleep(3000);
			DropdownValues.selectByVisibleText("Option 1");
			Thread.sleep(3000);
  }
}
