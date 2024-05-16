package com.villeos.Backlog_Test_case;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 extends Base_class implements ITestListener 
{	

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case get pass: "+result.getName()+"  "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		try 
		{
			capturscreenshot(result.getName()+".png");
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test case get skip: "+result.getName());
	}
}
	
