package com.irctc.BasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonClass{
	
	public int waitPageToLoad(int n) {
		BrowserDriver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(n));
		return n;
	}
	public void waitPageToLoadXpath(String xpath) {
		WebDriverWait wait = new WebDriverWait(BrowserDriver.driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}
	public void waitPageToLoadId(String id) {
		WebDriverWait wait=new WebDriverWait(BrowserDriver.driver,Duration.ofSeconds(20));
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(id)));
	}
	public void waitPageToLoadName(String name) {
		WebDriverWait wait=new WebDriverWait(BrowserDriver.driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(name)));
		
	}
	
}
