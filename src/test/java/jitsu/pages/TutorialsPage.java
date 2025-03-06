package jitsu.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class TutorialsPage {
    private AppiumDriver<MobileElement> appiumDriver;

    public TutorialsPage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    By menuAssignedRoute = By.xpath("//android.view.View[@content-desc='Assigned Route']");
    By menuDirectBooking = By.xpath("//android.view.View[@content-desc='Direct Booking']");
    By menuTicketBooking = By.xpath("//android.view.View[@content-desc='Ticket Booking']");


    public void displayMenuAssignedRoute() {
        appiumDriver.findElement(menuAssignedRoute).isDisplayed();
    }

    public void clickMenuAssignedRoute() {
        appiumDriver.findElement(menuAssignedRoute).click();
    }


    public void displayMenuDirectBooking() {
        appiumDriver.findElement(menuDirectBooking).isDisplayed();
    }

    public void displayMenuTicketBooking() {
        appiumDriver.findElement(menuTicketBooking).isDisplayed();
    }

}
