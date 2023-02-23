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


}
