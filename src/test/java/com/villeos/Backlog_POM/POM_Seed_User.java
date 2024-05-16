package com.villeos.Backlog_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Seed_User 
{
	WebDriver driver;
	POM_Seed_User()
	{
		
	}
	
	public POM_Seed_User(WebDriver driver1)
	{
		this.driver=driver1;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement userName;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-default']")
	private WebElement log_button;
	
	@FindBy(xpath="//input[@class='form-control input-sm']")
	private WebElement search;
	
	@FindBy(xpath="//*[@id='UserTable']/tbody/tr[1]/td[7]/div/div[1]/button")
	private WebElement Edit;
	
	@FindBy(id="roleName")
	private WebElement role;
	
	@FindBy(id="agnetId")
	private WebElement Agent;
	
	@FindBy(xpath="//*[@id='addEditUser']/div/div/div[10]/button[2]")
	private WebElement Save;
	
	@FindBy(xpath="//*[@id='logout']/button")
	private WebElement Logout;
	
	public void Login(String username, String Password)
	{
		userName.sendKeys(username);
		
		password.sendKeys(Password);
		
		log_button.click();
	}
	
	public void User_Seed(String new_user)
	{
		search.sendKeys(new_user);
		
		Edit.click();
		
		 Select sc;
		  
		  sc= new Select(role);
		  
		  sc.selectByValue("Buyer");
		  
		  sc=new Select(Agent);
		  
		  sc.selectByVisibleText("TestAgent ");
		  
		  Save.click();
		  
		  Logout.click();
	}
}
