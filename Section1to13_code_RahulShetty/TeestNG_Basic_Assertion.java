package Section1to13_code_RahulShetty;
<<<<<<< HEAD

=======
import java.util.List;

import org.checkerframework.checker.units.qual.Length;
>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class TeestNG_Basic_Assertion {

    public static void main(String[] args) throws InterruptedException {
    	
    	
    	   // Setup Firefox WebDriver
        WebDriverManager.firefoxdriver().setup(); // Sets up the Firefox WebDriver

        // Create a new FirefoxDriver instance
        FirefoxDriver driver = new FirefoxDriver(); // Creates a new FirefoxDriver object and assigns it to the WebDriver interface

        // Initialize ChromeDriver
      //  WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Click on the passenger information dropdown
        driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
        Thread.sleep(2000);

        // Increase the number of adults to 5
        int i = 1;
        while (i < 5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

        // Select all checkboxes if not already selected
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }

        // Assertion: Verify that the 'Close' button is not selected
        Assert.assertFalse(driver.findElement(By.id("btnclosepaxoption")).isSelected());

        // Click on the 'Close' button
        driver.findElement(By.id("btnclosepaxoption")).click();

        // Assertion: Verify that the 'Close' button is selected after clicking it
        Assert.assertTrue(driver.findElement(By.id("btnclosepaxoption")).isSelected());

        // Assertion: Verify the number of adults displayed
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        // Assignment-1
        // Navigate to the second webpage
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(2000);

        // Click on the first checkbox and verify if it is selected
        WebElement checkBoxOption1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        checkBoxOption1.click();
        Assert.assertTrue(checkBoxOption1.isSelected());
        Thread.sleep(2000);

        // Click on the first checkbox again and verify if it is deselected
        checkBoxOption1.click();
        Assert.assertFalse(checkBoxOption1.isSelected());

        // Close the browser
        driver.quit();
    }
=======
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

>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
}
