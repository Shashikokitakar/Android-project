package com.villeos.Backlog_Test_case;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Check_House_Prefrence;
import com.villeos.Backlog_POM.POM_House_Prefrence;

import io.appium.java_client.AppiumBy;

public class House_Prefrence extends Base_class
{
	protected POM_House_Prefrence p1;
	
	protected POM_Check_House_Prefrence p2;
	
	String mail="Shashikant.kokitakar@facillima.com";
	
	String password="Test@1234";
	
 @Test
  public void Check_house_Prefrence() throws InterruptedException 
  {
	  p1=new POM_House_Prefrence(driver);
	  
	  p1.Login(mail, password);
	  
	  p1.clickMenu();
	  
	  p1.Purchase_Time();
	  
	  p1.Purchase_Range();
	  
	  p1.State();
	  
	  p1.City2();
	  
	  p1.Code();
	  
	  Thread.sleep(5000);
	  
	  p1.prefrence();
	  
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SAVE\"))"));
	  
	  p1.Save();
	  
  }
 @Test
  public void check_house_prefrence()
  {
	  String mail="shashikokitakar95v2@gmail.com";
	  
	  String password="Test@1234";
	  
	  p2=new POM_Check_House_Prefrence(driver);
	  
	  p2.Login(mail, password);
	  
	  p2.valid_task();
	  
	  
  }
}
