package tests;


import helperMethods.ElementMethod;
import helperMethods.PageMethods;
import helperMethods.WindowMethod;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablePage;
import sharedData.SharedData;

public class WebTableTest extends SharedData {


    @Test
    public void metodaTest() {


        //definim un obiect de tipul window method
        WindowMethod windowMethod = new WindowMethod(driver);
        //definim un obiect de tipul element method
        ElementMethod elementMethod = new ElementMethod(driver);
        //definim un obiect de tipul page method
        PageMethods pageMethods = new PageMethods(driver);

        //facem un scroll la pagina pentru vizibilitate
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,350)", "");
        pageMethods.scrollPage(0, 350);

        //interactionam cu meniul/submeniul
        HomePage homePage1 = new HomePage(driver);
        homePage1.navigateToElementsMenu();

        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.navigateToWebtableMeniu();

        //definim un element dupa id
        //test 1: adaug un entry
        WebTablePage webTablePage = new WebTablePage(driver);
        webTablePage.addEntry("Alex", "Alejandros", "exemple@exemple.com", "30",
                "300000", "ShaormaTester");


        //test2: modific un entry existent
        webTablePage.editEntry("Dania Tester");

        //dam un click la id-ul de delete
        webTablePage.deleteEntry();
    }
}
