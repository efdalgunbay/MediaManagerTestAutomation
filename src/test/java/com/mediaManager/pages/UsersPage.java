package com.mediaManager.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage extends BasePage {

    @FindBy(xpath ="//h4[contains(text(),'Users')]")
    public WebElement usersTitle;


    @FindBy(xpath ="//div[@id='mat-select-value-5']")
    public WebElement statusFilterField;

    @FindBy(xpath ="(//span[@class='mat-option-text'])[1]")
    public WebElement statusFilterActive;

    @FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
    public WebElement statusFilterInactive;

    @FindBy(xpath ="(//i[@class='material-icons'])[1]")
    public WebElement usersFilterClearButton;

    @FindBy(xpath ="(//td[contains(text(),' Active ')])[1]")
    public WebElement clearFiltreVerify;


    @FindBy(xpath ="//td[contains(text(),' michael ')]")
    public WebElement nameSearcingVerifyUserPage;

    @FindBy(xpath ="//td[contains(text(),' New client ')]")
    public WebElement UsersClientNameSearchingVerfy;

    @FindBy(xpath ="//div[@id='mat-select-value-3']")
    public WebElement userPageRole;

    @FindBy(xpath =" (//span[@class='mat-option-text'])[2]")
    public WebElement userPageRolePM;

    @FindBy(xpath ="(//div[contains(text(),' Name ')])[1]")
    public WebElement nameShortingButton;

    @FindBy(xpath ="(//div[contains(text(),' Client ')])[1]")
    public WebElement clientShortingButton;

    @FindBy(xpath ="(//td[contains(text(),' Google ')])[1]")
    public WebElement clientShortingverfiy;

    @FindBy(xpath ="//td[contains(text(),' Accura-newuser ')]")
    public WebElement nameShortingverfiy;





}
