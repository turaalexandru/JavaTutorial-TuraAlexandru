package pages;

import helperMethods.AlertMethod;
import helperMethods.ElementMethod;
import helperMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {
    public WebDriver driver;
    public ElementMethod elementMethod;
    public PageMethods pageMethods;
    public AlertMethod alertMethod;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
        elementMethod = new ElementMethod(driver);
        pageMethods = new PageMethods(driver);
        alertMethod = new AlertMethod(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "alertButton")
    public WebElement clickButton;

    @FindBy(id = "confirmButton")
    public WebElement confirmButton;

    @FindBy(id = "promtButton")
    public WebElement promtButton;

    @FindBy(id = "timerAlertButton")
    public WebElement waitButton;

    public void interactclickButton () {
        pageMethods.scrollPage(0, 350);
        elementMethod.clickElement(clickButton);
        alertMethod.acceptAlert();
    }

    public void interactconfirmButton () {
        pageMethods.scrollPage(0, 350);
        elementMethod.clickElement(confirmButton);
        alertMethod.dismissAlert();
    }

    public void interactpromtButton (String text) {
        pageMethods.scrollPage(0, 350);
        elementMethod.clickElement(promtButton);
        alertMethod.fillAlert(text); //apelam alerta din method
    }

    public void interactwaitButton () {
        pageMethods.scrollPage(0, 350);
        elementMethod.clickElement(waitButton);
        alertMethod.acceptAlert(); //apelam alerta din method
    }



}
