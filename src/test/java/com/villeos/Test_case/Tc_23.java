package com.villeos.Test_case;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_23;

import io.appium.java_client.android.connection.ConnectionStateBuilder;

public class Tc_23 extends Base_class
{
	//To validate the Network Error alert functionality while trying to click on about while the data connectivity is off.
	

	private POM_Tc_23 p1;
	
	String Mail="Shashikant.kokitakar@facillima.com";
	
	String Password="Test@1234";
	
  @Test
  public void About() throws InterruptedException
  {
	  p1=new POM_Tc_23(driver);
	  
	  p1.entermail(Mail);
	  
	  p1.enterpassword(Password);
	  
	  p1.LoginBtn();
	  
	  p1.clickMenu();
	  
	//Turning off the internet connectivity before clicking on the Help and feedback option.
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  
	  Thread.sleep(3000);
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));

	  //click about menu
	  p1.clickAbout();
	  
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
					  
					  //Adding some wait condition before click on Try again button..
					  
					  //try to click on the Try again button present at the network error alert after internet connectivity turning on.
					  p1.clickAgainbtn();
				  }
			  }
			
			catch(Exception e)
			{  
					Assert.fail("Test failed due to absence of network error alert ");	
			}
			
			p1.clickMenu();
			
			p1.clickAbout();
			
			//Adding some wait condition before Turn on the wifi.
			  Thread.sleep(3000);
			  
			  //Turn on the Wifi connection
			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
			  
			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
			
			//click on back button
			  p1.clickBackbtn();
			  
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
						  
						  //Adding some wait condition before click on Try again button..
						  
						  //try to click on the Try again button present at the network error alert after internet connectivity turning on.
						  p1.clickAgainbtn();
					  }
				  }
				
				catch(Exception e)
				{  
						Assert.fail("Test failed due to absence of network error alert ");	
				}  
  }
  
}
