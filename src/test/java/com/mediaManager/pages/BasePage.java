package com.mediaManager.pages;

import com.mediaManager.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

}