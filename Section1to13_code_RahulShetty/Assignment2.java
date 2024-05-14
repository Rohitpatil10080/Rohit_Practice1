package Section1to13_code_RahulShetty;
<<<<<<< HEAD

// Import statements
=======
>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

=======
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
public class Assignment2 {

	public static void main(String[] args) {
		
<<<<<<< HEAD
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
=======
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Rohit");
		driver.findElement(By.xpath(".//input[@name='email']")).sendKeys("rohitpatil10080@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Admin123");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		driver.findElement(By.id("inlineRadio2")).click();
		//driver.findElement(By.id("#exampleFormControlSelect1")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		dropdown.click();
		Select dropdownelement= new Select(dropdown);
	    dropdownelement.selectByVisibleText("Female");
	    driver.findElement(By.id("exampleFormControlSelect1")).click();	
	    driver.findElement(By.xpath("//input[@type='date']")).click();
	    
	 WebElement element = driver.findElement(By.xpath("//input[@name='bday']"));
	 
	
	    
	  element.click();
	  
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
}
