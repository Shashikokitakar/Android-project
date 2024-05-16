package com.villeos.Backlog_Test_case;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_About_Us;

public class About_Us extends Base_class
{
	//In this test we try to validate the about us functionality by just checking that when we click on about us it will open a correct page.
	
	String username="Shashikant.kokitakar@facillima.com";
	
	String password="Test@1234";
	
	POM_About_Us p1;
  @Test
  public void About_us() throws InterruptedException
  {
	  
	  p1=new POM_About_Us(driver);
	  
	  
	  //Login to the Application.
	  p1.Login(username, password);
	  
	  //performing some operation on About us.
	  p1.About_us();
  }
}
