package br.ce.cristian.appium.page;

import org.openqa.selenium.By;

import br.ce.cristian.appium.core.BasePage;
import br.ce.cristian.appium.core.DriverFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class CliquesPage extends BasePage {

	public void cliqueLongo() {

		new TouchAction<>(DriverFactory.getdriver()).longPress(ElementOption.element(
				DriverFactory.getdriver().findElement(By.xpath("//android.widget.TextView[@text='Clique Longo']"))))
				.release().perform();

	}

	public String obterTextoPorCampo() {
		return obtertexto(By.xpath("(//android.widget.TextView)[3]"));
	}

	public void duploClique() {

		new TouchAction<>(DriverFactory.getdriver()).tap(tapOptions()
				.withElement(element(
						DriverFactory.getdriver().findElement(By.xpath("//android.widget.TextView[@text='Clique duplo']"))))
				.withTapsCount(2)).perform();
	}

	public String obterTextoDuploClique(String texto) {
		return obtertexto(By.xpath("//android.widget.TextView[@text='" + texto + "']"));
	}
}
