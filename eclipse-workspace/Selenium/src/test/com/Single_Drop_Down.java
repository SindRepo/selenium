package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Drop_Down {
	
	public static void main(String[] args) throws Throwable {
		
		// set system property to find the web driver file in the system
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drriver/chromedriver.exe");
		
		// create the object for the web driver class
		
		WebDriver driver = new ChromeDriver();
		
		// get the web page to access using the 'Get' method in the driver methods
		
		driver.get("https://www.facebook.com/");
		
		// to maximize the web page
		
		driver.manage().window().maximize();
		
		// find the xpath for the web element 'create a account' button
		
		WebElement Create_New_Acc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		// click the create new account button
		
		Create_New_Acc.click();
		
		// make the page sleep for 30 secs
		
		Thread.sleep(3000);
		
		// find the web element for the month 
		
		WebElement Month_element = driver.findElement(By.xpath("//select[@id='month']"));
		
		// create an object for the select class where will be able to access the drop down feature
		
		Select s = new Select(Month_element);
		
		// select the vlaue by using the method 'selectByValue' in the select class
		
		s.selectByValue("9");
		
		// find the web element for the 'day' web element
		
		WebElement Day_element = driver.findElement(By.xpath("//select[@id='day']"));
		
		// create an object for the 'day' web elemnt drop down
		
		Select s1 = new Select(Day_element);
		
		// use the 'selectByvisible' method to select the values in the day web element
		
		s1.selectByVisibleText("12");
		
		// find the web elemt for the year
		
		WebElement year_element = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s2 = new Select(year_element);
		
		s2.selectByIndex(9);
		
		
		
		
		
	}

}
