import java.time.Duration;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Expicit_concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] itemlist = { "Brocolli", "Cauliflower", "Cucumber", "Beetroot" };

		// if we call method in main method we need to method as static
		// and 2nd nd way we need to create an object of the class and call the method

		Implicit_Expicit_concepts method = new Implicit_Expicit_concepts();
		method.pro(driver, itemlist);

		// pro(driver,itemlist);-if we write like this then below public method declare
		// as static then run thi code

		driver.findElement(By.xpath("//img[@alt='Cart']")).click();

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='PROCEED TO CHECKOUT']")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Apply']")));
		System.out.println(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText());

	}

	public void pro(WebDriver driver, String[] itemlist) {
		int j = 0;

		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < product.size(); i++) {
			String[] addeditem = product.get(i).getText().split("-");
			String formattedname = addeditem[0].trim();

			List<String> items = Arrays.asList(itemlist);

			if (items.contains(formattedname)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemlist.length) {
					break;
				}
			}

		}
	}

}
