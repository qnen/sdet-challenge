package com.interview.tasks;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.interview.utils.Selenium;

public class TaskOne {

	static WebDriver driver = Selenium.getSelenium();
	static WebDriverWait wait = Selenium.getWait(40);
	
	static String wikipediaUrl = "https://www.wikipedia.org";
	
	static By wikipediaSuccessfullLoadPageText = By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span");
	static By wikipediaSearchInput = By.id("searchInput");
	static By wikipediaLanguageButton = By.id("searchLanguage");
	static By wikipediaEnglishLanguageSelector = By.cssSelector("#searchLanguage > option:nth-child(17)");
	static By wikipediaSearchButton = By.cssSelector("#search-form > fieldset > button");
	static By wikipediaLogoAssertionResultPage = By.cssSelector("#p-logo > a");
	
	static String expectedSearchResultTitle = "Voyager 1";
	static String expectedFirstParagraph = "Outer planetary, heliosphere, and interstellar medium exploration";
	
	@Test
	public void TaskOne() {
		
		driver.get(wikipediaUrl);
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(wikipediaSuccessfullLoadPageText));
		
		wait.until(ExpectedConditions.elementToBeClickable(wikipediaSearchInput));
		driver.findElement(wikipediaSearchInput).sendKeys("Voyager 1");
		
		driver.findElement(wikipediaLanguageButton).click();
		driver.findElement(wikipediaEnglishLanguageSelector).click();
		driver.findElement(wikipediaSearchButton).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(wikipediaLogoAssertionResultPage));

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"firstHeading\"]/i[contains(text(),'Voyager 1')]")));
		assertEquals(expectedSearchResultTitle, driver.findElement(By.xpath("//*[@id=\"firstHeading\"]/i[contains(text(),'Voyager 1')]")).getText());

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[3]/td[contains(text(),'Outer planetary, heliosphere, and interstellar medium exploration')]")));
		assertEquals(expectedFirstParagraph, driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[3]/td[contains(text(),'Outer planetary, heliosphere, and interstellar medium exploration')]")).getText());
		
		driver.quit();
		
	}
	
}
