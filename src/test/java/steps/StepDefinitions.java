package steps;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Homepage;
import utils.BrowserManager;
import utils.QaProps;
import utils.TestDataReader;

import java.util.HashMap;



public class StepDefinitions {


    private WebDriver driver;
    Homepage homepage;
    Scenario scenario;
    String url;
    HashMap<String, String> data;

    public StepDefinitions(BrowserManager browserManager) {
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
        data = TestDataReader.getData("Verify the user is able to enter valid Username and click next");
    }

    @And("user click on signIn")
    public void userClickOnSignIn() {
        homepage = new Homepage(driver);
        homepage.getLoginButton().click();
        homepage.getLoginPage().isDisplayed();


    }

    @When("user enter valid username and click next")
    public void userEnterValidUsernameAndClickNext() {

        homepage.getUsername().sendKeys(data.get("TypeValue"));
        homepage.getUsername().sendKeys(Keys.ENTER);
//        String text = homepage.getSearchResult()
//                .getText();
//        Assert.assertEquals(text,"Password");


    }

    @Then("password page displayed")
    public void passwordPageDisplayed() {

        homepage.getPasswordBox().isDisplayed();

    }

    @When("user click on enter")
    public void userClickOnEnter() {
        // homepage.getSignInButton().click();
        //  homepage.getSignInPage().sendKeys(Keys.ENTER);
        homepage = new Homepage(driver);
        homepage.getUserName().sendKeys(Keys.ENTER);

    }

//    @Then("field {string} should be with error")
//    public void fieldEmailShouldBeWithError() {
//
//
//    }

    @Then("field email should be with error")
    public void fieldEmailShouldBeWithError() {
        homepage = new Homepage(driver);
        homepage.getUserName().isDisplayed();
    }

    @When("user enter Invalid username and click next")
    public void userEnterInvalidUsernameAndClickNext() {
        homepage = new Homepage(driver);
        data = TestDataReader.getData("User enter Invalid username and click next");
        homepage.getInvalidUser().sendKeys(data.get("TypeValue"));
        homepage.getInvalidUser().sendKeys(Keys.ENTER);

    }


    @Then("Error message appear")
    public void errorMessageAppear() {
        homepage.getInvalidUser().isDisplayed();

    }
//
//    @When("User type {string} in email")
//    public void userTypeInEmail(String) {
////        homepage = new Homepage(driver);
////        homepage.getEmailBox().sendKeys(username);
////        homepage.getEmailBox().sendKeys(Keys.ENTER);
//
//    }
//
//
//    @And("User type {string} in password")
//    public void userTypePsInPassword(String password) {
////        homepage.getPassBox().sendKeys(password);
//
//
//
//    }


    @And("User click on enter key")
    public void userClickOnEnterKey() {
        homepage.getPassBox().sendKeys(Keys.ENTER);

    }

    @Then("User logIn successfully in amazon")
    public void userLogInSuccessfullyInAmazon() {
//        homepage = new Homepage(driver);
//       String value = homepage.getSuccessfulMsg()
//                .getAttribute("value");
//        Assert.assertEquals(value,"Hello, Ritika");
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.in/"));

    }


    @When("User type {string} in email")
    public void userTypeInEmail(String arg0) {
        homepage = new Homepage(driver);
        homepage.getEmailBox().sendKeys(arg0);
      homepage.getEmailBox().sendKeys(Keys.ENTER);

    }

    @And("User type {string} in password")
    public void userTypeInPassword(String arg0) {
        homepage.getPassBox().sendKeys( arg0);
    }


    @When("user enter valid username")
    public void userEnterValidUsername() {
        homepage = new Homepage(driver);
       data = TestDataReader.getData("User enter Valid username and Invalid password");
        homepage.getValidName().sendKeys(data.get("TypeValue"));
        homepage.getValidName().sendKeys(Keys.ENTER);
    }

    @And("user enter Invalid password")
    public void userEnterInvalidPassword() {
        homepage.getInvalidPass().sendKeys(data.get("Pass"));
        homepage.getInvalidPass().sendKeys(Keys.ENTER);
    }

    @Then("Error Box popUp")
    public void errorBoxPopUp() {
        homepage.getInvalidPass().isDisplayed();
    }
}