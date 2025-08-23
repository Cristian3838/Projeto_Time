package br.ce.cristian.appium.testes;

import org.junit.Before;
import org.junit.Test;

import br.ce.cristian.appium.core.BaseTest;
import br.ce.cristian.appium.core.DriverFactory;
import br.ce.cristian.appium.page.AlertaPage;
import br.ce.cristian.appium.page.MenuPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class AlertaTeste extends BaseTest {
	private AndroidDriver<MobileElement> driver;
	private MenuPage menu = new MenuPage();
	private AlertaPage page = new AlertaPage();

	@Before
	public void inicializaAppium() {
		menu.acessarMenuAlerta();
		driver = DriverFactory.getdriver();
	}

	// Roteito de Testes
	@SuppressWarnings("deprecation")
	@Test
	public void alertasDeConfirmacao() {

		// Clicar em alerta Confirm
		page.clicarAlertaConfirm();

		// Verificar os textos
		Assert.assertEquals("Info", page.obterTituloTexto());
		Assert.assertEquals("Confirma a operação?", page.frasePageModal1());

		// Confirmar alerta
		page.clicarBotaoConfirm();

		// Verificar nova mensagem
		Assert.assertEquals("Info", page.obterTituloTexto());
		Assert.assertEquals("Confirmado", page.frasePageModal2());

		// Clicar em sair
		page.clicarBotao("SAIR"); 
	}

	@SuppressWarnings("deprecation")
	@Test
	public void deveConfirmarAlerta() {
		page.clciarAlertaSimples("ALERTA SIMPLES");
		page.clicarForaCaixa(98, 171);
		
		Assert.assertTrue("O título esperado não está visível na tela.",
				page.isTituloVisivel("Pode clicar no OK ou fora da caixa para sair"));
	}

}
