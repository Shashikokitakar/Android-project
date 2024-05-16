package com.villeos.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Tc_10
{
	protected static AndroidDriver driver;
	
	
	public POM_Tc_10()
	{
		
	}
	
	public POM_Tc_10(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='House Preference']")
	private WebElement house_prefrence;
	
	@FindBy(className="android.widget.Button")
	private WebElement TryAgainbtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement backbtn;
	
	@FindBy(xpath="android.widget.Button[@index='0')]")
	private WebElement Save_button;
	
	@FindBy(xpath="android.widget.Button[@index='0')]")
	private WebElement cancel_button;
	
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
	
	public void clickMenu()
	{
		Menu.click();
	}
	
	public void house_prefrence()
	{
		house_prefrence.click();
	}
	
	public void clickAgainbtn()
	{
		TryAgainbtn.click();
	}
	
	public void clickBackbtn()
	{
		backbtn.click();
	}
	
	public void Save_button()
	{
		Save_button.click();
	}
	
	public void Cancel_button()
	{
		cancel_button.click();
	}
	

}
