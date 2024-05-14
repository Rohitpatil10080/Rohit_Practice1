/*import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrintLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Links present on webpage " + links.size());

		// Links present on specific footer page

		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println("Links present on footer webpage " + footer.findElements(By.tagName("a")).size());

		WebElement firstrow = footer.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		System.out.println("firstrow links present on webpage " + firstrow.findElements(By.tagName("a")).size());

		// click on each link and check pages are opening
		Actions a=new Actions(driver);

		for (int i = 1; i < firstrow.findElements(By.tagName("a")).size(); i++) {
			
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);

			
			firstrow.findElements(By.tagName("a")).get(i).sendKeys("clickonlinktab");
			Thread.sleep(10000);

		}*/
package Section1to13_code_RahulShetty;

import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class PrintLinks {

		    public static void main(String[] args) throws InterruptedException {
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		        // Find all links on the page
		        List<WebElement> links = driver.findElements(By.tagName("a"));
		        System.out.println("Links present on webpage: " + links.size());

		        // Find links in the footer
		        WebElement footer = driver.findElement(By.id("gf-BIG"));
		        List<WebElement> footerLinks = footer.findElements(By.tagName("a"));
		        System.out.println("Links present on footer webpage: " + footerLinks.size());

		        // Find links in the first row of the footer
		        WebElement firstRow = footer.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		        List<WebElement> firstRowLinks = firstRow.findElements(By.tagName("a"));
		        System.out.println("First row links present on webpage: " + firstRowLinks.size());

		        // Click on each link and open in a new tab
		        Actions actions = new Actions(driver);
		        for (int i = 0; i < firstRowLinks.size(); i++) {
		            // Open link in new tab
		            actions.keyDown(Keys.CONTROL).click(firstRowLinks.get(i)).keyUp(Keys.CONTROL).build().perform();
		            Thread.sleep(2000); // Wait for page to load in new tab
		        }

		        // Close the browser
		        driver.quit();
		    }
		

	}


