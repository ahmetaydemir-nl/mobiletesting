package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");
//        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        // desiredCapabilities.setCapability("automationName","UiAutomator2");

       // "appPackage": "com.google.android.calculator"
        //"appActivity":  "com.android.calculator2.Calculator"


        desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(3000);
        driver.findElementById("com.android.dialer:id/fab").click();//callbutton
        Thread.sleep(2000);
        driver.findElementById("com.android.dialer:id/one").click();//1
        Thread.sleep(2000);
        driver.findElementById("com.android.dialer:id/one").click();//1
        Thread.sleep(2000);
        driver.findElementById("com.android.dialer:id/one").click();//1
        Thread.sleep(2000);
        driver.findElementById("com.android.dialer:id/dialpad_floating_action_button").click(); //call
        Thread.sleep(3000);
        driver.findElementByXPath("com.android.dialer:id/incall_end_call").click();//end
        Thread.sleep(1000);

        driver.quit();

    }
}
