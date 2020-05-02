import Pages.HeaderTabs;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.OperaDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.*;


public class TestBase {
    WebDriver driver;
    ElementsHelper elementsHelper;
    public String testUrl = ("https://github.com/session");
    LoginPage loginPage = new LoginPage();
    HeaderTabs headerTabs = new HeaderTabs();
    NewRepository newRepository = new NewRepository();
    ImportRepository importRepository = new ImportRepository();
    NewGist newGist = new NewGist();
    NewOrganization newOrganization = new NewOrganization();
    NewProject newProject = new NewProject();

    @BeforeClass
    @Parameters("browser")
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

    @AfterClass
    public void AfterTests() {
        driver.quit();
    }
}

