package com.mediaManager.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {


    @FindBy(xpath ="(//a[@class='nav-link'])[1]")
    public WebElement projectNavBar;

    @FindBy(xpath ="(//a[@class='nav-link'])[2]")
    public WebElement LanguageBundlesNavBar;

    @FindBy(xpath ="(//a[@class='nav-link'])[3]")
    public WebElement usersNavBar;

    @FindBy(xpath ="(//a[@class='nav-link'])[4]")
    public WebElement logsNavBar;

    @FindBy(xpath ="(//a[@class='nav-link'])[5]")
    public WebElement settingNavBar;

}
