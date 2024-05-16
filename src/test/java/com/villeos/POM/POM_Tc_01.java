package com.villeos.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Tc_01 
{
	protected static AndroidDriver driver;
	
	public POM_Tc_01()
	{	
	}
	
	public POM_Tc_01(AndroidDriver driver1)
	{
		this.driver=driver1;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@FindBy(xpath="//android.widget.TextView[@text='Need an account? Sign up for free']")
	private WebElement signup;
	
	@FindBy(className="android.widget.Button")
	private WebElement TryAgainbtn;
	
	public void clickSignUp()
	{
		signup.click();
	}
	
	public void clickAgainbtn()
	{
		TryAgainbtn.click();
	}
	
	
}
