package core;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Interactions {


    private WebDriver driver;
    private WebDriverWait wait;

    public Interactions() {
        this.driver = Driver.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // 🔹 Aguardar elemento visível
    public WebElement aguardarElementoVisivel(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // 🔹 Clicar
    public void clicar(By locator) {
        aguardarElementoVisivel(locator).click();
    }

    // 🔹 Escrever texto
    public void escrever(By locator, String texto) {
        WebElement elemento = aguardarElementoVisivel(locator);
        elemento.clear();
        elemento.sendKeys(texto);
    }

    // 🔹 Verificar se está visível
    public boolean estaVisivel(By locator) {
        return aguardarElementoVisivel(locator).isDisplayed();
    }

    // 🔹 Aguardar elemento clicável
    public void aguardarClicavel(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // 🔹 Navegar para URL
    public void acessarUrl(String url) {
        driver.get(url);
    }

    // 🔹 Fechar navegador
    public void fecharNavegador() {
        Driver.quitDriver();
    }

    public boolean validarListaVisivel(By locator) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

        var elementos = driver.findElements(locator);

        if (elementos.isEmpty()) {
            throw new AssertionError("Nenhum elemento encontrado para o locator: " + locator);
        }

        for (WebElement elemento : elementos) {
            if (!elemento.isDisplayed()) {
                throw new AssertionError("Elemento não está visível: " + elemento);
            }
        }

        return true;
    }
    public boolean elementoEstaClicavel(By locator) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
