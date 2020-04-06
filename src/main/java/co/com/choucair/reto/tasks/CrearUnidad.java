package co.com.choucair.reto.tasks;

import co.com.choucair.reto.model.UnidadDeNegocio;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.reto.userinterface.OrganizacionPage.*;

public class CrearUnidad implements Task {

    UnidadDeNegocio unidadDeNegocio;

    public CrearUnidad(UnidadDeNegocio unidadDeNegocio) {
        this.unidadDeNegocio = unidadDeNegocio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_ORGANIZACION),
                Click.on(LINK_UNIDADES_DE_NEGOCIO),
                Click.on(BOTON_NUEVA_UNIDAD_DE_NEGOCIO),
                Enter.theValue(unidadDeNegocio.getNombre()).into(CAMPO_NOMBRE),
                Click.on(Boton_Guardar)
        );
    }


    public static CrearUnidad deNegocio(List<UnidadDeNegocio> unidadDeNegocio) {
        return Instrumented.instanceOf(CrearUnidad.class).withProperties(unidadDeNegocio.get(0));
    }
}
