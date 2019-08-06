package com.amazon.testcase;

import org.testng.annotations.Test;

import com.amazon.base.AppCapabilities;

public class LaptopDropDown extends AppCapabilities{

//	@Test (priority = 3)
	public void ScrollTODropDown() throws InterruptedException {
		driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceId(\"in.amazon.mShop.android.shopping:id/mshop_webView_container\")).scrollIntoView(new UiSelector().text(\"Find Now\"));");
		Thread.sleep(3000);
	}
}
