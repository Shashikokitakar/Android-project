package com.villeos.Test_case;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_19;

public class Tc_19 extends Base_class
{
	//To validate the Network Error alert functionality while trying to send message to the buyer from stage while the data connectivity is off.
	
	protected POM_Tc_19 p1;
	
	String mail="newuser03649791@gmail.com";
	String password="Test@1234";
	
  @Test
  public void Message() throws InterruptedException 
  {
	  p1=new POM_Tc_19(driver);
	  
	  //login to the application as agent
	  
	  p1.entermail(mail);
	  
	  p1.enterpassword(password);
	  
	  p1.LoginBtn();
	  
	  //click on message icon
	  
	  p1.click_Message();
	  
	 // p1.click_Message();
	  
	  //click on task related message
	  
	  p1.click_user();
	  
	  Thread.sleep(3000);
	  
	  //Turning off the internet connectivity before clicking on the profile option.
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	  //click on send button
	  
	  p1.click_Send();
	  
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
