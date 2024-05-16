package com.villeos.Backlog_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Admin_Message 
{
	AndroidDriver driver;
	public POM_Admin_Message()
	{
		
	}
	
	public POM_Admin_Message(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='Shashikant ']")
	private WebElement user;
	
	@FindBy(xpath="//android.widget.EditText[@text='Type your message here...']")
	private WebElement Type_Message;
	
	@FindBy(xpath="//android.widget.TextView[@text='Send']")
	private WebElement Send_button;
	
	@FindBy(xpath="//android.widget.ScrollView[@index='1']")
	private WebElement scroll;
	
	@FindBy(xpath="//android.widget.EditText[@text='Search this chat']")
	private WebElement search;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement Notification;
	
	@FindBy(xpath="//android.widget.TextView[@index='0']")
	private WebElement back;
	
	@FindBy(xpath="//android.widget.TextView[@text='Admin has sent you a message on Help & Feedback.']")
	private WebElement message_notification;
	
	@FindBy(xpath="//android.widget.TextView[@text='Clear All']")
	private WebElement Clear_All;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 1 Pre-Approval for the Home Loan']")
	private WebElement Stage_1;
	
	@FindBy(xpath="//android.widget.TextView[@text='Admin_Message_1']")
	private WebElement Search_text;
	
	public void login(String Mail, String pass)
	{
		email.sendKeys(Mail);
	
		password.sendKeys(pass);

		logbtn.click();
	}
	String Message="Admin_Message_1";
	
	public void Message_send()
	{
		user.click();
		
		Type_Message.sendKeys(Message);
		
		Send_button.click();
		
		scroll.click();
		
		search.sendKeys(Message);
		
		String A=Search_text.getText();
		
		if(A.contains(Message))
		{
			System.out.println("Send from admin..");
		}
		
	}
	
	public void notification()
	{
		Notification.click();
		
		message_notification.click();
		
		search.sendKeys(Message);
		
		String A=Search_text.getText();
		
		if(A.contains(Message))
		{
			System.out.println("Message Recieved at user end..");
		}
		back.click();
		
		Notification.click();
		
		Clear_All.click();
	}
}
