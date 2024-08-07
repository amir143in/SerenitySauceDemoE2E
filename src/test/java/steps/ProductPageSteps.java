package steps;

import net.serenitybdd.annotations.Step;
import pages.ProductsPage;

public class ProductPageSteps {

    private ProductsPage productsPage;

    @Step
    public void validateOptionProduct() {
        productsPage.isProductOptionExist();
    }

    @Step
    public void addProducts(String productName){
        productsPage.addProductToCartByName(productName);

    }
    @Step
    public void clickCheckout(){
        productsPage.clickOnCheckOut();
    }


}
