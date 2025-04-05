package br.ce.cristian.appium.testes;
import org.junit.Before;
import org.junit.Test;

import br.ce.cristian.appium.core.BaseTest;
import br.ce.cristian.appium.core.DriverFactory;
import br.ce.cristian.appium.page.FormularioPage;
import br.ce.cristian.appium.page.MenuPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class FormularioTeste extends BaseTest{
	
	
	//Variavel Global
	private AndroidDriver<MobileElement> driver;
	
	//Instanciando as páginas
	private MenuPage menu = new MenuPage();
	private FormularioPage page = new FormularioPage();
	
	//Antes da execução do código, o Before executa esse metodo
	@Before
	public void inicializarAppium(){
		menu.acessarFormulario();
		driver = DriverFactory.getdriver();
	}
	
	//Formulário Teste, roteiro de teste e suas assertivas
	@SuppressWarnings("deprecation")
	@Test
	public void preencheFormulario()  {	
		
		
		//Escrever nome
        page.escreverNome("Cristian Jonas");
		
		//Checar nome escrito
		Assert.assertEquals("Cristian Jonas", page.obterTexto());
				
		//Clicar para escolher o combo 
		page.clicaEstruturaCombo();	
		
		//Selecionar a opção desejada
		page.clicarNoElemento();
		
		//Verificar a opção escolhida 
		Assert.assertEquals("XBox One", page.obterValorCombo());
		
		//Verificar status dos elementos checkBox e switch antes de clicar
		Assert.assertFalse(page.antesClickCheck());
		Assert.assertTrue(page.antesClickSwitch());
	
		page.clicarCheck();
		page.clicarSwitch();
		
		//Checando estado alterado da aplicação
		Assert.assertTrue(page.aposClickCheck());
		Assert.assertFalse(page.aposClickSwitch());
		
		//Clicar no botão Salvar
		page.clicarBotaoSalvar();
		
		//Verificar retorno após clicar no botão salvar
		Assert.assertEquals("Nome: Cristian Jonas", page.checarNomeEscrito());
		Assert.assertEquals("Console: xone", page.checarConsoleEscrito());
		Assert.assertEquals("Checkbox: Marcado", page.checarCheckMarcado());
		
		//Clica no botão limpar
		page.clicarBotaoLimpar();
			
	}
	
	@Test
	public void preencheFormularioDemorado(){	
				
		//Escrever nome
        page.escreverNome("Cristian Jonas");
		
		//Checar nome escrito
		Assert.assertEquals("Cristian Jonas", page.obterTexto());
		
		
		//Clicar no botão Salvar
		page.clicarBotaoSalvarDemorado();
		
		//Verificar retorno após clicar no botão salvar
		Assert.assertEquals("Nome: Cristian Jonas", page.checarNomeEscrito());
		
		
	}
	
	@Test
	public void deveInteragirComData() {
		page.clicarPorData();
		page.clicarNaData();
		page.confirmar();
		Assert.assertEquals("19/01/2000", page.verificaDataEscohida());
	}

	
	

	
}
