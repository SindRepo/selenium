package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Xpath {
	
	public static void main(String[] args) {
		
		// set the system property to call the particular web page using its webdriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aypn\\eclipse-workspace\\Selenium\\Drriver\\chromedriver.exe");
		
		// create the driver object for the particular webdriver
		
		WebDriver driver = new ChromeDriver();
		
		// get the particular url
		
		driver.get("https://www.facebook.com/");
		
		// Maximize the webpage
		
		driver.manage().window().maximize();
		
		// use fidnElelement method to find the particular webelement by xpath(input iype)
		
		WebElement Facebook_email = driver.findElement(By.xpath("//input[@name='email']"));
		
		// to add values in the webelement
		
		Facebook_email.sendKeys("acb@gmail.com");
		
		// to find the webelement by text type
		
		WebElement Create_a_page = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		
		// to get the text of create a page web element
		
		String text = Create_a_page.getText();
		System.out.println(text);
		
		Create_a_page.click();
		
	}

}
