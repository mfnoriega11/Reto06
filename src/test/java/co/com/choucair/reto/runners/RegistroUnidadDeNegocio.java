package co.com.choucair.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/registro_unidad_de_negocio.feature",
        glue= {"co.com.choucair.reto.stepdefinitions","co.com.choucair.reto.util"},
        tags = "@RegistrarUnidadDeNegocio",
        snippets=SnippetType.CAMELCASE
)
public class RegistroUnidadDeNegocio {
}
