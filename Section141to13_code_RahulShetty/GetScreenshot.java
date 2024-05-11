package Section141to13_code_RahulShetty;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		  // Setting up Firefox driver
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();

		// maximize the window

		driver.manage().window().maximize();

	      // Opening the URL

		driver.get("https://www.google.co.in/");

		// Taking screenshot of the webpage

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// here we give path of and create name as screenshot file name

		FileUtils.copyFile(src, new File("C:\\KT Plat\\screenshot.png"));

	}

}
