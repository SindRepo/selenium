package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aypn\\eclipse-workspace\\Selenium\\Drriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// to launch the webpage
		
		driver.get("https://www.facebook.com/");
		
		// to maximize
		
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.id("email"));
		
		findElement.sendKeys("xyz@gmail.com");
		
		WebElement findElement2 = driver.findElement(By.id("pass"));
		
		findElement2.sendKeys("abc@123");
		
		WebElement findElement3 = driver.findElement(By.name("login"));
		
		findElement3.click();
	}

}
