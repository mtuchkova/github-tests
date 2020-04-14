import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;



public class FirstTest {

    WebDriver driver;

    @Test(priority = 1)
    public void openPage() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test(priority = 2)
    public void secondTest() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.get("https://github.com/session");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("[id='login_field']")).sendKeys("angelina.batayeva@gmail.com");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("Angryowl19752606");
        driver.findElement(By.cssSelector("[value='Sign in']")).click();
        driver.quit();


    }
}

