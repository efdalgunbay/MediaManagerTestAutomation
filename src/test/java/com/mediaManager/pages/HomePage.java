package com.mediaManager.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(xpath ="//p[contains(text(),'Total new tasks')]")
    public WebElement projectNavBar;

    @FindBy(xpath ="(//a[@class='nav-link'])[2]")
    public WebElement LanguageBundlesNavBar;

    @FindBy(xpath ="(//a[@class='nav-link'])[3]")
    public WebElement usersNavBar;

    @FindBy(xpath ="(//a[@class='nav-link'])[4]")
    public WebElement logsNavBar;

    @FindBy(xpath ="(//a[@class='nav-link'])[5]")
    public WebElement settingNavBar;


    @FindBy(xpath ="(//span[@class='mat-button-wrapper'])[5]")
    public WebElement contentTypeFilter;

    @FindBy(xpath ="(//div[@class='mat-list-text'])[2]")
    public WebElement adHocFilter;

    @FindBy(xpath ="//p[contains(text(),'Total new tasks')]")
    public WebElement contentTypeWrite;

    @FindBy(xpath ="(//span[@class='mat-button-wrapper'])[4]")
    public WebElement deadlineFilter;

    @FindBy(xpath ="//mat-select[@id='dateOption']")
    public WebElement selectDateOption;

    @FindBy(xpath ="//span[contains(text(),'Last month ')]")
    public WebElement lastMonthFilter;

    @FindBy(xpath ="//p[contains(text(),' Cloud')]")
    public WebElement productAreacloudFilter;

    @FindBy(xpath ="//p[contains(text(),' Android')]")
    public WebElement productandroidFilter;

    @FindBy(xpath ="//i[@class='material-icons']")
    public WebElement clearFilter;

    @FindBy(xpath ="(//span[@class='mat-button-wrapper'])[3]")
    public WebElement startDateFilter;

    @FindBy(xpath ="(//span[@class='mat-button-wrapper'])[6]")
    public WebElement productAreaFilter;

    @FindBy(xpath ="(//span[@class='mat-button-wrapper'])[7]")
    public WebElement productFilter;

    @FindBy(xpath ="//span[contains(text(),'Last 3 months')]")
    public WebElement selectDateOptionFilter;

    @FindBy(xpath ="(//span[@class='mat-option-text'])[1]")
    public WebElement deadlineLastSevenFilter;

    @FindBy(xpath ="//div[contains(text(),' MediaManager ')]")
    public WebElement mediaManagerNavBar;

}

