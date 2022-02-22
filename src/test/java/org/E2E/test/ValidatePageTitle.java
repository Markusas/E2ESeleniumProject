package org.E2E.test;
import org.E2E.base.Base;
import org.E2E.pages.ForgotPassword;
import org.E2E.pages.Home;
import org.E2E.pages.Login;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidatePageTitle extends Base{
    private static Logger log = LogManager.getLogger(ValidatePageTitle.class.getName());
    Home home;
    Login login;

    @Test(dataProvider = "getData")
    public void quickTest(String email, String pass) {
        home = new Home(driver);
        login = new Login(driver);
        Assert.assertEquals(home.getPageTitle(), "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy", "Error");
        log.info("Successfully validated page title");
        home.clickLogin();
        login.getLogIn(email, pass);
        ForgotPassword fp = login.clickForgotPassButt();
        Assert.assertEquals(fp.getResetPassText(), "Reset Password", "Error");

    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[2][2];

        data[0][0] = "test@test.com";
        data[0][1] = "1234";

        data[1][0] = "aut@aut.com";
        data[1][1] = "4321";

        return data;
    }
}
