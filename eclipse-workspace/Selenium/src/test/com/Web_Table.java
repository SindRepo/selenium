package test.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aypn\\eclipse-workspace\\Selenium\\Drriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// launch the url
		
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		
		// to maximize the webpage
		
		driver.manage().window().maximize();
		
		// to retrieve the whole table data
		
		System.out.println("***************All Data ****************");
		
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		// to get all the data in the table, go for for each loop
		
		for (WebElement data : all_data) {
			
			String values = data.getText();
			
			System.out.println(values);
			
		}
			
			
		System.out.println("***********All Row data*******************");
		
		List<WebElement> row_data = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		
		for (WebElement row_values : row_data) {
			
			String row_elements = row_values.getText();
			
			System.out.println(row_elements);
			
		}
			
		System.out.println("***************All Column Data****************");
		
		List<WebElement> column_data = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		
		for (WebElement column_values : column_data) {
			
			String column_elements = column_values.getText();
			
			System.out.println(column_elements);
		}
		
		System.out.println("********************Particular data************************");
		
		List<WebElement> part_data = driver.findElements(By.xpath("//table/tbody/tr[5]/td[2]"));
		
		for (WebElement part_values : part_data) {
			
			String part_element = part_values.getText();
			
			System.out.println(part_element);
			
		}
		
		System.out.println("*****************Particular value using for Loop************************");
		
		List<WebElement> part_data2 = driver.findElements(By.xpath("//table/tbody/tr[6]/td[4]"));
		
		for (int i = 0; i < part_data2.size(); i++) {
			
			String part_values2 = part_data2.get(i).getText();
			
			System.out.println(part_values2);
			
		}
			
		}
		
			
		}
		
	

