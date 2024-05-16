package com.villeos.Backlog_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_About_Us
{
	protected AndroidDriver driver;
	public POM_About_Us()
	{
		
	}
	
	public POM_About_Us(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='About']")
	private WebElement clickabout;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement backbtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='Log Out']")
	private WebElement Logout;
	
	public void Login(String Mail, String pass)
	{
		
		email.sendKeys(Mail);
	
		password.sendKeys(pass);

		logbtn.click();
	
	}
	
	public void About_us() throws InterruptedException
	{
		Menu.click();
		
		clickabout.click();
		
		Thread.sleep(3000);
		
		boolean b1=clickabout.isDisplayed();
		
		if(b1)
		{
			System.out.println("About page is displayed correctly");
		}
		
		backbtn.click();
		
		Menu.click();
		
		Logout.click();
			
	}

}
