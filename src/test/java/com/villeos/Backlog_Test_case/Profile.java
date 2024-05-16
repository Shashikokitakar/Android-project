package com.villeos.Backlog_Test_case;

import java.io.IOException;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Profile;

public class Profile extends Base_class
{
	String Email="newUser260695@outlook.com";
	
	String Password="Test@1234";
	
	String zip="90001";
	
	String City="City";
	
	String  street="Street";
	
	String State="State";
	
	protected POM_Profile p1;
 @Test
  public void Check_Profile() 
  {
	  
	  p1=new POM_Profile(driver);
	  
	  p1.Login(Email, Password);
	  
	  p1.clickMenu();
	  
	  p1.clickprofile();
	  
	 // p1.Empty_Profile();
	  
	  p1.Edit_Profile(zip,street,City,State);
	  
	  p1.clear_text();
	  
  }
 
 
 @Test
  public void Change_profile() throws IOException, InterruptedException
  {
	  p1=new POM_Profile(driver);
	  
	  p1.Login(Email, Password);
	  
	  p1.change_profile();
  }
}
