package org.E2E.test;

import org.E2E.base.Base;
import org.E2E.pages.Home;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateFeaturedTextHomePage extends Base {
    private static Logger log = LogManager.getLogger(ValidateFeaturedTextHomePage.class.getName());
    Home home;

    @Test
    public void testText() {
        home = new Home(driver);
        Assert.assertEquals(home.getFeaturedText(), "FEATURED COURSES");
        log.info("Cheking text");
    }
}
