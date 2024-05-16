package com.villeos.Test_case;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_11;
import com.villeos.POM.POM_Tc_13;

public class Tc_13 extends Base_class
{

	//To validate the Network Error alert functionality while trying to send a message with the attached document while the internet connection is off
	
	  POM_Tc_13 p1;
		
		//Storing the valid credentials in String variable.

		String mail="buyer8559@gmail.com";
		String password="Test@1234";
	  @Test
	  public void Task_Message() throws InterruptedException 
	  {
		  p1=new POM_Tc_13(driver);
		  
		//Log in to the application with valid credentials such as Email and password.
		  p1.entermail(mail);
		  
		  p1.enterpassword(password);
		  
		  p1.LoginBtn();
		  
		  p1.click_stage();
		  
		  Thread.sleep(3000);
		  //Turning off the internet connectivity before clicking on the profile option.
		  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
		  
		  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
		  
		  //click on task message icon.
		  
		  p1.click_task();
		  
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
	 Thread.sleep(3000);
	 
	 p1.click_task();
	 
	 Thread.sleep(3000);
	  //Turning off the internet connectivity before clicking on the profile option.
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	  p1.clickBackbtn();
	  
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