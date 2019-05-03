package com.carolsmanioto.com.correiosfunctionaltests.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseSelenium {
	
	public static WebDriver driver = getDriver();
	
	public BaseSelenium() {
		PageFactory.initElements(driver, this);
	}
	
	@BeforeClass
	public static void setupCases() {
		driver = SeleniumFactory.getDriver(Browser.Chrome.toString(), OperationalSystem.Linux.toString());
		driver.manage().window().maximize();
	}
	
	@Before
	public void beforeCase() {
	}
	
	@After
	public void afterCase() {
	}
	
	@AfterClass
	public static void finishCases() {
		driver.quit();
	}
	
	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException ignore) {
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
}
