package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {

    @FindBy(css = "#checkout")
    private WebElement btnCheckout;

    @FindBy(css = ".title")
    private WebElement txtYourCart;

    public void isYourCartExist(){
        shouldBeVisible(txtYourCart);
    }

    public void doClickCheckout(){
        btnCheckout.click();
    }






}
