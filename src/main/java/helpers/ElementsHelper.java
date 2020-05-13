package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ElementsHelper {

    private WebDriver driver;

    public ElementsHelper(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresent(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(timeout));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
            return true;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not present: " + element, e);
        }
    }

    public boolean isElementVisible(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not visible: " + element, e);
        }
    }

    public boolean isElementClickable (By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        }
        catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not clickable:" + element, e);
        }
    }

    public void clickOnVisibleAndClickableElement (By element,int timeout) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            driver.findElement(element).click();
        }
        catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not visible or not clickable within timeout:" + element + "Time" + timeout, e);
        }
    }

    public String getElementTextVisibilityOf(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return driver.findElement(element).getText();

        } catch (NoSuchElementException e) {
            throw new RuntimeException("Does not see the text of the element within timeout:" + element + "Time" + timeout, e);
        }
    }

    public void textInputField(By inputFieldElement, int timeout, String inputText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(inputFieldElement));
            driver.findElement(inputFieldElement).sendKeys(inputText);
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Text input field is not present:" + inputFieldElement + "Time" + timeout, e);
        }
    }
}