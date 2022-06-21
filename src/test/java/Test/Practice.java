package Test;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
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
	System.out.println("Launch Setting");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("automationName", "UiAutomator2");
    cap.setCapability("deviceName", "Redmi");
	
	cap.setCapability("appium:udid", "7c8a42ee");
	cap.setCapability("platformName","Android");
	cap.setCapability("platformVersion","11");
	cap.setCapability("appPackage","com.android.settings");
	cap.setCapability("appActivity", "com.android.settings.MainSettings");	
	URL url=new URL("http://127.0.0.1:4723/wd/hub");
	Thread.sleep(2000);
	driver = new AndroidDriver(url, cap);
	//android:id/checkbox
	//android:id/title
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Wi-Fi')]")).click();
	//driver.findElement(By.xpath("//android.widget.TextView[@text=‘Wi-Fi’]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("android:id/checkbox")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("miui:id/up")).click();
//	driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Bluetooth')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("android:id/checkbox")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("miui:id/up")).click();
//	driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Connection & sharing')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("android:id/switch_widget")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("miui:id/up")).click();
//	
//	

	

}}
