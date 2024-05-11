package Section141to13_code_RahulShetty;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// hitting the URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// here we checking finding element where all links are present under this
		WebElement links = driver.findElement(By.id("gf-BIG"));

		// here we are actually getting size of the links present on the webpage
		System.out.println(links.findElements(By.tagName("a")).size());

		// here we are finding perticular footer section links present

		WebElement footer = driver.findElement(By.xpath("//tbody/tr/td[1]/ul"));

		// here we are getting links present on footer section on first row

		System.out.println(footer.findElements(By.tagName("a")).size());

		// here we are clicking on every links which present on footer of first row

		for (int i = 1; i < footer.findElements(By.tagName("a")).size(); i++) {

			String clickonelement = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			// using index we are clicking each link
			footer.findElements(By.tagName("a")).get(i).sendKeys(clickonelement);

		}

		// here we are handling multiple windws

		Set<String> abc = driver.getWindowHandles();

		// so iterating all window
		
		Iterator<String> it = abc.iterator();

		// hasnext we use check there is next window is present so we garb title or
		// anything from that next window

		while (it.hasNext()) {
			// next onlt we move to the next page
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
