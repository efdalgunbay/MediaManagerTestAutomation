package com.mediaManager.step_definitions;

import com.mediaManager.pages.HomePage;
import com.mediaManager.pages.LanguageBundlesPage;
import com.mediaManager.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

public class LanguageBundlesStepDefinitions {
    HomePage homePage=new HomePage();
    LanguageBundlesPage languageBundlesPage=new LanguageBundlesPage();


    @Given("Click Language Bundles button")
    public void user_button() {
        homePage.LanguageBundlesNavBar.click();
        ReusableMethods.waitFor(3);
    }

    @Given("Language Bundles page appears")
    public void language_Bundles_page_appears() {
        languageBundlesPage.languageBundlesTitle.isDisplayed();
        ReusableMethods.waitFor(2);


    }
}
