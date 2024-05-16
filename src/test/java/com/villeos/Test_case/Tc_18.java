package com.villeos.Test_case;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_18;

public class Tc_18 extends Base_class
{
	//To validate the Network Error alert functionality while trying to send message to the buyer while the data connectivity is off.

	protected POM_Tc_18 p1;
	
	String mail="newuser03649791@gmail.com";
	String password="Test@1234";
	
  @Test
  public void Message_Agent_task() throws InterruptedException 
  {
	  
	  p1= new POM_Tc_18(driver);
	  
	  //Login to the application as agent.
	  
	  p1.entermail(mail);
	  
	  p1.enterpassword(password);
	  
	  p1.LoginBtn();
	  
	  //click on user
	  
	  p1.clickUser();
	  
	  //click on stage.
	  
	  p1.click_stage_1();
	  
	  Thread.sleep(3000);
	  
	   p1.click_task();
	   
	   //Turning off the internet connectivity before clicking on the profile option.
		  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
		  
		  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
		  
		  //click on message.
		  
		  p1.Message_user();
		  
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
		  //In this section we will try to send a message without internet connection.
		  
		  //click on user.
		  p1.clickUser();
		  
		  //click on stage
		  
		  p1.click_stage_1();
		  
		  
		  Thread.sleep(3000);
		  
		  //click on message
		  
		   p1.click_task();
		  
		  // click on non task message.
		  p1.Message_user();
		  
		  Thread.sleep(3000);
		  
		//Turning off the internet connectivity before clicking on the profile option.
		  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
		  
		  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
		  
		  //click on send button.
		  
		  p1.click_send_button();
		  
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
