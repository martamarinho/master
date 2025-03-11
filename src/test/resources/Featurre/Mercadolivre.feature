 #language: pt

@tag
Funcionalidade: Site Mercado Livre
  

  @tag1
  Cenario: Pesquisar TV led 50 
    Dado entrar no site "https://www.mercadolivre.com.br/"
    Quando acessar a barra de pesquisa
    E pesquisar por tv 
    E clicar em lupa
    Então retornara o produto 

