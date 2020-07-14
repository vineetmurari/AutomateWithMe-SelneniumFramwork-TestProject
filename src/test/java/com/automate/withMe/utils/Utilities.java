package com.automate.withMe.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Utilities {
	public void Button_Link_Click(WebDriver driver_instance, By ele){
		driver_instance.findElement(ele).click();;
	}
	
	public void Assert_My_Title(WebDriver driver_instance, String Expected){
//		Assert.assertTrue(false);
//		Assert.assertEquals("A", "B");
		
		String Actual=driver_instance.getTitle();
		
	//	SoftAssert testasset= new SoftAssert();
		Assert.assertEquals(Expected, Actual);
		
	}

	public void Naigate_to_URL(WebDriver driver_instance, String URL){
		driver_instance.get(URL);
	}
	
	public void Input_Text(WebDriver driver_instance,By ele, String Text){
		driver_instance.findElement(ele).sendKeys(Text);
	}
	
	public void Enter_key_Press(WebDriver driver_instance,By ele){
		driver_instance.findElement(ele).sendKeys(Keys.ENTER);
	}
	
	public void wait_for_some_Time(int time) throws InterruptedException{
		Thread.sleep(time);
	}
}
