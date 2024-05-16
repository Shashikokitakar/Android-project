package com.villeos.Backlog_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Dashboard 
{
	protected static AndroidDriver driver;
	
	public POM_Dashboard()
	{
		
	}
	
	public POM_Dashboard(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='House Preference']")
	private WebElement House_prefrence;
	
	@FindBy(xpath="//android.widget.TextView[@text='Help Desk & Feedback']")
	private WebElement Help;
	
	@FindBy(xpath="//android.widget.TextView[@text='About']")
	private WebElement clickabout;
	
	@FindBy(xpath="//android.widget.TextView[@text='Log Out']")
	private WebElement Logout;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement profile;
	
	@FindBy(xpath="//android.widget.TextView[@text='󰅖']")
	private WebElement close;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement Notification;
	
	@FindBy(xpath="//android.widget.TextView[@text='Notifications']")
	private WebElement Notification2;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement back;
	
	@FindBy(xpath="//android.widget.TextView[@text='ESCROW TIMELINE']")
	private WebElement Escrow;
	
	@FindBy(xpath="//android.widget.TextView[@text='Property :']")
	private WebElement property;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 1 Pre-Approval for the Home Loan']")
	private WebElement stage1;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 2 Listing and Home Showings']")
	private WebElement stage2;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 3 Offer']")
	private WebElement stage3;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 4  Under Contract']")
	private WebElement stage4;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stage 5 Close of Escrow']")
	private WebElement stage5;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement Message;
	
	@FindBy(xpath="//android.widget.TextView[@text='Messages']")
	private WebElement Message2;
	
	@FindBy(xpath="//android.widget.TextView[@text='Agent']")
	private WebElement Agent;
	
	@FindBy(xpath="//android.widget.TextView[@text='Agent Details']")
	private WebElement Agent_profile;
	
	@FindBy(xpath="//android.widget.TextView[@text='House Search']")
	private WebElement House_Search;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement Menu;
	
	public void Login(String Mail, String pass)
	{
		email.sendKeys(Mail);

		password.sendKeys(pass);
	
		logbtn.click();
	}
	
	public void Click_close()
	{
		Menu.click();
		
		boolean b1=House_prefrence.isDisplayed();
		
		if(b1)
		{
			boolean b2=profile.isDisplayed();
			
			if(b2)
			{
				boolean b3=Help.isDisplayed();
				
				if(b3)
				{
					boolean b4=clickabout.isDisplayed();
					
					if(b4)
					{
						boolean b5=Logout.isDisplayed();
						{
							System.out.println("all the options in Menu is displayed");
						}
					}
					
				}
			}
		}
		close.click();
	}
	
	public void notification()
	{
		boolean b1=Notification.isDisplayed();
		
		if(b1)
		{
			Notification.click();
		}
		
		String s1=Notification2.getText();
		
		String s2="Notifications";
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Notification functionality working fine");
			
			back.click();
		}
	}
	
	public void Escrow_Timeline()
	{
		boolean b1=Escrow.isDisplayed();
		
		if(b1)
		{
			Escrow.click();
			
			boolean b2=property.isDisplayed();
			
			if(b2)
			{
				System.out.println("Escrow timeline is displayed on Dashboard");
			}
		}
	}

	public void stages()
	{
		boolean b1=stage1.isDisplayed();
		
		if(b1)
		{
			boolean b2=stage2.isDisplayed();
			
			if(b2)
			{
				boolean b3=stage3.isDisplayed();
				
				if(b3)
				{
					boolean b4=stage4.isDisplayed();
					
					if(b4)
					{
						boolean b5=stage5.isDisplayed();
						
						if(b5)
						{
							System.out.println("All the Stages are displayed on Dashboard");
						}
					}
				}
			}
		}
	}
	
	public void message()
	{
		boolean b1=Message.isDisplayed();
		
		if(b1)
		{
			
	
				System.out.println("Message section is displayed on Dashboard");
				
				
			}
		
	}
	
	public void Agent()
	{
		boolean b1=Agent.isDisplayed();
		
		Agent.click();		
		if(b1)
		{
			boolean b2=Agent_profile.isDisplayed();
			
			if(b2)
			{
				back.click();
				
				System.out.println("Agent Profile is displayed on Dashboard");
			}
		}
	}
	
	public void House_search()
	{
		boolean b2=House_Search.isDisplayed();
		
		if(b2)
		{	
			System.out.println("House Search is displayed on Dashboard");
		}
		
	}

}
