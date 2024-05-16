package com.villeos.Backlog_Test_case;

import java.util.Properties;

import org.testng.annotations.Test;

import com.villeos.Backlog_POM.POM_Forget_Password;
import com.villeos.POM.POM_Tc_06;

import jakarta.activation.DataHandler;
import jakarta.mail.BodyPart;
import jakarta.mail.Folder;
import jakarta.mail.Message;
import jakarta.mail.Multipart;
import jakarta.mail.Session;
import jakarta.mail.Store;

public class Forget_Password extends Base_class 
{
	protected POM_Forget_Password p1;
  
	String E_Mail = "User260695@outlook.com";
	@Test
  public void check_Password() throws InterruptedException
  {
	  
	  p1=new POM_Forget_Password(driver);
      // Perform the actions to trigger the verification code email (e.g., click on Forgot Password and enter email
     
	  p1.click_forgot_link();
      Thread.sleep(3000);
      
      p1.send_mail(E_Mail);
     
      p1.click_Button();
       
      String host = "outlook.office365.com";
      
      String username = "User260695@outlook.com";
      
      String password = "Shashi@1995";
      
      //Assuming you have sent an email to yourself containing the verification cod
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
      
      p1.Code_Verrify(verificationCode);
      
      p1.newpassword();
      
      p1.click_Button();
      
      p1.alert();
	
  }

	    // Implement a method to extract the verification code from the email content
	    private String extractVerifyCode(String content)
	    {
	        // Use a regular expression pattern to find the verification code (6 consecutive digits)
	        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\b\\d{6}\\b");
	        java.util.regex.Matcher matcher = pattern.matcher(content);
	        
	        if (matcher.find())
	        {
	            return matcher.group(); // The matched group contains the verification code value
	        }
	        return ""; // Return an empty string if the verification code is not found
	    }

	    // Implement a method to retrieve the email content using Jakarta Mail
	    private String getEmailContent(String host, String username, String password)
	    {
	        Properties properties = new Properties();
	        properties.put("mail.store.protocol", "imaps");

	        try 
	        {
	            Session session = Session.getDefaultInstance(properties);
	            Store store = session.getStore("imaps");
	            store.connect("outlook.office365.com", 993, username, password);

	            Folder emailFolder = store.getFolder("INBOX");
	            emailFolder.open(Folder.READ_ONLY);

	            Message[] messages = emailFolder.getMessages();
	            if (messages.length > 0) 
	            {
	                Message message = messages[messages.length - 1]; // Get the most recent email
	                Object content = message.getContent();

	                if (content instanceof String)
	                {
	                    return (String) content;
	                }
	                else if (content instanceof Multipart) 
	                {
	                    // Handle emails with attachments or HTML content
	                    Multipart multipart = (Multipart) content;
	                    StringBuilder emailContent = new StringBuilder();

	                    for (int i = 0; i < multipart.getCount(); i++) 
	                    {
	                        BodyPart bodyPart = multipart.getBodyPart(i);
	                        Object partContent = bodyPart.getContent();

	                        if (partContent instanceof String) 
	                        {
	                            emailContent.append(partContent);
	                        } 
	                        else if (partContent instanceof DataHandler)
	                        {
	                            DataHandler dataHandler = (DataHandler) partContent;
	                            emailContent.append("\nAttachment: ").append(dataHandler.getName());
	                        }
	                    }
	                    
	                    return emailContent.toString();
	                    
	                }
	            
	            }

	            emailFolder.close(false);
	            
	            store.close();
	            } 
	        
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }

	        return null;
	        
	        
	   
	    }
	    
  }

