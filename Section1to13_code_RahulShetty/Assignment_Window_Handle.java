package Section1to13_code_RahulShetty;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Window_Handle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://the-internet.herokuapp.com/");

		// click on multiple window link
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();

		// click on one more so you will get one more window
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		// syntax of window handels
		Set<String> dropdown = driver.getWindowHandles();

		// handle the multiple windows using iterator method

		Iterator<String> it = dropdown.iterator();

		// parent window
		String parentID = it.next();

		// move it on chield window
		String chieldId = it.next();

		// wait 2 sec

		Thread.sleep(2000);

		// now switched on chield window
		driver.switchTo().window(chieldId);

		// and get text from the page and printed
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());

		// again wait for 3 sec
		Thread.sleep(3000);

		// to switch from chield to parent

		driver.switchTo().window(parentID);

		// print the text using get text method

		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

	}

}
