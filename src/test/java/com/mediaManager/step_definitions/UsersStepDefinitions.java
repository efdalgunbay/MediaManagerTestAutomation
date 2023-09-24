package com.mediaManager.step_definitions;

import com.mediaManager.pages.HomePage;
import com.mediaManager.pages.LanguageBundlesPage;
import com.mediaManager.pages.UsersPage;
import com.mediaManager.utilities.ConfigReader;
import com.mediaManager.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

import java.util.ResourceBundle;

public class UsersStepDefinitions {

    HomePage homePage=new HomePage();
    UsersPage usersPage=new UsersPage();
    LanguageBundlesPage languageBundlesPage=new LanguageBundlesPage();

    @Given("Click User button")
    public void user_button() {
       homePage.usersNavBar.click();
        ReusableMethods.waitFor(3);
    }

    @Given("User page appears")
    public void page_appears() {
        usersPage.usersTitle.isDisplayed();
        ReusableMethods.waitFor(2);


    }

    @Given("Status Filter Area is Clicked")
    public void statusFilterArea() {
        usersPage.statusFilterField.click();
        ReusableMethods.waitFor(1);
    }


    @Given("Inactive Filter is Selected")
    public void inactiveFilter() {
        usersPage.statusFilterInactive.click();
        ReusableMethods.waitFor(2);
    }


    @Given("Click on the Clean Filter Button")
    public void cleanFilterButton() {
        usersPage.usersFilterClearButton.click();
        ReusableMethods.waitFor(6);
    }

    @Given("It is seen that the filter is cleaned")
    public void filterisCleaned() {
        usersPage.clearFiltreVerify.isDisplayed();
        ReusableMethods.waitFor(2);

    }

    @Given("A keyword is entered in the name field")
    public void enteredNameField() {
        languageBundlesPage.languageBundlesNameField.click();
        languageBundlesPage.languageBundlesNameField.sendKeys(ConfigReader.getProperty("user_page_user_name"));
        ReusableMethods.waitFor(2);

    }

    @Given("It appears that you are searching by keyword")
    public void searchingByKeyword() {
        usersPage.nameSearcingVerifyUserPage.isDisplayed();
        ReusableMethods.waitFor(2);

    }

    @Given("Keyword is entered in the client name field Users Page")
    public void searchingByKeywordUsers() {
      languageBundlesPage.languageBundlesclientNameField.sendKeys(ConfigReader.getProperty("user_name_client_name"));
        ReusableMethods.waitFor(2);
    }

    @Given("It appears that you are searching by client name keyword on Users Page")
    public void nameKeywordUsersPage() {
      usersPage.UsersClientNameSearchingVerfy.isDisplayed();
      ReusableMethods.waitFor(2);
    }


    @Given("User Role Filter is made")
    public void userRoleFilter() {
        usersPage.userPageRole.click();
        usersPage.userPageRolePM.click();
        ReusableMethods.waitFor(2);
    }


    @Given("It is seen that the filter is made according to the selected Role")
    public void theSelectedRole() {

    }

    @Given("Click on the sort by name button")
    public void sortbyNameButton() {
        usersPage.nameShortingButton.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Appears to be sorted by name")
    public void sortedbynName() {
        usersPage.nameShortingverfiy.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Given("Sort by client is clicked")
    public void clientisClicked() {
        usersPage.clientShortingButton.click();
        ReusableMethods.waitFor(2);

    }

    @Given("Appears to be sorted by client")
    public void sortedbyClient() {
        usersPage.clientShortingverfiy.isDisplayed();
        ReusableMethods.waitFor(2);
    }
}
