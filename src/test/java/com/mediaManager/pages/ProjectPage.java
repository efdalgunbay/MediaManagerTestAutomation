package com.mediaManager.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends BasePage {

    @FindBy(xpath ="//div[contains(text(),' Programs ')]")
    public WebElement projectPageTitle;

    @FindBy(xpath ="//input[@name='projectName']")
    public WebElement projectNameField;

    @FindBy(xpath ="(//i[@class='material-icons'])[4]")
    public WebElement openTask;

    @FindBy(xpath ="//button[@mattooltip='Add Project']")
    public WebElement addTask;

    @FindBy(xpath ="//button[contains(text(),' Blog ')]")
    public WebElement blogTask;

    @FindBy(xpath ="//input[@id='taskTitle']")
    public WebElement taskTitle;

    @FindBy(xpath ="//input[@id='clientService']")
    public WebElement services;

    @FindBy(xpath ="(//span[@class='mat-option-text'])[1]")
    public WebElement translationButton;

    @FindBy(xpath ="//input[@formcontrolname='productArea']")
    public WebElement productArea;

    @FindBy(xpath ="(//span[@class='mat-option-text'])[1]")
    public WebElement productAreaCloud;

    @FindBy(xpath ="//input[@formcontrolname='productType']")
    public WebElement productType;

    @FindBy(xpath ="(//span[@class='mat-option-text'])[1]")
    public WebElement productTypeOpenSource;


    @FindBy(xpath ="//input[@id='yTLink']")
    public WebElement sourceUrl;

    @FindBy(xpath ="(//span[@class='mat-button-wrapper'])[157]")
    public WebElement taskRequstor;

    @FindBy(xpath ="//input[@id='filter']")
    public WebElement taskRequstorFilter;

    @FindBy(xpath ="(//p[@class='ext-usr'])[1]")
    public WebElement taskRequstorUser;

    @FindBy(xpath ="(//span[@class='mat-button-wrapper'])[158]")
    public WebElement taskRequstorSaveButton;

    @FindBy(xpath ="//td[contains(text(),'Test7-18Blog')]")
    public WebElement newBlogTask;

    @FindBy(xpath ="(//span[@class='mat-button-wrapper'])[5]")
    public WebElement programFilterfield;

    @FindBy(xpath ="//button[contains(text(),' Archived programs ')]")
    public WebElement archivedButton;

    @FindBy(xpath ="(//i[contains(text(),'unarchive')])[1]")
    public WebElement archivedPrograms;

    @FindBy(xpath ="//div[contains(text(),' Automation Project')]")
    public WebElement automationProjectField;

    @FindBy(xpath ="(//span[@class='mat-button-wrapper'])[4]")
    public WebElement taskStatusFilterField;

    @FindBy(xpath ="//button[contains(text(),' Ready to Start')]")
    public WebElement readyToStartTaskFilter;

    @FindBy(xpath ="//div[contains(text(),' Ready to Start')]")
    public WebElement readyToStartExistingTasks;

    @FindBy(xpath ="(//span[@class='mat-button-wrapper'])[6]")
    public WebElement startDateFilterButton;

    @FindBy(xpath ="//button[@aria-label='Previous month']")
    public WebElement  previousMonthButton;

    @FindBy(xpath ="//div[contains(text(),' 21 ')]")
    public WebElement  theTwentyFirstMonth;

    @FindBy(xpath ="//div[contains(text(),' Twitter Automation')]")
    public WebElement  startDateVerification;

    @FindBy(xpath ="(//div[contains(text(),'Name')])[1]")
    public WebElement  projectPageNameShorting;

    @FindBy(xpath ="(//div[contains(text(),' 10-7')])[1]")
    public WebElement  projectPageNameShortingVerify;

    @FindBy(xpath ="(//div[contains(text(),'Status')])[1]")
    public WebElement  projectPageNameStatusShorting;

    @FindBy(xpath ="(//div[contains(text(),' Ready to Start ')])[1]")
    public WebElement  projectPageNameStatusVerify;

    @FindBy(xpath ="(//div[contains(text(),'Progress')])[1]")
    public WebElement  projectPageProgressShorting;

    @FindBy(xpath ="(//mat-progress-bar[@mode='determinate'])[1]")
    public WebElement  projectPageProgressShortingVerify;

    @FindBy(xpath ="(//div[contains(text(),'Total Cost')])[1]")
    public WebElement  projectPageTotalCostShorting;

    @FindBy(xpath ="(//td[contains(text(),'$0.00')])[1]")
    public WebElement  projectPageTotalCostShortingVerify;

    @FindBy(xpath ="(//div[contains(text(),' Start Date')])[1]")
    public WebElement  projectPageStartDateShorting;

    @FindBy(xpath ="(//td[contains(text(),'24 Sep 2021 ')])[1]")
    public WebElement  projectPageStartDateShortingVerify;
}
