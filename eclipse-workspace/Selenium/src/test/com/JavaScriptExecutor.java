package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drriver\\chromedriver.exe");
		
		// create object for the web driver class
		
		WebDriver driver = new ChromeDriver();
		
		// get the url by using the web driver object
		
		driver.get("https://www.amazon.com/");
		
		// maximize the window
		
		driver.manage().window().maximize();
		
		// find the web elemet and write a xpath
		
		WebElement Get_to_know_txt = driver.findElement(By.xpath("//div[text()='Get to Know Us']"));
		
		// scroll down to find the web element
		
		// create a reference variable for the JavaScriptexecutor Interface
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// add the syntax for the java script excecutor for scroll down
		
		js.executeScript("arguments[0].scrollIntoView();", Get_to_know_txt);
		
		// make the page sleep for 30 secs
		
		Thread.sleep(3000);
		
		// find the web element to scroll up
		
		WebElement easy_upgrade_txt = driver.findElement(By.xpath("//h2[text()='Easy upgrades, big impact']"));
		
		//scroll up to view another web element 
		
		js.executeScript("arguments[0].scrollIntoView();", easy_upgrade_txt);
		
		
		
		
		
		
		
		
		
		
	}
}
