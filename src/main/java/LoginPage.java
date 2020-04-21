import org.openqa.selenium.By;

public class LoginPage {
    public By loginField = By.cssSelector("[id='login_field']");
    public By passwordField = By.cssSelector("[id='password']");
    public By signInButton = By.cssSelector("[name='commit']");
    public By signOutButton = (By.cssSelector("[data-ga-click='Header, sign out, icon:logout']"));

}
