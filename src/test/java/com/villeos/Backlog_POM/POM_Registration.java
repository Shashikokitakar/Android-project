package com.villeos.Backlog_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Registration 
{
	protected AndroidDriver driver;
	public POM_Registration()
	{
		
	}
	
	public POM_Registration(AndroidDriver driver1)
	{
		this.driver=driver1;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Need an account? Sign up for free']")
	private WebElement signup;
	
	@FindBy(className="android.widget.Button")
	private WebElement Sign_up_button;
	
	@FindBy(className="android.widget.Button")
	private WebElement TryAgainbtn;
	
	@FindBy(xpath="//android.widget.EditText[@text='Confirm Password']")
	private WebElement confirm_pass;
	
	@FindBy(xpath="//android.widget.EditText[@text='Password']")
	private WebElement pass;
	
	@FindBy(xpath="//android.widget.EditText[@text='E-mail']")
	private WebElement Email;
	
	@FindBy(xpath="//android.widget.EditText[@text='First Name']")
	private WebElement FName;
	
	@FindBy(xpath="//android.widget.EditText[@text='Last Name']")
	private WebElement L_Name;
	
	@FindBy(xpath="//android.widget.EditText[@text='Verification code']")
	private WebElement Verify_code;
	
	@FindBy(xpath="//android.widget.TextView[@text='House Preference']")
	private WebElement House;
	
	public void clickSignUp()
	{
		signup.click();
	}
	
	public void clickAgainbtn()
	{
		TryAgainbtn.click();
	}
	
	public void click_signUpBtn()
	{
		Sign_up_button.click();
	}
	
	public void send_confirm_pass(String pass)
	{
		confirm_pass.sendKeys(pass);
	}
	
	public void send_pass(String password)
	{
		pass.sendKeys(password);
	}
	
	public void send_mail(String mail)
	{
		Email.sendKeys(mail);
	}
	
	public void send_FName(String name)
	{
		//F_Name.click();
		FName.sendKeys(name);
	}
	
	public void send_LName(String name)
	{
		L_Name.sendKeys(name);
	}
	
	public void Verify_code(String A)
	{
		Verify_code.sendKeys(A);
	}
	
	public void check()
	{
		boolean b1=House.isDisplayed();
		
		if(b1)
		{
			System.out.println("Registration completed");
		}
	}


}
