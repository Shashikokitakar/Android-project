package com.villeos.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Tc_06
{
	protected static AndroidDriver driver;
	public POM_Tc_06()
	{
		
	}
	
	public POM_Tc_06(AndroidDriver driver1)
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

}
