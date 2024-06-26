package Section1to13_code_RahulShetty;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit_Expicit_concepts {
    public static WebDriver driver;

    public static void main(String[] args) {
    	
    	
    	   // Setup Firefox WebDriver
        WebDriverManager.firefoxdriver().setup(); // Sets up the Firefox WebDriver

        // Create a new FirefoxDriver instance
        FirefoxDriver driver = new FirefoxDriver(); // Creates a new FirefoxDriver object and assigns it to the WebDriver interface

        
        // Set implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        // Setup explicit wait
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        
        // Open the webpage
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        String[] itemlist = { "Brocolli", "Cauliflower", "Cucumber", "Beetroot" };

        // Call the pro method
        Implicit_Expicit_concepts method = new Implicit_Expicit_concepts();
        method.pro(driver, itemlist);

        // Click on Cart and proceed to checkout
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

        // Wait until the "PROCEED TO CHECKOUT" button is visible
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='PROCEED TO CHECKOUT']")));

        // Apply promo code
        driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[text()='Apply']")).click();

        // Wait until the "Apply" button is visible
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Apply']")));

        // Print message after code is applied
        System.out.println(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText());

    }

    public void pro(WebDriver driver, String[] itemlist) {
        int j = 0;
        List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < product.size(); i++) {
            String[] addeditem = product.get(i).getText().split("-");
            String formattedname = addeditem[0].trim();

            List<String> items = Arrays.asList(itemlist);

            if (items.contains(formattedname)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j == itemlist.length) {
                    break;
                }
            }
        }
    }
}