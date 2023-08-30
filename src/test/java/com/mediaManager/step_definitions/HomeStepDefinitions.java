package com.mediaManager.step_definitions;

import com.mediaManager.pages.HomePage;
import com.mediaManager.pages.LoginPage;
import com.mediaManager.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

public class HomeStepDefinitions {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();

    @Given("Home page appears")
    public void home_page_appears() {
        homePage.LanguageBundlesNavBar.isDisplayed();
        ReusableMethods.waitFor(3);
    }

    @Given("Click on Content Type")
    public void clickOnContentType() {
        homePage.contentTypeFilter.click();
        ReusableMethods.waitFor(3);
    }

    @Given("Click on Content Type Write")
    public void clickOnContentTypeWrite() {
        ReusableMethods.waitFor(3);
        ReusableMethods.doubleClick(homePage.contentTypeWrite);
        ReusableMethods.waitFor(3);
    }

    @Given("Ad-hoc selected")
    public void adHocSelect() {
        homePage.adHocFilter.click();
        ReusableMethods.waitFor(2);
    }

    @Given("It is seen that filtering is done in Ad-hoc type")
    public void adHocFilitreType() {

    }

    @Given("Click on the start date filter field")
    public void startDateFilterField() {
        homePage.startDateFilter.click();
        ReusableMethods.waitFor(2);

    }

    @Given("Click on Start Date Option Field")
    public void startDateOptionField() {
        homePage.selectDateOptionFilter.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Click Last Month")
    public void clickLastMonth() {
        homePage.lastMonthFilter.click();
        ReusableMethods.waitFor(2);
    }


    @Given("Click on the deadline filter field")
    public void deadlineFilterField() {
        homePage.deadlineFilter.click();
        ReusableMethods.waitFor(2);

    }

    @Given("Select Date Option Field Clicked")
    public void selectDateOptionField() {
        homePage.selectDateOption.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Last 7 Days Click")
    public void lastDayClick() {
        homePage.deadlineLastSevenFilter.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Click on the Product Area filter field")
    public void productAreaFilterField() {
        homePage.productAreaFilter.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Cloud filter is selected")
    public void cloudFilteRisSelected() {
        homePage.productAreacloudFilter.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Click on the Product filter field")
    public void productFilterField() {
        homePage.productFilter.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Android filter is selected")
    public void androidFilterisSelected() {
        homePage.productandroidFilter.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Click on Clean Filter Button")
    public void clearFilterButton() {
        homePage.clearFilter.click();
        ReusableMethods.waitFor(2);
    }

}
