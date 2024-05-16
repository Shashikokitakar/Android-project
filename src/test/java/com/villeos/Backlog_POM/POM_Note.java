package com.villeos.Backlog_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Note 
{
	protected AndroidDriver driver;
	
	public POM_Note()
	{
		
	}
	
	public POM_Note(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 1 Pre-Approval for the Home Loan']")
	private WebElement Stage_1;
	
	@FindBy(xpath="//android.widget.TextView[@text='󱞂']")
	private WebElement Note;
	
	@FindBy(xpath="//android.widget.TextView[@text='󱞂']")
	private WebElement Note1;
	
	@FindBy(xpath="//android.widget.TextView[@text='󱞂']")
	private WebElement close;
	
	@FindBy(className="android.widget.Button")
	private WebElement Save;
	
	@FindBy(xpath="//android.widget.EditText[@index='2']")
	private WebElement Text;
	
	public void login(String Mail, String pass)
	{
		email.sendKeys(Mail);
	
		password.sendKeys(pass);

		logbtn.click();
	}
	
	public void Save_Note() throws InterruptedException
	{
		String note="Note-1";
		
		Stage_1.click();
		
		Note.click();
		
		Text.sendKeys(note);
		
		Save.click();
		
		Thread.sleep(3000);
		
		Note1.click();
		
		String s1=Text.getText();
		
		if(s1.contentEquals(note))
		{
			System.out.println("Note save Successfully");
			
			close.click();
		}
		
		
	}
}
