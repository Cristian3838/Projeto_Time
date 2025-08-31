package br.ce.cristian.appium.page;

import org.openqa.selenium.By;

import br.ce.cristian.appium.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarFormulario() {

		// Acessar Formulário
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='Formulário']"));
	}

	public void acessaSplash() {

		clicarNoElemento(By.xpath("//android.widget.TextView[@text='Splash']"));
	}

	public void acessarMenuAlerta() {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='Alertas']"));

	}

	public void AcessarAbas() {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='Abas']"));

	}

	public void acessaAcorddion() {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='Accordion']"));

	}

	public void acessaAbasClique() {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='Cliques']"));

	}
	
	public void clicaOpcaoEscondida(String texto) {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='" + texto + "']"));
	}
	 
	public String checarNomeEscrito(String texto) {
		return obtertexto(By.xpath("//android.widget.TextView[@text='" + texto + "']"));
	}
	
	public void clicarEmSair(String texto) {
		clicarNoElemento(By.xpath("//android.widget.Button[@text='"+ texto + "']"));
	}

}
