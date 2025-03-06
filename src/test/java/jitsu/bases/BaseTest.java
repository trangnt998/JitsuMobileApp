package jitsu.bases;

import jitsu.utils.AppiumDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected AppiumDriverManager appiumDriverManager = new AppiumDriverManager();

    @BeforeClass(alwaysRun = true)
    public void testSetup(){
        appiumDriverManager.createAppiumDriver();
    }

    @AfterClass
    public void tearDown(){
        if (appiumDriverManager != null){
            appiumDriverManager.quitDriver();
        }
    }
}
