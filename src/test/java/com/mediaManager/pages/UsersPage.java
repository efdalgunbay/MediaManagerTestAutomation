package com.mediaManager.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage {

    @FindBy(xpath ="//h4[contains(text(),'Users')]")
    public WebElement usersTitle;
}
