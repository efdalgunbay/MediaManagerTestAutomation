package com.mediaManager.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage extends BasePage {

    @FindBy(xpath ="//h4[contains(text(),'Users')]")
    public WebElement usersTitle;


    @FindBy(xpath ="//div[@id='mat-select-value-25']")
    public WebElement statusFilterField;

    @FindBy(xpath ="(//span[@class='mat-option-text'])[1]")
    public WebElement statusFilterActive;

    @FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
    public WebElement statusFilterInactive;

    @FindBy(xpath ="(//i[@class='material-icons'])[1]")
    public WebElement usersFilterClearButton;

    @FindBy(xpath ="(//td[contains(text(),' Active ')])[1]")
    public WebElement clearFiltreVerify;
}
