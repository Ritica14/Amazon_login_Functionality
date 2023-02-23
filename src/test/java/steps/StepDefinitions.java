package steps;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.Homepage;
import utils.BrowserManager;
import utils.QaProps;
import utils.TestDataReader;

import java.util.HashMap;



public class StepDefinitions{





    private WebDriver driver;
    Homepage homepage;
    Scenario scenario;
    String url;
    HashMap<String, String> data;

    public StepDefinitions(BrowserManager browserManager){
        this.driver = browserManager.getDriver();
    }


    @Given("user navigates in homepage")
    public void user_navigates_in_homepage() {
        url = QaProps.getValue("url");
        driver.get(url);
      //  System.out.println(1 / 0);

    }
    @When("user click on sign in button")
    public void user_click_on_sign_in_button() {
        homepage = new Homepage(driver);
        homepage.getSignInButton().click();

    }
    @Then("signIn page displayed")
    public void sign_in_page_displayed() {
        homepage.getSignInPage().isDisplayed();

    }

    @Given("user is in homepage")
    public void userIsInHomepage() {
        url = QaProps.getValue("url");
        driver.get(url);
      //  data = TestDataReader.getData("Verify the user is able to enter valid Username and click next");
    }

    @And("user click on signIn")
    public void userClickOnSignIn() {
        homepage = new Homepage(driver);
        homepage.getLoginButton().click();
        homepage.getLoginPage().isDisplayed();



    }

    @When("user enter valid username and click next")
    public void userEnterValidUsernameAndClickNext() {

        homepage.getUsername().sendKeys("7905897319");
        homepage.getUsername().sendKeys(Keys.ENTER);



    }

    @Then("password page displayed")
    public void passwordPageDisplayed() {
        homepage.getPasswordBox().isDisplayed();
    }
}
