package Section1to13_code_RahulShetty; // Declares the package name

import org.openqa.selenium.By; // Imports the By class from Selenium
import org.openqa.selenium.WebDriver; // Imports the WebDriver interface from Selenium
import org.openqa.selenium.chrome.ChromeDriver; // Imports the ChromeDriver class from Selenium
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts { // Defines a class named Alerts

    public static void main(String[] args) throws InterruptedException { // Main method
    	
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver=new FirefoxDriver();

       // WebDriver driver = new ChromeDriver(); // Creates a new ChromeDriver object and assigns it to the WebDriver interface
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); // Opens the specified URL in the Chrome browser

        String name = "Rohit"; // Declares and initializes a String variable named 'name' with the value "Rohit"

        Thread.sleep(2000); // Pauses the execution of the program for 2000 milliseconds (2 seconds)

        // Finds the element by its ID and enters the value of 'name' into the input field
        driver.findElement(By.id("name")).sendKeys(name); 
        Thread.sleep(2000); // Pauses the execution for 2000 milliseconds (2 seconds)
        
        // Finds the element by CSS selector and clicks on it
        driver.findElement(By.cssSelector("#alertbtn")).click(); 
        Thread.sleep(2000); // Pauses the execution for 2000 milliseconds (2 seconds)
        
        // Switches to the alert dialog and accepts it
        driver.switchTo().alert().accept(); 
        Thread.sleep(2000); // Pauses the execution for 2000 milliseconds (2 seconds)

        // Finds the element by CSS selector and enters the value of 'name' into the input field
        driver.findElement(By.cssSelector("#name")).sendKeys(name); 
        // Finds the element by its ID and clicks on it
        driver.findElement(By.id("confirmbtn")).click(); 
        // Switches to the alert dialog, retrieves its text, and prints it
        System.out.println(driver.switchTo().alert().getText()); 
        // Switches to the alert dialog and accepts it
        driver.switchTo().alert().accept(); 

        // driver.switchTo().alert().dismiss(); // This line is commented out; it would switch to the alert dialog and dismiss it

    }

}