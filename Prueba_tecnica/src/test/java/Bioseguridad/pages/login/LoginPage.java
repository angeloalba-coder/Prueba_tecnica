package Bioseguridad.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class LoginPage extends PageObject {

    @FindBy(id = "TxtUsuario_I")
    protected WebElementFacade txt_username_login;

    @FindBy(id = "TxtClave_I")
    protected WebElementFacade txt_password_login;

    @FindBy(id = "BtnIngresar_I")
    protected WebElementFacade btn_login;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/p/a")
    protected WebElementFacade btn_registro;

}
