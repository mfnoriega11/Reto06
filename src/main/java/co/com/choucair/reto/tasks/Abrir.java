package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.LoginPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    LoginPage loginPage;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(loginPage)
        );
    }


    public static Abrir laPaginaPrincipal(){
        return Instrumented.instanceOf(Abrir.class).withProperties();
    }
}
