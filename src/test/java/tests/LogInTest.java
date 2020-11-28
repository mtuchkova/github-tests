package tests;

import helpers.ElementsHelper;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LogInTest extends TestBase {
    LoginPage loginPage = new LoginPage();



    @Test(groups = {"git_test"})
    public void logInPageTest() {
        elementsHelper.textInputField(loginPage.loginField, 10, "angelina.batayeva@gmail.com");
        elementsHelper.textInputField(loginPage.passwordField, 10, "Angryowl19752606");
        elementsHelper.clickOnVisibleAndClickableElement(loginPage.signInButton, 10);
    }
}



