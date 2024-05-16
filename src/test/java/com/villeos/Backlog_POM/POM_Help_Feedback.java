package com.villeos.Backlog_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Help_Feedback 
{
	
protected static AndroidDriver driver;
	
	public POM_Help_Feedback()
	{
		
	}
	
	public POM_Help_Feedback(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='Help Desk & Feedback']")
	private WebElement Help;
	
	@FindBy(xpath="//android.widget.EditText[@text='Type your message here...']")
	private WebElement Type_Message;
	
	@FindBy(xpath="//android.widget.TextView[@text='Send']")
	private WebElement Send_button;
	
	@FindBy(xpath="//android.widget.ScrollView[@index='1']")
	private WebElement scroll;
	
	@FindBy(xpath="//android.widget.EditText[@text='Search this chat']")
	private WebElement search;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement back;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement Notification;
	
	@FindBy(xpath="//android.widget.TextView[@text='Buyer Shashikant has sent you a message.']")
	private WebElement message_notification;
	
	@FindBy(xpath="//android.widget.TextView[@text='Clear All']")
	private WebElement Clear_All;
	
	@FindBy(xpath="//android.widget.TextView[@text='Hello_Admin_1']")
	private WebElement Search_text;
	
	String Message="Hello_Admin_1";
	
	public void entermail(String Mail,String pass)
	{
		email.sendKeys(Mail);

		password.sendKeys(pass);
	
		logbtn.click();
	}
	
	public void clickMenu()
	{
		Menu.click();
	}
	
	public void clickHelp()
	{
		Help.click();
	}
	
	public void Send_Message()
	{
		Type_Message.click();
		
		Type_Message.sendKeys(Message);
	
		Send_button.click();
	
		scroll.click();

		search.sendKeys(Message);
		
		String s1=Search_text.getText();
		
		if(s1.contains(Message))
		{
			System.out.println("help message send to Admin");
		}
		
		back.click();
	}
	
	public void notification()
	{

		Notification.click();
		
		message_notification.click();
		
		search.sendKeys(Message);
		
		String A=Search_text.getText();
		
		if(A.contains(Message))
		{
			System.out.println("Message Recieved from User..");
		}
		back.click();
		
		Notification.click();
		
		Clear_All.click();
	}


}
