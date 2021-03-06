package Appium;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;

public class Switch extends Base {
    /*
    Api demos
    preference
    5. preference from code
    ilkl check box secili olmali
    switch acik
    acik oldugunu onayla
     */
    @Test
    public void test() throws MalformedURLException {
        AndroidDriver driver = lunchAndroid();
        driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='5. Preferences from code']").click();
//ilk checkbox secili olup olmadigini kontrol ediyoruz
        List<WebElement> checkBox1 = driver.findElementsByAndroidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\").index(0).checked(false)");
        // System.out.println(checkBox1.size());
        TouchAction touchAction = new TouchAction(driver);
        //eger secili degil sec (tap ile)
        if (checkBox1.size()>0) {
            touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(checkBox1.get(0)))).perform();
        }
        WebElement switchButton = driver.findElementByXPath("//android.widget.Switch");
//eger switch button kapaliysa ac
        if(switchButton.getText().equals("OFF")){
            switchButton.click();
        }
//switch button in acik oldugunu onayla
        Assert.assertEquals("ON",switchButton.getText());
    }
}

