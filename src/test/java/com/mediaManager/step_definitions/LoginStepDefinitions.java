package com.mediaManager.step_definitions;

import com.mediaManager.pages.LoginPage;
import com.mediaManager.utilities.ReusableMethods;
import io.cucumber.java.en.Given;


public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();

        @Given("Gmail Button Click")
    public void gmail_button_click() {
            loginPage.gmailbutton.click();
            ReusableMethods.waitFor(2);
    }


    }



