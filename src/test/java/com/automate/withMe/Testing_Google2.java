package com.automate.withMe;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automate.withMe.utils.Utilities;

import pageObjects.Page_obj;

public class Testing_Google2 extends BeforeAfterTest {
  @Test(dataProvider = "data-provider")
  public void f(String data) {
	  
	  Utilities utils = new Utilities();
	  Page_obj page= new Page_obj();
	  
	  //navigate
	  utils.Naigate_to_URL(driver, "https://www.google.co.in/");
	  
	  
	  //Assert
	  utils.Assert_My_Title(driver, "Google");
	  
	  //input the Text
	  utils.Input_Text(driver, page.seach_box, data);
	  
	  
	  //Enter
	  utils.Enter_key_Press(driver, page.seach_box); 
  }
  
  
  @DataProvider(name = "data-provider")
  public Object[][] dataProviderMethod() {
      return new Object[][] { { "QA Automation" }, { "QA" } };
  }
}
