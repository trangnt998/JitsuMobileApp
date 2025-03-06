package jitsu.steps;

import io.appium.java_client.AppiumDriver;
import jitsu.pages.TutorialsPage;
import jitsu.utils.AppiumDriverManager;

public class TutorialsSteps {
    AppiumDriver appiumDriver = new AppiumDriverManager().getDriver();
    TutorialsPage tutorialsPage = new TutorialsPage(appiumDriver);

    public void seeThreeSections(){
        tutorialsPage.displayMenuAssignedRoute();
        tutorialsPage.displayMenuDirectBooking();
        tutorialsPage.displayMenuTicketBooking();
    }

    public void clickMenuAssignedRoute(){
        tutorialsPage.clickMenuAssignedRoute();
    }
}
