package com.villeos.Backlog_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Login 
{
	protected static AndroidDriver driver;
	
	public POM_Login()
	{
		
	}
	
	public POM_Login(AndroidDriver driver1)
	{
		this.driver=driver1;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(xpath="//android.widget.EditText[@text='E-mail']")
	private WebElement email;
	
	@FindBy(xpath="//android.widget.EditText[@text='Password']")
	private WebElement password;
	
	@FindBy(className="android.widget.Button")
	private WebElement logbtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement Menu;
	
	@FindBy(xpath="//android.widget.TextView[@text='Log Out']")
	private WebElement Logout;
	
	public void entermail(String Mail, String pass)
	{
		email.sendKeys(Mail);
		
		password.sendKeys(pass);
	
		logbtn.click();
	}
	
	public void clickMenu()
	{
		Menu.click();
	}
	
	public void clicklogout()
	{
		Logout.click();
	}

}
