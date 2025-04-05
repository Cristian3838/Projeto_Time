package br.ce.cristian.appium.testes;

import org.junit.Before;
import org.junit.Test;

import br.ce.cristian.appium.core.BasePage;
import br.ce.cristian.appium.core.BaseTest;
import br.ce.cristian.appium.core.DriverFactory;
import br.ce.cristian.appium.page.AcorddionPage;
import br.ce.cristian.appium.page.MenuPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class AcorddionTeste extends BaseTest {
	
	//Instancinado paginas
	private MenuPage menu = new MenuPage();
	private AcorddionPage page = new AcorddionPage();
	
	//Variavel Global
	private AndroidDriver<MobileElement> driver;
	
	@Before
	public void inicializarAppium(){
		menu.acessaAcorddion();
		driver = DriverFactory.getdriver();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void deveInteragirComAcorddion() {
		
		// Clicar na opção 1
		page.clicarNaOpcao1();
		
		
		//Verificar texto da opção 1
		Assert.assertEquals("Esta é a descrição da opção 1", page.retornaTextoOpcao1());
		
		
		//Clicar na opção 2
		page.clicarNaOpcao2();

		
		
		// Verificar a opção 2
		Assert.assertEquals("Esta é a descrição da opção 2", page.retornaTextoOpcao2());

		
	}

}
