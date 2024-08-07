package tests;

import com.fasterxml.jackson.databind.JsonNode;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.*;
import utils.JsonUtils;

import java.io.IOException;
import java.util.Arrays;

import static utils.JsonUtils.objectMapper;


@RunWith(SerenityRunner.class)
public class E2EComprarFlujoTest extends BaseTest {
    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    ProductPageSteps productPageSteps;

    @Steps
    CartPageSteps cartPageSteps;

    @Steps
    CheckoutInfoPageSteps checkoutInfoPageSteps;
    @Steps
    CheckoutOverviewSteps checkoutOverviewSteps;


    @Test
    public void validateCheckoutOverview() throws InterruptedException, IOException {
        JsonNode jsonData = JsonUtils.readJsonFromFile("data/testData.json");
        String username = jsonData.get("username").asText();
        String password = jsonData.get("password").asText();
        String[] products = objectMapper.convertValue(jsonData.get("products"), String[].class);

        // Use the data in your test
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Products: " + Arrays.toString(products));

        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsUser(username, password);

        for (String product : products) {
            productPageSteps.addProducts(product);
        }
        productPageSteps.clickCheckout();
        cartPageSteps.clickCheckout();
        checkoutInfoPageSteps.CheckoutInformation();

        checkoutOverviewSteps.validateItemTotal();
        checkoutOverviewSteps.validateTotal();
        checkoutOverviewSteps.clickFinish();
        checkoutOverviewSteps.verifySuccessMessage();
    }
}
