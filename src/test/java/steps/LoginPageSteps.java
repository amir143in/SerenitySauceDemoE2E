package steps;


import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import pages.LoginPage;

public class LoginPageSteps {
    private LoginPage loginPage;

    @Step
    public void isOnLoginPage(){
        loginPage.open();
    }

    @Step
    public void loginAsUser(String usuario, String clave){
        loginPage.doLogin( usuario, clave);
    }

    @Step
    public void userShouldBeLogin(){
        Assert.assertEquals("Swag Labs", loginPage.accountPageIsVisible());
    }


}
