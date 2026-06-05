package br.ce.cristian.appium.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {
	//Variavel Global
		private static AndroidDriver<MobileElement> driver;
		
		
		public static AndroidDriver<MobileElement> getdriver(){
			if(driver == null) { 
				createDriver();  
			}
			return driver;
		}
		
		
		private static void createDriver()  {
			// Definir as capacidades desejadas 
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("deviceName", "Android Emulator");
			capabilities.setCapability("automationName", "uiautomator2");
			capabilities.setCapability("appPackage", "com.saulo.timer"); 
			capabilities.setCapability("appActivity", "com.saulo.timer.MainActivity"); 

			// Inicializar o driver do Appium
			 try {
				driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			 
			//Aguardar um pouco após o clique
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public static void killdriver() {
			if(driver != null) {
				driver.quit();
				driver = null;
			}
		}
		

}
