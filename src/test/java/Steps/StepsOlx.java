package Steps;

import Elementos.ElementoOlx;
import Metodos.Metodos_utilizados;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class StepsOlx {

	Metodos_utilizados metodo = new Metodos_utilizados();
	ElementoOlx elemento = new ElementoOlx();

	@Dado("que eu acesso a página do OLX {string}")
	public void que_eu_acesso_a_página_do_olx(String string) {
		metodo.abrirNavegador("https://www.olx.com.br/");
		metodo.clicar(elemento.getBtnX());
	}

	@Quando("eu clico no botão entrar")
	public void eu_clico_no_botão_entrar() {
		metodo.clicar(elemento.getBtnEntrar());

	}

	@Quando("eu preencho o campo email")
	public void eu_preencho_o_campo_email() throws InterruptedException {
		metodo.pausar(3000);
		metodo.clicar(elemento.getBtnaceitar());
		// metodo.clicar(elemento.getBtnfechar());
		metodo.pausar(3000);
		metodo.preencherCampo(elemento.getCampoEmail(), "Othrom29@rhyta.com");
		
	}

	@Quando("eu clico no botão continuar")
	public void eu_clico_no_botão_continuar() {
		metodo.clicar(elemento.getBtncontinuar());	
	}

	@Entao("eu sou redirecionado para a página de cadastro")
	public void eu_sou_redirecionado_para_a_página_de_cadastro() {

	}
}
