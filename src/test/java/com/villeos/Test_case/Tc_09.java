package com.villeos.Test_case;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_09;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.connection.ConnectionStateBuilder;

public class Tc_09 extends Base_class
{
	//To validate the Network Error alert functionality while trying to view  "My Profile" option from menu while turning off internet connection .
	
	private POM_Tc_09 p1;
	
	//Storing the valid credentials in String variable.

	String mail="Shashikant.kokitakar@facillima.com";
	String password="Test@1234";
	
	@Test(priority=0)
  public void Profile() throws InterruptedException 
  {
	  //creating the object of page object class to use the method of that class
	  p1=new POM_Tc_09(driver);
	  
	  //Log in to the application with valid credentials such as Email and password.
	  p1.entermail(mail);
	  
	  p1.enterpassword(password);
	  
	  p1.LoginBtn();
	  
	  //click on the menu option.
	  p1.clickMenu();
	  
	  Thread.sleep(5000);
	  //Turning off the internet connectivity before clicking on the profile option.
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	  //selecting the profile option from the menu
	  p1.clickprofile();
	  
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
	  
	  //click on the menu option.
	  p1.clickMenu();
	  
	  //selecting the profile option from the menu
	  p1.clickprofile();
	  
	  Thread.sleep(3000);
	  //Turning off the internet connectivity after clicking on the profile option.
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
		   
					//Adding some wait condition before click on Try again button..
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
  public void Profile_Save() throws InterruptedException
  {
	  p1=new POM_Tc_09(driver);
	  
	  p1.entermail(mail);
	  
	  p1.enterpassword(password);
	  
	  p1.LoginBtn();
	  
	//click on the menu option.
	  p1.clickMenu();
	  
	  //selecting the profile option from the menu
	  p1.clickprofile();
	  
	  Thread.sleep(3000);
	  //Turning off the internet connectivity after clicking on the profile option.
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	  //click on back button
	  p1.click_pencil();
	  
	  //checking that network error alert will displayed after wifi getting turn off.
			try
			
			{
				//checking that network error alert will displayed after wifi getting turn off.
				boolean w1= driver.findElement(By.xpath("//android.widget.TextView[@text='Oops!']")).isDisplayed();
				
				if(w1==true)
				
				{
					
					//try to click on the Try again button present at the network error alert.
					
					p1.clickAgainbtn();
		   
					//Adding some wait condition before click on Try again button..
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
			
			p1.clickBackbtn();
			
			//In this section we will try to edit the profile without internet connection.
			
			p1.clickMenu();
			
			p1.clickprofile();
			
			p1.click_pencil();
			
			Thread.sleep(3000);
			  //Turning off the internet connectivity after clicking on the profile option.
			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
			  
			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
			  
			  p1.click_Save();
			  
			  try
				
				{
					//checking that network error alert will displayed after wifi getting turn off.
					boolean w1= driver.findElement(By.xpath("//android.widget.TextView[@text='Oops!']")).isDisplayed();
					
					if(w1==true)
					
					{
						
						//try to click on the Try again button present at the network error alert.
						
						p1.clickAgainbtn();
			   
						//Adding some wait condition before click on Try again button..
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
  
  @Test(priority=2)
  public void Profil_delete() throws InterruptedException
  {
	  // in this method we will check internet connection alert will deleting profile.
	  p1=new POM_Tc_09(driver);
	  
	  p1.entermail(mail);
	  
	  p1.enterpassword(password);
	  
	  p1.LoginBtn();
	  
	//click on the menu option.
	  p1.clickMenu();
	  
	  //selecting the profile option from the menu
	  p1.clickprofile();
	  
	//click on edit profile button
	  p1.click_pencil();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"DELETE MY ACCOUNT\"))"));
	  
	  Thread.sleep(3000);
	 
	  //Turning off the internet connectivity after clicking on the profile option.
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	  //click on delete button
	  p1.click_delete_btn();
	  
	  //checking that network error alert will displayed after wifi getting turn off.
			try
			
			{
				//checking that network error alert will displayed after wifi getting turn off.
				boolean w1= driver.findElement(By.xpath("//android.widget.TextView[@text='Oops!']")).isDisplayed();
				
				if(w1==true)
				
				{
					
					//try to click on the Try again button present at the network error alert.
					
					p1.clickAgainbtn();
		   
					//Adding some wait condition before click on Try again button..
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
			
			Thread.sleep(10000);
			
  }
  
}
