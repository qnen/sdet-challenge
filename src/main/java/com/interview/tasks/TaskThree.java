package com.interview.tasks;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.interview.utils.Selenium;

public class TaskThree {

	static WebDriver driver = Selenium.getSelenium();
	static WebDriverWait wait = Selenium.getWait(40);
	
	@Test
	public void TaskThree() {
		
//		System.out.println("Explanation: To find the image on any pages of 10, we first take all the currenctly open windows, and so we iterate through all of them, "
//				+ "looking for the image locator on the page and if not found, switching to the next page doing it all over again until we find the image");
//		
//		String imageToFind = "image_locator_sample";
//		
//		// Getting number of open pages...
//		ArrayList<String> pages = new ArrayList<String>(driver.getWindowHandles());
//		String currentPage = driver.getWindowHandle();
//		System.out.println("No. of tabs: " + pages.size());
//		
//		for(String actualPage: pages) {
//			if(!actualPage.equalsIgnoreCase(currentPage)) {
//			// Switch to the opened tab
//			driver.switchTo().window(actualPage);
//			
//			// Searching for image locator...
//			driver.findElement(By.id("imageToFind")).isDisplayed();
//			}
//		}
	}	
}
