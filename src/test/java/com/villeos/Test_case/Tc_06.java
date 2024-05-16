package com.villeos.Test_case;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.villeos.POM.POM_Tc_06;

import jakarta.mail.*;
import jakarta.mail.internet.MimeMultipart;
import jakarta.activation.DataHandler;
import org.testng.annotations.Test;
import java.util.Properties;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

public class Tc_06 extends Base_class
{
	protected POM_Tc_06 p1;
	
	public String Mail="newuser03649791@gmai.com";
	
	public String E_Mail="User260695@outlook.com";
 @Test
  public void forgot_link() throws InterruptedException
  {
	 //To validate that  Network Error alert functionality trying to change a password from forget password link on app without the internet connection.
	  p1=new POM_Tc_06(driver);
	  
	  //turn of internet connection.
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	  //click on forgot password link.
	  
	  p1.click_forgot_link();
	  
	  try
	  
  	  {
  		  //checking that network error alert will displayed after wifi getting turn off.
  		  boolean w1= driver.findElement(By.xpath("//android.widget.TextView[@text='Oops!']")).isDisplayed();
  		  
  		  if(w1==true)
  		  {
  			  //try to click on the Try again button present at the network error alert.
  			  p1.clickAgainbtn();
  			  
  			  //Adding some wait condition before Turn on the wifi.
  			  Thread.sleep(3000);
  			  
  			  
  			  //Turn on the Wifi connection
  			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi enable"));
  			  
  			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data enable"));
  			  
  			  //try to click on the Try again button present at the network error alert.
  			  p1.clickAgainbtn();
  			  }
  		  }
	  
	  catch(Exception e)
	  
	  {
		  
		Assert.fail("Test failed due to absence of network error alert ");
		
	  }
	  
	  Thread.sleep(3000);
	  
	  //checking the internet conection error alert on get code button in Forgot  password.
	  
	  p1.click_forgot_link();
	  
	  p1.send_mail(Mail);
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	  //click on get code button.
	  
	  p1.click_Button();
	  
try
	  
  	  {
  		  //checking that network error alert will displayed after wifi getting turn off.
  		  boolean w1= driver.findElement(By.xpath("//android.widget.TextView[@text='Oops!']")).isDisplayed();
  		  
  		  if(w1==true)
  		  {
  			  //try to click on the Try again button present at the network error alert.
  			  p1.clickAgainbtn();
  			  
  			  //Adding some wait condition before Turn on the wifi.
  			  Thread.sleep(3000);
  			  
  			  
  			  //Turn on the Wifi connection
  			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi enable"));
  			  
  			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data enable"));
  			  
  			  //try to click on the Try again button present at the network error alert.
  			  p1.clickAgainbtn();
  			  }
  		  }
	  
	  catch(Exception e)
	  
	  {
		  
		Assert.fail("Test failed due to absence of network error alert ");
		
	  }  
  }
  
  @Test
  public void verify_code() throws InterruptedException
  {
	  //checking internet connection alert on verify code button.
	  
	  String EMail="newuser03649791@gmai.com";
	  
	  p1=new POM_Tc_06(driver);
	  
	  //click on forgot password link.
	  
	  p1.click_forgot_link();
	  
	  //sending valid mail
	  p1.send_mail(EMail);
	  
	  //click on valid code button
	  
	  p1.click_Button();
	  
	  Thread.sleep(3000);
	  
	  //turn of internet connection.
	  
      driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
	  
	  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
	  
	  //click on verify code button.
	  
	  p1.click_Button();
	  
	  try
	  
  	  {
  		  //checking that network error alert will displayed after wifi getting turn off.
  		  boolean w1= driver.findElement(By.xpath("//android.widget.TextView[@text='Oops!']")).isDisplayed();
  		  
  		  if(w1==true)
  		  {
  			  //try to click on the Try again button present at the network error alert.
  			  p1.clickAgainbtn();
  			  
  			  //Adding some wait condition before Turn on the wifi.
  			  Thread.sleep(3000);
  			  
  			  
  			  //Turn on the Wifi connection
  			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi enable"));
  			  
  			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data enable"));
  			  
  			  //try to click on the Try again button present at the network error alert.
  			  p1.clickAgainbtn();
  			  }
  		  }
	  
	  catch(Exception e)
	  
	  {
		  
		Assert.fail("Test failed due to absence of network error alert ");
		
	  }  
  
  }
	
