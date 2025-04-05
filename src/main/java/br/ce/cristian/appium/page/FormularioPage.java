package br.ce.cristian.appium.page;

import org.openqa.selenium.By;

import br.ce.cristian.appium.core.BasePage;
import io.appium.java_client.MobileBy;

//Formulario Page como localizar um elemento na tela e como interagir com eles usando o metodo da classe DSL
public class FormularioPage extends BasePage{
	
	
	
	public void escreverNome(String nome)  {
		
		//Escrever nome
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		escrever(MobileBy.AccessibilityId("nome"), nome);
	}
	
	public String obterTexto() {
		
		return obtertexto(MobileBy.AccessibilityId("nome")); 
	}
	
	
	public void clicarNoElemento() {
		clicarNoElemento(By.xpath("//android.widget.CheckedTextView[@text='XBox One']"));

	}
	
	public void clicaEstruturaCombo() {
		clicarEstruturaCombo(MobileBy.AccessibilityId("console"));	
	}
	
	public String obterValorCombo() {
		return obtertexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}
	
	
	public Boolean  antesClickCheck() {
		return isCheckMarcado(By.xpath("//android.widget.CheckBox"));
	}
	
	public Boolean  antesClickSwitch() {
		return isCheckMarcado(By.xpath("//android.widget.Switch"));
	}
	
	public void clicarCheck() {
		clicarNoElemento(By.xpath("//android.widget.CheckBox"));
	}
	
	
	public void clicarSwitch() {
		clicarNoElemento(By.xpath("//android.widget.Switch"));
	}
	
	
	
	public Boolean  aposClickCheck() {
		return isCheckMarcado(By.xpath("//android.widget.CheckBox"));
	}
	
	public Boolean  aposClickSwitch() {
		return isCheckMarcado(By.xpath("//android.widget.Switch"));
	}
	
	public void clicarBotaoSalvar() {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='SALVAR']"));

	}
	
	public String checarNomeEscrito() {
		return obtertexto(By.xpath("//android.widget.TextView[@text='Nome: Cristian Jonas']"));
	}
	
	public String checarConsoleEscrito() {
		return obtertexto(By.xpath("//android.widget.TextView[@text='Console: xone']"));
	}
	
	public String checarCheckMarcado() {
		return obtertexto(By.xpath("//android.widget.TextView[@text='Checkbox: Marcado']"));
	}
	
	public void clicarBotaoLimpar() {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='LIMPAR']"));
	}

	public void clicarBotaoSalvarDemorado() {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='SALVAR DEMORADO']"));
		
	}
	
	public void clicarPorData() {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='01/01/2000']"));  
		
	}
	
	public void clicarNaData() {
		clicarNoElemento(By.xpath("//android.view.View[@text='19']"));
		
	}
	
	public void confirmar() {
		clicarNoElemento(By.xpath("//android.widget.Button[@text='OK']"));
		
	}
	
	public String verificaDataEscohida() {
		return obtertexto(By.xpath("//android.widget.TextView[@text='19/01/2000']"));
	}
	
	
	
}
