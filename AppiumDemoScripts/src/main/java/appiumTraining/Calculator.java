package appiumTraining;

import java.net.MalformedURLException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AppiumDriver<MobileElement> driver;
		java.net.URL url = new java.net.URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "RZ8M31Z0FGZ");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.app.popupcalculator");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.sec.android.app.popupcalculator.Calculator");
		
		driver = new AndroidDriver<MobileElement>(url, dc);
		
		driver.launchApp();
		
		WebElement seven = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07"));
		WebElement mul = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul"));
		WebElement eight = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_08"));
		WebElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
		WebElement result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
		
		seven.click();
		mul.click();
		eight.click();
		equal.click();
		String res = result.getText();
		if(res.equals("57")) {
			System.out.print("Test Passed");
		}
		else {
			System.out.print("Test Failed");
		}

	}

}
