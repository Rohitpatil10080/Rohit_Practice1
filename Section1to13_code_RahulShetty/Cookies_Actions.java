package Section1to13_code_RahulShetty;

import org.openqa.selenium.firefox.FirefoxDriver; // Imports the FirefoxDriver class from Selenium WebDriver

import io.github.bonigarcia.wdm.WebDriverManager; // Imports the WebDriverManager class for managing WebDriver binaries

public class Cookies_Actions {

    public static void main(String[] args) {

        // Setup Firefox WebDriver
        WebDriverManager.firefoxdriver().setup(); // Sets up the Firefox WebDriver

        // Create a new FirefoxDriver instance
        FirefoxDriver driver = new FirefoxDriver(); // Creates a new FirefoxDriver object and assigns it to the WebDriver interface

        // Maximizes the browser window
        driver.manage().window().maximize(); // Maximizes the browser window

        // Deletes all cookies from the current browsing session
        driver.manage().deleteAllCookies(); // Deletes all cookies from the current browsing session

        // Navigates to the specified URL
        driver.get("https://www.google.co.in/"); // Navigates to "https://www.google.co.in/"

        // Note: The commented-out line below shows how to delete a specific cookie by its name
        // driver.manage().deleteCookieNamed(null); // Deletes the cookie with the specified name
    }

}
