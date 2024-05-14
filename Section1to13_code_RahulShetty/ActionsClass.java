package Section1to13_code_RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);

		WebElement move = driver.findElement(By.id("nav-link-accountList"));

		// Type text in capital letter using action class
		// Kyes.shift used for make capital text
		// double click use to select the text
		// build means our line is ready to execute but won't get perform
		// perform- used here to perform whatever we written here

		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
				.doubleClick().build().perform();

		// context click used here to right click
		a.moveToElement(move).contextClick().build().perform();

	}

}
