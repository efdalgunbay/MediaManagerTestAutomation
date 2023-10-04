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

    @FindBy(xpath ="//mat-icon[contains(text(),'playlist_add')]")
    public WebElement addNewLanguage;


    @FindBy(xpath ="(//button[@aria-haspopup='menu'])[4]")
    public WebElement addNewLanguageSelection;

    @FindBy(xpath ="//span[contains(text(),'English (American)')]")
    public WebElement LanguageEnglish;

    @FindBy(xpath ="//p[@class='lng-prgress-title']")
    public WebElement languagetitle;

    @FindBy(xpath ="(//input[@id='name'])[2]")
    public WebElement newLanguageBundlesNameField;


    @FindBy(xpath ="//button[@type='submit']")
    public WebElement addNewLanguageSaveButton;

    @FindBy(xpath ="//h2[@id='swal2-title']")
    public WebElement addNewLanguageSuccessTitle;

    @FindBy(xpath ="(//input[@id='client'])[2]")
    public WebElement newLanguageBundlesclientNameField;












}
