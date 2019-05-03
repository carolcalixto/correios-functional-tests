package com.carolsmanioto.com.correiosfunctionaltests.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class SeleniumFactory {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver(String browser, String operationalSystem) {
		if(driver == null) {
			getDriverByBrowser(browser, operationalSystem);
		}
		return driver;
	}
	
	private static void getDriverByBrowser(String browser, String operationalSystem) {
		if (Browser.Chrome.toString().equalsIgnoreCase(browser)) {
			final String file = OperationalSystem.Linux.toString().equalsIgnoreCase(operationalSystem) ? "chromedriver" : "chromedriver.exe";
			final String pathDriverChrome = System.getProperty("user.dir") + "/drivers/" + file;
			System.setProperty("webdriver.chrome.driver", pathDriverChrome);
			driver = new ChromeDriver();
		} else if (Browser.Mozila.toString().equalsIgnoreCase(browser)) {
			final String pathDriverMozila = System.getProperty("user.dir") + "/drivers/geckodriver";
			System.setProperty("webdriver.gecko.driver", pathDriverMozila);
			driver = new FirefoxDriver();
		}
	}
	
}
