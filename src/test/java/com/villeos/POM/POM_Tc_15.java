package com.villeos.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Tc_15
{
protected static AndroidDriver driver;
	
	
	public POM_Tc_15()
	{
		
	}
	
	public POM_Tc_15(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement user;
	
	@FindBy(xpath="//android.widget.TextView[@text='󰃰']")
	private WebElement timeline;
	
	@FindBy(className="android.widget.Button")
	private WebElement TryAgainbtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='SAVE']")
	private WebElement save;
	
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
	
	public void clickUser()
	{
		user.click();
	}
	
	public void clickAgainbtn()
	{
		TryAgainbtn.click();
	}
	
	public void clicktimeline()
	{
		timeline.click();
	}
	
	public void savebtn()
	{
		save.click();
	}

}
