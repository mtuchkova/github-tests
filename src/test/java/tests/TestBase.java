package tests;

import helpers.ElementsHelper;
import io.github.bonigarcia.wdm.*;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestBase {

    public  static WebDriver driver;
    public static ElementsHelper elementsHelper;
    public String testUrl = ("https://github.com/login");

    @BeforeGroups(alwaysRun = true,groups = {"git_test"})
    @Parameters("browser")
    public void setUp( Browsers browser) {
        switch (browser) {
            case CHROME:
                ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                 WebDriverManager.firefoxdriver().setup();
                 driver = new FirefoxDriver();
                 break;
            default:
                throw new RuntimeException("Invalid specified browser:" + browser + ",expected one of 'CHROME', 'FIREFOX', 'OPERA'");
        }
        elementsHelper = new ElementsHelper(driver);
        driver.get(testUrl);
        driver.manage().window().maximize();
    }

   @AfterGroups(alwaysRun = true,groups = {"git_test"})
    public void AfterTests() {

        driver.quit();
    }
}

