package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;

import static java.time.temporal.ChronoUnit.SECONDS;

public class ProductsPage extends PageObject {

    @FindBy(css = "div[class='inventory_item']")
    private List<WebElement> cards;

    @FindBy(css = ".shopping_cart_link")
    private WebElement btnCheckout;

    public void isProductOptionExist(){
        shouldBeVisible(By.xpath(".title"));
    }
    public void addProductToCartByName(String productName) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOfAllElements(cards));
        System.out.println("Trying to add product: " + productName);

        for (WebElement card : cards) {
            String name = card.findElement(By.cssSelector("div a div")).getText();
            System.out.println("Found product: " + name);
            if (name.equalsIgnoreCase(productName)) {
                card.findElement(By.cssSelector(".btn_inventory")).click();
                System.out.println("Product added to cart: " + productName);
                break;
            }
        }
    }

    public void clickOnCheckOut(){
        btnCheckout.click();
      }

}
