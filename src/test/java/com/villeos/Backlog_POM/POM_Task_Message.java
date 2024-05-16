package com.villeos.Backlog_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Task_Message 
{
	AndroidDriver driver;
	POM_Task_Message()
	{
		
	}
	
	public POM_Task_Message(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement Message;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 1 Pre-Approval for the Home Loan']")
	private WebElement Stage_1;
	
	@FindBy(xpath="//android.widget.EditText[@text='Type your message here...']")
	private WebElement Type_Message;
	
	@FindBy(xpath="//android.widget.TextView[@text='Send']")
	private WebElement Send_button;
	
	@FindBy(xpath="//android.widget.ScrollView[@index='1']")
	private WebElement scroll;
	
	@FindBy(xpath="//android.widget.EditText[@text='Search this chat']")
	private WebElement search;
	
	@FindBy(xpath="//android.widget.TextView[@text='Task_Message_buyer']")
	private WebElement Search_text;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement Notification;
	
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Shashikant has sent you a message about')]")
	private WebElement message_notification;
	
	@FindBy(xpath="//android.widget.TextView[@text='Clear All']")
	private WebElement Clear_All;

	@FindBy(xpath="//android.widget.TextView[@index='0']")
	private WebElement back;
	
	public void login(String Mail, String pass)
	{
		email.sendKeys(Mail);
	
		password.sendKeys(pass);

		logbtn.click();
	}
	
	String message="Task_Message_buyer";
	
	public void send_Task_message() throws InterruptedException
	{
		Thread.sleep(5000);
		Stage_1.click();
	
		Message.click();
		
		Type_Message.sendKeys(message);
		
		Send_button.click();
		
		search.sendKeys(message);
		
		String s1=Search_text.getText();
		
		if(s1.contains(message))
		{
			System.out.println("Search text will be appear in chat");
		}
	}
	
	public void notification()
	{

		Notification.click();
		
		message_notification.click();
		
		search.sendKeys(message);
		
		String A=Search_text.getText();
		
		if(A.contains(message))
		{
			System.out.println("Message Recieved from Agent..");
		}
		back.click();
		
		Notification.click();
		
		Clear_All.click();
	}


}
