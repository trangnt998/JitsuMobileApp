package jitsu.tests;

import jitsu.bases.BaseTest;
import jitsu.steps.*;

import org.testng.annotations.Test;

public class StartTutorialTest extends BaseTest {
    @Test()
    public void login() throws InterruptedException {
        LoginSteps loginSteps = new LoginSteps();
        ActiveAssignmentSteps activeAssignmentSteps = new ActiveAssignmentSteps();
        NavigateBarSteps navigateBarSteps = new NavigateBarSteps();
        AccountSteps accountSteps = new AccountSteps();
        TutorialsSteps tutorialsSteps = new TutorialsSteps();

        loginSteps.LoginByUsername("auto_244332", "Testing1!");
        navigateBarSteps.clickButtonAccount();
        accountSteps.clickMenuTutorials();
        tutorialsSteps.seeThreeSections();
        tutorialsSteps.clickMenuAssignedRoute();
        activeAssignmentSteps.seeActiveAssignmentScreen();
        activeAssignmentSteps.startAndQuitAssignedRouteTutorial();

        Thread.sleep(5000);
    }
}
