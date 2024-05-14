package Section_15_LatestFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Hight_Get_width {

    public static void main(String[] args) {

        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Open the webpage
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // Find the element by CSS Selector
        WebElement name = driver.findElement(By.cssSelector("[name='name']"));

        // Printing the height and width of the element
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());
    }

}