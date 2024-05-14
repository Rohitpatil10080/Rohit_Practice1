package Scetion14_Java_Streams; // Package declaration

import java.util.List; // Importing List interface
import java.util.stream.Collectors; // Importing Collectors class for Stream operations

import org.openqa.selenium.By; // Importing By class from Selenium
import org.openqa.selenium.WebElement; // Importing WebElement interface from Selenium
import org.openqa.selenium.chrome.ChromeDriver; // Importing ChromeDriver class from Selenium
import org.testng.Assert; // Importing Assert class from TestNG

import io.github.bonigarcia.wdm.WebDriverManager; // Importing WebDriverManager class for managing WebDriver binaries

public class Filter_WebTable_using_strems { // Class declaration

	public static void main(String[] args) { // Main method

		WebDriverManager.chromedriver().setup(); // Setting up ChromeDriver using WebDriverManager

		ChromeDriver driver = new ChromeDriver(); // Creating an instance of ChromeDriver

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers"); // Navigating to a webpage

		driver.findElement(By.id("search-field")).sendKeys("Rice"); // Finding the search field and typing "Rice"

		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]")); // Finding elements using XPath

		List<WebElement> veglist = veggies.stream() // Converting the list to a stream
				.filter(veg -> veg.getText().contains("Rice")) // Filtering elements containing "Rice"
				.collect(Collectors.toList()); // Collecting filtered elements into a list

		Assert.assertEquals(veggies.size(), veglist.size()); // Asserting that original and filtered list sizes are
																// equal
	}
}