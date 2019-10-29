package appiumTestPackage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
			 
		// xpath is address / location of the element on web page or mobile
		//xpath, id, classname, adroidUIAutomator
		// //tagName[@Attribute='value']
		// tagName is usually class = android.widget.TextView
		// attributes are index, text, resource-id, class, package 
		/*
		 * while(driver.findElementByXPath("//android.widget.Button[@text='Continue']").
		 * isDisplayed()) {
		 * driver.findElementByXPath("//android.widget.Button[@text='Continue']").click(
		 * ); }
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("WiFi");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
	}

}
