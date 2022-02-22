package org.E2E.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user_email")
    private WebElement emailAddress;

    @FindBy(id = "user_password")
    private WebElement password;

    @FindBy(name = "commit")
    private WebElement loginInButton;

    @FindBy(className = "link-below-button")
    private WebElement forgotPassButt;

    public void getLogIn(String email, String pass) {
        emailAddress.sendKeys(email);
        password.sendKeys(pass);
        loginInButton.click();
    }

    public ForgotPassword clickForgotPassButt() {
        ForgotPassword forgotPassword = new ForgotPassword(driver);
        forgotPassButt.click();
        return forgotPassword;
    }
}
