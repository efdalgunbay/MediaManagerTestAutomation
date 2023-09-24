package com.mediaManager.step_definitions;

import com.mediaManager.pages.HomePage;
import com.mediaManager.pages.ProjectPage;
import com.mediaManager.pages.UsersPage;
import com.mediaManager.utilities.ConfigReader;
import com.mediaManager.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

import java.awt.image.RescaleOp;

public class ProjectStepDefinitions {
HomePage homePage=new HomePage();
ProjectPage projectPage=new ProjectPage();
UsersPage usersPage=new UsersPage();

    @Given("Click Project button")
    public void project_button() {
        ReusableMethods.waitFor(3);
        ReusableMethods.doubleClick(homePage.projectNavBar);
        ReusableMethods.waitFor(2);
    }

    @Given("Project page appears")
    public void project_Page_appears() {
        projectPage.projectPageTitle.isDisplayed();
        ReusableMethods.waitFor(3);

    }

    @Given("The project is searched in the Project Area")
    public void project_is_searched() {
        projectPage.projectNameField.sendKeys(ConfigReader.getProperty("project_name"));
        ReusableMethods.waitFor(3);
    }

    @Given("Click Open Task Button")
    public void clickOpenTask() {
        projectPage.openTask.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Click Add Task Button")
    public void clickAddTask() {
        projectPage.addTask.click();
        ReusableMethods.waitFor(2);
    }


    @Given("Click Blog Task Button")
    public void clickBlogTask() {
        projectPage.blogTask.click();
        ReusableMethods.waitFor(2);
    }
    @Given("Task Name is Entered")
    public void taskTitle() {
        projectPage.taskTitle.click();
        projectPage.taskTitle.sendKeys(ConfigReader.getProperty("task_title"));
        ReusableMethods.waitFor(2);
    }

    @Given("Services The field is filled")
    public void clickServices() {
        projectPage.services.click();
        ReusableMethods.waitFor(2);
        projectPage.translationButton.click();
        ReusableMethods.waitFor(2);
    }
    @Given("Product Area The field is filled")
    public void clickProductArea() {
    projectPage.productArea.click();
        ReusableMethods.waitFor(2);
        projectPage.productAreaCloud.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Product The field is filled")
    public void clickProduct() {
        projectPage.productType.click();
        ReusableMethods.waitFor(2);
        projectPage.productTypeOpenSource.click();
        ReusableMethods.waitFor(2);

    }

    @Given("Source URL The field is filled")
    public void sourceUrl() {
        projectPage.sourceUrl.sendKeys(ConfigReader.getProperty("source_url"));
        ReusableMethods.waitFor(2);
    }

    @Given("Task Assigned to a Person")
    public void taskAssigned() {
        ReusableMethods.scrollToElement(projectPage.taskRequstor);
        ReusableMethods.waitFor(2);
        projectPage.taskRequstor.click();
        ReusableMethods.waitFor(2);
        projectPage.taskRequstorFilter.click();
        ReusableMethods.waitFor(2);
        projectPage.taskRequstorFilter.sendKeys(ConfigReader.getProperty("task_requestor"));
        ReusableMethods.waitFor(2);
        projectPage.taskRequstorUser.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Click Save Button")
    public void clickSaveButton() {
        projectPage.taskRequstorSaveButton.click();
        ReusableMethods.waitFor(10);

    }

    @Given("New Blog Task Appears to be Saved")
    public void blogTaskAppears() {
        projectPage.newBlogTask.isDisplayed();
        ReusableMethods.waitFor(2);

    }

    @Given("Click on the program filter area")
    public void programFilterArea() {
        projectPage.programFilterfield.click();
        ReusableMethods.waitFor(2);

    }

    @Given("Archive Program Filter is Selected")
    public void filterisSelected() {
        projectPage.archivedButton.click();
        ReusableMethods.waitFor(2);

    }

    @Given("Archive Programs Are Seen Listed")
    public void programsAreSeenListed() {
        projectPage.archivedPrograms.isDisplayed();
        ReusableMethods.waitFor(2);

    }

    @Given("It is seen that the program name comes according to the entered keyword")
    public void accordingTheEnteredKeyword() {
        projectPage.automationProjectField.isDisplayed();
        ReusableMethods.waitFor(2);

    }


    @Given("Click on Ready to Start Task Status")
    public void clickonReadytoStart() {
        projectPage.readyToStartTaskFilter.click();
        ReusableMethods.waitFor(2);

    }


    @Given("Task Status Filter Area is Clicked")
    public void taskStatusFilterArea() {
       projectPage.taskStatusFilterField.click();
       ReusableMethods.waitFor(1);

    }

    @Given("It is seen that tasks that are Ready to Start are coming")
    public void readytoStartAreComing() {
        projectPage.readyToStartExistingTasks.isDisplayed();
        ReusableMethods.waitFor(1);
    }


    @Given("Click on the Start Date Filter Field")
    public void startDateFilterField() {
        projectPage.startDateFilterButton.click();
        ReusableMethods.waitFor(1);
    }

    @Given("Any Date Selected")
    public void anyDateSelected() {
        projectPage.previousMonthButton.click();
        ReusableMethods.waitFor(1);
        projectPage.theTwentyFirstMonth.click();
        ReusableMethods.waitFor(1);
    }

    @Given("It is seen that it is filtered according to the selected date")
    public void selectedDateVerify() {
        projectPage.startDateVerification.isDisplayed();
        ReusableMethods.waitFor(1);
    }

    @Given("On the project page click the Sort by name button")
    public void sortbynameButton() {

    }

    @Given("It can be seen that it is sorted by name on the project page")
    public void sortedbyNameontheProjectPage() {

    }

    @Given("On the project page click the Sort by status button")
    public void sortbyStatusbButton() {

    }

    @Given("It can be seen that it is sorted by status on the project page")
    public void sortedbyStatusontheProjectPage() {

    }

    @Given("On the project page click the Sort by Progress button")
    public void sortbyProgressButton() {

    }

    @Given("It can be seen that the project page is sorted by Progress")
    public void pageisSortedbyProgress() {

    }

    @Given("On the project page click the Sort by Total Cost button")
    public void sortbyTotalCostButton() {

    }

    @Given("On the project page it can be seen that it is sorted according to Total Cost")
    public void sortedAccordingtoTotalCost() {

    }

    @Given("On the project page click the Sort by Start Date button")
    public void sortbyStartDateButton() {

    }

    @Given("On the project page it can be seen that it is sorted by Start Date")
    public void sortedbyStartDate() {

    }


}
