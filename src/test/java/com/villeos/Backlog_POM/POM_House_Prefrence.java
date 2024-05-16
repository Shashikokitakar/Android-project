package com.villeos.Backlog_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_House_Prefrence 
{
protected static AndroidDriver driver;
	
	public POM_House_Prefrence()
	{
		
	}
	
	public POM_House_Prefrence(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='House Preference']")
	private WebElement House_prefrence;
	
	@FindBy(xpath="//android.widget.TextView[@text='Over 12 months']")
	private WebElement Target_Purchase;
	
	@FindBy(xpath="//android.widget.EditText[@text='3']")
	private WebElement Min_range;
	
	@FindBy(xpath="//android.widget.EditText[@text='6']")
	private WebElement Max_Range;
	
	@FindBy(xpath="//android.widget.TextView[@text='Single Family Home (Attached)']")
	private WebElement Property_Type;
	
	@FindBy(xpath="//android.widget.TextView[@text='Alabama']")
	private WebElement State;
	
	@FindBy(xpath="//android.widget.TextView[@text='Abbeville, Alabama']")
	private WebElement City;
	
	@FindBy(xpath="//android.widget.TextView[@text='90001']")
	private WebElement Zip_code;
	
	@FindBy(xpath="//android.widget.TextView[@text='Select options']")
	private WebElement options;
	
	@FindBy(xpath="//android.widget.TextView[@text='SAVE']")
	private WebElement Save;
	
	@FindBy(xpath="//android.widget.TextView[@text='1+']")
	private WebElement Beds;
	
	@FindBy(xpath="//android.widget.TextView[@text='Any']")
	private WebElement construction;
	
	@FindBy(xpath="//android.widget.TextView[@text='Yes']")
	private WebElement Hookup;
	
	@FindBy(xpath="//android.widget.TextView[@text='Yes']")
	private WebElement pool;
	
	@FindBy(xpath="//android.widget.TextView[@text='9+']")
	private WebElement Rating;
	
	@FindBy(xpath="//android.widget.EditText[@text='01']")
	private WebElement HOA;
	
	public void Login(String Mail, String Pass)
	{
		email.sendKeys(Mail);
		
		password.sendKeys(Pass);

		logbtn.click();
	}
	
	public void clickMenu()
	{
		Menu.click();
	}
	
	Select sc;
	
	public void Purchase_Time() throws InterruptedException
	{
		House_prefrence.click();
		
		Thread.sleep(3000);
		
		Target_Purchase.click();
		
		Target_Purchase.click();
		
	}
	
	public void Purchase_Range()
	{
		Min_range.click();
		Min_range.sendKeys("3");
		 driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).click();
		Max_Range.click();
		Max_Range.sendKeys("6");
		
	}
	
	public void Save()
	{
		Save.click();
	}
	
	public void Property_Type() throws InterruptedException
	{
		Thread.sleep(3000);
		
		Property_Type.click();
		
		Thread.sleep(3000);
		
		options.click();
		
		Property_Type.click();
	}
	
	public void State()
	{
		State.click();
		
		State.click();
	}
	
	public void City2()
	{
		City.click();
		
		options.click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Abbeville, Alabama\"))"));
		
		City.click();
		
		
	}
	
	/*public void City()
	{
		City.click();
		
		City.click();
		
		options.click();
		
	}*/

	public void Code()
	{
		Zip_code.click();
		
		options.click();
		
		Zip_code.click();
		
	}
	
	public void prefrence() throws InterruptedException
	{
		Beds.click();
		
		Beds.click();

		
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"New Construction\"))"));
		construction.click();
		
		construction.click();
		
		pool.click();
		
		pool.click();
		
		Hookup.click();
		
		Hookup.click();
		
		Rating.click();
		
		Rating.click();
		
		HOA.sendKeys("01");
		
	}
}
