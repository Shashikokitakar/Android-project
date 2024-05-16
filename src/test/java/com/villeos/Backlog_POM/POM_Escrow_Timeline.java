package com.villeos.Backlog_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Escrow_Timeline 
{

AndroidDriver driver;
	
	public POM_Escrow_Timeline()
	{
		
	}
	
	public POM_Escrow_Timeline(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='󰃰']")
	private WebElement Escrow_icon;
	
	//Locating the elements of Escrow Timeline from Agent Login.
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='propertyTextInput']")
	private WebElement Property;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='closeOfEscrowDate']")
	private WebElement close_escrow;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='acceptanceDate']")
	private WebElement Acceptance;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='depositDueDate']")
	private WebElement Deposite;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='propertyConditionContigencyDueDate']")
	private WebElement condition;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='appraisalContigencyDueDate']")
	private WebElement Appraisal;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='inspectionDate']")
	private WebElement Inspection;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='loanContigencyDueDate']")
	private WebElement Loan ;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='contigencyRemovalDatesDateField']")
	private WebElement removal;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='walkThroughDateField']")
	private WebElement WalkTrough;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='RentBackDateAlwaysAtCoeDate']")
	private WebElement COE;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='rentBackEndsDate']")
	private WebElement Rent;
	
	@FindBy(xpath="//android.view.View[@index='20']")
	private WebElement Date;
	@FindBy(xpath="//android.widget.EditText[@resource-id='homeWarrantyTextInput']")
	private WebElement Warrenty;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='paidByTextInput']")
	private WebElement Paid;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='orderedByTextInput']")
	private WebElement order ;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='keyHandoffTextInput']")
	private WebElement handoff;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='OtherTextInputFirst']")
	private WebElement Other1;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='OtherTextInputSecond']")
	private WebElement Other2;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='OtherTextInputThird']")
	private WebElement Other3;
	
	@FindBy(className="android.widget.Button")
	private WebElement Save;
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	WebElement ok;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	WebElement Menu;
	
	@FindBy(xpath="//android.widget.TextView[@text='Log Out']")
	private WebElement Logout;
	
	//Locating the elements of Escrow Timeline from Buyer Login.
	
	@FindBy(xpath="//android.widget.TextView[@text='ESCROW TIMELINE']")
	private WebElement Escrow;
	
	@FindBy(xpath="//android.widget.TextView[@text='MyProperty']")
	private WebElement Property2;
	
	@FindBy(xpath="//android.widget.TextView[@index='3']")
	private WebElement close2;
	
	@FindBy(xpath="//android.widget.TextView[@index='5']")
	private WebElement Acceptance2;
	
	@FindBy(xpath="//android.widget.TextView[@index='7']")
	private WebElement deposite2;
	
	@FindBy(xpath="//android.widget.TextView[@index='11']")
	private WebElement Appraisal2;
	
	@FindBy(xpath="//android.widget.TextView[@index='13']")
	private WebElement Inspection2;
	
	@FindBy(xpath="//android.widget.TextView[@index='15']")
	private WebElement Loan2;
	
	@FindBy(xpath="//android.widget.TextView[@index='17']")
	private WebElement warrenty2 ;
	
	@FindBy(xpath="//android.widget.TextView[@index='19']")
	private WebElement Paid2;
	
	//creating a method for login functionality.
	public void Login(String Mail, String Pass)
	{
		email.sendKeys(Mail);
		
		password.sendKeys(Pass);

		logbtn.click();
	}
	
	//creating a method for Editing and validating the escrow timeline.
	public void edit_Escrow()
	{
		User.click();
		
	//Edit and fetch a text from property text field.	
		Escrow_icon.click();
		
		Property.sendKeys("MyProperty");
		
		String property=Property.getText();
		
		System.out.println(property);
		
	//Edit and fetch a text from close of escrow text field and editing calender date.
		
		close_escrow.click();
		
		Date.click();
		
		ok.click();
		
		String close=close_escrow.getText();
		
	//Edit and fetch a text from Acceptance text field and editing calender date.
		
		Acceptance.click();
		
		Date.click();
		
		ok.click();
		
		String acceptance=Acceptance.getText();
		
	//Edit and fetch a text from Deposite due text field and editing calender.
		
		Deposite.click();
		
		Date.click();
		
		ok.click();
		
		String deposite=Deposite.getText();
		
	//perform scrolling action to perform next operation
	    
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Home Warranty\"))"));
		
	//Edit and fetch a text from Inspection date text field and editing calender.
		
		Inspection.click();
		
		Date.click();
		
		ok.click();
		
		String inspection=Inspection.getText();
	
	//Edit and fetch a text from Loan contingency due text field and editing calender.
		
		Loan.click();
		
		Date.click();
		
		ok.click();
		
		String loan=Loan.getText();
		
	//Edit and fetch a text from home warrenty text field.
		
		Warrenty.sendKeys("MyWarrenty");
		
		String warrenty=Warrenty.getText();
		
	//Edit and fetch a text from Paid by text field.
		
		Paid.sendKeys("MyPaid");
		
		String paid=Paid.getText();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Key Handoff\"))"));
		
		//Edit and fetch a text from walk through date  text field and editing calender.
		
		WalkTrough.click();
		
		Date.click();
		
		ok.click();
		
		String walk=WalkTrough.getText();
		
	//Edit and fetch a text from rent back date text field and editing calender.
		
		COE.click();
		
		Date.click();
		
		ok.click();
		
		String coe=COE.getText();
		
	//Edit and fetch a text from rent back end text field and editing calender.
		
		Rent.click();
		
		Date.click();
		
		ok.click();
		
		String rent=Rent.getText();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Other\"))"));
		
	//Edit and fetch a text from other text field.
		
		Other2.sendKeys("MyProperty");
		
		String other2=Other3.getText();
		
		Other3.sendKeys("Myother2");
		
		String other3=Other3.getText();
		
	//Logout from the Agent side
		
		Save.click();
		
		Menu.click();
		
		Logout.click();
		
	//Login as a buyer
		
        driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).sendKeys("Shashikant.kokitakar@facillima.com");
		
		password.sendKeys("Test@1234");

		logbtn.click();
		
		Escrow.click();
		
	//Fetching  the text from Escrom Timeline fields 
		
		String user_property=Property2.getText();
		
		String user_warrenty=warrenty2.getText();
		
		String user_paid=Paid2.getText();
		
		String user_acceptance=Acceptance2.getText();
		
		String user_Deposite=deposite2.getText();
		
		String user_close=close2.getText();
		
		String user_inspection=Inspection2.getText();
		
		String user_loan=Loan2.getText();
		
	//Checking that the text Fields edited by agent side matching the text fields in buyer side(escrow timeline)	
		
		if(user_property.contains(property))
		{
			if(user_warrenty.contains(warrenty))
			{
				if(user_paid.contains(paid))
				{
			System.out.println("property added successfully");
				}
			}
		}
	
	//Checking that the text Fields and calender date edited by agent side matching the text fields in buyer side(escrow timeline)
		if(user_close.contains(close))
		{
			if(user_acceptance.contains(acceptance))
			{
				if(user_Deposite.contains(deposite))
				{
					if(user_inspection.contains(inspection))
					{
						if(user_loan.contains(loan))
						{
							System.out.println("calender fields in escrow updated successfully");
							
						}
					}
				}
			}
		}
	}
}
