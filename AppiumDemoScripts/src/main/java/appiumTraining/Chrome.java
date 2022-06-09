package appiumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppiumDriver<MobileElement> driver;
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "RZ8M31Z0FGZ");
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		dc.setCapability(MobileCapabilityType.FULL_RESET, false);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
		
		driver = new AndroidDriver<MobileElement>(dc);		
		WebElement urlBar = driver.findElement(By.id("com.android.chrome:id/search_box_text"));
		urlBar.sendKeys("https://publicissapient.com");
		((AndroidDeviceActionShortcuts)driver).pressKeyCode(AndroidKeyCode.KEYCODE_NUMPAD_ENTER);
		
//		driver.launchApp();

	}

}
