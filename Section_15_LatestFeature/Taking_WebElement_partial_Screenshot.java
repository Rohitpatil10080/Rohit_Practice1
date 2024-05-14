package Section_15_LatestFeature;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taking_WebElement_partial_Screenshot {

    public static void main(String[] args) throws IOException {

        // Setting up ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        // Opening the webpage
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // Finding the element by CSS Selector
        WebElement name = driver.findElement(By.cssSelector("[name='name']"));

        // Entering text into the input field
        name.sendKeys("Rohit");

        // Taking a partial screenshot of the WebElement
        File file = name.getScreenshotAs(OutputType.FILE);

        // Copying the screenshot to a file
        FileUtils.copyFile(file, new File("logo.png"));

    }

}