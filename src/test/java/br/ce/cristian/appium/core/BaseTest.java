package br.ce.cristian.appium.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//Comportamento para se reproduzir em todos os testes
public class BaseTest {

	@Rule
	public TestName testeName = new TestName();

	@AfterClass
	public static void finalizaClasse() {
		DriverFactory.killdriver();
	}

	@After
	public void tearDown() {
		gerarScreenShot();

		if (DriverFactory.getdriver() != null) {
			DriverFactory.getdriver().quit();
		}
	}

	// Metodo para tirar uma ScreenShot de uma tela
	public void gerarScreenShot() {

		File imagem = ((TakesScreenshot) DriverFactory.getdriver()).getScreenshotAs(OutputType.FILE);

		try {
			File absolutPath = new File("target/screenshots/" + testeName.getMethodName() + ".png");
			FileUtils.copyFile(imagem, absolutPath);
			System.out.println(absolutPath);

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
