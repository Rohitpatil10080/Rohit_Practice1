package Section141to13_code_RahulShetty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();*/
		
		//firefox driver 
		//geco driver
		
		//System.setProperty("webdriver.gecko.driver", "file path");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
	}

}
