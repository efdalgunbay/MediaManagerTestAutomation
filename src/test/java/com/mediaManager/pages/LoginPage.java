package com.mediaManager.pages;

import com.mediaManager.utilities.ConfigReader;
import com.mediaManager.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

@FindBy(xpath ="//div[@class='nsm7Bb-HzV7m-LgbsSe-Bz112c-haAclf']")
public WebElement gmailbutton;

    @FindBy(xpath ="//input[@class='form-control cstm-input ng-pristine ng-invalid ng-touched']")
    public WebElement userNameField;

    @FindBy(xpath ="//input[@class='form-control cstm-input ng-untouched ng-pristine ng-invalid']")
    public WebElement passwordField;

    @FindBy(xpath ="//button[@class='btn btn-primary lgn-btn']")
    public WebElement loginButton;



}

