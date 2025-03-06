/*
package jitsu.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LaunchApp {
    public static void main(String[] args){
        try {
            AppiumDriver<MobileElement> appiumDriver;

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            desiredCapabilities.setCapability("appPackage", "com.axlehire.drive.staging");
            desiredCapabilities.setCapability("appActivity", "com.axlehire.drive.MainActivity");

            URL appiumServer = new URL("http://localhost:4723");
            appiumDriver = new AppiumDriver<>(appiumServer, desiredCapabilities);
            appiumDriver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);

            MobileElement startButton = appiumDriver.findElementByAccessibilityId("Đăng nhập");
            startButton.click();

            Thread.sleep(10000);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
*/
