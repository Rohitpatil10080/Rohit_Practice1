package Section1to13_code_RahulShetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class WindowActivities {

    public static void main(String[] args) throws InterruptedException {
    	
    	
    	
    	   // Setup Firefox WebDriver
        WebDriverManager.firefoxdriver().setup(); // Sets up the Firefox WebDriver

        // Create a new FirefoxDriver instance
        FirefoxDriver driver = new FirefoxDriver(); // Creates a new FirefoxDriver object and assigns it to the WebDriver interface

        // Initialize ChromeDriver
        //WebDriver driver = new ChromeDriver();

        // Set implicit wait timeout to 5 minutes
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));

        // Maximize the browser window
        driver.manage().window().maximize();

        // Minimize the browser window
        driver.manage().window().minimize();

        // Wait for 2 seconds
        Thread.sleep(2000);

        // Navigate to google.com
        driver.get("http://google.com");

        // Navigate to rahulshettyacademy.com
        driver.navigate().to("https://rahulshettyacademy.com");

        // Wait for 2 seconds
        Thread.sleep(2000);

        // Navigate back to the previous page
        driver.navigate().back();

        // Wait for 2 seconds
        Thread.sleep(2000);

        // Navigate forward to the next page
        driver.navigate().forward();

        // Navigate back to the previous page
        driver.navigate().back();

        // Close the browser
        driver.quit();
    }
}
