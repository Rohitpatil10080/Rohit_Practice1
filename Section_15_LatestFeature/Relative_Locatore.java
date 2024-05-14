package Section_15_LatestFeature; // Package declaration

import org.openqa.selenium.By; // Importing By class from Selenium
import org.openqa.selenium.WebElement; // Importing WebElement interface from Selenium
import org.openqa.selenium.chrome.ChromeDriver; // Importing ChromeDriver class from Selenium
import org.openqa.selenium.support.locators.RelativeLocator; // Importing RelativeLocator from Selenium support library

import io.github.bonigarcia.wdm.WebDriverManager; // Importing WebDriverManager class for managing WebDriver binaries

public class Relative_Locatore { // Class declaration

    public static void main(String[] args) { // Main method
        
        // Explanation of relative locator methods:
        // above() - Element located above with respect to the specified element
        // below() - Element located below with respect to the specified element
        // toLeftOf() - Element located to the left of the specified element
        // toRightOf() - Element located to the right of the specified element
        
        // Syntax:
        // driver.findElement(with(By.tagName("tag"))).above(element)
        
        WebDriverManager.chromedriver().setup(); // Setting up ChromeDriver using WebDriverManager
        
        ChromeDriver driver = new ChromeDriver(); // Creating an instance of ChromeDriver
        
        driver.get("https://rahulshettyacademy.com/angularpractice/"); // Navigating to a webpage
        
        WebElement locator = driver.findElement(By.cssSelector("[name='name']")); // Finding the target element
        
        // Using RelativeLocator to locate an element above the specified element and printing its text
        System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).above(locator)).getText());
    }

}