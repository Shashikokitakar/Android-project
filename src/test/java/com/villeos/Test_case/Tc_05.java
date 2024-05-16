package com.villeos.Test_case;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_05;

public class Tc_05 extends Base_class
{
	//To validate that  Network Error alert functionality while trying to login to the app  without the internet connection.
	
	protected POM_Tc_05 p1;
	
	//Storing the valid credentials in String variable.

		String mail="Shashikant.kokitakar@facillima.com";
		String password="Test@1234";
		
		@Test(priority=0)
		  public void Login() throws InterruptedException 
		  {
			  //creating the object of page object class to use the method of that class
			  p1=new POM_Tc_05(driver);
			  
			  //Log in to the application with valid credentials such as Email and password.
			  p1.entermail(mail);
			  
			  p1.enterpassword(password);
			  
			  Thread.sleep(5000);
			  //Turning off the internet connectivity before clicking on the profile option.
			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
			  
			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
			  
			  //click on login button
			  p1.LoginBtn();
			  
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
