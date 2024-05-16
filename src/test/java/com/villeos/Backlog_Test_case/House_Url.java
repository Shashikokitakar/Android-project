package com.villeos.Backlog_Test_case;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_House_URL;

public class House_Url extends Base_class
{
	POM_House_URL p1;
	
	String username="buyer8559@gmail.com";
	
	String password="Test@1234";
	
	String username1="Shashikant.kokitakar@facillima.com";
	
	String password2="Test@1234";
  @Test
  public void check_Url() throws InterruptedException
  {
	  p1=new POM_House_URL(driver);
	  
	  p1.Login(username, password);
	 
  }
  
}
