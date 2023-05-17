package org.example;

import org.testng.annotations.*;

public class Test extends TestBase{
    HomePage homepage;
    GraphicsPage graphicsPage;

    @BeforeSuite
    public void beforeSuit(){
        AndroidSetupDesiredCapabilities();

    }
    @BeforeMethod
    public void beforeMethod() {
        lunchAndroidDriver();
        homepage=new HomePage(driver);
        graphicsPage=new GraphicsPage(driver);
    }
    @AfterMethod
    public void afterMethod() {
        terDown();
    }

    @org.testng.annotations.Test
    public void VerifyScrolling() {

        homepage.clickOnGraphicsElement();
        graphicsPage.clickOnOpenGLESElement("OpenGL ES");

    }

}
