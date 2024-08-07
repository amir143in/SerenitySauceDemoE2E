package tests;


import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class BaseTest extends PageObject {
    @Managed(uniqueSession = true)
    protected WebDriver driver;

    @Before
    public void setup(){
        System.out.println("Setting up test environment...");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        // Clean up after test
        if (driver != null) {
            driver.quit();
        }

    }
}
