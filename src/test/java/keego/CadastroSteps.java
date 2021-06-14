package keego;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CadastroSteps {
	@Given("Eu acesso a pagina de cadastro")
	public void verificarPagina() throws InterruptedException {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.verificarPagina();
		Utils.logPrint("Acesso a pagina");

	}

	@And("verifico os campos")
	public void verificaCampos() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.verificaCampos();
		
	}

	@When("eu preencho os dados solicitados")
	public void preencherDados() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.preencherDados();
		Utils.logPrint("Preenchimento dos Dados");

	}

	@And("concordo com os termos de privacidade")
	public void botaoPrivacidade() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.botaoPrivacidade();
		Utils.logPrint("Aceito do Termo de Privacidade");
	}

	@And("clico em 'Register'")
	public void clicarRegister() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.clicarRegister();
		Utils.logPrint("Clicar em Registrar");
	}

	@Then("o cadastro e realizado")
	public void cadastrado() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.cadastrado();
		Utils.logPrint("Cadastro Realizado e usuario logado");

	}

}


