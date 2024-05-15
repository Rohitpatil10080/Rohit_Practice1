package Section1to13_code_RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Section12_assignment {

    public static void main(String[] args) {
    	
    	
    	
    	   // Setup Firefox WebDriver
        WebDriverManager.firefoxdriver().setup(); // Sets up the Firefox WebDriver

        // Create a new FirefoxDriver instance
        FirefoxDriver driver = new FirefoxDriver(); // Creates a new FirefoxDriver object and assigns it to the WebDriver interface

        // Initialize WebDriver
       // WebDriver driver = new ChromeDriver();
        
        // Navigate to the webpage
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        // Find the element containing the table
        WebElement table = driver.findElement(By.id("product"));
        
        // Print the number of rows in the table
        System.out.println("Total rows present: " + table.findElements(By.tagName("tr")).size());

        // Print the number of columns in the table (assuming all rows have the same number of columns)
        System.out.println("Total columns present: " + table.findElements(By.tagName("th")).size());

        // Print the text of the third row (assuming the rows are indexed from 0)
        System.out.println("Text of the third row: " + driver.findElement(By.xpath("//tbody/tr[3]")).getText());

        // Close the browser
        driver.quit();
    }
}