package Section1to13_code_RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Section12_Assignment2 {

    public static void main(String[] args) throws InterruptedException {
    	
    	
    	   // Setup Firefox WebDriver
        WebDriverManager.firefoxdriver().setup(); // Sets up the Firefox WebDriver

        // Create a new FirefoxDriver instance
        FirefoxDriver driver = new FirefoxDriver(); // Creates a new FirefoxDriver object and assigns it to the WebDriver interface

        // Initialize WebDriver
      //  WebDriver driver = new ChromeDriver();
        
        // Navigate to the webpage
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        
        // Locate the autocomplete input field and enter "ind"
        WebElement autocompleteInput = driver.findElement(By.id("autocomplete"));
        autocompleteInput.sendKeys("ind");
        
        // Pause to allow suggestions to load
        Thread.sleep(3000);
        
        // Use the DOWN arrow key twice to navigate to the desired option
        autocompleteInput.sendKeys(Keys.DOWN);
        autocompleteInput.sendKeys(Keys.DOWN);
        
        // Click on the "India" option from the dropdown
        driver.findElement(By.xpath("//div[text()='India']")).click();
        
        // Close the browser
        driver.quit();


//	 Actions s =new Actions(driver);
//	   
//	s.moveToElement(driver.findElement(By.xpath("//div[text()='India']"))); 
//	 
	
	
	
	
	
	
	
	
	
	
	
	}

}