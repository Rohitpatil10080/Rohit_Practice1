package Section141to13_code_RahulShetty;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Section12_Assignment2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	 driver.findElement(By.id("autocomplete")).sendKeys("ind");
	 Thread.sleep(3000);
	 driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	 driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	 
	 driver.findElement(By.xpath("//div[text()='India']")).click();

//	 Actions s =new Actions(driver);
//	   
//	s.moveToElement(driver.findElement(By.xpath("//div[text()='India']"))); 
//	 
	
	
	
	
	
	
	
	
	
	
	
	}

}
