package test.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Drriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// wait  - implicit wait - wait for a certain amount of time 
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// get the url
		
		driver.get("https://www.google.com/");
		
		// to maximize the window
		
		driver.manage().window().maximize();
		
		// to find the web element using xpath - input type
		
		WebElement Google_image = driver.findElement(By.xpath("//img[@alt='Google']"));
		
		// create a webdriverwaut class for the explicit wait and its object
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		
		
		// wait - explicitly wait - wait until the certain conditions is met
		
		wait.until(ExpectedConditions.visibilityOf(Google_image));
		
		
		// fluent wait - wait - wait for a speicifed condition for a frquency of interval
		
		// create a object for the fulent wait
		
		Wait wait1 = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS).ignoring(Exception.class);
		
		

	}

}