	@Test
    public void verifyEmailVerificationCode() throws InterruptedException 
	{
		// check internet connection alert when changing the password.
		p1=new POM_Tc_06(driver);
        // Try to getting a verifaction code while giving valid mail.
        p1.click_forgot_link();
        Thread.sleep(3000);
        p1.send_mail(E_Mail);
        p1.click_Button();
        
        String host = "outlook.office365.com"; // Replace with your email provider's IMAP server
        String username = "User260695@outlook.com"; // Replace with your email address
        String password = "Shashi@1995"; // Replace with your email account password

// Assuming you have sent an email to yourself containing the verification cod
        String emailContent = getEmailContent(host, username, password);
        String verificationCode = extractVerifyCode(emailContent);
        if (!verificationCode.isEmpty())
        {
        	System.out.println("Verification Code: " + verificationCode);
        }
    
	else 
	{
    System.out.println("Verification code not found in the email.");
    }
        //provide verification code.
        
        p1.Code_Verrify(verificationCode);
        
        //Enter a new password.
        
        p1.newpassword();
        
        Thread.sleep(3000);
        
        //turn off internet connection.
  	  
        driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi disable"));
  	  
        driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data disable"));
        
        //click on change password button.
        
        p1.click_Button();
        
        try
  	  
    	  {
    		  //checking that network error alert will displayed after wifi getting turn off.
    		  boolean w1= driver.findElement(By.xpath("//android.widget.TextView[@text='Oops!']")).isDisplayed();
    		  
    		  if(w1==true)
    		  {
    			  //try to click on the Try again button present at the network error alert.
    			  p1.clickAgainbtn();
    			  
    			  //Adding some wait condition before Turn on the wifi.
    			  Thread.sleep(3000);
    			  
    			  
    			  //Turn on the Wifi connection
    			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc wifi enable"));
    			  
    			  driver.executeScript("mobile: shell", ImmutableMap.of("command", "svc data enable"));
    			  
    			  //try to click on the Try again button present at the network error alert.
    			  p1.clickAgainbtn();
    			  }
    		  }
  	  
  	  catch(Exception e)
  	  
  	  {
  		  
  		Assert.fail("Test failed due to absence of network error alert ");
  		
  	  }  
	}

	    // Implement a method to extract the verification code from the email content
	    private String extractVerifyCode(String content) {
	        // Use a regular expression pattern to find the verification code (6 consecutive digits)
	        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\b\\d{6}\\b");
	        java.util.regex.Matcher matcher = pattern.matcher(content);
	        if (matcher.find()) {
	            return matcher.group(); // The matched group contains the verification code value
	        }
	        return ""; // Return an empty string if the verification code is not found
	    }

	    // Implement a method to retrieve the email content using Jakarta Mail
	    private String getEmailContent(String host, String username, String password) {
	        Properties properties = new Properties();
	        properties.put("mail.store.protocol", "imaps");

	        try {
	            Session session = Session.getDefaultInstance(properties);
	            Store store = session.getStore("imaps");
	            store.connect("outlook.office365.com", 993, username, password);

	            Folder emailFolder = store.getFolder("INBOX");
	            emailFolder.open(Folder.READ_ONLY);

	            Message[] messages = emailFolder.getMessages();
	            if (messages.length > 0) {
	                Message message = messages[messages.length - 1]; // Get the most recent email
	                Object content = message.getContent();

	                if (content instanceof String) {
	                    return (String) content;
	                } else if (content instanceof Multipart) {
	                    // Handle emails with attachments or HTML content
	                    Multipart multipart = (Multipart) content;
	                    StringBuilder emailContent = new StringBuilder();

	                    for (int i = 0; i < multipart.getCount(); i++) {
	                        BodyPart bodyPart = multipart.getBodyPart(i);
	                        Object partContent = bodyPart.getContent();

	                        if (partContent instanceof String) {
	                            emailContent.append(partContent);
	                        } else if (partContent instanceof DataHandler) {
	                            DataHandler dataHandler = (DataHandler) partContent;
	                            emailContent.append("\nAttachment: ").append(dataHandler.getName());
	                        }
	                    }

	                    return emailContent.toString();
	                }
	            }

	            emailFolder.close(false);
	            store.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return null;
	   
	    }
	    
}







