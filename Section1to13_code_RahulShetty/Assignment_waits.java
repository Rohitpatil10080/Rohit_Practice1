<<<<<<< HEAD
package Section1to13_code_RahulShetty; // Declares the package name

import java.time.Duration;
import java.util.Arrays; 
import java.util.List; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; // Imports WebDriver interface for browser interaction
import org.openqa.selenium.WebElement; // Imports WebElement interface for web element interaction
import org.openqa.selenium.chrome.ChromeDriver; // Imports ChromeDriver class for Chrome browser interaction
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions; // Imports ExpectedConditions class for wait conditions
import org.openqa.selenium.support.ui.Select; // Imports Select class for dropdown selection
import org.openqa.selenium.support.ui.WebDriverWait; // Imports WebDriverWait class for explicit waits

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_waits { // Defines a class named Assignment_waits

	public static void main(String[] args) throws InterruptedException { // Main method
		
		WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver=new FirefoxDriver();

		
		// Creates a new ChromeDriver object and assigns it to the WebDriver interface

		//WebDriver driver = new ChromeDriver(); 
		
		// Opens the specified URL in the Chrome browser
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/"); 
		
		int j = 0; // Initializes an integer variable 'j' to count the number of mobile devices
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Sets implicit wait to 5 seconds
		
		// Login
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy"); // Enters username
		driver.findElement(By.id("password")).sendKeys("learning"); // Enters password
		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click(); // Clicks on the "User" button
		Thread.sleep(2000); // Pauses execution for 2 seconds
		driver.findElement(By.id("okayBtn")).click(); // Clicks on the "Okay" button

		// Select "Consultant" from dropdown and accept terms
		WebElement dropdown = driver.findElement(By.xpath("//div/select")); // Finds the dropdown element
		Select s = new Select(dropdown); // Initializes a new Select object with the dropdown element
		s.selectByVisibleText("Consultant"); // Selects "Consultant" from the dropdown
		driver.findElement(By.id("terms")).click(); // Accepts terms

		// Click on sign in button
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3)); // Initializes WebDriverWait object
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("signInBtn"))); // Waits until "signInBtn" is visible
		driver.findElement(By.id("signInBtn")).click(); // Clicks on the "Sign In" button

		// Array of mobile devices
		String[] mob = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" }; // Array of mobile devices

		// Find all devices on the page
		List<WebElement> devices = driver.findElements(By.xpath("//div/h4")); // Finds all device elements

		// Iterate through devices and click on corresponding "Add" buttons
		for (int i = 0; i < devices.size(); i++) { // Iterates through each device
			String items = devices.get(i).getText(); // Gets the text of the current device
			List<String> item = Arrays.asList(mob); // Converts array to list
			if (item.contains(items)) { // Checks if the current device is in the list of mobile devices
				j++; // Increments the count of mobile devices found

				// Find and click the "Add" button for the current device
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initializes WebDriverWait object
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-info']"))); // Waits until "Add" button is clickable
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click(); // Clicks on the "Add" button

				if (j == mob.length) { // Checks if all mobile devices have been found
					break; // Exits the loop
				}
			}
		}
	}
=======
package Section1to13_code_RahulShetty;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_waits {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		int j = 0;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// login

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("okayBtn")).click();

		// Select "Consultant" from dropdown and accept terms

		WebElement dropdown = driver.findElement(By.xpath("//div/select"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();

		//// Click on sign in button

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("signInBtn")));
		driver.findElement(By.id("signInBtn")).click();

		// Array of mobile devices

		String[] mob = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };

		// Find all devices on the page

		List<WebElement> devices = driver.findElements(By.xpath("//div/h4"));

		//// Iterate through devices and click on corresponding "Add" buttons

		for (int i = 0; i < devices.size(); i++) {
			String items = devices.get(i).getText();
			List<String> item = Arrays.asList(mob);
			if (item.contains(items)) {
				j++;

				// Find and click the "Add" button for the current device

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-info']")));
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();

				if (j == mob.length) {
					break;
				}
			}

		}

	}

>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
}
