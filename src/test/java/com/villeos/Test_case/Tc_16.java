package com.villeos.Test_case;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_16;

import io.appium.java_client.AppiumBy;

public class Tc_16 extends Base_class
{
	//To validate the Network Error alert functionality while trying to assign a task to buyer from agent side while the mobile connectivity is off 

	private POM_Tc_16 p1;

	
	//Storing the valid credentials in String variable.

	String mail="newuser03649791@gmail.com";
	String password="Test@1234";
	
  @Test
  public void Task_Assign() throws InterruptedException
  {
	//creating the object of page object class to use the method of that class
	  p1=new POM_Tc_16(driver);
	  
	  //Log in to the application with valid credentials such as Email and password.
	  p1.entermail(mail);
	  
	  p1.enterpassword(password);
	  
	  p1.LoginBtn();
	  
	  Thread.sleep(5000);
	  
	  //click on user.
	  
	  p1.clickUser();
	  
	  p1.click_stage_3();
	  
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bank statement showing proof of funds\"))"));
	  //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\""+"Bank statement showing proof of funds"+"\").instance(0))"));
	  
	  Thread.sleep(3000);
	  
	//Turning off the internet connectivity before clicking on the profile option.
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	  Thread.sleep(3000);
	  
	  //click on task
	  
	  p1.click_Task();
	  
	  try
	  
  	  {
  		  //checking that network error alert will displayed after wifi getting turn off.
  		  boolean w1= driver.findElement(By.xpath("//android.widget.TextView[@text='Oops!']")).isDisplayed();
  		  
  		  if(w1==true)
  		  {
  			  //try to click on the Try again button present at the network error alert.
  			  p1.clickAgainbtn();
  			  
  			  //Adding some wait condition before Turn on the wifi.
  			  Thread.sleep(3000);
  			  
  			  
  			  //Turn on the Wifi connection
  			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi enable"));
  			  
  			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data enable"));
  			  
  			  //try to click on the Try again button present at the network error alert.
  			  p1.clickAgainbtn();
  			  }
  		  }

catch(Exception e)
	    {
		Assert.fail("Test failed due to absence of network error alert ");
		}

	  
	  
  }
  
}
