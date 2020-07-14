package com.automate.withMe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;

public class Test_Headless {
public static void main(String[] args) {
	WebDriver driver = new HtmlUnitDriver();
	
	driver.get("https://www.google.co.in/");
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "Google");
	driver.close();
	driver.quit();
}
}
