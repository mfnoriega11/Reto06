package co.com.choucair.reto.stepdefinitions;

import co.com.choucair.reto.model.Login;
import co.com.choucair.reto.model.Reunion;
import co.com.choucair.reto.model.UnidadDeNegocio;
import co.com.choucair.reto.questions.ObtenerMensaje;
import co.com.choucair.reto.tasks.Abrir;
import co.com.choucair.reto.tasks.CrearUnidad;
import co.com.choucair.reto.tasks.IniciarSesion;
import co.com.choucair.reto.tasks.Programar;
import co.com.choucair.reto.userinterface.LoginPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class RegistroUnidadDeNegocioStepDefinitions {

    private String actor = "Manuel";


    @Dado("^que entro a la pagina de Serenity Demo$")
    public void queEntroALaPaginaDeSerenityDemo() {
        theActorCalled(actor).wasAbleTo(Abrir.laPaginaPrincipal());
    }

    @Cuando("^inicio sesion con el usuario y clave incorrectas$")
    public void inicioSesionConElUsuarioYClaveIncorrectas(List<Login> conLosDatosDeAcceso) {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.enElAplicativo(conLosDatosDeAcceso)
        );
    }

    @Entonces("^no se inicia sesion y aparece el mensaje \"([^\"]*)\"$")
    public void noSeIniciaSesionYApareceElMensajeSomething(String mensajeEsperado) {
        theActorInTheSpotlight().should(
                seeThat(ObtenerMensaje.delObjeto(LoginPage.MENSAJE_ERROR_AUTENTICACION), equalTo(mensajeEsperado))
        );
    }


    @Dado("^que ingreso al sistema$")
    public void queIngresoAlSistema(List<Login> conLosDatosDeAcceso) {
        theActorCalled(actor).wasAbleTo(
                Abrir.laPaginaPrincipal()
        );
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.enElAplicativo(conLosDatosDeAcceso)
        );
    }

    @Cuando("^registra una nueva Unidad de negocio$")
    public void registraUnaNuevaUnidadDeNegocio(List<UnidadDeNegocio> unidadDeNegocio) {
        theActorInTheSpotlight().attemptsTo(
                CrearUnidad.deNegocio(unidadDeNegocio)
        );
    }

    @Y("^programa una reunion$")
    public void programaUnaReunion(List<Reunion> datosReunion) {
        theActorInTheSpotlight().attemptsTo(
                Programar.unaReunion(datosReunion)
        );
    }

    @Entonces("^la reunion se programa correctamente$")
    public void laReunionSeProgramaCorrectamente() {

    }

}
