package co.com.choucair.reto.util;


import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }

}
