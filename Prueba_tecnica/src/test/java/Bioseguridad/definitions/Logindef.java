package Bioseguridad.definitions;

import Bioseguridad.steps.login.LoginStep;
import Bioseguridad.steps.login.validations.ValidationStep;
import Bioseguridad.utilities.website.Website;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class Logindef {

    @Steps(shared = true)
    Website url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;


    @Given("el usuario navega al sitio web")
    public void userNavigate(){
        url.navigateTo("https://bioseguridad.godoycordoba.com/");
    }
    @When("ingresa credenciales inexistentes")
    public void ingresaCredencialesInexistentes(){
        login.typeUsername("aalba1");
        login.typePassword("12345");
        login.clickLogin();
    }
    @Then("deberia arrojar un mensaje de error Datos incorrectos, por favor intentelo nuevamente")
    public void msjDeError(){
        Assert.assertTrue(validate.msjError());
    }
    @When("agrega sus datos para registrarse")
    public void registroUsuarioNuevo() {
        login.clickRegistrarse();
        login.typeUsername("aalba1");
        login.typePassword("12345");

    }
    @Then("deberia ver un mensaje de registro exitoso")
    public void msjDeRegistroExitoso() {
        Assert.assertTrue(validate.msj_registro_exitoso());
    }
}
