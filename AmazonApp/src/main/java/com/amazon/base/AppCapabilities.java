package com.amazon.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppCapabilities {
	public static String deviceName = "Galaxy A50";
	public static String platformVersion = "9";
	public static String model = "RZ8M31M9CDE";
	public static String appPackage = "in.amazon.mShop.android.shopping";
	public static String appActivity = "com.amazon.mShop.home.HomeActivity";

	public static AndroidDriver<AndroidElement> driver;

	/* public static void main(String[] args) throws MalformedURLException {
		Capabilities(deviceName,platformVersion,model,appPackage,appActivity);
		
	} */
	
	@Test
	public static AndroidDriver<AndroidElement> Capabilities(String deviceName, String platformVersion, String model,
			String appPackage, String appActivity) throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "");
		cap.setCapability("deviceName", deviceName);
		cap.setCapability("platformVersion", platformVersion);
		cap.setCapability("model", model);
		cap.setCapability("platformName", "Android");
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);
		cap.setCapability("appPackage", appPackage);
		cap.setCapability("appActivity", appActivity);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;

	}

}
