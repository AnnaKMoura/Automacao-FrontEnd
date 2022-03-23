#Author: polishop.com.br

@testes
Feature: Cadastro e login em minha conta
  Eu como usuario desejo realizar meu cadastro e logar em minha conta

  Background: Acessar polishop
     Given que eu esteja na tela de login
     
    Scenario: Logar na conta					
    When eu envio a requisicao com os dados corretos 							
    Then logo na conta 							
    
    Scenario: Logar na conta					
    When eu envio a requisicao com os dados em branco  							
    Then o sistema deve solicitar o preenchimento dos campos obrigatorios	
