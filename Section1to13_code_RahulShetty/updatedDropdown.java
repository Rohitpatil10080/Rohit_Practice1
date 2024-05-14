package Section1to13_code_RahulShetty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class updatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		   // Setup Firefox WebDriver
        WebDriverManager.firefoxdriver().setup(); // Sets up the Firefox WebDriver

        // Create a new FirefoxDriver instance
        FirefoxDriver driver = new FirefoxDriver(); // Creates a new FirefoxDriver object and assigns it to the WebDriver interface

		
		
		//WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
	/*int i=1;	
	while(i<5)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}*/
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		


	}

}
