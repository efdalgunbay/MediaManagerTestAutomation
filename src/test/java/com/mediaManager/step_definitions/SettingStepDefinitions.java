package com.mediaManager.step_definitions;

import com.mediaManager.pages.HomePage;
import com.mediaManager.pages.SettingsPage;
import com.mediaManager.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

public class SettingStepDefinitions {

    HomePage homePage=new HomePage();
    SettingsPage settingsPage=new SettingsPage();

    @Given("Click Setting button")
    public void setting_button() {
        homePage.settingNavBar.click();
        ReusableMethods.waitFor(3);
    }

    @Given("Setting page appears")
    public void setting_page_appears() {
        settingsPage.settingsTitle.isDisplayed();
        ReusableMethods.waitFor(2);


    }
}
