package br.ce.cristian.appium.testes;
import org.junit.Before;
import org.junit.Test;

import br.ce.cristian.appium.core.BaseTest;
import br.ce.cristian.appium.core.DriverFactory;
import br.ce.cristian.appium.page.MenuPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

@SuppressWarnings("deprecation")
public class MenuTest extends BaseTest{
	
	
	//Variavel Global
	private AndroidDriver<MobileElement> driver;
	
	//Instanciando as páginas
	private MenuPage menu = new MenuPage();
	
	//Antes da execução do código, o Before executa esse metodo
	@Before
	public void inicializarAppium(){
		driver = DriverFactory.getdriver();
	}
	
	@Test
	public void acessaMenu() {
		menu.acessaMenu();
	}
	

	
}
