package appiumTraining;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Version {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AppiumDriver<MobileElement> driver;
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.6");
		dc.setCapability(MobileCapabilityType.UDID, "deaea6f2c3a9edfe556657a7fdb650b569831cb6");
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		dc.setCapability(MobileCapabilityType.FULL_RESET, false);
		dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.apple.Preferences");
//		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
		URL url = new URL("http://127.0.0.1:4780/wd/hub");
		driver = new IOSDriver<MobileElement>(url, dc);
		driver.launchApp();
		
		driver.findElement(By.name("General")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("About")).click();
		String ver = driver.findElement(By.xpath("//XCUIElementTypeCell[@name = \"Software Version\"]/XCUIElementTypeStaticText[2]")).getText();
		
		if(ver.equals("14.6")) {
			System.out.print("Test Passed");
		}
		else {
			System.out.print("Test Failed");
		}
	}

}
