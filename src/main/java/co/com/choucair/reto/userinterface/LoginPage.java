package co.com.choucair.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://serenity.is/demo")
public class LoginPage extends PageObject {

    public static final Target USERNAME = Target.the("Campo Usuario").located(By.name("Username"));
    public static final Target PASSWORD = Target.the("Campo Clave").located(By.name("Password"));
    public static final Target SIGN_IN = Target.the("Boton Iniciar Sesion").located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));

    public static final Target MENSAJE_ERROR_AUTENTICACION = Target.the("Mensaje de Error al Iniciar Sesion").located(By.xpath("//div[@class='toast-message']"));
}
