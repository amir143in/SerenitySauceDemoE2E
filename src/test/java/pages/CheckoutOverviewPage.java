package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutOverviewPage extends PageObject {

    @FindBy(css = ".inventory_item_price")
    private List<WebElement> productPrices;

    @FindBy(css = ".summary_subtotal_label")
    private WebElement itemTotal;

    @FindBy(css = ".summary_tax_label")
    private WebElement tax;

    @FindBy(css = ".summary_total_label")
    private WebElement total;

    @FindBy(css = "#finish")
    private  WebElement finishButton;

    @FindBy(css = ".complete-header")
    private WebElement successMessage;


    public List<Double> getProductPrices() {
        return productPrices.stream()
                .map(element -> Double.parseDouble(element.getText().replace("$", "")))
                .toList();
    }

    public double getItemTotal() {
        return Double.parseDouble(itemTotal.getText().replace("Item total: $", ""));
    }

    public double getTax() {
        return Double.parseDouble(tax.getText().replace("Tax: $", ""));
    }

    public double getTotal() {
        return Double.parseDouble(total.getText().replace("Total: $", ""));
    }

    public void doClickFinish(){
        finishButton.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }


}
