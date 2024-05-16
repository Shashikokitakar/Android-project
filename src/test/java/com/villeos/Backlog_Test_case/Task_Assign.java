package com.villeos.Backlog_Test_case;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Task_Assign;

public class Task_Assign extends Base_class
{
	 POM_Task_Assign p1;
	  
	  String username="newuser03649791@gmail.com";
	  String password="Test@1234";
 @Test
  public void assign_task() throws InterruptedException
  { 
	  p1=new  POM_Task_Assign(driver);
	  
	  p1.login(username, password);
	  
	  p1.stage_1();
	  
	  p1.stage_2();
  }
  
	  @Test
  public void check_notification() throws InterruptedException
  {
	  p1=new  POM_Task_Assign(driver);
	  
	  String username1="newUser260695@outlook.com";
	  
	  String password1="Test@1234";
	  
	  p1.login(username1, password1);
	  
	  p1.notification();
  }
	  
 
}
