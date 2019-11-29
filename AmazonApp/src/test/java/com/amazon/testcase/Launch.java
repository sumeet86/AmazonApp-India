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
	public void AppMenu() throws MalformedURLException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("App launched");
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/chrome_action_bar_burger_icon")).click();
		System.out.println("Done");
		//driver.findElementByAndroidUIAutomator(
		//		"new UiScrollable(new UiSelector().resourceId(\"in.amazon.mShop.android.shopping:id/gno_drawer_list\")).scrollIntoView(new UiSelector().text(\"Customer Service\"));").click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Shop by Category']")).click();
		Thread.sleep(2000);
		
	
	}

/*	@SuppressWarnings("deprecation")
	@Test(priority = 2)
	public void AppExit() {
		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("App Exits");
	} */
	
	@Test(priority= 2)
	public void MobileComputer() throws InterruptedException{
		 driver.findElement(By.xpath("//*[@text='Mobiles, Computers']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@text='Laptops']")).click();
	}
}
