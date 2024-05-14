package Section1to13_code_RahulShetty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

=======
import org.testng.Assert;

>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
public class Validating_UI_Elements_are_enble_or_diasableUsing_attribute {

	public static void main(String[] args) {
		//sometime calender is showing in disable mode but if you clcik it is enable
		//so devloper has changes code in html if you click on calender something will change
		// so we have verifying is enable or not
		
<<<<<<< HEAD
		 // Initialize ChromeDriver
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();

        // Navigate to the webpage
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Click on the 'Round Trip' checkbox
        driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]")).click();

        // Assertion: Verify that the 'Return Date' input field is selected
        Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_view_date2")).isSelected());

        // Assertion: Verify that the 'Return Date' input field is enabled
        if (driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style").contains("0.5")) {
            System.out.println("Return Date input field is enabled");
            Assert.assertTrue(true);
        } else {
            System.out.println("Return Date input field is disabled");
            Assert.assertFalse(false);
        }

        // Close the browser
        driver.quit();
    }
}
=======
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]")).click();	
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isSelected());
       // driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2")).getAttribute("style");
        if( driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2")).getAttribute("style").contains("0.5"))
        {
        	System.out.println("is enabled");
        	Assert.assertTrue(true);
        }
        else
        {
        	System.out.println("is disbled");
        	Assert.assertFalse(false);
        }
      
		
		
		
		
		

	}

}
>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
