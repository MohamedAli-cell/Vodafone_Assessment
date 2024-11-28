package tests;

import Pages.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase extends AbstractTestNGCucumberTests {
    private static final Logger log = LoggerFactory.getLogger(TestBase.class);
    public static WebDriver driver;

    @BeforeSuite
    public void setUpDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://eshop.vodafone.com.eg/shop/home");
    }

    @AfterSuite
    public void closeDriver()
    {
        driver.quit();
    }

}
