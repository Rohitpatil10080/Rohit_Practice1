package Section_15_LatestFeature;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Invoking_multiplewindows_TabsNewWindow {

    public static void main(String[] args) throws IOException {
        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        
        // Create an instance of ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Navigate to the initial webpage
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        // Open a new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        
        // Get handles of all open windows
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentWindowId = it.next();
        String childWindow = it.next();
        
        // Switch to the child window
        driver.switchTo().window(childWindow);
        
        // Navigate to another URL in the child window
        driver.get("https://rahulshettyacademy.com/");
        
        // Find the course link and get its text
        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
        
        // Switch back to the parent window
        driver.switchTo().window(parentWindowId);
        
        // Find the input element by name and send the course name to it
        WebElement name = driver.findElement(By.cssSelector("[name='name']"));
        name.sendKeys(courseName);
    }
}