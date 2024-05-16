package com.villeos.Test_case;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Base_class
{
	static String Screenshot_folder;
	protected static AndroidDriver driver;
	@BeforeMethod
	public void base_Class() throws InterruptedException
	{
		
	DesiredCapabilities caps= new DesiredCapabilities();
	  
	  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	  
	  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "MZIBVKPRAMCMK7GM");
	  
	  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	  
	  caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	  
	  caps.setCapability("appPackage", "com.villeos");
	  
	  caps.setCapability("appActivity", "com.villeos.MainActivity");
	  
	  //Establishing the connection with appium server
	  
	  URL url = null;
	try 
	{
		url = new URL("http://127.0.0.1:4723/wd/hub/");
	}
	catch (MalformedURLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
       driver= new AndroidDriver(url,caps);
       
       //Thread.sleep(5000);
	  
	  //Using Implicit wait to tell a driver to wait a certain time to load a element on page.
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	  //To communicate with the splashscreen.
	  driver.findElement(By.className("android.widget.Button")).click();
	  driver.findElement(By.className("android.widget.Button")).click();
	  driver.findElement(By.className("android.widget.Button")).click();
	  driver.findElement(By.className("android.widget.Button")).click();
}
	@AfterMethod
	public void teardown()
	{
		 //Turn on the Wifi connection
		  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi enable"));
		  
		  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data enable"));
		  
		  driver.quit();
	}	
	
	public void capturscreenshot(String filename) throws IOException
	{
		if(Screenshot_folder== null)
		{
		LocalDateTime myDateObj = LocalDateTime.now();
	   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd_MM_yyyy_HHmmss");

	    Screenshot_folder= myDateObj.format(myFormatObj);
	    
		}
	    
		File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/"+Screenshot_folder+"/"+filename);
		FileUtils.copyFile(sourceFile, destFile);
		System.out.println("Screenshot saved successfully");
	}
	
	
}
	


