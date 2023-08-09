package com.mediaManager.step_definitions;

import com.mediaManager.pages.HomePage;
import com.mediaManager.pages.LoginPage;
import com.mediaManager.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

public class HomeStepDefinitions {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();

    @Given("Home page appears")
    public void home_page_appears() {
        homePage.LanguageBundlesNavBar.isDisplayed();
        ReusableMethods.waitFor(3);
    }

}
