package com.villeos.Backlog_Test_case;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Note;

public class Note extends Base_class
{
	POM_Note p1;
	
	String UserName="Shashikant.kokitakar@facillima.com";
	
	String Password="Test@1234";
	
  @Test
  public void Note_save() throws InterruptedException 
  {
	  p1=new POM_Note(driver);
	  
	  p1.login(UserName, Password);
	  
	  p1.Save_Note();
	  
  }
}
