package br.ce.cristian.appium.testes;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.ce.cristian.appium.core.BaseTest;
import br.ce.cristian.appium.core.DriverFactory;
import br.ce.cristian.appium.page.MenuPage;
import br.ce.cristian.appium.page.SplashPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;


//Roteiro de teste
public class SplashTeste extends BaseTest {
	
	//Variavel Global
	private AndroidDriver<MobileElement> driver;
		
	//Instanciando as páginas
	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();
	
	@Before
	public void inicializarAppium(){
		menu.acessaSplash();
		driver = DriverFactory.getdriver();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void deveAguardarSplashSumir() {
		
		
		//Verificar que o Splash está sendo exibido
		page.isTelaSplashVisivel();
		
		//Aguardar Saída do Splash
		page.aguardarSplashSumir();
		
		//Verificar que o Formulário está sendo exibido
		Assert.assertEquals("Formulário", page.telaHome());
		
		
	}

}
