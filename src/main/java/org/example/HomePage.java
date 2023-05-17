package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class HomePage extends PageBase {
    private By app = By.xpath("//*[@content-desc='Graphics']");

    public HomePage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }
    public void clickOnGraphicsElement()
    {
        driver.findElement(app).click();
    }

}
