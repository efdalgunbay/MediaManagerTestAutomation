package com.mediaManager.pages;

import com.mediaManager.utilities.ConfigReader;
import com.mediaManager.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

@FindBy(xpath ="//div[@class='nsm7Bb-HzV7m-LgbsSe-Bz112c-haAclf']")
public WebElement gmailbutton;

    @FindBy(xpath ="//input[@formcontrolname='username']")
    public WebElement userNameField;

    @FindBy(xpath ="//input[@formcontrolname='password']")
    public WebElement passwordField;

    @FindBy(xpath ="//mat-icon[contains(text(),'login')]")
    public WebElement loginButton;



}

