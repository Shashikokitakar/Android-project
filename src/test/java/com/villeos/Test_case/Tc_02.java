package com.villeos.Test_case;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_02;

public class Tc_02 extends Base_class 
{
	//To validate that the Preview functionality of the document/ file which is to be attached in the chat.
	
	protected POM_Tc_02 p1;
	  @Test
	  public void Terms_Condition() throws InterruptedException 
	  {
		  p1= new POM_Tc_02(driver);
		  
		  Thread.sleep(3000);
		  
		  //Turning off the internet connectivity before clicking on the profile option.
		  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
		  
		   driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
		   
		   //click on terms of services when internet connection is off.
		  
		   p1.click_Terms();
		  
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