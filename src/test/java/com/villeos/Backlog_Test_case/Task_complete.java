package com.villeos.Backlog_Test_case;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Task_Assign;
import com.villeos.Backlog_POM.POM_Task_complete;

import io.appium.java_client.AppiumBy;

public class Task_complete extends Base_class
{
	protected POM_Task_complete p1;
	
	String s1="newUser260695@outlook.com";
	
	String s2="Test@1234";
  @Test(priority=0)
  public void complete_task() throws InterruptedException 
  {
	p1=new POM_Task_complete(driver);
	
	p1.login(s1, s2);

	
	p1.stage_1();
	
	p1.stage_2();
	
	p1.stage_3();

	  
  }
  
  @Test(priority=1)
  public void check_notification()
  {
	  p1=new  POM_Task_complete(driver);
	  
	  String username1="newuser03649791@gmail.com";
	  
	  String password1="Test@1234";
	  
	  p1.login(username1, password1);
	  
	  p1.notification();
  }
}
