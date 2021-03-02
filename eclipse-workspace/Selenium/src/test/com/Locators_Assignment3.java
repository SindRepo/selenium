package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Assignment3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aypn\\eclipse-workspace\\Selenium\\Drriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// to lauch the url
		
		driver.get("https://www.google.com/");
		
		// to maximize the window
		
		driver.manage().window().maximize();
		
		// to find the webelement for the earch text box
		
		WebElement searchbox = driver.findElement(By.id("input"));
		
		// to enter values in the search text box
		
		searchbox.sendKeys("Greens Technology");
		
		// to find the webelement for the search button
		
		WebElement icon = driver.findElement(By.id("icon"));
		
		// to click the icon
		
		icon.click();
	}
	

}
