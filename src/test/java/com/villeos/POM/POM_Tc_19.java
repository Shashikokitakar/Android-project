package com.villeos.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Tc_19
{
protected static AndroidDriver driver;
	
	public POM_Tc_19()
	{	
	}
	
	public POM_Tc_19(AndroidDriver driver1)
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
	
	@FindBy(className="android.widget.Button")
	private WebElement TryAgainbtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement Message_icon;
	
	@FindBy(xpath="//android.widget.TextView[@text='Send']")
	private WebElement send_button;
	
	@FindBy(xpath="//android.widget.TextView[@text='TestBuyer ']")
	private WebElement user;
	
	public void entermail(String Mail)
	{
		email.sendKeys(Mail);
	}
	
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}

	public void LoginBtn()
	{
		logbtn.click();
	}
	
	public void clickAgainbtn()
	{
		TryAgainbtn.click();
	}
	
	public void click_Message()
	{
	Message_icon.click();
	}
	
	public void click_Send()
	{
		send_button.click();
	}
	
	public void click_user()
	{
		user.click();
	}

}
