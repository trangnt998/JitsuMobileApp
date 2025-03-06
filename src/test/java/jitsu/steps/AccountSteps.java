package jitsu.steps;

import io.appium.java_client.AppiumDriver;
import jitsu.pages.AccountPage;
import jitsu.utils.AppiumDriverManager;

public class AccountSteps {
    AppiumDriver appiumDriver = new AppiumDriverManager().getDriver();
    AccountPage accountPage = new AccountPage(appiumDriver);

    public void clickMenuTutorials(){
        accountPage.clickMenuTutorials();
    }

}
