package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aypn\\eclipse-workspace\\Selenium\\Drriver\\chromedriver.exe");
		
	// Launch Browser
		
		WebDriver driver = new ChromeDriver();
		
	// get method - to launch the url
		
		driver.get("https://www.amazon.com/");
		
	// maximize the screeen
		
		driver.manage().window().maximize();
		
	// get method  - to get the title name of the page
		
		String title = driver.getTitle();
		
		System.out.println("title name is: " + title);
		
	// getcurrenturl method  - to get the current url
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("The current url is:  " +currentUrl);
		
	// navigate method - to navigate to the next url
		
		driver.navigate().to("https://www.google.com/search?q=google&oq=google&aqs=chrome..69i60j69i57j69i59l2j69i60l4.5574j0j4&sourceid=chrome&ie=UTF-8");
		
	// navigate back to the old url
		
		driver.navigate().back();
		
	// forward back to the current url again
		
		driver.navigate().forward();
		
	// to refresh the page
		
		driver.navigate().refresh();
	
	}
}
