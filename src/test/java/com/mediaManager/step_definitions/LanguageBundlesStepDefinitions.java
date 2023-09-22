package com.mediaManager.step_definitions;

import com.mediaManager.pages.HomePage;
import com.mediaManager.pages.LanguageBundlesPage;
import com.mediaManager.utilities.ConfigReader;
import com.mediaManager.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

import java.util.ResourceBundle;

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

    @Given("Test name is entered in the name field")
    public void language_Bundles_entered_in_the_name_field() {

    }


    @Given("It is seen that there are filters related to the test name")
    public void language_Bundles_related_to_the_test_name() {

    }


    @Given("Click the Clear Button")
    public void language_Bundles_Clear_Button() {

    }

    @Given("The filter field appears to be deleted")
    public void language_Bundles_field_appears_to_be_deleted() {

    }

    @Given("Keyword is entered in the name field")
    public void enteredNameField() {
        languageBundlesPage.languageBundlesNameField.click();
        languageBundlesPage.languageBundlesNameField.sendKeys(ConfigReader.getProperty("laguage_bundles_page"));
        ReusableMethods.waitFor(2);

    }

    @Given("It appears that you are searching by keyword on Laguage Bundles Page")
    public void keywordLaguageBundlesPage() {
        languageBundlesPage.languageBundlesclientNameField.isDisplayed();
        ReusableMethods.waitFor(2);

    }

    @Given("Keyword is entered in the client name field")
    public void clientKeywordLaguageBundlesPage() {
    languageBundlesPage.languageBundlesclientNameField.sendKeys(ConfigReader.getProperty("laguage_bundles_client_name"));
        ReusableMethods.waitFor(2);
    }

    @Given("It appears that you are searching by client name keyword on Laguage Bundles Page")
    public void clientnamekeywordLaguageBundlesPage() {
        languageBundlesPage.languageBundlesClientNameSearchingVerfy.isDisplayed();
        ReusableMethods.waitFor(2);
    }



}


