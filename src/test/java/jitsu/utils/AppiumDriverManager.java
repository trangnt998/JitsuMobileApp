package jitsu.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverManager {
    private static AppiumDriver<MobileElement> appiumDriver;

    public AppiumDriverManager createAppiumDriver() {
        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            desiredCapabilities.setCapability("appPackage", "com.axlehire.drive.staging");
            desiredCapabilities.setCapability("appActivity", "com.axlehire.drive.MainActivity");

            desiredCapabilities.setCapability("autoGrantPermissions", true);

            URL appiumServer = new URL("http://localhost:4723");
            appiumDriver = new AppiumDriver<>(appiumServer, desiredCapabilities);
            setupDriverTimeouts();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return this;
    }


    public AppiumDriver getDriver(){
        return appiumDriver;
    }

    public void quitDriver(){
        appiumDriver.quit();
    }

    public void setupDriverTimeouts(){
        getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

}