package Bioseguridad.steps.login.validations;

import Bioseguridad.pages.login.validations.ValidationPage;
import net.serenitybdd.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("validar mensaje de ingreso fallido")
    public boolean msjError(){
        return msj_login_fallido.isDisplayed();

    }
    @Step("validar mensaje de registro exitoso")
    public boolean msj_registro_exitoso(){
        return msj_registro_exitoso.isDisplayed();
    }
}
