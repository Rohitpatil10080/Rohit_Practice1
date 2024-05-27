import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {


	System.setProperty("WebDriver.gicko.driver", "D:\\gickodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://altoconvertpdftoword.com/");
		driver.findElement(By.id("browse")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:\\jqr\\File-Upload.exe");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
