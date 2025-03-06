package jitsu.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class AccountPage {
    private AppiumDriver<MobileElement> appiumDriver;

    public AccountPage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }


    By menuTutorials = By.xpath("//android.view.View[@content-desc='Tutorials']");


    public void clickMenuTutorials() {
        appiumDriver.findElement(menuTutorials).click();
    }
}
