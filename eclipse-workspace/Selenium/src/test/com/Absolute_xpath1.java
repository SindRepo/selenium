package test.com;

public class Absolute_xpath1 {
	
	package test.com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Absolute_Xpath {

	public static void main(String[] args) {
			
			//use set and get the system property to locate the path of the web driver
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drriver//chromedriver.exe");
			
			// create the object for the chrome driver class
			
			WebDriver driver = new ChromeDriver();
			
			//use the get() method from the driver methods to access the url
			
			driver.get("https://www.amazon.com/s?k=i+phones&ref=nb_sb_noss_2");
			
			// maximize the window
			
			driver.manage().window().maximize();
			
			// find the web elelemt using the absolute x path
			
			WebElement image_btn = driver.findElement(By.xpath(""));
			
			// to click the web element
			
			image_btn.click();

}
