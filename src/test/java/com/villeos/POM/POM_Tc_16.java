package com.villeos.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Tc_16
{
protected static AndroidDriver driver;
	
	
	public POM_Tc_16()
	{
		
	}
	
	public POM_Tc_16(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 3 Offer']")
	private WebElement Stage_3;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement task;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement backbtn;
	
	@FindBy(className="android.widget.Button")
	private WebElement TryAgainbtn;
	
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
	
	public void click_stage_3()
	{
		Stage_3.click();
	}
	
	public void click_Task()
	{
		task.click();
	}
	
	public void clickBackbtn()
	{
		backbtn.click();
	}

	public void clickAgainbtn()
	{
		TryAgainbtn.click();
	}
}
