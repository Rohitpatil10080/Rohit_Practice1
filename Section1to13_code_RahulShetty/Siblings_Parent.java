package Section1to13_code_RahulShetty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Siblings_Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//header/div/button[1]/following-sibling::button[1]
		//Absolute xpath=// from top traverse chield
		//Relative xpath =/ slash
		//sibling to sibling=following-sibling::siblingname
		
		   // Setup Firefox WebDriver
        WebDriverManager.firefoxdriver().setup(); // Sets up the Firefox WebDriver

        // Create a new FirefoxDriver instance
        FirefoxDriver driver = new FirefoxDriver(); // Creates a new FirefoxDriver object and assigns it to the WebDriver interface

		
		
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		
		
		
		
		
		

	}

}
