#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
	@tag
	Feature: Teste de Cadastro

  @tag1 
  Scenario: Realizar cadastro no site
    Given Eu acesso a pagina de cadastro
    And verifico os campos
    When eu preencho os dados solicitados
    And concordo com os termos de privacidade
    And clico em 'Register'
    Then o cadastro e realizado
        
   @tag2  
  Scenario: Realizar login no site
    Given Eu acesso a pagina inicial
    And clico no icone de menu de usuario
    When eu preencho os dados de login
    And clico em 'Sign In'
    Then o login e realizado
    And a pagina e verificada
   
   
