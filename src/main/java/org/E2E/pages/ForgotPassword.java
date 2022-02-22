package org.E2E.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
    WebDriver driver;

    public ForgotPassword(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='main-hero']//h1")
    private WebElement resetPassText;

    public String getResetPassText() {
        return resetPassText.getText();
    }


}
