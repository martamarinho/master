package Steps;

import Elementos.ElementosMercadolivre;
import Metodos.Metodos_utilizados;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class StepsMercadolivre {
	ElementosMercadolivre ele = new ElementosMercadolivre();
	Metodos_utilizados metodos = new Metodos_utilizados();

	@Dado("entrar no site {string}")
	public void entrar_no_site(String string) {
		metodos.abrirNavegador(string);
	}

	@Dado("acessar a barra de pesquisa")
	public void acessar_a_barra_de_pesquisa() {
		metodos.clicar(ele.getBtnPesquisar());
	}

	@Quando("pesquisar por tv")
	public void pesquisar_por_tv() {
	metodos.preencherCampo(ele.getBarraDePesquisa(), "tv");
	}

	@Quando("clicar em lupa")
	public void clicar_em_lupa() {
     metodos.quit();
	}

	@Então("retornara o produto")
	public void retornara_o_produto() {

	}

}
