package test.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {
	
	public static void main(String[] args) {
		
		//use set and get the system property to locate the path of the web driver
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drriver//chromedriver.exe");
		
		// create the object for the chrome driver class
		
		WebDriver driver = new ChromeDriver();
		
		//use the get() method from the driver methods to access the url
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		// maximize the window
		
		driver.manage().window().maximize();
		
		//  first step - find the web element of the table using the findelelement() method
		
		WebElement multi_select_webelement = driver.findElement(By.xpath("//select[@id='multi-select']"));
		
		// step 2 - create an object for the select class to access the methods
		
		Select s = new Select(multi_select_webelement);
		
		// step 3 - find out if the drop down table is single or multiple select table using the isMultiple()
		
		boolean single_or_multi_dropdown = s.isMultiple();
		
		System.out.println("****************Drop down type****************");
		
		System.out.println("is mutilple dropdown :" + single_or_multi_dropdown);
	
		
		// step 4 - get all the options from the drop down
		
		 List<WebElement> get_all_options = s.getOptions();
		 
		 for (WebElement all_options : get_all_options) {
			 
			 String all_values = all_options.getText();
			 
			 System.out.println("************All Values in the dropdown****************");
			 
			 System.out.println(all_values);
			 	
		}
		 
		 // step 5 -get the size of all the options in the drop down
		 
		 int size = get_all_options.size();
		 
		 System.out.println("*************size of the Dropdown*******************");
		 
		 System.out.println(size);
		
		// step 6 - select the options from the drop down by using the for loop to select more than oneoption
		
		for (int i = 0; i < size; i++) {
			
			if (i %2 ==0) {
				
				s.selectByIndex(i);
				
			}
			
		}
			
		// step 7 - get all the selected options()
			
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			
			for (WebElement all_select : allSelectedOptions) {
				
				String all_select_values = all_select.getText();
				
				System.out.println("************selected values******************");
				
				System.out.println(all_select_values);
				
			}
		
		
		
		
		
	}

}
