#Author: Daniella 

@tag
Feature: Abertura de Conta Banco Inter


 
  Scenario: Abertura de conta com sucesso
    Given que o usuario acesse o site "https://inter.co/"
    When clicar no botão abra sua conta
    And preencher todos os campos corretamente
    And selecionar o ckeckbox
    And clicar no botão continuar
    Then aparecerá mensagem que os dados foram recebidos


