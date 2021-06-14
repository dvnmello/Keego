package keego;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	@Given("Eu acesso a pagina inicial")
	public void checkPage() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		loginPage.checkPage();
		Utils.logPrint("Acesso a pagina Inicial");

	}

	@And("clico no icone de menu de usuario")
	public void clicaMenu() {
		LoginPage loginPage = new LoginPage();
		loginPage.clicaMenu();
		Utils.logPrint("Item Menu de Usuario");
		
	}

	@When("eu preencho os dados de login")
	public void preencherDadosLogin() {
		LoginPage loginPage = new LoginPage();
		loginPage.preencherDadosLogin();
		Utils.logPrint("Preenchimento dos Dados Login");

	}

	@And("clico em 'Sign In'")
	public void botaoLogar() {
		LoginPage loginPage = new LoginPage();
		loginPage.botaoLogar();
		Utils.logPrint("Logar na pagina");
	}


	@Then("o login e realizado")
	public void logado() {
		LoginPage loginPage = new LoginPage();
		loginPage.logado();
		Utils.logPrint("Login Realizado");

	}

	@And("a pagina e verificada")
	public void checkUser() {
		LoginPage loginPage = new LoginPage();
		loginPage.checkUser();
		Utils.logPrint("Usuario logado");
	}
}
