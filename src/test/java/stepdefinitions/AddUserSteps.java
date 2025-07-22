package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AddUser;
import utils.DriverFactory;

public class AddUserSteps {

    WebDriver driver = DriverFactory.getDriver();
    AddUser addUser = new AddUser(driver);

    @Given("the user open the browser")
    public void user_opens_browser() {
       driver.get("https://mini-dashboard-rahul.netlify.app/");
    }

    @When("the user is on page \"Add User Data\"")
    public void user_is_on_add_user_page() {
        addUser.clickSidebarItem();
    }

    @When("the user fill the data in form")
    public void user_enters_all_fields() {
        addUser.enterusername("rahul");
        addUser.enterorder("5");
        addUser.enterrevenue("1000");
    }

    @When("then click on Submit Button")
    public void user_clicks_submit() {
        addUser.clicksubmit();
    }

    @Then("User should see a success message")
    public void user_should_see_success_message() {
        String alertText = addUser.getSuccessAlertText();
        Assert.assertEquals("Success message does not match", "User created!", alertText);
    }
}
