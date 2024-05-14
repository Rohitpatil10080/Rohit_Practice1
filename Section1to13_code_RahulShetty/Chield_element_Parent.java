package Section1to13_code_RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chield_element_Parent {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver=new FirefoxDriver();

        
      //  WebDriver driver = new ChromeDriver(); // Creates a new ChromeDriver object and assigns it to the WebDriver interface
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); // Opens the specified URL in the Chrome browser
        
        // Finds the parent button element of the child button and prints its text
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
    }

}
