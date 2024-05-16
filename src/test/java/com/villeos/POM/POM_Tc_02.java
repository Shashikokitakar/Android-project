package com.villeos.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Tc_02
{
protected static AndroidDriver driver;
	
	public POM_Tc_02()
	{	
	}
	
	public POM_Tc_02(AndroidDriver driver1)
	{
		this.driver=driver1;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(className="android.widget.Button")
	private WebElement TryAgainbtn;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='tOsUrlText']")
	private WebElement Terms; 
	
	public void clickAgainbtn()
	{
		TryAgainbtn.click();
	}
	
	public void click_Terms()
	{
		Terms.click();
	}

}
