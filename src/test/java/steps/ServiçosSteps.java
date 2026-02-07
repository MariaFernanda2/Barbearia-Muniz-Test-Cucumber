package steps;

import Pages.HomePageBarber;
import Pages.ServiçosPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ServiçosSteps {

    private HomePageBarber homePageBarber = new HomePageBarber();
    private ServiçosPage serviçosPage = new ServiçosPage();

    @Given("que acesso a página Serviços")
    public void que_acesso_a_página_serviços() {
        homePageBarber.acessarSiteBarbearia();
        homePageBarber.acessarServicos();

    }
    @Then("os componentes de Serviços devem ser visiveis")
    public void os_componentes_de_serviços_devem_ser_visiveis() {
        serviçosPage.validarInfoBarbearia();
    }

}
