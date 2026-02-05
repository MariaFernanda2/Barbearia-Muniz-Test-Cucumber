package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSiteSteps {

    @Given("que estou na tela de login")
    public void que_estou_na_tela_de_login() {
        System.out.println("Estou na tela de login");
    }

    @When("informo usuario e senha validos")
    public void informo_usuario_e_senha_validos() {
        System.out.println("Informo usuario e senha validos");
    }

    @Then("o login deve ser realizado")
    public void o_login_deve_ser_realizado() {
        System.out.println("Login realizado com sucesso");
    }
}

