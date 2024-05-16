package com.villeos.Backlog_Test_case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Seed_User;

public class Seed_user
{
	 POM_Seed_User p1;
	 
	 String username="Help@facillima.com";
	 
	 String password="Test@1234";
	 
	 String user="newUser260695@outlook.com";
	 
	 @Test
	 
	 public void user_seed() throws InterruptedException 
	 
	 {
		 //System.setProperty("webdriver.chrome.driver","C:\\Users\\My_Work\\Desktop\\Villeos_project\\villeos-1.56\\driver\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	 
	  driver.manage().window().maximize();
	  
	  p1= new POM_Seed_User(driver);
	  
	  driver.get("http://salesdemo.southeastasia.cloudapp.azure.com:144/Account/Login?ReturnUrl=%2F");
	  
	  Thread.sleep(5000);
	  
	  p1.Login(username, password);
	  
	  Thread.sleep(5000);
	  
	  p1.User_Seed(user);
	  
	  driver.quit();
  }
}
