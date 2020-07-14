package com.automate.withMe;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automate.withMe.utils.Utilities;

import pageObjects.Page_obj;

public class Test_google extends BeforeAfterTest{
  @Test
  @Parameters({"URL"})
  public void f(String URL) {
	  
	  Utilities utils = new Utilities();
	  Page_obj page= new Page_obj();
	  
	  //navigate
	  utils.Naigate_to_URL(driver, URL);
	  
	  
	  //Assert
	  utils.Assert_My_Title(driver, "Google");
	  
	  //input the Text
	  utils.Input_Text(driver, page.seach_box, "QA Automation");
	  
	  
	  //Enter
	  utils.Enter_key_Press(driver, page.seach_box);
	  
	  
  }
 
}
