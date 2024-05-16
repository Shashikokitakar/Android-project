package com.villeos.Backlog_Test_case;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Login extends Base_class
{
	protected POM_Login p1;
	
	@Test(priority=0)
	public void login_valid_Credential() throws InterruptedException
	{
		String username="Shashikant.kokitakar@facillima.com";
		
		String password="Test@1234";
		
		 p1=new POM_Login(driver);
		  
		  p1.entermail(username,password);
		  
	      
	     try
	      {
	    	  
	    	  boolean w2=driver.findElement(By.xpath("//android.widget.TextView[@text='Dashboard']")).isDisplayed();
	    	  if(w2)
	    	  {
	    		  p1.clickMenu();
	    		  
	    		  p1.clicklogout();
	    		  
	    		  System.out.println("Test Pass:Login with Valid Credentials");
	             
	    	  }
	    	  
	      }
	      
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	      }
		
	}
	
  @Test(dataProvider = "Logindata",priority=1)
  public void login_InValid_Credential(String username, String password) throws InterruptedException
  {
	  p1=new POM_Login(driver);
	  
	  p1.entermail(username,password);
	  
     try
      {
  
    	  boolean w2=driver.findElement(By.xpath("//android.widget.TextView[@text='Forgot Password?']")).isDisplayed();
    	  if(w2)
    	  {
    		  
    		  Thread.sleep(10000);
    		  System.out.println("Test Pass:Login not allowed with InValid Credentials"+username+"/"+password);
             
    	  }
    	  
      }
      
      catch(Exception e)
      {
    	  e.printStackTrace();
      }
	  
  }
  
  @DataProvider
  public Object[][] Logindata()
  {
   Object[][] dataset=new Object[5][2];
   dataset[0][0]="Shashikant.Kokitakarfacillima.com";
   dataset[0][1]="Test@1234";
   
   dataset[1][0]="abcd@gmail.com";
   dataset[1][1]="Test@1234";
   
   dataset[2][0]="Shashikant.Kokitakar@gmail.com";
   dataset[2][1]="Abcd@1234";
   
   dataset[3][0]="Shashikant.Kokitakar@com";
   dataset[3][1]="Test@1234";
   
   dataset[4][0]="Shashikant.Kokitakar@facillima.";
   dataset[4][1]="Test@1234";
   
   return dataset;
  }
}
