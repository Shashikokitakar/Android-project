package com.villeos.Backlog_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Delete_account 
{
	protected AndroidDriver driver;
	public POM_Delete_account()
	{
		
	}
	
	public POM_Delete_account(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement profile;
	
	@FindBy(xpath="//android.widget.TextView[@text='DELETE MY ACCOUNT']")
	private WebElement Delete;
	
	@FindBy(xpath="//android.widget.EditText[@text='Verification code']")
	private WebElement Verify_code;
	
	@FindBy(className="android.widget.Button")
	private WebElement Verify_code_button;
	
	@FindBy(xpath="//android.widget.TextView[@text='Your account has been deleted']")
	private WebElement alert_check;
	
	public void Login(String Mail, String Pass)
	{
		email.sendKeys(Mail);
		
		password.sendKeys(Pass);

		logbtn.click();
	}
	
	public void clickprofile()
	{
		Menu.click();
		
		profile.click();
		
		Delete.click();
	}
	
	public void Verify_code(String A)
	{
		Verify_code.sendKeys(A);
	}
	
	public void Delete_Button()
	{
		Delete.click();
	}

	public void click_Verify_button()
	{
		Verify_code_button.click();
	}
	
	public void Check_alert()
	{
		boolean b1=alert_check.isDisplayed();
		
		if(b1)
		{
			System.out.println("Account successfully deleted");
			
			driver.findElement(By.className("android.widget.Button")).click();
		}
	}
	
}
