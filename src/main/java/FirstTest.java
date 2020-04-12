import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.*;

public class FirstTest   {

    WebDriver driver;

    @Test
    public void openPage () {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void secondTest () {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.get("https://github.com/session");
        driver.manage().window().maximize();
        By login = cssSelector("[id='login_field']");
        driver.findElement(login);
        driver.quit();

    }

    @Test
    public void thirdTest () {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.get("https://github.com/session");
        driver.manage().window().maximize();
        By password = By.cssSelector("[id='password']");
        driver.findElement(password);
        driver.quit();

    }
}

