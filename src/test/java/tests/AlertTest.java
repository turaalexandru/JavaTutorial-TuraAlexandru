package tests;

import helperMethods.AlertMethod;
import helperMethods.ElementMethod;
import helperMethods.PageMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.AlertWindowsPage;
import pages.HomePage;

import java.time.Duration;

public class AlertTest {

    public WebDriver driver;

    @Test
    public void AlertTest() {

        //Deschidem un browser
        driver = new ChromeDriver();

        //deschidem un anumit URL
        driver.get("https://demoqa.com");

        //Facem browserul in mod maximize

        driver.manage().window().maximize();

        //definim un obiect de tip alert methods ca sa apelam metodele din clasa
        AlertMethod alertMethod = new AlertMethod(driver);
        ElementMethod elementMethod = new ElementMethod(driver);
        PageMethods pageMethods = new PageMethods(driver);
        HomePage homePage = new HomePage(driver);
        AlertWindowsPage  alertWindowsPage = new AlertWindowsPage(driver);


        //wait implicit - va astepta reactia din partea driverului
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //interactionam cu meniul/submeniul

        homePage.navigateToAlertMenu();
        alertWindowsPage.navigateToAlertsOptionMeniu();


        //interactionam cu un alertButton

        AlertPage alertPage = new AlertPage(driver);
        alertPage.interactclickButton();
        alertPage.interactclickButton();

        //Alert alertButton = driver.switchTo().alert();
        //System.out.println(alertButton.getText());
        //alertButton.accept();

        //interactionam cu un confirmButton-dimiss
        alertPage.interactconfirmButton();


        //Alert alertconfirmButton = driver.switchTo().alert();
        //System.out.println(alertconfirmButton.getText());
        //alertconfirmButton.dismiss();

        //interactionam cu un promtButton
        alertPage.interactpromtButton("Alejandro");

        //Alert alertpromtButton = driver.switchTo().alert();
         //System.out.println(alertpromtButton.getText());
        //String alertpromtValue = "Aljandro";
        //alertpromtButton.sendKeys(alertpromtValue);
        //alertpromtButton.accept();

        //interactionam cu o alerta cu care trebuie sa asteptam putin
        alertPage.interactwaitButton();

        //definim un wait explicit
        //WebDriverWait alertDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //alertDriverWait.until(ExpectedConditions.alertIsPresent());

        //Alert alertwaitButton = driver.switchTo().alert();
        //System.out.println(alertwaitButton.getText());
        //alertwaitButton.dismiss();

        // Închidem driver-ul
        driver.quit();

    }
}
