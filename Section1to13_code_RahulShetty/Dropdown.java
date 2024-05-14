package Section1to13_code_RahulShetty;
<<<<<<< HEAD

=======
>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

    public static void main(String[] args) {
    	
    	
    	   // Setup Firefox WebDriver
        WebDriverManager.firefoxdriver().setup(); // Sets up the Firefox WebDriver

        // Create a new FirefoxDriver instance
        FirefoxDriver driver = new FirefoxDriver(); // Creates a new FirefoxDriver object and assigns it to the WebDriver interface


        // Create a new ChromeDriver instance
       // WebDriver driver = new ChromeDriver(); 

        // Navigate to the specified URL
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Find the static dropdown element
        WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        // Create a new Select object
        Select dropdown = new Select(staticdropdown);

        // Select option by index
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        // Select option by visible text
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        // Select option by value
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
    }
=======
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

      WebDriver driver=new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
      
      //dropdown with select tag
      //select by index
      
   WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
      
      Select dropdown=new Select(staticdropdown);
      dropdown.selectByIndex(3);
      System.out.println(dropdown.getFirstSelectedOption().getText());
      dropdown.selectByVisibleText("AED");
      System.out.println(dropdown.getFirstSelectedOption().getText());
      dropdown.selectByValue("INR");
      System.out.println(dropdown.getFirstSelectedOption().getText());

      
      
      
		
		
		
		
		
		
		
		
		
		
		

	}
>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6

}
