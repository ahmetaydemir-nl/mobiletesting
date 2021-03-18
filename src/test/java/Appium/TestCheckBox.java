package Appium;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import java.net.MalformedURLException;
public class TestCheckBox extends Base {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        /*
        Api demos => preference => preference dependencies
        => Wifi check box   tikla
        => wifi settings => text kutusuna "Hello World" => OK
         */
        AndroidDriver driver = lunchAndroid();
        //driver.findElementById("com.android.permissioncontroller:id/continue_button").click();
        //driver.findElementById("android:id/button1").click();
        //driver.findElementById("com.touchboarder.android.api.demos:id/buttonDefaultPositive").click();
        driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
        Thread.sleep(3000);
        driver.findElementById("android:id/edit").sendKeys("Hello World");
        Thread.sleep(3000);
        driver.findElementById("android:id/button1").click();
    }
}

//calismaniz icin
//chrome browser da
//https://youube.com git
//arama cubugunda "techproed" ara
//abone ol / subscribe tikla
//abone oldugunu onayla :slightly_smiling_face: (edited)

//Task 2 : bu ikisini yarin derse kadar yapip kanalda kodlari paylasalim
//on sart (api demos telefonda ac)
//apidemos tikla
//prefrences tikla
//preferences from code tikla
//checkbox preference tikla
//switch preference tikla
//Edit preference tikla
//yazi kutusuna "text" yaz ok tikla
//list preference tikla  option3 sec
//11:34
//test senaryosunu anlamak icin aplikasyonda adimlari manual olarak takip edip kodlarinizi yazin
//gorusmek uzere