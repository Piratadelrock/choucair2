package co.com.choucair.certificacion.test.stepdefinitions;

import co.com.choucair.certificacion.test.tasks.Abrir;
import cucumber.api.java.es.Dado;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RegistroStepDefinition {

    @Dado("^que (.*) accedio al sitio web del registro$")
    public void abrirPagina(String actor) {
        theActorCalled(actor).wasAbleTo(Abrir.lapagina());
    }
}
