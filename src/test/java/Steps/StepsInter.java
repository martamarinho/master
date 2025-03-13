package Steps;

import Elementos.ElementosInter;
import Metodos.Metodos_utilizados;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepsInter {

	
	Metodos_utilizados m = new Metodos_utilizados();
	ElementosInter i = new ElementosInter();
	
	
	
	@Given("que o usuario acesse o site {string}")
	public void que_o_usuario_acesse_o_site(String string) {
	   m.abrirNavegador("https://inter.co/");
	}

	@When("clicar no botão abra sua conta")
	public void clicar_no_botão_abra_sua_conta() throws InterruptedException {
	  Thread.sleep(5000);
		m.clicar(i.getBtnAbraSuaConta());
	}

	@When("preencher todos os campos corretamente")
	public void preencher_todos_os_campos_corretamente() throws InterruptedException {
		Thread.sleep(3000);
	 m.preencherCampo("Daniella Almeida", i.getCampoNome());
	 m.preencherCampo("11973394192", i.getCampoTelefone());
	 m.preencherCampo("daniella.dealmeida@yahoo.com", i.getCampoEmail());
	 m.preencherCampo("482.514.120-05", i.getCampoCpf());
	 m.preencherCampo("14/11/1990", i.getDataNascimento());
	 
	}

	@When("selecionar o ckeckbox")
	public void selecionar_o_ckeckbox() throws InterruptedException {
	   Thread.sleep(3000);
		m.clicar(i.getCheckBox()); 
	}

	@When("clicar no botão continuar")
	public void clicar_no_botão_continuar() {
	   m.clicar(i.getBtnContinuar());
	}

	@Then("aparecerá mensagem que os dados foram recebidos")
	public void aparecerá_mensagem_que_os_dados_foram_recebidos() {
	m.quit();    
	}

}