package com.villeos.Backlog_Test_case;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Admin_Message;

import io.appium.java_client.AppiumBy;

public class Admin_message extends Base_class
{
	POM_Admin_Message p1;
	
	String Username="Help@facillima.com";
	
	String Password="Test@1234";

	
  @Test
  public void Message_Admin() throws InterruptedException 
  {
	  p1=new POM_Admin_Message(driver);
	  
	  p1.login(Username, Password);
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Shashikant \"))"));
	  
	  p1.Message_send();
  }
  
  @Test
  public void check_Notification()
  {
	  String UserName1="shashikant.kokitakar@facillima.com";
		
		String Password1="Test@1234";
	  p1= new POM_Admin_Message(driver);
	  
	  p1.login(UserName1, Password1);
	  
	  p1.notification();
  }
}
