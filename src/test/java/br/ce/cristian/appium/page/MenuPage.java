package br.ce.cristian.appium.page;

import org.openqa.selenium.By;

import br.ce.cristian.appium.core.BasePage;

public class MenuPage extends BasePage {

	public void acessaMenu() {
			obtertexto(By.xpath("//android.widget.TextView[@text='Workout Timer']"));
	}

}
