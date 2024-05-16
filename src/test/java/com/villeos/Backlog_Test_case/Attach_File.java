package com.villeos.Backlog_Test_case;

import java.io.IOException;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Attach_File;

public class Attach_File extends Base_class
{
	public POM_Attach_File p1;
	
	String UserName="newUser260695@outlook.com";
	
	String Password="Test@1234";
	
	@Test
	
	public void File_Attchment() throws InterruptedException, IOException 
	{
	  
	  p1=new POM_Attach_File(driver);
	  
	  p1.login(UserName, Password);
	  
	 p1.File_Image();
	  
	 p1.File_PDF();
	  
	 p1.invalid_File();
  }
}
