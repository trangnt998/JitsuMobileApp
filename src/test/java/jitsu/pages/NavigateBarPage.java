package jitsu.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateBarPage {
    private AppiumDriver<MobileElement> appiumDriver;

    public NavigateBarPage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    By buttonAccount = By.xpath("//android.widget.ImageView[@content-desc='Profile\n" +
            "Tab 5 of 5']");

    public void clickButtonAccount() {
        WebDriverWait wait = new WebDriverWait(appiumDriver, 30);
        wait.until(ExpectedConditions.visibilityOf(appiumDriver
                .findElement(buttonAccount))).click();
    }
}
