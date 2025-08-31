package br.ce.cristian.appium.testes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ce.cristian.appium.core.BaseTest;
import br.ce.cristian.appium.core.DriverFactory;
import br.ce.cristian.appium.page.MenuPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class OpcaoEscondidaTest extends BaseTest {

	MenuPage menu = new MenuPage();
	
	AndroidDriver<MobileElement> driver = DriverFactory.getdriver();

	@Test
	public void deveEncotrarOpcaEscondida() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@text='Formulário']")));
				
				
		// Scroll Down
		menu.scrollToText(0.9, 0.1);

		// Clicar menu
		menu.clicaOpcaoEscondida("Opção bem escondida");

		// Verificar mensagem
		Assert.assertEquals("Você achou essa opção", menu.checarNomeEscrito("Você achou essa opção"));

		// Sair
		menu.clicarEmSair("OK");
	}

}
