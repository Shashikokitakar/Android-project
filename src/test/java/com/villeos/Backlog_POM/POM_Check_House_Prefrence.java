package com.villeos.Backlog_POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Check_House_Prefrence
{
	protected AndroidDriver driver;
	public POM_Check_House_Prefrence()
	{
		
	}
	
	public POM_Check_House_Prefrence(AndroidDriver driver1)
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
	private WebElement User;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='homeIcon']")
	private WebElement prefrence;
	
	@FindBy(xpath="//android.widget.TextView[@index='3']")
	private WebElement range;
	
	@FindBy(xpath="//android.widget.TextView[@index='5']")
	private WebElement property;
	@FindBy(xpath="//android.widget.TextView[@index='7']")
	private WebElement state;
	@FindBy(xpath="//android.widget.TextView[@index='9']")
	private WebElement city;
	@FindBy(xpath="//android.widget.TextView[@index='11']")
	private WebElement zip;
	@FindBy(xpath="//android.widget.TextView[@index='13']")
	private WebElement beds;
	@FindBy(xpath="//android.widget.TextView[@index='15']")
	private WebElement baths;
	@FindBy(xpath="//android.widget.TextView[@index='17']")
	private WebElement space;
	@FindBy(xpath="//android.widget.TextView[@index='19']")
	private WebElement stories;
	@FindBy(xpath="//android.widget.TextView[@index='31']")
	private WebElement construction;
	@FindBy(xpath="//android.widget.TextView[@index='33']")
	private WebElement pool;
	@FindBy(xpath="//android.widget.TextView[@index='35']")
	private WebElement hookup;
	@FindBy(xpath="//android.widget.TextView[@index='37']")
	private WebElement rating;
	@FindBy(xpath="//android.widget.TextView[@index='39']")
	private WebElement hoa;
	
	String Range1="3";
	
	
	//@FindsBy(xpath="//android.widget.CheckBox[@index='3']")
	//private WebElement task;
	
	public void Login(String Mail, String Pass)
	{
		email.sendKeys(Mail);
		
		password.sendKeys(Pass);

		logbtn.click();
	}
	public void valid_task()
	{
		User.click();
		
		prefrence.click();
		
		String Property1="Single Family Home (Attached)";
		
		String State1="Alabama";
		
		String City1="Abbeville, Alabama";
		
		String Zip1="90001";
		
		String room1="1+";
		
		String construction1="Any";
		
		String pool1="Yes";
		String Hookup1="Yes";
		String rating1="9+";
		
		String HOA1="01";
		
		String Range=range.getText();
		
		System.out.println(Range);
		
		String Property=property.getText();
		
		System.out.println(Property);
		
		String State=state.getText();
		
		System.out.println(State);
		
		String City=city.getText();
		
		System.out.println(City);
		
		String Zip=zip.getText();
		
		System.out.println(Zip);
		
		String room=beds.getText();
		
		System.out.println(room);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"HOA\"))"));
		
		String Construction=construction.getText();
		
		System.out.println(Construction);
		
		String Pool=pool.getText();
		
		System.out.println(Pool);
		
		String Hookup=hookup.getText();
		
		System.out.println(Hookup);
		
		String Rating =rating.getText();
		
		System.out.println(Rating);
		
		String HOA=hoa.getText();
		
			if(Property1.contains(Property))
			{
				if(State1.contains(State))
				{
					if(City1.contains(City))
					{
						if(Zip1.contains(Zip))
						{
							if(room1.contains(room))
							{
								if(construction1.contains(Construction))
								{
									if(pool1.contains(Pool))
									{
										if(Hookup1.contains(Hookup))
										{
											if(rating1.contains(Rating))
											{
												if(HOA1.contains(HOA))
												{
													System.out.println("House Preference updated successfully");
												}
											}
										}
										
									}
								}
							}
						}
					}
				}
			}
		
		
		
	}
	

}
