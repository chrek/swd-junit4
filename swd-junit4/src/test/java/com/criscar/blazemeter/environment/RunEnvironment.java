package com.criscar.blazemeter.environment;

import org.openqa.selenium.WebDriver;

public class RunEnvironment {
	
	private static WebDriver webDriver;

	public static WebDriver getWebDriver() {
		return webDriver;
	}

	public static void setWebDriver(WebDriver webDriver) {
		RunEnvironment.webDriver = webDriver;
	}

}
