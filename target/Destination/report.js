$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Teste de Cadastro",
  "description": "",
  "id": "teste-de-cadastro",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 3562609100,
  "status": "passed"
});
formatter.before({
  "duration": 1318521800,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Realizar cadastro no site",
  "description": "",
  "id": "teste-de-cadastro;realizar-cadastro-no-site",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Eu acesso a pagina de cadastro",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "verifico os campos",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "eu preencho os dados solicitados",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "concordo com os termos de privacidade",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "clico em \u0027Register\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "o cadastro e realizado",
  "keyword": "Then "
});
formatter.match({
  "location": "CadastroSteps.verificarPagina()"
});
formatter.result({
  "duration": 2862475200,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.verificaCampos()"
});
formatter.result({
  "duration": 26102800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.preencherDados()"
});
formatter.result({
  "duration": 1827139700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.botaoPrivacidade()"
});
formatter.result({
  "duration": 234035500,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.clicarRegister()"
});
formatter.result({
  "duration": 260737400,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.cadastrado()"
});
formatter.result({
  "duration": 218455000,
  "status": "passed"
});
formatter.after({
  "duration": 486426300,
  "status": "passed"
});
formatter.after({
  "duration": 210067000,
  "status": "passed"
});
formatter.before({
  "duration": 1258244500,
  "status": "passed"
});
formatter.before({
  "duration": 1253687900,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Realizar login no site",
  "description": "",
  "id": "teste-de-cadastro;realizar-login-no-site",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "Eu acesso a pagina inicial",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "clico no icone de menu de usuario",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "eu preencho os dados de login",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "clico em \u0027Sign In\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "o login e realizado",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "a pagina e verificada",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.checkPage()"
});
formatter.result({
  "duration": 4398225200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clicaMenu()"
});
formatter.result({
  "duration": 234818200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.preencherDadosLogin()"
});
formatter.result({
  "duration": 329973800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.botaoLogar()"
});
formatter.result({
  "duration": 216493000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.logado()"
});
formatter.result({
  "duration": 134315900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.checkUser()"
});
formatter.result({
  "duration": 1055098200,
  "status": "passed"
});
formatter.after({
  "duration": 92708100,
  "status": "passed"
});
formatter.after({
  "duration": 120882300,
  "status": "passed"
});
});