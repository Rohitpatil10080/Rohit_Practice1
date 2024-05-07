import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Performingscrolling_using_java_script_executor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// docuemnt-this will select entire page
		// sof if you want scroll one specific method se we have give locatore of that
		// field and perform action like top bottom

		// document.queryselector("locator").scrollTop(500)

		// window.scrollBy-this for browser level

		// WebDriver initialization
		WebDriver driver = new ChromeDriver();

		// Open the webpage
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Creating a JavascriptExecutor instance
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll the window by 500 pixels vertically
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(3000); // Pause for 3 seconds

		// Scroll a specific element (in this case, a table with class 'tableFixHead')
		// by setting its scrollTop property to 5000
		js.executeScript("document.querySelector('.tableFixHead').scrollTop = 5000");

		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for (int i = 0; i < values.size(); i++) {
			values.get(i).getText();

			// converting string to integer

			sum = sum + Integer.parseInt(values.get(i).getText());
		}

		System.out.println(sum);

		driver.findElement(By.cssSelector(".totalAmount")).getText();
		
		// Here we are retrieving the total amount displayed on the webpage and converting it to an integer.
		// Then, we are asserting that the sum of values extracted from the table matches the total amount.
		
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);

	}

}
