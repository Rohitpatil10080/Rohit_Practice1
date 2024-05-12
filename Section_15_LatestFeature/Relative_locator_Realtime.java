// Package declaration
package Section_15_LatestFeature;

// Importing necessary Selenium classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import io.github.bonigarcia.wdm.WebDriverManager; // Importing WebDriverManager class for managing WebDriver binaries

// Class declaration
public class Relative_locator_Realtime {

    // Main method
    public static void main(String[] args) {

        // Setting up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Creating an instance of ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Navigating to a webpage
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // Finding the label associated with the Date of Birth field
        WebElement DateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));

        // Using RelativeLocator to locate an input element below the Date of Birth label and clicking on it
        driver.findElement(RelativeLocator.with(By.tagName("input")).below(DateOfBirth)).click();
        
        
        // Comment for toLeftOf() - Element located to the left of the specified element
        // Finding the element located to the left of the specified element and clicking on it
        WebElement leftof = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(leftof)).click();
        
        
        // Comment for toRightOf() - Element located to the right of the specified element
        // Finding the element located to the right of the specified element and printing its text
        WebElement Rightof = driver.findElement(By.id("inlineRadio1"));
        System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).toRightOf(Rightof)).getText());
    }
}