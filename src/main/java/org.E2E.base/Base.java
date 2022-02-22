package org.E2E.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class  Base {
    private static Logger log = LogManager.getLogger(Base.class.getName());
    protected WebDriver driver;
    String url;

    @BeforeMethod
    public void setUP() throws IOException {
        Properties properties = new Properties();
        FileInputStream stream = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\data.properties");
        properties.load(stream);
        String browserName = properties.getProperty("browser");
        url = properties.getProperty("baseUrl");

        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        log.info("Driver is initialized");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(properties.getProperty("waitTime"))));
        driver.get(url);
        log.info("Navigated to home page");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
