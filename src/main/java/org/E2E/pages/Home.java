package org.E2E.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
    WebDriver driver;

    public Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(), 'Login')]")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='text-center']/h2")
    private WebElement featuredText;

    @FindBy(css = ".nav.navbar-nav")
    private WebElement navbar;

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void clickLogin() {
        loginButton.click();
    }

    public String getFeaturedText() {
        return featuredText.getText();
    }

    public boolean isDisplayed() {
        return navbar.isDisplayed();
    }
}
