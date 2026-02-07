package Pages;

import core.Interactions;
import org.openqa.selenium.By;

public class HomePageBarber {

    // 🔹 Instância das interações
    private final Interactions interactions = new Interactions();
    ;

    // 🔹 Mapeamento dos elementos
    private static final String URLBarbearia = "https://app-barbearia-muniz.vercel.app/";
    private By logoBarber = By.xpath("//img[@alt='Barbearia Muniz']");
    private By menuHamburger = By.xpath("//button[.//*[name()='svg' and contains(@class,'lucide-menu')]]");
    private By mensagemRecepção = By.xpath("//h2[normalize-space()='Olá! Vamos agendar um corte hoje?']");
    private By insertBuscaBarber = By.xpath("//input[@placeholder='Busque por uma barbearia...']");
    private By botãoReservar = By.xpath("//button[normalize-space()='Reservar']");

    //Metodos
    public void acessarSiteBarbearia() {
        interactions.acessarUrl(URLBarbearia);

    }

    public void validaElementosHome() {
        interactions.estaVisivel(menuHamburger);
        interactions.estaVisivel(logoBarber);
        interactions.estaVisivel(mensagemRecepção);
        interactions.estaVisivel(insertBuscaBarber);
        interactions.estaVisivel(botãoReservar);
    }
    public void acessarServicos(){
        interactions.clicar(botãoReservar);
    }
}