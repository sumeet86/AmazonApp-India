package com.amazon.testcase;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.amazon.base.AppCapabilities;

import io.appium.java_client.android.AndroidKeyCode;

@SuppressWarnings("deprecation")
public class Launch extends AppCapabilities {

	/*	public Launch(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	} */

	@Test(priority = 1)
	public void AppLaunch() throws MalformedURLException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("App launched");
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/chrome_action_bar_burger_icon")).click();
		System.out.println("Done");
	}

	@SuppressWarnings("deprecation")
	@Test(priority = 2)
	public void AppExit() {
		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("App Exits");

	}

}
