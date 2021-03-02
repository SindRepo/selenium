package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over_action {
	
	public static void main(String[] args) {
		
		//use set and get the system property to locate the path of the web driver
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drriver//chromedriver.exe");
		
		// create the object for the chrome driver class
		
		WebDriver driver = new ChromeDriver();
					
		//use the get() method from the driver methods to access the url
					
		driver.get("http://automationpractice.com/index.php");
					
		// maximize the window
					
		driver.manage().window().maximize();
		
		// create the object for the Actions class, where all the mouse over actins methods are found
		
		Actions a = new Actions(driver);
		
		// find the web element for the mouse over actions
		
		WebElement women_webelement = driver.findElement(By.xpath("//a[text()='Women']"));
		
		a.moveToElement(women_webelement).build().perform();
		
		// to click the web element with mouse over method 
		
		// find the web element to click
		
		WebElement blouses_webelement = driver.findElement(By.xpath("//a[text()='Blouses']"));
		
		a.click(blouses_webelement).build().perform();
					
		
		
	}
			

}

