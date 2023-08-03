package com.mediaManager.pages;

import com.mediaManager.utilities.ConfigReader;
import com.mediaManager.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

@FindBy(xpath ="//div[@class='nsm7Bb-HzV7m-LgbsSe-Bz112c-haAclf']")
public WebElement gmailbutton;

    @FindBy(xpath ="(//div[@class='fFW7wc-ibnC6b-K4efff'])[1]")
    public WebElement gmailbuttonAccountButton;




}

