package Elementos;

import org.openqa.selenium.By;

public class ElementosInter {
    
	private By BtnAbraSuaConta = By.xpath("/html/body/div[1]/div[1]/header/div/nav/div[2]/div/div/span[6]/button");
	private By CampoNome = By.id("nome");
	private By CampoTelefone = By.id("celular");
	private By CampoEmail = By.id("email");
	private By CampoCpf = By.id("cpf");
	private By DataNascimento = By.id("dataNascimento");
	private By CheckBox = By.xpath("/html/body/div[3]/div[2]/div/form/div[6]/label");
	private By BtnContinuar = By.xpath("/html/body/div[3]/div[2]/div/form/button");
	
	
	
	
	public By getBtnAbraSuaConta() {
		return BtnAbraSuaConta;
	}
	public By getCampoNome() {
		return CampoNome;
	}
	public By getCampoTelefone() {
		return CampoTelefone;
	}
	public By getCampoEmail() {
		return CampoEmail;
	}
	public By getCampoCpf() {
		return CampoCpf;
	}
	public By getDataNascimento() {
		return DataNascimento;
	}
	public By getCheckBox() {
		return CheckBox;
	}
	public By getBtnContinuar() {
		return BtnContinuar;
	}
}
