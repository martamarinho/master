package Elementos;

import org.openqa.selenium.By;

public class ElementosNubank {
	
	private By CampoCPF = By.cssSelector("#field-cpf");
	private By btncontinuar = By.id("test");
	private By CampoNomecompleto = By.id("field-name");
	private By CampoCelular = By.id("field-phone");
	private By CampoEmail = By.id("field-email");
	private By CampoEmailconfirmacao = By.id("field-emailConfirmation");
	private By Checkbox = By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/div/div[7]/label");
	private By btnenviar = By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/div/button");
	private By Informacoesenviadas = By.xpath("//*[@id=\"complete-form-drawer\"]/div/div/div[2]/form/div/h4");
	
	public By getCampoCPF() {
		return CampoCPF;
	}
	
	public By getCampoCelular() {
		return CampoCelular;
	}
	public By getCampoEmail() {
		return CampoEmail;
	}
	public By getCampoEmailconfirmacao() {
		return CampoEmailconfirmacao;
	}
	public By getBtncontinuar() {
		return btncontinuar;
	}
	
	public By getCheckbox() {
		return Checkbox;
	}
	public By getBtnenviar() {
		return btnenviar;
	}
	public By getInformacoesenviadas() {
		return Informacoesenviadas;
	}
	public By getCampoNomecompleto() {
		return CampoNomecompleto;
	}
	public void setCampoNomecompleto(By campoNomecompleto) {
		CampoNomecompleto = campoNomecompleto;
	}
	

}
