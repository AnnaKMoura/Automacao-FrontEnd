package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {

	WebDriver driver;

	public void abrirNavegador() {
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.polishop.com.br");
			driver.manage().window().maximize();
		}

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void digitar(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void pause() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	public void clicarTexto(String texto) {
		driver.findElement(By.partialLinkText(texto)).click();

	}

	public void fechar(String teste) throws IOException {
		screenShot(teste);
		driver.quit();
	}

	public void validarLogin(String textoEsperado, By elemento) {
		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);
	}

	public void validarTexto(String textoEsperado, By elemento) {
		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);

	}

	public void screenShot(String nome) throws IOException {
		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".jpeg");
		FileUtils.copyFile(srcFile, destFile);
	}

	public void sleep() throws InterruptedException {
		Thread.sleep(8000);

	}

}
