package co.com.choucair.reto.tasks;

import co.com.choucair.reto.model.Login;
import co.com.choucair.reto.userinterface.LoginPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.reto.userinterface.LoginPage.*;

import java.util.List;

public class IniciarSesion implements Task {

    Login datosDeAcceso;

    public IniciarSesion(List<Login> datosDeAcceso) {
        this.datosDeAcceso = datosDeAcceso.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosDeAcceso.getUsuario()).into(USERNAME),
                Enter.theValue(datosDeAcceso.getClave()).into(PASSWORD),
                Click.on(SIGN_IN)
        );
    }

    public static IniciarSesion enElAplicativo(List<Login> datosDeAcceso){
        return Instrumented.instanceOf(IniciarSesion.class).withProperties(datosDeAcceso);
    }
}
