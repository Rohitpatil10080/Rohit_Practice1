import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		String name = "Rohit";
		
		Thread.sleep(2000);
		
		 driver.findElement(By.id("name")).sendKeys(name);
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("#alertbtn")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("#name")).sendKeys(name);
		 driver.findElement(By.id("confirmbtn")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().accept();
		
		 //driver.switchTo().alert().dismiss();
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		

	}

}
