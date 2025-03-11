package Steps;

import java.io.IOException;

import Elementos.ElementosNubank;
import Metodos.Metodos_utilizados;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsNubank {

	ElementosNubank e = new ElementosNubank();
	Metodos_utilizados m = new Metodos_utilizados();

@Given("que acesse o site {string}")
public void que_acesse_o_site(String string) {
    m.abrirNavegador(string);
}

@When("preencher o formulario de abertura de conta")
public void preencher_o_formulario_de_abertura_de_conta() throws IOException, InterruptedException {
	m.pausar(3000);
	m.preencherCampo("588.869.464-90", e.getCampoCPF());
	m.clicar(e.getBtncontinuar());
	m.preencherCampo("Pedro Henrique Gabriel Jorge da Paz", e.getCampoNomecompleto());
	m.preencherCampo("(87) 99181-6189", e.getCampoCelular());
	m.preencherCampo("pedro_dapaz@taclog.com.br", e.getCampoEmail());
	m.preencherCampo("pedro_dapaz@taclog.com.br", e.getCampoEmailconfirmacao());
	m.clicar(e.getCheckbox());
	m.clicar(e.getBtnenviar());
	
    
}

@Then("formulario sera enviado com sucesso")
public void formulario_sera_enviado_com_sucesso() throws IOException, InterruptedException {
	m.pausar(1000);
	m.tirarPrint(e.getInformacoesenviadas());
	m.tirarPrint("informações enviadas");
	//m.validarTexto(e.getInformacoesenviadas(), "informacoes enviadas");
	m.quit();
	
	}

}
