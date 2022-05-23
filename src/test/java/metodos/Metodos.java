package metodos;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Metodos {

	WebDriver driver;

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	public void validar(String texto, By elemento) {
		String texto2 = driver.findElement(elemento).getText();
		System.out.println(texto2);
		assertEquals(texto, texto2);

	}

	public void execultarNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40000, TimeUnit.MILLISECONDS);
	}

	public void scroll(By elemento) throws InterruptedException {
		WebElement element = driver.findElement((elemento));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		element.click();
	}
	public void scroll2(By elemento) throws InterruptedException {
		WebElement element = driver.findElement((elemento));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
	}
}

