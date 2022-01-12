package co.com.choucair.certificacion.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroPage {

    public static final Target FORM = Target.the("Donde escribimos el nombre")
            .located(By.id("id='basicBootstrapForm'"));
    public static final Target TXT_NOMBRE = Target.the("Donde escribimos el nombre")
            .located(By.xpath("//input[@ng-model='FirstName']"));
    public static final Target TXT_APELLIDO = Target.the("Donde escribimos el apellido")
            .located(By.xpath("//input[@ng-model='LastName']"));
    public static final Target TXT_ADDRESS = Target.the("donde escribimos la direccion")
            .located(By.xpath("//input[@ng-model='Adress']"));
    public static final Target TXT_CORREO = Target.the("donde escribimos el correo")
            .located(By.xpath("//input[@ng-model='EmailAdress']"));
    public static final Target TXT_TELEFONO = Target.the("donde escribimos el telefono")
            .located(By.xpath("//input[@ng-model='EmailAdress']"));
    public static final Target CHK_REGISTRO = Target.the("Selecciona el genero")
            .locatedBy("//input[@value='{0}']");
    public static final Target LST_REGISTRO = Target.the("Selecciona el genero")
            .locatedBy("//select//option[@value='{0}']");
    public static final Target TXT_CONTRASENA = Target.the("Selecciona el genero")
            .located(By.id("firstpassword"));
    public static final Target TXT_RE_CONTRASENA = Target.the("Selecciona el genero")
            .located(By.id("secondpassword"));
    public static final Target BTN_SUBMIT = Target.the("Selecciona el genero")
            .located(By.id("submitbtn"));
}
