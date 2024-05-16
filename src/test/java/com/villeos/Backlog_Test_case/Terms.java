package com.villeos.Backlog_Test_case;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Terms extends Base_class
{
  @Test
  public void f() 
  {  
	  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='termOfServiceUrlText']")).click();
	  
	  Set<String> contextHandles = driver.getContextHandles();
	  for (String context : contextHandles) {
	      if (context.contains("WEBVIEW")) {
	          driver.context(context);
	          break;
	      }
  }
}
}
