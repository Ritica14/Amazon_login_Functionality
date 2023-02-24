package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    private WebDriver driver;


    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public WebElement getSignInButton() {
        return SignInButton;
    }

    @FindBy(xpath = "//span[@id=\"nav-link-accountList-nav-line-1\"]")
    WebElement SignInButton;


    @FindBy(xpath = "//div[@id=\"a-page\"]")
    WebElement SignInPage;

    public WebElement getSignInPage() {
        return SignInPage;
    }

    @FindBy(xpath = "//span[@id=\"nav-link-accountList-nav-line-1\"]")
    WebElement LoginButton;

    public WebElement getLoginButton() {
        return LoginButton;
    }

    public WebElement getLoginPage() {
        return LoginPage;
    }

    @FindBy(xpath = "//div[@id=\"a-page\"]")
    WebElement LoginPage;


@FindBy(xpath = "//input[@id=\"ap_email\"]")
    WebElement username;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPasswordBox() {
        return passwordBox;
    }

    @FindBy(xpath = "//input[@id=\"ap_password\"]")
    WebElement passwordBox;

//    public WebElement getSearchResult() {
//        return SearchResult;
//    }
//
//    @FindBy(xpath = "label[@class=\"a-form-label\"]")
//    WebElement SearchResult;


    public WebElement getErrorPage() {
        return ErrorPage;
    }

    @FindBy(xpath = "i[@class=\"a-icon a-icon-alert\"]")
    WebElement ErrorPage;

//    public WebElement getSignInPage() {
//        return SignInPage;
//    }
//
//    @FindBy(xpath = "//input[@id=\"ap_email\"]")
//    WebElement SignInPage;

    public WebElement getUserName() {
        return UserName;
    }

    @FindBy(xpath = "//input[@id=\"ap_email\"]")
    WebElement UserName;

    @FindBy(xpath = "//input[@id=\"ap_email\"]")
    WebElement InvalidUser;

    public WebElement getInvalidUser() {
        return InvalidUser;
    }

    public WebElement getErrorBox() {
        return ErrorBox;
    }

    @FindBy(xpath = "div[@id=\"authportal-main-section\"]")
    WebElement ErrorBox;

    @FindBy(xpath = "//input[@id=\"ap_email\"]")
    WebElement emailBox;

    public WebElement getEmailBox() {
        return emailBox;
    }

    public WebElement getPassBox() {
        return passBox;
    }

    @FindBy(xpath = "//input[@id=\"ap_password\"]")
    WebElement passBox;

    public WebElement getSuccessfulMsg() {
        return successfulMsg;
    }

    @FindBy(xpath = "span[@id=\"nav-link-accountList-nav-line-1\"]")
    WebElement successfulMsg;

    @FindBy(xpath ="//input[@id=\"ap_email\"]")
    WebElement validName;

    public WebElement getValidName() {
        return validName;
    }

    public WebElement getInvalidPass() {
        return invalidPass;
    }

    @FindBy(xpath ="//input[@id=\"ap_password\"]")
    WebElement invalidPass;


}
