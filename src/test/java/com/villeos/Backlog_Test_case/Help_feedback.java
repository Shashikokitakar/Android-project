package com.villeos.Backlog_Test_case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Agent_Message;
import com.villeos.Backlog_POM.POM_Help_Feedback;

public class Help_feedback extends Base_class
{
	String s1="Shashikant.Kokitakar@facillima.com";
	
	String s2="Test@1234";
	
	
	
	protected POM_Help_Feedback p1;
  @Test
  public void Help_feedback_check()
  {
	  p1=new POM_Help_Feedback(driver);
	  
	  p1.entermail(s1, s2);
	  
	  p1.clickMenu();
	  
	  p1.clickHelp();
	  
	  p1.Send_Message();
	  
  }
  
  @Test
  public void check_notification()
  {
	  String UserName1="Help@facillima.com";
		
		String Password1="Test@1234";
		p1=new POM_Help_Feedback(driver);
	  
	  p1.entermail(UserName1, Password1);
	  
	  p1.notification();
	  	  
  }
}
