package com.villeos.config;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.villeos.Test_case.Base_class;

import io.appium.java_client.android.AndroidDriver;

public class screenshot
{
	public void capturscreenshot(String filename) throws IOException
	{
		AndroidDriver driver=new AndroidDriver(null);
		
		String Screenshot_folder = null;
			File sourceFile = driver.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Screenshots/"+Screenshot_folder+"/"+filename);
			FileUtils.copyFile(sourceFile, destFile);
			System.out.println("Screenshot saved successfully");
		}
	}


