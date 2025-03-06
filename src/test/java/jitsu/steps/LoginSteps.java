package jitsu.steps;

import io.appium.java_client.AppiumDriver;
import jitsu.pages.*;
import jitsu.utils.AppiumDriverManager;
import org.testng.Assert;

public class LoginSteps {
    AppiumDriver appiumDriver = new AppiumDriverManager().getDriver();
    LoginPage loginPage = new LoginPage(appiumDriver);
    public void LoginByUsername(String username, String password) throws InterruptedException {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
        loginPage.clickButtonLogin();
        Thread.sleep(10000);
    }

}
