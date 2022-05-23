package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By produto = By.cssSelector("#gallery-layout-container > div:nth-child(2) > section > a > article > button > div:nth-child(3) > div > div > img");
	private By btnLupa = By.cssSelector("#chaordic-search-bar > form > button.tokstoksponsorio-chaordic-components-0-x-searchButton.bn.bg-transparent > svg");
	private By btnComprar = By.xpath("/html/body/div[3]/div/div[1]/div/div[1]/div/div[6]/div/div[7]/div/section/div/div[2]/div/div[1]/div/div[6]/div/div/div/div/div/div[2]/div/div/button/div");
	private By btnIrParaOCarinho = By.xpath("/html/body/div[3]/div/div[1]/div/div[1]/div/div[6]/div/div[5]/div[2]/div[4]/button[2]");
	private By btnFecharPedido = By.xpath("/html/body/div[7]/div[3]/div[2]/div[2]/div[2]/h3");
	private By campoDePesquisa = By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/section/div/div[2]/div/div/div/div/div[1]/div/form/input");
	private By btnChato = By.xpath("/html/body/div[3]/div/div[1]/div/div[10]/div/button");
	public By getBtnChato() {
		return btnChato;
	}
	public By getCampoDePesquisa() {	
		return campoDePesquisa;
	}
	public By getBtnLupa() {
		return btnLupa;
	}
	public By getProduto() {
		return produto;
	}
	public By getBtnComprar() {
		return btnComprar;
	}
	public By getBtnIrParaOCarinho() {
		return btnIrParaOCarinho;
	}
	public By getBtnFecharPedido() {
		return btnFecharPedido;
	}
	
}
