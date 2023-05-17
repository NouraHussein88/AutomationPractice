package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class GraphicsPage extends PageBase{
    private By openGleElement=By.xpath("//*[@content-desc='OpenGL ES']");
    public GraphicsPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }
    public void clickOnOpenGLESElement(String elementTxt)
    {
        scrollDownByVisibleText( elementTxt);
        driver.findElement(openGleElement).click();

    }
}
