package com.villeos.Backlog_Test_case;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Buyer_Message;

public class Buyer_Message extends Base_class
{
	POM_Buyer_Message p1;
	
	String UserName="Shashikant.kokitakar@facillima.com";
	
	String Password="Test@1234";
	
	
	
	@Test
  public void Send_Message()
  {
	  
	  p1= new POM_Buyer_Message(driver);
	  
	  p1.login(UserName, Password);
	  
	  p1.Message_send();
  }
  @Test
  public void check_notification()
  {
	  String UserName1="shashikokitakar95v2@gmail.com";
		
		String Password1="Test@1234";
	  p1= new POM_Buyer_Message(driver);
	  
	  p1.login(UserName1, Password1);
	  
	  p1.notification();
	  
	  
	  
  }
}
