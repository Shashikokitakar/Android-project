package com.villeos.Test_case;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_21;

import io.appium.java_client.android.connection.ConnectionStateBuilder;

public class Tc_21 extends Base_class 
{
	
	//To validate the Network Error alert functionality while trying to logout while the data connectivity is off.
	

	private POM_Tc_21 p1;
	
	String mail="Shashikant.kokitakar@facillima.com";
	
	String password="Test@1234";

  @Test
  public void Logout() throws InterruptedException 
  {
	p1=new POM_Tc_21(driver);
	
	p1.entermail(mail);
	
	p1.enterpassword(password);
	
	p1.LoginBtn();
	
	p1.clickMenu();
	
	//Turning off the internet connectivity before clicking on the profile option.
	driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	
	Thread.sleep(3000);
	
	driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	p1.Logout();
	
	//checking that network error alert will displayed after wifi getting turn off.
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

