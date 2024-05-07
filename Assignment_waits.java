import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_waits {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		int j = 0;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// login

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("okayBtn")).click();

		// Select "Consultant" from dropdown and accept terms

		WebElement dropdown = driver.findElement(By.xpath("//div/select"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();

		//// Click on sign in button

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("signInBtn")));
		driver.findElement(By.id("signInBtn")).click();

		// Array of mobile devices

		String[] mob = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };

		// Find all devices on the page

		List<WebElement> devices = driver.findElements(By.xpath("//div/h4"));

		//// Iterate through devices and click on corresponding "Add" buttons

		for (int i = 0; i < devices.size(); i++) {
			String items = devices.get(i).getText();
			List<String> item = Arrays.asList(mob);
			if (item.contains(items)) {
				j++;

				// Find and click the "Add" button for the current device

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-info']")));
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();

				if (j == mob.length) {
					break;
				}
			}

		}

	}

}
