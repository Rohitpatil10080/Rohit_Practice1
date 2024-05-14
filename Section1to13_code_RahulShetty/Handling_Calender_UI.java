package Section1to13_code_RahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Calender_UI {

	public static void main(String[] args) {

		String monthNumber = "6";
		String date = "15";
		String year = "2027";
		String[] Expectedlist = { monthNumber, date, year };
		
		   // Setup Firefox WebDriver
        WebDriverManager.firefoxdriver().setup(); // Sets up the Firefox WebDriver

        // Create a new FirefoxDriver instance
        FirefoxDriver driver = new FirefoxDriver(); // Creates a new FirefoxDriver object and assigns it to the WebDriver interface


	//	WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// here we are clicking on calendar
		driver.findElement(By.cssSelector(".react-date-picker__calendar-button")).click();

		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();

		// here we haven't hardcoded just declare variable and concatenation

		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();

		// if you want to convert string to integer use integer.parseInt Select the
		// desired month
		//// Select the desired month. Subtracting 1 because months are zero-indexed in
		// the calendar.
		// For example, to select June (month number 6), subtract 1 from the month
		// number.

		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber) - 1).click();

		//
		// Select the desired date here we haven't hardcoded just declare variable and
		// concatenation

		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();

		// here we are printing the values so get the specific matching element

		List<WebElement> list = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

		// Assert that the values match the expected values

		for (int i = 0; i < list.size(); i++) {

			// Print the value for verification

			System.out.println(list.get(i).getAttribute("value"));

			// Assert that the actual value matches the expected value
			Assert.assertEquals(list.get(i).getAttribute("value"), Expectedlist[i]);

		}

	}

}
