package com.interview.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
	public static WebDriver driver;
	public static WebDriver getSelenium() {		
		System.setProperty("webdriver.chrome.driver", "D:\\dev\\projects\\challenges\\tasks\\src\\main\\resources\\drivers\\chromedriver.exe");
		if(driver == null) {			
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	public static WebDriverWait getWait(int time) {
	    Duration durationInMinutes = Duration.ofMinutes(time);
		WebDriverWait wait = new WebDriverWait(driver, durationInMinutes);
		return wait;
	}
}
