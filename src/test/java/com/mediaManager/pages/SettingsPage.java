package com.mediaManager.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends BasePage {

    @FindBy(xpath ="//div[@class='div col-md-12']")
    public WebElement settingsTitle;
}
