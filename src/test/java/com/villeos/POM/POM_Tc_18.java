package com.villeos.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Tc_18 
{
protected static AndroidDriver driver;
	
	
	public POM_Tc_18()
	{
		
	}
	
	public POM_Tc_18(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 1 Pre-Approval for the Home Loan']")
	private WebElement Stage_1;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement backbtn;
	
	@FindBy(className="android.widget.Button")
	private WebElement TryAgainbtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement Task_1;
	
	@FindBy(xpath="//android.widget.TextView[@text='TestBuyer ']")
	private WebElement Message_user;
	
	@FindBy(className="android.widget.Button")
	private WebElement Send_btn;
	
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
	
	public void click_stage_1()
	{
		Stage_1.click();
	}
	
	public void clickBackbtn()
	{
		backbtn.click();
	}

	public void clickAgainbtn()
	{
		TryAgainbtn.click();
	}
	
	public void click_task()
	{
		Task_1.click();
	}
	
	public void Message_user()
	{
		Message_user.click();
	}
	
	public void click_send_button()
	{
		Send_btn.click();
	}


}
