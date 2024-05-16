package com.villeos.Backlog_Test_case;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Escrow_Timeline;

import io.appium.java_client.AppiumBy;

public class Escrow_Timeline extends Base_class
{
	POM_Escrow_Timeline p1;
	
	String username="shashikokitakar95v2@gmail.com";

	String password="Test@1234";
	
  @Test
  public void Edit_Timeline() 
  {
	  p1=new POM_Escrow_Timeline(driver);
	  
	  p1.Login(username, password);
	  
	  p1.edit_Escrow();
	  
	
  }
}
