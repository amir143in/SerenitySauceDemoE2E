package steps;

import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import pages.CheckoutOverviewPage;

import java.util.List;

public class CheckoutOverviewSteps {

    private CheckoutOverviewPage checkoutOverviewPage;

    @Step
    public void validateItemTotal() {
        List<Double> productPrices = checkoutOverviewPage.getProductPrices();
        double expectedItemTotal = productPrices.stream().mapToDouble(Double::doubleValue).sum();
        double actualItemTotal = checkoutOverviewPage.getItemTotal();
        Assert.assertEquals("Item total should match the sum of product prices", expectedItemTotal, actualItemTotal, 0.01);
    }

    @Step
    public void validateTotal() {
        double itemTotal = checkoutOverviewPage.getItemTotal();
        double tax = checkoutOverviewPage.getTax();
        double expectedTotal = itemTotal + tax;
        double actualTotal = checkoutOverviewPage.getTotal();
        Assert.assertEquals("Total should be equal to item total plus tax", expectedTotal, actualTotal, 0.01);
    }

    @Step
    public void clickFinish(){
        checkoutOverviewPage.doClickFinish();
    }

    @Step("Verify the success message is displayed")
    public void verifySuccessMessage() {
        String expectedMessage = "Thank you for your order!";
        String actualMessage = checkoutOverviewPage.getSuccessMessage();
        Assert.assertEquals(expectedMessage,actualMessage );
    }
}
