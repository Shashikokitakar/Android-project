package com.villeos.Backlog_Test_case;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Task_Assign;
import com.villeos.Backlog_POM.POM_Task_Verify;

public class Task_Verify extends Base_class
{
	POM_Task_Verify p1;

	String username="newuser03649791@gmail.com";

	String password="Test@1234";

	@Test
	public void Verify_Task() throws InterruptedException 
	{
		p1=new POM_Task_Verify(driver);
  
		p1.login(username, password);
  
		p1.stage_1();
  
		p1.stage_2();
		
	}
	@Test
	public void check_notification()
	  {
		  p1=new  POM_Task_Verify(driver);
		  
		  String username1="newUser260695@outlook.com";
		  
		  String password1="Test@1234";
		  
		  p1.login(username1, password1);
		  
		  p1.notification();
		  
	  }
}
