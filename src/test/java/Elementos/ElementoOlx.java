package Elementos;

import org.openqa.selenium.By;

public class ElementoOlx {

	private static By WindowCookeis1 = null;
	private By BtnEntrar = By.cssSelector("#header > nav > div > div.olx-header__column-right > ul > li:nth-child(5) > span > span > span > a");
	private By BtnX = By.cssSelector("#modal-example-1 > button > svg");
	private By Btnfechar = By.cssSelector("//*[@id=\"ds-modal-body-1\"]/div/button/span");
	//private By WindowCookeis = By.cssSelector("#cookie-banner > div");
	private By Btnaceitar = By.id("adopt-accept-all-button");
	private By CampoEmail = By.id("Othrom29@rhyta.com");
	private By Btncontinuar = By.xpath("/html/body/div[1]/div/div[1]/div[3]/form/div[2]/button/span");
	
	
	public By getBtnX() {
		return BtnX;
	}
	public By getBtnfechar() {
		return Btnfechar;
	}
	
	
	public By getCampoEmail() {
		return CampoEmail;
	}
	public By getBtncontinuar() {
		return Btncontinuar;
	}
	public By getBtnaceitar() {
		return Btnaceitar;
	}
	public void setBtnaceitar(By btnaceitar) {
		Btnaceitar = btnaceitar;
	}

	public By getWindowCookeis() {
		return WindowCookeis1;
	}
	public void setWindowCookeis(By windowCookeis) {
		WindowCookeis1 = windowCookeis;
	}
	public By getBtnEntrar() {
		return BtnEntrar;
	}
	public void setBtnEntrar(By btnEntrar) {
		BtnEntrar = btnEntrar;
	}
}




