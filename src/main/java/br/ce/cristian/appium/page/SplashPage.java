package br.ce.cristian.appium.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ce.cristian.appium.core.BasePage;
import static br.ce.cristian.appium.core.DriverFactory.getdriver;;


public class SplashPage extends BasePage {
	
	
	public boolean isTelaSplashVisivel() {
		return existeElementoPorTexto(By.xpath("//android.widget.TextView[@text='Splash!']"));
	}
	
	public String telaHome() {
		return obtertexto(By.xpath("//android.widget.TextView[@text='Formulário']"));
		
	}
	
	
	public void aguardarSplashSumir() {
		 getdriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		 WebDriverWait wait = new WebDriverWait(getdriver(), 10);
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));
		 

	}

}
