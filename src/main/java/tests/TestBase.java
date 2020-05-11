package tests;

import helpers.ElementsHelper;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.OperaDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;

public class TestBase {

    WebDriver driver;
    ElementsHelper elementsHelper;
    public String testUrl = ("https://github.com/login");

    @BeforeGroups(groups = "gittest")
    @Parameters(value = "browser")
    public void setUp(Browsers browser) {
        switch (browser) {
            case CHROME:
                ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case OPERA:
                OperaDriverManager.getInstance(DriverManagerType.OPERA).setup();
                driver = new OperaDriver();
                break;
            default:
                throw new RuntimeException("Invalid specified browser:" + browser + ",expected one of 'CHROME', 'FIREFOX', 'OPERA'");
        }
        elementsHelper = new ElementsHelper(driver);
        driver.get(testUrl);
        driver.manage().window().maximize();
    }
    @AfterGroups(groups = "gittest")
    public void AfterTests() {

        driver.quit();
    }
}

