package Elementos;

import org.openqa.selenium.By;

public class ElementosPicpay {

	
	private By BtnAceitaCoock = By.id("onetrust-accept-btn-handler");
	private By CampoCPF = By.id("picpay-lp-parent-cpf-value");
	private By BtnAbrirConta = By.cssSelector("#__next > div > main > div.sc-2tg547-0.kAtMbe > div > div.sc-1ma4oy1-0.hZQiuh > form > button");
	private By CampoNome = By.id("Nome");
	private By CampoEmail = By.id("E-mail");
	private By CampoCelular = By.id("Celular");
	private By CampoDataNascimento = By.xpath("//*[@id=\"leads-form\"]/div[5]/div/input");
	private By BtnTermoEPolitica = By.xpath("//*[@id=\"terms\"]");
	private By BtnEnviar = By.xpath("//*[@id=\"radix-0\"]/div/div[3]/button[2]/div");

	
	

	public By getCampoNome() {
		return CampoNome;
	}

	public By getCampoEmail() {
		return CampoEmail;
	}

	public By getCampoCelular() {
		return CampoCelular;
	}

	public By getCampoDataNascimento() {
		return CampoDataNascimento;
	}

	public By getCampoCPF() {
		return CampoCPF;
	}

	public By getBtnAbrirConta() {
		return BtnAbrirConta;
	}

	public By getBtnAceitaCoock() {
		return BtnAceitaCoock;
	}

	public By getBtnTermoEPolitica() {
		return BtnTermoEPolitica;
	}

	public By getBtnEnviar() {
		return BtnEnviar;
	}
}
