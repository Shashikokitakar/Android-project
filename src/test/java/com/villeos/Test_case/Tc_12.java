package com.villeos.Test_case;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_12;

public class Tc_12 extends Base_class
{
	//To validate the Network Error alert functionality while buyer trying to complete the task asign by the agent without the internet connectivity.
	
	POM_Tc_12 p1;
	
	//Storing the valid credentials in String variable.

	String mail="buyer8559@gmail.com";
	String password="Test@1234";
	
  @Test
  public void complete_task() throws InterruptedException
  {
	  p1=new POM_Tc_12(driver);
	  
	//Log in to the application with valid credentials such as Email and password.
	  p1.entermail(mail);
	  
	  p1.enterpassword(password);
	  
	  p1.LoginBtn();
	  
	  p1.click_stage();
	  
	  Thread.sleep(3000);
	  //Turning off the internet connectivity before clicking on the profile option.
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	  //click on complete task button.
	  
	  p1.click_checkbox();
	  
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
