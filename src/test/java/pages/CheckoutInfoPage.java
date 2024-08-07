package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutInfoPage extends PageObject {

    @FindBy(css = "#first-name")
    private WebElement firstname;

    @FindBy(css = "#last-name")
    private WebElement lastname;

    @FindBy(css = "#postal-code")
    private WebElement postalCode;

    @FindBy(css = "#continue")
    private WebElement btnContinue;

    public void enterCheckoutInformation (){
        firstname.sendKeys("Testing");
        lastname.sendKeys("Pruebas");
        postalCode.sendKeys("123324");
        btnContinue.click();

    }









}
