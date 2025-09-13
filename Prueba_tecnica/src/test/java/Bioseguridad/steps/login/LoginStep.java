package Bioseguridad.steps.login;

import Bioseguridad.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;


public class LoginStep extends LoginPage {

@Step("ingresar usuario")
     public void typeUsername(String username){
         txt_username_login.sendKeys(username);
     }
     @Step("ingresar contraseña")
     public void typePassword(String password){
    txt_password_login.sendKeys(password);
     }
     @Step("click en boton ingresar")
     public void clickLogin(){
    btn_login.click();
     }
     @Step("clicl en boton registrarse")
    public void clickRegistrarse(){
    btn_registro.click();
     }
}
