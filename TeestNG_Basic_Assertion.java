import java.util.List;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TeestNG_Basic_Assertion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		for(int i1=0; i1<checkboxes.size();i1++)
		{
		   WebElement checkbox=checkboxes.get(i);
		   if(!checkbox.isSelected())
		   {
			   checkbox.click();
		   }
		}
	
		
		Assert.assertFalse(driver.findElement(By.id("btnclosepaxoption")).isSelected());
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertTrue(driver.findElement(By.id("btnclosepaxoption")).isSelected());
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText() ,"5 Adult");
		
		//Assignment-1
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
	
		
		
		
		
		
		
		
		

	}

}
