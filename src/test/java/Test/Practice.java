package Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Practice {
	AppiumDriver driver;
	//AndroidDriver driver;
	@Test
	public void openCalculator() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appium:automationName", "Appium");

		cap.setCapability("deviceName", "emulator-5554");
		
		cap.setCapability("appium:udid", "emulator-5554");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","6.0");
		cap.setCapability("appPackage","com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		
		driver = new AndroidDriver(url, cap);
		
		Thread.sleep(500000);
	

}}
