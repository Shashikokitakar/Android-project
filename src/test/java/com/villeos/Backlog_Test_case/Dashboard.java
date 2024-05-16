package com.villeos.Backlog_Test_case;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Dashboard;

public class Dashboard extends Base_class
{
	protected POM_Dashboard p1;
	
	String mail="Shashikant.kokitakar@facillima.com";
	
	String password="Test@1234";
	
  @Test
  public void Dashboard_check()
  {
	  p1= new POM_Dashboard(driver);
	  //Login to the application with the valid credentials.
	  p1.Login(mail,password);
	  
	  
	  //check that login is successfull.
	  boolean b1=driver.findElement(By.xpath("//android.widget.TextView[@text='Dashboard']")).isDisplayed();
	  
	  if(b1)
	  {
		  System.out.println("Log In successfully");
	  }
	  
	  //checking that alll the elements on page are visible
	  
	  //checking for menu option.
	  
	  p1.Click_close();	
	  
	  //checking for Notification
	  
	  p1.notification();
	  
	//checking for Stages
	  
	  p1.stages();
	  
	//checking for escrow Timeline
	  
	  p1.Escrow_Timeline();
	  
	//checking for Message
	  
	  p1.message();
	  
	//checking for Agent profile
	  p1.Agent();
	  
	//checking for House_search
	  p1.House_search();
	  
  }
}
