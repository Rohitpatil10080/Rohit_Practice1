package Section1to13_code_RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver=new FirefoxDriver();

        
       // WebDriver driver = new ChromeDriver(); // Creates a new ChromeDriver object and assigns it to the WebDriver interface
        
        // Opens the specified URL in the Chrome browser
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        // Checks if the checkbox is selected and prints the result
        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        
        // Clicks on the checkbox
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        
        // Checks if the checkbox is selected after clicking and prints the result
        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        
        // Prints the total number of checkboxes on the page
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

    }

}