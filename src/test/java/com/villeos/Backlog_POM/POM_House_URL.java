package com.villeos.Backlog_POM;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.android.Activity;

public class POM_House_URL
{
	
	AndroidDriver driver;
	
	POM_House_URL()
	{
		
	}
	
	public POM_House_URL(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='House Search']")
	private WebElement House_Url;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='android:id/message']")
	private WebElement alert;
	
	@FindBy(className="android.widget.Button")
	private WebElement Ok;

	public void Login(String Mail, String pass) throws InterruptedException
	{
		
		email.sendKeys(Mail);
	
		password.sendKeys(pass);

		logbtn.click();
		
		House_Url.click();
		
		Thread.sleep(3000);
		
		String s1=alert.getText();
		
		String s2="Please contact your agent to update your House Search link.";
		
		if(s1.contains(s2))
		{
			System.out.println("House Url not set");
		}
		
		else
		{
			System.out.println("House Url is set ");
		}
		
		Ok.click();
		
	}
}
