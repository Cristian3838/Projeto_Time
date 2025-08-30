package br.ce.cristian.appium.testes;

import org.junit.Before;
import org.junit.Test;

import br.ce.cristian.appium.core.BaseTest;
import br.ce.cristian.appium.core.DriverFactory;
import br.ce.cristian.appium.page.CliquesPage;
import br.ce.cristian.appium.page.MenuPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CliquesTest extends BaseTest {

	// Variavel Global
	private AndroidDriver<MobileElement> driver;

	// Instanciando as páginas
	private MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();

	// Antes da execução do código, o Before executa esse metodo
	@Before
	public void inicializarAppium() {
		menu.acessaAbasClique();
		driver = DriverFactory.getdriver();
	}

	@Test
	public void deveRealizarCliqueLongo() {
		page.cliqueLongo();
		Assert.assertEquals("Clique Longo", page.obterTextoPorCampo());

	}
	
	@Test
	public void deveRealizarDuploClique() {
		page.duploClique();
		Assert.assertEquals("Duplo Clique", page.obterTextoDuploClique("Duplo Clique"));
	}

}
