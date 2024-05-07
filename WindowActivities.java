import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
	    driver.navigate().back();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
