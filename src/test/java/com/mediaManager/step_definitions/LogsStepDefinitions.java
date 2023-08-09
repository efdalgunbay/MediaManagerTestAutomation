package com.mediaManager.step_definitions;

import com.mediaManager.pages.HomePage;
import com.mediaManager.pages.LogsPage;
import com.mediaManager.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

public class LogsStepDefinitions {

    LogsPage logsPage=new LogsPage();
    HomePage homePage=new HomePage();

    @Given("Click Logs button")
    public void logs_button() {
        homePage.logsNavBar.click();
        ReusableMethods.waitFor(3);
    }

    @Given("Logs Page appears")
    public void logs_Page_appears() {
        logsPage.logsTitle.isDisplayed();
        ReusableMethods.waitFor(2);
    }
}
