package com.villeos.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Tc_09 
{
	protected static AndroidDriver driver;
	
	public POM_Tc_09()
	{
		
	}
	
	public POM_Tc_09(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement profile;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement backbtn;
	
	@FindBy(className="android.widget.Button")
	private WebElement TryAgainbtn;
	
	@FindBy(xpath="//android.widget.Button[@index='0']")
	private WebElement Pencil;
	
	@FindBy(className="android.widget.Button")
	private WebElement save_button;
	
	@FindBy(xpath="//android.widget.Button[@index='0']")
	private WebElement delete_button;
	
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
	
	public void clickprofile()
	{
		profile.click();
	}
	
	public void clickAgainbtn()
	{
		TryAgainbtn.click();
	}
	
	public void clickBackbtn()
	{
		backbtn.click();
	}
	
	public void click_pencil()
	{
		Pencil.click();
	}
	
	public void click_Save()
	{
		save_button.click();
	}
	
	public void click_delete_btn()
	{
		delete_button.click();
	}

}
