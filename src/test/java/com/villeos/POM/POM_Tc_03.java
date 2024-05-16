package com.villeos.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Tc_03 
{
protected static AndroidDriver driver;
	
	public POM_Tc_03()
	{	
	}
	
	public POM_Tc_03(AndroidDriver driver1)
	{
		this.driver=driver1;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(className="android.widget.Button")
	private WebElement TryAgainbtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='By logging in, you agree to our Terms of Service and Privacy Policy']")
	private WebElement Policy; 
	
	public void clickAgainbtn()
	{
		TryAgainbtn.click();
	}
	
	public void click_Policy()
	{
		Policy.click();
	}

}
