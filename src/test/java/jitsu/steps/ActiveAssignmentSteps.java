package jitsu.steps;

import io.appium.java_client.AppiumDriver;
import jitsu.pages.ActiveAssignmentPage;
import jitsu.utils.AppiumDriverManager;
import org.testng.Assert;

public class ActiveAssignmentSteps {
    AppiumDriver appiumDriver = new AppiumDriverManager().getDriver();
    ActiveAssignmentPage activeAssignmentPage = new ActiveAssignmentPage(appiumDriver);

    public void verifyTitlePage(){
        String actTitle = activeAssignmentPage.getTitlePage();
        String expTitle = "Active Assignment";
        Assert.assertEquals(actTitle, expTitle);
    }

    public void seeActiveAssignmentScreen(){
        String actTitle = activeAssignmentPage.getTitlePage();
        String expTitle = "Active Assignment";
        Assert.assertEquals(actTitle,expTitle);
    }
    public void startAndQuitAssignedRouteTutorial() {
        System.out.println("Check call function start tutorial");
        if (activeAssignmentPage.getLabelButtonStartTutorial() != null) {
            activeAssignmentPage.clickButtonStartTutorial();
            activeAssignmentPage.clickButtonQuitTutorial();
            activeAssignmentPage.clickConfirmQuitTutorial();

            String actToast = activeAssignmentPage.getTextToastQuitTutorialSuccess();
            String expToast = "Quit tutorial successful";
            Assert.assertEquals(actToast, expToast);
        }
        else {
            System.out.println("Tutorial not exist - END");
        }
    }
}
