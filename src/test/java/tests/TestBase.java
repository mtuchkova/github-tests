package tests;

import helpers.ElementsHelper;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class TestBase {

    public static WebDriver driver;
    public static ElementsHelper elementsHelper;
    public String testUrl = ("https://github.com/login");

    @BeforeGroups(alwaysRun = true, groups = {"git_test"})
    @Parameters("browser")
    public void setUp(Browsers browser) {


        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\tuchu\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
                ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
//                ChromeDriverManager.chromedriver().browserVersion("87.0.4280.66").setup();
//        System.setProperty("webdriver.chrome.driver", "C:\\gitPractice\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();



        elementsHelper = new ElementsHelper(driver);
        driver.get(testUrl);
        driver.manage().window().maximize();
    }

    @AfterGroups(alwaysRun = true, groups = {"git_test"})
    public void AfterTests() {

        driver.quit();
    }
}

