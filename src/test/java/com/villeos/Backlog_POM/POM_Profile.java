package com.villeos.Backlog_POM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM_Profile
{
	protected static AndroidDriver driver;
	
	public POM_Profile()
	{
		
	}
	
	public POM_Profile(AndroidDriver driver1)
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
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement profile;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement Edit;
	
	@FindBy(xpath="//android.widget.EditText[@text='Enter Zip']")
	private WebElement zip;
	
	@FindBy(xpath="//android.widget.EditText[@text='Enter Street']")
	private WebElement Street;
	
	@FindBy(xpath="//android.widget.EditText[@text='Enter City']")
	private WebElement City;
	
	@FindBy(xpath="//android.widget.TextView[@index='11']")
	private WebElement City2;
	
	@FindBy(xpath="//android.widget.TextView[@index='9']")
	private WebElement Street2;
	
	@FindBy(xpath="//android.widget.TextView[@index='15']")
	private WebElement zip2;
	
	@FindBy(xpath="//android.widget.TextView[@index='13']")
	private WebElement State2;
	
	@FindBy(xpath="//android.widget.EditText[@text='Enter State']")
	private WebElement state;
	
	@FindBy(className="android.widget.Button")
	private WebElement Save; 
	
	@FindBy(xpath="//android.widget.EditText[@text='90001']")
	private WebElement Clear_zip;
	
	@FindBy(xpath="//android.widget.EditText[@text='City']")
	private WebElement Clear_City;
	
	@FindBy(xpath="//android.widget.EditText[@text='State']")
	private WebElement Clear_State;
	
	@FindBy(xpath="//android.widget.EditText[@text='Street']")
	private WebElement Clear_Street;
	
	@FindBy(xpath="//android.widget.TextView[@text='DELETE MY ACCOUNT']")
	private WebElement Delete;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement icon;
	
	@FindBy(xpath="//android.widget.TextView[@text='Select from Gallery']")
	private WebElement select;
	
	@FindBy(id="com.android.documentsui:id/sub_menu_list")
	private WebElement List;		
	
	@FindBy(xpath="//android.widget.TextView[@text='Image01.jpg']")
	private WebElement pic;
	
	@FindBy(id="com.villeos:id/menu_crop")
	private WebElement ok;

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
	
	public void clickprofile()
	{
		profile.click();
	}
	
	public void Edit_Profile(String A, String B,String C, String D)
	{
		
		Edit.click();
		
		zip.sendKeys(A);
		
		Street.sendKeys(B);
		
		City.sendKeys(C);
		
		state.sendKeys(D);
		
		Save.click();
		
		String s2=Street2.getText();
	
		String s3=City2.getText();
		
		String s1=zip2.getText();
		
		String s4=State2.getText();
		
		
		if(s1.equalsIgnoreCase(A))
		{
			if(s2.equalsIgnoreCase(B))
			{
				if(s3.equalsIgnoreCase(C))
				{
					if(s4.equalsIgnoreCase(D))
					{
						System.out.println("Profile Updated Successfully");	
					}
				}
			}
		}
		
		else
		{
			System.out.println("Some Error");
		}
		
	}
	
	public void clear_text()
	{
		Edit.click();
		
		Clear_zip.clear();
		
		Clear_Street.clear();
		
		Clear_City.clear();
		
		Clear_State.clear();
		
		Save.click();
		
	
	}
	
	
	public void change_profile() throws IOException, InterruptedException
	{
		Menu.click();
		
		profile.click();
		
		Thread.sleep(3000);
		
		icon.click();
		
		select.click();
		
		Thread.sleep(3000);
		
		String Localpath="C:/Users/My_Work/Desktop/Villeos_project/villeos-1.56/Files/Image01.jpg";
		
		String Remotepath="/storage/emulated/0/Downloads/Image01.jpg";
		
		File file = new File(Localpath);
        driver.pushFile(Remotepath, file);
        
        List.click();
        
        pic.click();
        
        ok.click();
	}
	

}
