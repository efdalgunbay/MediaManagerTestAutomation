package com.mediaManager.step_definitions;

import com.mediaManager.pages.HomePage;
import com.mediaManager.pages.ProjectPage;
import com.mediaManager.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

public class ProjectStepDefinitions {
HomePage homePage=new HomePage();
ProjectPage projectPage=new ProjectPage();

    @Given("Click Project button")
    public void project_button() {
        homePage.projectNavBar.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Project page appears")
    public void project_Page_appears() {
        projectPage.projectPageTitle.isDisplayed();
        ReusableMethods.waitFor(3);

    }
}
