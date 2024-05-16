package com.villeos.Test_case;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_10;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionStateBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc_10 extends Base_class
{
	//To validate the Network Error alert functionality while trying to add the "House Prefrence"without the internet connection activity .
	private POM_Tc_10 p1;
	
  @Test(priority=1)
  public void house_Prefrence() throws InterruptedException 
  {
	 //creating a object of page object class.
	  p1=new POM_Tc_10(driver); 
	  
	  //Storing the login credentials in string variable.
	  String mail="Shashikant.kokitakar@facillima.com";
	  
	  String password="Test@1234";
	  
	  //Trying to login with valid credentials.
	  p1.entermail(mail);
	  
	  p1.enterpassword(password);
	  
	  p1.LoginBtn();
	  
	  //click on menu option.
	  p1.clickMenu();
	  
	  Thread.sleep(3000);
	  
	  //Turn off the wifi.
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  Thread.sleep(3000);
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	  //Thread.sleep(3000);
	  
	  //click on house_prefrence option.
	  p1.house_prefrence();
	  
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
	  
	//click on menu option.
	  p1.clickMenu();
	  
	  
	//click on house_prefrence option.
	  p1.house_prefrence();
	  
	  Thread.sleep(3000);
	  
	  //Turn off the wifi.
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	Thread.sleep(3000);
	  
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
  
  @Test(priority=1)
  public void house_Prefrence_Save() throws InterruptedException 
  {
	 //creating a object of page object class.
	  p1=new POM_Tc_10(driver); 
	  
	  //Storing the login credentials in string variable.
	  String mail="Shashikant.kokitakar@facillima.com";
	  
	  String password="Test@1234";
	  
	  //Trying to login with valid credentials.
	  p1.entermail(mail);
	  
	  p1.enterpassword(password);
	  
	  p1.LoginBtn();
	  
	  //click on menu option.
	  p1.clickMenu();
	  
	  //click on house prefrence option
	  
	  
	  p1.house_prefrence();
	  
	  Thread.sleep(10000);
	  
	  //Turn off the wifi.
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SAVE\"))"));
	  
	  p1.Save_button();
	  
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
			  Thread.sleep(3000);
			  
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
  
 