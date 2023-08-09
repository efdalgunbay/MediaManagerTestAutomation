package com.mediaManager.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LanguageBundlesPage extends BasePage{

    @FindBy(xpath ="//h4[@class='card-title']")
    public WebElement languageBundlesTitle;
}
