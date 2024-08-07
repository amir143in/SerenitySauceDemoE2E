package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(id = ".app_logo")
    private WebElement appLogo;
    public void doLogin(String usuario, String clave) {
        username.sendKeys(usuario);
        password.sendKeys(clave);
        loginButton.submit();
    }

    public String accountPageIsVisible() {
        return appLogo.getText();
    }
}
