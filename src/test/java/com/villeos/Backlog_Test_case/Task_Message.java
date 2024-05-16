package com.villeos.Backlog_Test_case;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Buyer_Message;
import com.villeos.Backlog_POM.POM_Task_Message;

public class Task_Message extends Base_class
{
	POM_Task_Message p1;
	
	String UserName="Shashikant.kokitakar@facillima.com";
	
	String Password="Test@1234";
	
  @Test(priority=0)
  public void task_message() throws InterruptedException 
  {
	  p1=new POM_Task_Message(driver);
	  
	  p1.login(UserName, Password);
	  
	  p1.send_Task_message();
  }
  
  @Test(priority=1)
  public void check_notification()
  {
	  String UserName1="shashikokitakar95v2@gmail.com";
		
		String Password1="Test@1234";
	  p1= new POM_Task_Message(driver);
	  
	  p1.login(UserName1, Password1);
	  
	  p1.notification();
	  
  }
}
