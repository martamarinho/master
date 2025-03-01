#Author: your.email@your.domain.com

@tag
Feature: Abertura de Conta

  @tag1
  Scenario: Formulario de Abertura de Conta
    Given que acesse o site "https://nubank.com.br/"
    When preencher o formulario de abertura de conta
    Then formulario sera enviado com sucesso

  
