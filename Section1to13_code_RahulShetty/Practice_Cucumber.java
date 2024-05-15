package Section1to13_code_RahulShetty;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Cucumber {

    public static void main(String[] args) {
        // Set up WebDriver for Firefox
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        
        // Navigate to the webpage
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        
        // Initialize counter for the number of items added to cart
        int j = 0;
        
        // Define the list of items to be added to the cart
        String[] itemlist = { "Brocolli", "Cauliflower", "Cucumber", "Beetroot" };
        
        // Find all product elements on the page
        List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
        
        // Iterate through each product element
        for (int i = 0; i < product.size(); i++) {
            // Split the product name to extract the actual name
            String[] addeditem = product.get(i).getText().split("-");
            String formattedname = addeditem[0].trim();
            
            // Convert the itemlist array into a list for easier comparison
            List<String> items = Arrays.asList(itemlist);
            
            // Check if the product name matches any item in the itemlist
            if (items.contains(formattedname)) {
                j++; // Increment the counter
                
                // Click on the "Add to Cart" button associated with the product
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                
                // Break the loop if all items in the itemlist are added to the cart
                if (j == itemlist.length) {
                    break;
                }
            }
        }
    }
}