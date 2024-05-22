
package rahulshettyacademy.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobjects.LandingPage;

public class StandAloneTest {

	public static void main(String[] args) {

		// Setting up WebDriver

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();

		// Define product name

		String productsname = "ZARA COAT 3";

		// Navigate to website

		
		
		driver.get("https://rahulshettyacademy.com/client/");

		LandingPage landingpage = new LandingPage(driver);

		// Maximize window

		driver.manage().window().maximize();

		// Implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		// Login

		driver.findElement(By.id("userEmail")).sendKeys("rohitp@gmail.com");
		
		 driver.findElement(By.xpath("//input[@formcontrolname='userPassword']")).sendKeys("Rohit123");

		 driver.findElement(By.cssSelector("#login")).click();
		
		// Find product and add to cart

		List<WebElement> products = driver.findElements(By.cssSelector(".offset-sm-1"));
		WebElement prod = products.stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productsname)).findFirst()
				.orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

		// Wait for loading overlay to disappear

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));

		// Go to cart and verify product

		driver.findElement(By.cssSelector("[routerlink*='/dashboard/cart']")).click();
		List<WebElement> cardproducts = driver.findElements(By.cssSelector(".cartSection h3"));
		boolean match = cardproducts.stream()
				.anyMatch(cardproduct -> cardproduct.getText().equalsIgnoreCase(productsname));
		Assert.assertTrue(match);

		// Proceed to checkout

		driver.findElement(By.cssSelector("[type='button']:first-child")).click();

		// Enter shipping information

		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();

		// Confirm order

		driver.findElement(By.cssSelector(".btnn.action__submit")).click();

		// Verify order confirmation message

		String confirmmessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(confirmmessage.equalsIgnoreCase("Thankyou for the order."));

		// Close browser

		driver.close();
	}

}
