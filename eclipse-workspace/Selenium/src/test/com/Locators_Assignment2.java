package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Assignment2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aypn\\eclipse-workspace\\Selenium\\Drriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// tolaunch webpage
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		// to find out the first web element
		
		WebElement source = driver.findElement(By.id("src"));
		
		// to enter values in the from textbox
		
		source.sendKeys("Chennai");
		
		// to find the to textbox
		
		WebElement destination = driver.findElement(By.id("dest"));
		
		destination.sendKeys("Pondicherry");
		
		// to find the date textbox
		
		// WebElement date = driver.findElement(By.id("onward_cal"));
		
		// date.sendKeys("");
		
		// to find the 'search buses' text box
		
		WebElement button = driver.findElement(By.id("search_btn"));
		
		// to click the search button
		
		button.click();
	}

}
