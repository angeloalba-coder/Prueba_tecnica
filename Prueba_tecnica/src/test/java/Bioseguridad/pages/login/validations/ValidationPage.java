package Bioseguridad.pages.login.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {
    @FindBy(id = "lblRes")
    protected WebElementFacade msj_login_fallido;

    @FindBy()
    protected WebElementFacade msj_registro_exitoso;
}
