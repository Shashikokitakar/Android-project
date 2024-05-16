package com.villeos.Backlog_POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Task_Verify 
{
	protected AndroidDriver driver;
	
	public  POM_Task_Verify()
	{
		
	}
	
	public  POM_Task_Verify(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='User user']")
	private WebElement User;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 1 Pre-Approval for the Home Loan']")
	private WebElement Stage_1;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 2 Listing and Home Showings']")
	private WebElement Stage_2;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 3 Offer']")
	private WebElement Stage_3;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 4  Under Contract']")
	private WebElement Stage_4;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 5 Close of Escrow']")
	private WebElement Stage_5;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement Notification;
	
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Your completed task has been accepted.')]")
	private WebElement Task_notification;
	
	@FindBy(xpath="//android.widget.TextView[@text='Clear All']")
	private WebElement Clear_All;
	
	public void login(String Mail, String pass)
	{
		email.sendKeys(Mail);
	
		password.sendKeys(pass);

		logbtn.click();
		
		User.click();
	}
	
	public void stage_1() throws InterruptedException
	{
		Stage_1.click();
		
		Thread.sleep(3000);
		
		List<WebElement>we=driver.findElements(By.xpath("//android.widget.CheckBox[@index='3']"));
		
		for(WebElement w1:we)
		{
			w1.click();
		}
		
		Stage_1.click();
	}
	
	public void stage_2() throws InterruptedException
	{
		Stage_2.click();
		
		Thread.sleep(3000);
		
		List<WebElement>we=driver.findElements(By.xpath("//android.widget.CheckBox[@index='3']"));
		
		for(WebElement w1:we)
		{
			w1.click();
		}
		
		Stage_2.click();
	}
	
	public void notification()
	{
		Notification.click();
		
		boolean b1=Task_notification.isDisplayed();
		
		if(b1)
		{
			System.out.println("Task Assign notification is visible at Buyer end. ");
		}
		
		Clear_All.click();
	}

}

