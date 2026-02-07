package Pages;

import core.Interactions;
import org.openqa.selenium.By;

public class ServiçosPage{

    // 🔹 Instância das interações
    private Interactions interactions = new Interactions();


    // 🔹 Mapeamento dos elementos
    private By nomeBarbearia = By.xpath("//h1[normalize-space()='Barbearia Muniz - Centro de Cotia']");
    private By endereçoBarbearia = By.xpath("//p[normalize-space()='Rua Guido Fecchio, 626']");
    private By avaliaçõesBarbearia = By.xpath("//h1[normalize-space()='Barbearia Muniz - Centro de Cotia']");
    private By imagemServiço = By.xpath("//div[.//h2 and .//button]//img[contains(@class,'rounded')]");
    private By nomeDoServiço = By.xpath("//h2[normalize-space()='Alisante/Relaxamento']");
    private By descriçãoServiço = By.xpath("//p[contains(text(),'Deixe seu cabelo liso e com uma aparência mais nat')]");
    private By precoDoServico = By.xpath("(//p[contains(text(),'R$ 25,00')])[1]");
    private By botaoReservar = By.xpath("//button[@data-state='closed']");


    //Metodos
     public void validarInfoBarbearia(){
         interactions.estaVisivel(nomeBarbearia);
         interactions.estaVisivel(endereçoBarbearia);
         interactions.estaVisivel(avaliaçõesBarbearia);
         interactions.validarListaVisivel(imagemServiço);
         interactions.validarListaVisivel(nomeDoServiço);
         interactions.validarListaVisivel(descriçãoServiço);
         interactions.validarListaVisivel(precoDoServico);
         interactions.validarListaVisivel(botaoReservar);
         interactions.elementoEstaClicavel(botaoReservar);


     }
}