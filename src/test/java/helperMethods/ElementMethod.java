package helperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementMethod {
    //Constructor
    public WebDriver driver;

    public ElementMethod(WebDriver driver) {
        this.driver = driver;
    }

    //metode generale pentru interactiunea cu elemente


    //adaugam un element pentru a astepta pana la 10 secunde
    public void waitForElementVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Increase wait time to 20 seconds
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    //adaugam un element pentru a da click
    public void clickElement(WebElement element) {

        waitForElementVisible(element);
        element.click();
    }

    public void fillElement(WebElement element, String text) {
        waitForElementVisible(element);
        element.sendKeys(text);
    }

    public void clearFillElement(WebElement element, String text) {
        waitForElementVisible(element);
        element.clear();
        element.sendKeys(text);
    }

    public void pressElement(WebElement element, Keys key) {
        waitForElementVisible(element);
        element.sendKeys(key);
    }


    public void clickJSElement(WebElement element) {
        waitForElementVisible(element);
        JavascriptExecutor jsClick = (JavascriptExecutor) driver;
        jsClick.executeScript("arguments[0].click();", element);
    }

    public void selectByTextElement(WebElement element, String text) {
        waitForElementVisible(element);
        Select monthSelect = new Select(element);
        monthSelect.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element, String text) {
        waitForElementVisible(element);
        Select monthSelect = new Select(element);
        monthSelect.selectByVisibleText(text);
    }

    public void clearFill(WebElement element, String text) {
        waitForElementVisible(element);
        element.clear();
        element.sendKeys(text);
    }
}
