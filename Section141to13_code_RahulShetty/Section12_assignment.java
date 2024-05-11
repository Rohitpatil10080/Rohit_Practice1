package Section141to13_code_RahulShetty;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section12_assignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		WebElement count = driver.findElement(By.id("product"));
		System.out.println(count.findElements(By.tagName("tr")).size());

		//System.out.println("Total column present " + driver.findElements(By.xpath("//tbody/tr/td[2]")).size());
		System.out.println("Total rows present " + driver.findElements(By.xpath("//tbody/tr/th")).size());

		System.out.println(driver.findElement(By.xpath("//tbody/dtr[3]")).getText());

	}

}
