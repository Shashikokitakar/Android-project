package com.villeos.Test_case;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_04;

import io.appium.java_client.AppiumBy;

public class Tc_04 extends Base_class
{
	//To validate that  Network Error alert functionality while trying to register on the app without the internet connection.
	
		protected POM_Tc_04 p1;
		
	  @Test
	  public void Sign_up_Process() throws InterruptedException 
	  {
		  p1= new POM_Tc_04(driver);
		  
		  Thread.sleep(3000);
		  
		  p1.clickSignUp();
		  
		  //Turning off the internet connectivity before clicking on the profile option.
		  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
		  
		  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
		  
		  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Confirm Password\"))"));
		  
		  // click on the sign up button when internet is off.
		  
		  p1.click_signUpBtn();
		  
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
	  
	  @Test
	  public void Verify_code() throws InterruptedException
	  {
		  // In this method we will try to check the network alert when internet connection is off.
		  
		  String name="ABCD";
		  
		  String mail="ABCD@gmail.com";
		  
		  String pass="Test@1234";
		  
		  p1= new POM_Tc_04(driver);
		  
		  //click on sign up link.
		  
		  p1.clickSignUp();
		  
		  Thread.sleep(3000);
		  
		  //sending the required Details
		  
		 p1.send_FName(name);
		  
		  p1.send_LName(name);
		  
		  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Password\"))"));
		  
		  p1.send_mail(mail);
		  
		  p1.send_pass(pass);
		  
		  p1.send_confirm_pass(pass);
		  
		  //click on sign up button.
		  
		  p1.click_signUpBtn();
		 
		  Thread.sleep(3000);
		  
		//Turning off the internet connectivity before clicking on the profile option.
		  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
		  
		  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
		  
		  //click on verify button without internet connection.
		  
		  p1.click_signUpBtn();
		  
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

