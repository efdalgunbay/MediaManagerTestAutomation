package com.mediaManager.step_definitions;

import com.mediaManager.pages.LoginPage;
import com.mediaManager.utilities.ConfigReader;
import com.mediaManager.utilities.ReusableMethods;
import io.cucumber.java.en.Given;


public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();

        @Given("Fill in the username field")
    public void username_field() {
           loginPage.userNameField.sendKeys(ConfigReader.getProperty("username"));
           ReusableMethods.waitFor(2);
    }

    @Given("Password field is filled")
    public void password_field() {
       loginPage.passwordField.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(2);
    }

    @Given("Click the login button")
    public void login_Button_click() {
        loginPage.loginButton.click();
        ReusableMethods.waitFor(5);
    }


    }



