package steps;

import net.serenitybdd.annotations.Step;
import pages.CartPage;

public class CartPageSteps {

    private CartPage cartPage;

    @Step
    public void validateOptionYourCart(){
        cartPage.isYourCartExist();
    }

    public void clickCheckout(){
        cartPage.doClickCheckout();
    }

}
