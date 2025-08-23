package br.ce.cristian.appium.core;

import static br.ce.cristian.appium.core.DriverFactory.getdriver;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

//Classe responsável para encontrar os seletores
public class BasePage {

	public void escrever(By by, String texto) {

		getdriver().findElement(by).sendKeys(texto);

	}

	public Boolean existeElementoPorTexto(By by) {
		getdriver().findElement(by).getText();
		return true;
	}

	public String obtertexto(By by) {

		return getdriver().findElement(by).getText();
	}

	public void clicarEstruturaCombo(By by) {

		getdriver().findElement(by).click();

	}

	public boolean isCheckMarcado(By by) {

		return getdriver().findElement(by).getAttribute("checked").equals("true");

	}

	public void clicarNoElemento(By by) {
		getdriver().findElement(by).click();
	}

	public void tap(int x, int y) {
	    new TouchAction<>(getdriver())
	        .tap(PointOption.point(x, y))
	        .perform();
	}
	
	
	

}
