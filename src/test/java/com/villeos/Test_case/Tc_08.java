package com.villeos.Test_case;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_07;
import com.villeos.POM.POM_Tc_08;

public class Tc_08 extends Base_class 
{
	
	protected POM_Tc_08 p1;
	
	//To validate that  Network Error alert functionality while trying to search the house by turning off the internet connection of the device.
	
  @Test
  public void House_Url() throws InterruptedException 
  {
	//Storing the valid credentials in String variable.

			String mail="Shashikant.kokitakar@facillima.com";
			String password="Test@1234";
			
			p1=new POM_Tc_08(driver);
			
			//Login to the application as a buyer.
			
			p1.entermail(mail);
			
			p1.enterpassword(password);
			
			p1.LoginBtn();
			
			Thread.sleep(5000);
			
			//Turn off the internet.
			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
			  
			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
			  
			  Thread.sleep(5000);
			  
			  //click on house search icon.
			  
			p1.Click_house();
			
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
