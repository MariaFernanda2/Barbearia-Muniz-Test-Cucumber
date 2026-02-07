package steps;

import Pages.HomePageBarber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {

    private HomePageBarber homePageBarber = new HomePageBarber();


    @Given("que acesso o site da barbearia")
    public void que_acesso_o_site_da_barbearia() {
        homePageBarber.acessarSiteBarbearia();
    }
    @Then("os componentes da HomePage devem ser visiveis")
    public void os_componentes_da_home_page_devem_ser_visiveis() {
      homePageBarber.validaElementosHome();

    }

}
