package com.mediaManager.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LanguageBundlesPage extends BasePage{

    @FindBy(xpath ="//h4[@class='card-title']")
    public WebElement languageBundlesTitle;

    @FindBy(xpath ="//input[@id='name']")
    public WebElement languageBundlesNameField;

    @FindBy(xpath ="(//i[@class='material-icons'])[2]")
    public WebElement languageBundlesFilterClearButton;

    @FindBy(xpath ="//td[contains(text(),' JZ Test ')]")
    public WebElement languageBundlesNameSearchingVerfy;


    @FindBy(xpath ="//input[@id='client']")
    public WebElement languageBundlesclientNameField;

    @FindBy(xpath ="//td[contains(text(),' Venga ')]")
    public WebElement languageBundlesClientNameSearchingVerfy;






}
