package steps;

import net.serenitybdd.annotations.Step;
import pages.CheckoutInfoPage;

public class CheckoutInfoPageSteps {

    private CheckoutInfoPage checkoutInfoPage;

    @Step
    public void CheckoutInformation(){
        checkoutInfoPage.enterCheckoutInformation();
    }
}
