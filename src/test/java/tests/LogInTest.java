package tests;

import helpers.ElementsHelper;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LogInTest extends TestBase {
    LoginPage loginPage = new LoginPage();



    @Test(groups = {"git_test"})
    public void logInPageTest() {
        System.out.println("--------------------------------");
        elementsHelper.textInputField(loginPage.loginField, 10, "tuchusya@gmail.com");
        elementsHelper.textInputField(loginPage.passwordField, 10, "6a7b8c6a7b8c");
        elementsHelper.clickOnVisibleAndClickableElement(loginPage.signInButton, 10);
    }
}



