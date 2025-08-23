package br.ce.cristian.appium.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.ce.cristian.appium.core.BasePage;

public class AlertaPage extends BasePage {
	
	public void clicarAlertaConfirm() {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='ALERTA CONFIRM']"));
		
	}
	
	public String obterTituloTexto() {
		return obtertexto(By.xpath("//android.widget.TextView[@text='Info']"));
	}

	public String frasePageModal1() {
		return obtertexto(By.xpath("//android.widget.TextView[@text='Confirma a operação?']"));
	}

	public void clicarBotaoConfirm() {
		clicarNoElemento(By.xpath("//android.widget.Button[@text='CONFIRMAR']"));
		
	}

	public String frasePageModal2() {
		
		return obtertexto(By.xpath("//android.widget.TextView[@text='Confirmado']"));
	}

	public void clicarBotao(String texto ){
		clicarNoElemento(By.xpath("//android.widget.Button[@text='" + texto + "']"));
		
	}
	
	public void clciarAlertaSimples(String texto) {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='" + texto +"']"));
	}
	
	public void clicarForaCaixa(int x, int y) { 
		tap(x, y );
	}
	
	public boolean isTituloVisivel(String texto) {
	 
	      return existeElementoPorTexto(By.xpath("//android.widget.TextView[@text='"+ texto +"']"));
	        
	}


}
