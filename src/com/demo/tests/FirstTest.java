package com.demo.tests;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;


public class FirstTest {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setBefore() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 //driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	//driver.get("https://www.google.com/");
	//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	
	}

	@Test
	public void setUp() {
//Actions action = new Actions(driver);
		
		Utility.captureScreenShots(driver);

	}

}
