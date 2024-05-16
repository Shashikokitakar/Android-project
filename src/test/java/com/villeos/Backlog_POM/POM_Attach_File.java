package com.villeos.Backlog_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import java.io.File;
import java.io.IOException;

public class POM_Attach_File
{

	AndroidDriver driver;
	
	public void POM_Attach_File()
	{
		
	}
	
	public POM_Attach_File(AndroidDriver driver1)
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
	WebElement message1;
	
	@FindBy(xpath="//android.widget.TextView[@text='TestAgent ']")
	private WebElement User;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement attach_button;
	
	@FindBy(xpath="//android.widget.TextView[@text='OK']")
	private WebElement ok_button;
	
	@FindBy(xpath="//android.widget.TextView[@text='myfile1.jpg']")
	private WebElement image;
	
	@FindBy(xpath="//android.widget.TextView[@text='File.pdf']")
	private WebElement pdf;
	
	@FindBy(xpath="//android.widget.TextView[@text='10MG.mp4']")
	private WebElement Video;
	
	@FindBy(xpath="//android.widget.TextView[@text='Send']")
	private WebElement send;
	
	@FindBy(xpath="//android.widget.EditText[@text='Search this chat']")
	private WebElement search;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement close;
	
	@FindBy(className="android.widget.ImageView")
	private WebElement Imagepriview;
	
	@FindBy(xpath="//android.widget.TextView[@index='1']")
	private WebElement Filepriview;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='android:id/message']")
	private WebElement alert;
	
	@FindBy(xpath="//android.widget.TextView[@text='OK']")
	private WebElement ok;
	
	public void login(String Mail, String pass)
	{
		email.sendKeys(Mail);
	
		password.sendKeys(pass);

		logbtn.click();
	}
	
	public void File_Image() throws InterruptedException, IOException
	{
		message1.click();
		
		User.click();
		
		attach_button.click();
		
		ok_button.click();

		
		Thread.sleep(3000);
		
		String Localpath="C:/Users/My_Work/Desktop/Villeos_project/villeos-1.56/Files/myfile.jpg";
		
		String Remotepath="/storage/emulated/0/Downloads/myfile1.jpg";
		
		File file = new File(Localpath);
        driver.pushFile(Remotepath, file);
        
        Thread.sleep(5000);

		image.click();
		
		Thread.sleep(3000);
		
		boolean b1=Imagepriview.isDisplayed();
		
		if(b1)
		{
			System.out.println("File preview is present");
			send.click();
		}
		
		Thread.sleep(3000);
		
		String s1="myfile1.jpg";
		search.sendKeys(s1);
		
		String s2=image.getText();
		
		if(s1.contains(s2))
		{
			System.out.println("Image Uploaded successfully");
		}
		
	}
	
	public void File_PDF() throws InterruptedException, IOException
	{
		
		attach_button.click();
		
		ok_button.click();
		
		Thread.sleep(3000);
		
		String Localpath="C:/Users/My_Work/Desktop/Villeos_project/villeos-1.56/Files/File.pdf";
		
		String Remotepath="/storage/emulated/0/Downloads/File.pdf";
		
		File file = new File(Localpath);
        driver.pushFile(Remotepath, file);
        
        Thread.sleep(5000);

		pdf.click();
		
		Thread.sleep(3000);
		
		boolean b1=Filepriview.isDisplayed();
		
		if(b1)
		{
			System.out.println("File preview is present");
		
		}
		
		send.click();
		
		Thread.sleep(3000);
		
		String s1="File.pdf";
		
		close.click();
		
		search.sendKeys(s1);
		
		String s2=pdf.getText();
		
		if(s1.contains(s2))
		{
			System.out.println("Pdf Uploaded successfully");
		}
		
	}
	
	public void invalid_File() throws InterruptedException, IOException
	{
		
		attach_button.click();
		
		ok_button.click();
		
		Thread.sleep(3000);
		
		String Localpath="C:/Users/My_Work/Desktop/Villeos_project/villeos-1.56/Files/10MG.mp4";
		
		String Remotepath="/storage/emulated/0/Downloads/10MG.mp4";
		
		File file = new File(Localpath);
		
        driver.pushFile(Remotepath, file);
        
        Thread.sleep(10000);

		Video.click();
		
		boolean b1=alert.isDisplayed();
	
		if(b1)
		{
			System.out.println("File size exceed the 5mb limit");

		}
		
	}
	
}
