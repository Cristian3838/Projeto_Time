package br.ce.cristian.appium.page;

import org.openqa.selenium.By;

import br.ce.cristian.appium.core.BasePage;

public class AcorddionPage extends BasePage {
	
	public void clicarNaOpcao1() {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='Opção 1']"));
	}
	
	public String retornaTextoOpcao1(){
			return obtertexto(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 1']"));
	
	}

	public void clicarNaOpcao2() {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='Opção 2']"));
		
	}

	public String retornaTextoOpcao2() {
		
		return obtertexto(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 2']"));
	}

}
