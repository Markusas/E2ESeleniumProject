package org.E2E.test;

import org.E2E.base.Base;
import org.E2E.pages.Home;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ValidateNavbar extends Base {
    private static Logger log = LogManager.getLogger(ValidateNavbar.class.getName());
    Home home;

    @Test
    public void testNavbar() {
        home = new Home(driver);
        Assert.assertTrue(home.isDisplayed());
        log.info("Is displayed");
    }
}
