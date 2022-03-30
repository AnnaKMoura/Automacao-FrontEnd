package testes;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Browsers;

public class Steps {

	Browsers browsers = new Browsers();
	Elementos elementos = new Elementos();

	@Given("que eu esteja na tela de login")
	public void que_eu_esteja_na_tela_de_login() {
		browsers.abrirNavegador();
		browsers.pause();
		browsers.clicar(elementos.getCookies());
		browsers.clicar(elementos.getMinhaConta());
		browsers.pause();

	}

	@When("eu envio a requisicao com os dados corretos")
	public void eu_envio_a_requisicao_com_os_dados_corretos() {
		browsers.clicar(elementos.getLogin());
		browsers.clicar(elementos.getEntrar());
	}

	@Then("logo na conta")
	public void logo_na_conta() throws IOException {
		browsers.digitar("a***********@gmail.com", elementos.getEmail());
		browsers.digitar("Ex123456", elementos.getSenha());
		browsers.clicar(elementos.getLogar());
		browsers.pause();
		browsers.validarLogin("StatusOnline", elementos.getConfirmacao());
		browsers.fechar("evidencia1");
	}

	@When("eu envio a requisicao com os dados em branco")
	public void eu_envio_a_requisicao_com_os_dados_em_branco() {
		browsers.pause();
		browsers.clicar(elementos.getLogin());
		browsers.clicar(elementos.getEntrar());
	}

	@Then("o sistema deve solicitar o preenchimento dos campos obrigatorios")
	public void o_sistema_deve_solicitar_o_preenchimento_dos_campos_obrigatorios() throws IOException {
		browsers.digitar("", elementos.getEmail());
		browsers.digitar("", elementos.getSenha());
		browsers.clicar(elementos.getLogar());
		browsers.pause();
		browsers.validarTexto("Entre com um e-mail válido", elementos.getTextoRetorno());
		browsers.fechar("evidencia2");
	}

}
