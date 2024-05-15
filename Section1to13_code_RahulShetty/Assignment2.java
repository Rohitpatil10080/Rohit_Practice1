package Section1to13_code_RahulShetty;

// Import statements
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver=new FirefoxDriver();

		
		//WebDriver driver=new ChromeDriver(); // Creates a new ChromeDriver object and assigns it to the WebDriver interface
		driver.get("https://rahulshettyacademy.com/angularpractice/"); // Opens the specified URL in the Chrome browser
		
		// Enters "Rohit" into the name input field
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Rohit"); 
		
		// Enters email address
		driver.findElement(By.xpath(".//input[@name='email']")).sendKeys("rohitpatil10080@gmail.com");
		
		// Enters password
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Admin123");
		
		// Clicks on the checkbox for terms and conditions
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		
		// Clicks on the radio button for female gender
		driver.findElement(By.id("inlineRadio2")).click();
		
		// Finds the dropdown element for selecting gender
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		dropdown.click();
		
		// Initializes a new Select object with the dropdown element and selects "Female"
		Select dropdownelement= new Select(dropdown);
		dropdownelement.selectByVisibleText("Female");
		
		// Clicks on the date input field
		driver.findElement(By.id("exampleFormControlSelect1")).click();	
		
		// Clicks on the date picker input field
		WebElement element = driver.findElement(By.xpath("//input[@name='bday']"));
		element.click();
	}
}