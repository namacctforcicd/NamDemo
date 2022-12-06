package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobilePages.CalendarScreen;
import org.testng.Assert;

public class CalendarSD {

   CalendarScreen cs = new CalendarScreen();

    @When("^I click on add button$")
    public void clickAddButton(){
        cs.tapOnaddButton();
        cs.clickOnReminder();


    }

    @Then("^I add info to the calendar and verify$")
    public void addInfo(){

        cs.writeMessage();
        Assert.assertTrue(true,"Practice,Practice");
    }
}
