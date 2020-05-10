package pages;
import org.openqa.selenium.By;

public class LoginPage {
    public By loginField = By.cssSelector("[id='login_field']");
    public By passwordField = By.cssSelector("[id='password']");
    public By signInButton = By.cssSelector("[name='commit']");
}
