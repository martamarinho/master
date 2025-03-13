package Steps;

import java.io.IOException;

import Elementos.ElementosPicpay;
import Metodos.Metodos_utilizados;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class StepsPicpay {
  Metodos_utilizados metodo = new Metodos_utilizados();
  ElementosPicpay elemento = new  ElementosPicpay ();
  
  @Dado("que esteja na aplicação do  {string}")
  public void que_esteja_na_aplicação_do(String string) {
      metodo.abrirNavegador(string);
      metodo.clicar(elemento.getBtnAceitaCoock());
  }

  @Quando("digitar um CPF valido")
  public void digitar_um_cpf_valido() throws InterruptedException {
      metodo.preencherEspaco(elemento.getCampoCPF(), "567.934.742-35");
      
  }

  @Quando("clicar em abrir conta")
  public void clicar_em_abrir_conta() {
	   metodo.clicar(elemento.getBtnAbrirConta());
  }

  @Quando("preencher o formulario com dados validos")
  public void preencher_o_formulario_com_dados_validos() {
      metodo.preencherEspaco(elemento.getCampoNome(), "Oliver Nathan Pedro Henrique da Mata");
      metodo.preencherEspaco(elemento.getCampoEmail(), "oliver_damata@peopleside.com.br");
      metodo.preencherEspaco(elemento.getCampoCelular(), "63 995552431");
      metodo.preencherEspaco(elemento.getCampoDataNascimento(), "06/01/1981");
  }

  @Quando("aceita as politicas de qualidade do site")
  public void aceita_as_politicas_de_qualidade_do_site() {
     metodo.clicar(elemento.getBtnTermoEPolitica());
  }

  @Quando("clicar em enviar")
  public void clicar_em_enviar() {
     metodo.clicar(elemento.getBtnEnviar());
  }

  @Entao("retornara uma pagina com QRCode para completa os processos de abertura de conta")
  public void retornara_uma_pagina_com_qr_code_para_completa_os_processos_de_abertura_de_conta() throws IOException, InterruptedException {
  metodo.pausar(2000);
  metodo.tirarPrint("Mensagem informativa");
  metodo.quit();
  }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
