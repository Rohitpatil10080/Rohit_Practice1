import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Frames {

	public static void main(String[] args) throws InterruptedException {

		//WebDriver driver = new ChromeDriver();
		
		// TODO Auto-generated method stub
        WebDriverManager.edgedriver().setup();
		 EdgeDriver driver = new EdgeDriver();
		
		

		// get the url
		driver.get("https://the-internet.herokuapp.com/");

		// click on the element
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();

		// get the size of the frame and print it

		System.out.println(driver.findElements(By.tagName("frame")).size());

		// define implicit wait for

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// first capture parent frame
		driver.switchTo().frame("frame-top");

		// then under parent frame capture child frame

		driver.switchTo().frame("frame-middle");

		// then gettext() from that frame which was present and print it in the console

		System.out.println(driver.findElement(By.cssSelector("#content")).getText());

	}

}
