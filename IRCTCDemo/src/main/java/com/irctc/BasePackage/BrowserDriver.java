package com.irctc.BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDriver{
	public static WebDriver driver;
	public static WebDriver getBrowser() {
		if(ConstantsLib.browser.equalsIgnoreCase("chromedriver")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(ConstantsLib.browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else{
			System.out.println("Invalid Browser");
		}
		return driver;
	}

}
