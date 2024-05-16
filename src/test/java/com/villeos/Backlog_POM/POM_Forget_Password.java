package com.villeos.Backlog_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Forget_Password 
{
	protected AndroidDriver driver;
	public POM_Forget_Password ()
	{
		
	}
	
	public POM_Forget_Password(AndroidDriver driver1)
	{
		this.driver=driver1;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Forgot Password?']")
	private WebElement Forgot_pass;
	
	@FindBy(className="android.widget.Button")
	private WebElement TryAgainbtn;
	
	@FindBy(xpath="//android.widget.EditText[@text='E-mail']")
	private WebElement E_mail;
	
	@FindBy(xpath="//android.widget.EditText[@text='Verification code']")
	private WebElement code_verify;
	
	@FindBy(xpath="//android.widget.EditText[@text='New Password']")
	private WebElement New;
	
	@FindBy(xpath="//android.widget.EditText[@text='Confirm Password']")
	private WebElement old;
	
	@FindBy(className="android.widget.Button")
	private WebElement Button;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='android:id/message']")
	private WebElement Alert;
	public void click_forgot_link()
	{
		Forgot_pass.click();
	}
	
	public void clickAgainbtn()
	{
		TryAgainbtn.click();
	}
	
	public void send_mail(String mail)
	{
		E_mail.sendKeys(mail);
	}
	
	public void click_Button()
	{
		Button.click();
	}
	
	public void Code_Verrify(String a)
	{
		code_verify.sendKeys(a);
		
		Button.click();
	}
	
	public void newpassword()
	{
		New.sendKeys("Test@1234");

		old.sendKeys("Test@1234");
		
	}

	public void alert()
	{
		boolean b1=Alert.isDisplayed();
		
		if(b1)
		{
			System.out.println("Password changed successfully.");
		}
	}

}
