package com.amazon.testcase;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.amazon.base.AppCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;


public class Launch extends AppCapabilities {
  public AndroidDriver<AndroidElement> driver;
		
	@Test(priority=1)
	public void AppLaunch() throws MalformedURLException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("App launched");
	
	}
	@Test(priority=2)
	public void AppExit() {
		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("App Exits");
		
		
	}

}
