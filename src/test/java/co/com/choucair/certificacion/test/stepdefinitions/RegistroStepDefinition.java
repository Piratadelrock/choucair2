package co.com.choucair.certificacion.test.stepdefinitions;

import co.com.choucair.certificacion.test.tasks.Abrir;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.choucair.certificacion.test.models.builder.RegistroBuilder.con;
import static co.com.choucair.certificacion.test.tasks.Llenar.registro;

public class RegistroStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) accedio al sitio web del registro$")
    public void abrirPagina(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(Abrir.laPagina());
    }

    @Cuando("el usuario se registra en la página")
    public void registrarPagina() {
            OnStage.theActorInTheSpotlight().attemptsTo(registro(con().informacionUsuario()));
    }

    @Entonces("el usuario verifica que quedo registrado")
    public void elUsuarioVerificaQueQuedoRegistrado() {
    }

    @Entonces("^el usuario verifica que no se puede completar el registro$")
    public void elUsuarioVerificaQueNoSePuedeCompletarElRegistro() {
    }
}
