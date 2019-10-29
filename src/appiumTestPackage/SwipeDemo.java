package appiumTestPackage;

import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class SwipeDemo extends Base{
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		TouchAction action = new TouchAction(driver);
		WebElement datewidgets = driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']");
		action.tap(tapOptions().withElement(element(datewidgets))).perform();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		//long press on element for 1 second and then move to another element and release it
		WebElement fifteen = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement fortyFive = driver.findElementByXPath("//*[@content-desc='45']");
		action.longPress(longPressOptions().withElement(element(fifteen)).withDuration(ofSeconds(2))).moveTo(element(fortyFive)).release().perform();

	}

}
