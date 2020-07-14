package com.automate.withMe;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BeforeAfter {

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
