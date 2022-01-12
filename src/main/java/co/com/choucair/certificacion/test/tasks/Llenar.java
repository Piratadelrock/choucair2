package co.com.choucair.certificacion.test.tasks;

import co.com.choucair.certificacion.test.models.Registro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.certificacion.test.userinterface.RegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Llenar implements Task {

    private Registro registro;

    public Llenar(Registro registro) {
        this.registro = registro;
    }

    public static Performable registro(Registro informacionRegistro) {
        return instrumented(Llenar.class, informacionRegistro);    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(registro.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(registro.getApellido()).into(TXT_APELLIDO),
                Enter.theValue(registro.getDireccion()).into(TXT_ADDRESS),
                Enter.theValue(registro.getEmail()).into(TXT_CORREO),
                Enter.theValue(registro.getTelefono()).into(TXT_TELEFONO),
                Click.on(CHK_REGISTRO.of(registro.getGenero())),
                Click.on(CHK_REGISTRO.of(registro.getHobbies())),
                SelectFromOptions.byValue(registro.getPais()).from(LST_REGISTRO.of(registro.getPais()))
                );
    }
}
