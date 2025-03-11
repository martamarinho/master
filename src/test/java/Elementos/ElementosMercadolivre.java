package Elementos;

import org.openqa.selenium.By;

public class ElementosMercadolivre {

    private By btnPesquisar = By.id("cb1-edit"); // Corrigido nome da variável
    private By barraDePesquisa = By.xpath("/html/body/header/div/div[2]/form"); // Corrigido className errado
    private By btnLupa = By.className("nav-icon-search"); // Corrigido XPath inválido

    public By getBtnPesquisar() {
        return btnPesquisar;
    }

    public By getBarraDePesquisa() {
        return barraDePesquisa;
    }

    public By getBtnLupa() {
        return btnLupa;
    }
}