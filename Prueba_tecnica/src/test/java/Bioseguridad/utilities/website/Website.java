package Bioseguridad.utilities.website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class Website {
    @Steps(shared = true)
    PageObject website;

    @Step("navegar al sitio web")
    public void navigateTo(String url) {
        website.setDefaultBaseUrl(url);
        website.open();
    }
}
