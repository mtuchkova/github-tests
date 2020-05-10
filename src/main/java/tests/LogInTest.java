package tests;

import org.testng.annotations.BeforeClass;

public class LogInTest extends FirstTest {
    String login = "angelina.batayeva@gmail.com";
    String password = "Angryowl19752606";
    @BeforeClass
    public void logInPageTest() {
        elementsHelper.textInputField(loginPage.loginField, 10, login);
        elementsHelper.textInputField(loginPage.passwordField, 10, password);
        elementsHelper.clickOnVisibleAndClickableElement(loginPage.signInButton, 10);
    }
}



