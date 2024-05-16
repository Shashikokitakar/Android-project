package com.villeos.config;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.villeos.Test_case.Base_class;

public class Listener extends Base_class implements ITestListener 
{	
	@Override
	public void onStart(ITestContext context) 
	{
	}
	
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

	@Override
	public void onFinish(ITestContext context) {
	
	}

}
