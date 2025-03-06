package jitsu.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

public class ActiveAssignmentPage {
    private AppiumDriver<MobileElement> appiumDriver;

    public ActiveAssignmentPage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }


    By titlePage = By.xpath("//android.view.View[@content-desc='Active Assignment']");
    By buttonStartTutorial = By.xpath("//android.widget.Button[@content-desc='Start Tutorial']");
    By buttonQuitTutorial = By.xpath("//android.widget.Button[@content-desc='Quit tutorial']");
    By popupConfirmQuitTutorial = By.xpath("//android.view.View[@content-desc='Are you sure you want to quit the tutorial?\n" +
            "No, continue tutorial ']");

    By toastQuitTutorialSuccess = By.xpath("//android.widget.Toast[@text='Quit tutorial successful']");
    By buttonConfirmQuitTutorial = By.xpath("//android.widget.Button[@content-desc='Yes, quit tutorial']");

    public String getTitlePage() {
        return appiumDriver.findElement(titlePage).getAttribute("content-desc");
    }


    private MobileElement buttonStartTutorial() {
        List<MobileElement> elements = appiumDriver.findElementsByXPath("//android.widget.Button[@content-desc='Start Tutorial']");
        if (!elements.isEmpty()) {
            System.out.println("Exist Tutorial");
            return appiumDriver.findElementByXPath("//android.widget.Button[@content-desc='Start Tutorial']");
        } else {
            System.out.println("No exist element Tutorial");
            return null;
        }

    }

    public void clickButtonStartTutorial() {
        buttonStartTutorial().click();
    }

    public String getLabelButtonStartTutorial() {
        if (buttonStartTutorial() != null) {
            System.out.println(buttonStartTutorial().getAttribute("content-desc"));
            return buttonStartTutorial().getAttribute("content-desc");
        } else {
            System.out.println("No exist Tutorial !!!");
            System.out.println();
            return null;
        }


    }


    public void clickButtonQuitTutorial() {
        appiumDriver.findElement(buttonQuitTutorial).click();
    }

    public String getTitlePopupConfirmQuitTutorial() {
        return appiumDriver.findElement(popupConfirmQuitTutorial).getAttribute("content-desc");
    }

    public void clickConfirmQuitTutorial() {
        appiumDriver.findElement(buttonConfirmQuitTutorial).click();
    }

    public String getTextToastQuitTutorialSuccess() {
        return appiumDriver.findElement(toastQuitTutorialSuccess).getText();
    }

}
