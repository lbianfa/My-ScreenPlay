package co.com.bianfa.prueba.mia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login extends PageObject {

    public static final Target USERNAME = Target.the("usernameInput")
            .located(By.id("LoginPanel0_Username"));

    public static final Target PASSWORD = Target.the("passwordInput")
            .located(By.id("LoginPanel0_Password"));

    public static final Target LOGINBTN = Target.the("loginBtn")
            .located(By.id("LoginPanel0_LoginButton"));

}
