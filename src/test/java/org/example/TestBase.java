package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TestBase {
    public static AndroidDriver  driver;
    private DesiredCapabilities desiredCap;
    public static HomePage homepage;


    public void AndroidSetupDesiredCapabilities()  {
        desiredCap = new DesiredCapabilities();
        desiredCap.setCapability("platformName", "Android");
        desiredCap.setCapability("automationName", "Appium");
        desiredCap.setCapability("platformVersion", "13.0");
        desiredCap.setCapability("deviceName", "device1");
        desiredCap.setCapability("appPackage", "io.appium.android.apis");
        desiredCap.setCapability("app", "D:\\autonation practice\\practice\\src\\test\\resources\\apps\\ApiDemos.apk");
       // desiredCap.setCapability("app",System.getProperty("user.dir") + "/resources/apps/ApiDemos.apk");
    }
    public void lunchAndroidDriver() {
        try {
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    public void terDown() {
        driver.quit();
    }

}
