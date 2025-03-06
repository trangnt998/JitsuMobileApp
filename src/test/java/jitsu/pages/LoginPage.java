package jitsu.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;


public class LoginPage {
    private AppiumDriver<MobileElement> appiumDriver;

    public LoginPage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    By textboxUsername = By.xpath("//android.widget.EditText[1]");
    By textboxPassword = By.xpath("//android.widget.EditText[2]");
    By buttonLogin = By.xpath("//android.widget.Button[@content-desc='Log In']");


    public void inputUsername(String username) {
//        WebDriverWait wait = new WebDriverWait(appiumDriver, 30);
//        wait.until(ExpectedConditions.visibilityOf(textboxUsername));
        appiumDriver.findElement(textboxUsername).click();
        appiumDriver.findElement(textboxUsername).sendKeys(username);
    }


    public void inputPassword(String password) {
        appiumDriver.findElement(textboxPassword).click();
        appiumDriver.findElement(textboxPassword).sendKeys(password);
    }


    public void clickButtonLogin() {
        appiumDriver.findElement(buttonLogin).click();
    }

    public String getTextButtonLogin() {
        return appiumDriver.findElement(buttonLogin).getAttribute("content-desc");
    }

}
