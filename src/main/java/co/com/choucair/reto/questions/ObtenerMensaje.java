package co.com.choucair.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;


public class ObtenerMensaje implements Question<String> {

    private Target objeto;

    public ObtenerMensaje(Target objeto) {
        this.objeto = objeto;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(objeto).viewedBy(actor).asString();
    }

    public static ObtenerMensaje delObjeto(Target objeto){
        return new ObtenerMensaje(objeto);
    }

}
