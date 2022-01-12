package co.com.choucair.certificacion.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registro.feature",
        glue = "co.com.choucair.certificacion.test.stepdefinitions",
        tags = "@Registro",
        snippets = SnippetType.CAMELCASE)
public class RegistroRunner {

}