package com.mediaManager.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends BasePage {

    @FindBy(xpath ="//div[contains(text(),' Projects')]")
    public WebElement projectPageTitle;


}
