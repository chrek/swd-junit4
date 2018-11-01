package com.criscar.blazemeter.tests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.criscar.blazemeter.environment.EnvironmentManager;
import com.criscar.blazemeter.environment.RunEnvironment;

public class JUnit4ExampleTest {

	@Before
	public void startBrowser() {
		EnvironmentManager.initWebDriver();
	}

	@Test
	public void verifySiteURL() {
		WebDriver driver = RunEnvironment.getWebDriver();
		driver.get("https://www.blazemeter.com/selenium");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String siteUrl = driver.findElement(By.xpath("//*[@id=\"logo_image\"]")).getAttribute("href");
		assertEquals("https://www.blazemeter.com/", siteUrl);
	}

	@After
	public void tearDown() {
		EnvironmentManager.shutDownDriver();
	}

}
