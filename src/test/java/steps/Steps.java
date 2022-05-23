package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.Elementos;
import metodos.Metodos;

public class Steps {

	WebDriver driver;
	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("^que o usuario acesse o site \"([^\"]*)\"$")
	public void que_o_usuario_acesse_o_site(String site) throws Throwable {
		m.execultarNavegador(site);
		m.pausa(4000);
	}

	@Given("^preencha o campo de pesquisa$")
	public void preencha_o_campo_de_pesquisa() throws Throwable {
		m.pausa(2000);
		m.clicar(e.getBtnChato());
		m.pausa(2000);
		m.preencher(e.getCampoDePesquisa(), "sofá");
		m.pausa(5000);
		m.clicar(e.getBtnLupa());
		m.pausa(5000);
	}

	@Given("^selecione o produto$")
	public void selecione_o_produto() throws Throwable {
		m.pausa(5000);
		m.scroll(e.getProduto());
		m.pausa(5000);

	}

	@Given("^clique em comprar$")
	public void clique_em_comprar() throws Throwable {
		m.pausa(5000);
		m.scroll(e.getBtnComprar());
		m.pausa(4000);
	}

	@When("^acessar o carrinho de compra$")
	public void acessar_o_carrinho_de_compra() throws Throwable {
		m.pausa(5000);
		m.clicar(e.getBtnIrParaOCarinho());
		m.pausa(6000);
	}

	@Then("^validar o texto \"([^\"]*)\"$")
	public void validar_o_texto(String arg1) throws Throwable {
		m.pausa(15000);
		m.scroll2(e.getBtnFecharPedido());
		m.pausa(4000);
		m.validar("Calcule as opções de frete e retirada", e.getBtnFecharPedido());
		m.pausa(5000);
	}
	

}
