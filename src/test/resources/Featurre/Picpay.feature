#language : pt
@tag
Funcionalidade: Abertura de conta

  
  Cenario: Abrir conta 
  Dado que esteja na aplicação do  "https://picpay.com/"
  Quando digitar um CPF valido
  E clicar em abrir conta 
  E preencher o formulario com dados validos
  E aceita as politicas de qualidade do site 
  E clicar em enviar 
  Entao retornara uma pagina com QRCode para completa os processos de abertura de conta 
