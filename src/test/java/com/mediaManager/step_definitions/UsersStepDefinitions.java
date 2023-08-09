package com.mediaManager.step_definitions;

import com.mediaManager.pages.HomePage;
import com.mediaManager.pages.UsersPage;
import com.mediaManager.utilities.ConfigReader;
import com.mediaManager.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

import java.util.ResourceBundle;

public class UsersStepDefinitions {

    HomePage homePage=new HomePage();
    UsersPage usersPage=new UsersPage();

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
}
