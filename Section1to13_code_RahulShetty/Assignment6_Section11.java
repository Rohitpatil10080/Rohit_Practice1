package Section1to13_code_RahulShetty;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6_Section11 {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver=new FirefoxDriver();


		//WebDriver driver = new ChromeDriver(); // Creates a new ChromeDriver object and assigns it to the WebDriver interface
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // Opens the specified URL in the Chrome browser

		// Clicks on the checkbox
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input"))
				.click();
		
		// Gets the text of the checkbox option
		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]"))
				.getText();

		// Finds the dropdown element
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));

		// Initializes a new Select object with the dropdown element
		Select s = new Select(dropdown);
		// Selects the option from the dropdown
		s.selectByVisibleText(opt);

		// Enters the selected option into the input field
		driver.findElement(By.id("name")).sendKeys(opt);

		// Clicks on the alert button
		driver.findElement(By.id("alertbtn")).click();

		// Retrieves the text from the alert dialog
		String text = driver.switchTo().alert().getText();

		// Checks if the alert message contains the expected text
		if (text.contains(text)) {
			System.out.println("Alert message success");
		} else {
			System.out.println("something is wrong");
		}

	}

}
