package com.villeos.Backlog_Test_case;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Agent_Message;

public class Agent_Message extends Base_class
{
POM_Agent_Message p1;
	
	String UserName="Shashikokitakar95v2@gmail.com";
	
	String Password="Test@1234";

	String Message="Agent_Message_1";
	
	@Test
  public void Send_Message() throws InterruptedException
  {
	  
	  p1= new POM_Agent_Message(driver);
	  
	  p1.login(UserName, Password);
	  
	  p1.Message_send();
  }
  @Test
  public void check_notification()
  {
	  String UserName1="shashikant.kokitakar@facillima.com";
		
		String Password1="Test@1234";
	  p1= new POM_Agent_Message(driver);
	  
	  p1.login(UserName1, Password1);
	  
	  p1.notification();
	  
	  
	  
  }
}
