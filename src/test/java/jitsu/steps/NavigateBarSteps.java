package jitsu.steps;

import io.appium.java_client.AppiumDriver;
import jitsu.pages.NavigateBarPage;
import jitsu.utils.AppiumDriverManager;

public class NavigateBarSteps {
    AppiumDriver appiumDriver = new AppiumDriverManager().getDriver();
    NavigateBarPage navigateBarPage = new NavigateBarPage(appiumDriver);

    public void clickButtonAccount() throws InterruptedException {
        navigateBarPage.clickButtonAccount();
    }

}
