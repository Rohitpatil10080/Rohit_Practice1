package Section1to13_code_RahulShetty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		
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

}
