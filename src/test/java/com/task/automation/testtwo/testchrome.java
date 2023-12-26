package com.task.automation.testtwo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class testchrome {
	

	@Test
	public void chrome() throws MalformedURLException, InterruptedException {
		
		ChromeOptions dcc = new ChromeOptions();
		dcc.setCapability("browserName", "chrome");
		dcc.setCapability("OS", "Linux");
		dcc.setAcceptInsecureCerts(true);
		dcc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		dcc.addArguments("use-fake-ui-for-media-stream");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dcc);
		driver.get("https://www.google.com");
		System.out.print("Executed Successfully Chrome");
		Thread.sleep(5000);
		driver.quit();
	
}}
