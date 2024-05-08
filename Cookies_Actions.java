import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies_Actions {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.google.co.in/");

		// here we can give cookie name which we want to delete

		// driver.manage().deleteCookieNamed(null)
	}

}
