package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class PageBase {
    AndroidDriver driver;
    public PageBase(AndroidDriver  driver) {
        this.driver=driver;
    }
    public void scrollDownByVisibleText( String  elementTxt) {
        driver.findElement(AppiumBy.androidUIAutomator
                ("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().textContains(\""+elementTxt+"\"))"));


    }
}
