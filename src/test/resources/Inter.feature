#Author: Daniella 

@FormularioAberturaDeConta
Feature: Abertura de Conta Banco Inter


  @tag1
  Scenario: Abertura de conta com sucesso
    Given que o usuario acesse o site "https://inter.co/"
    When clicar no botão abra sua conta
    And preencher todos os campos corretamente
    And selecionar o ckeckbox
    And clicar no botão continuar
    Then aparecerá mensagem que os dados foram recebidos


