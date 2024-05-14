package Section1to13_code_RahulShetty;
<<<<<<< HEAD

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberAddProduct {

    public static void main(String[] args) throws InterruptedException {
        
        // Setup Firefox WebDriver
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();

        String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

        // Open the webpage
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        Thread.sleep(3000);

        int j = 0;

        // Find all product elements
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        // Iterate through each product
        for (int i = 0; i < products.size(); i++) {
            
            // Split the product name to extract the vegetable name
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();

            // Convert array to list for easy search
            List itemsNeededList = Arrays.asList(itemsNeeded);

            // Check if the vegetable name is present in the list of items needed
            if (itemsNeededList.contains(formattedName)) {
                j++;

                // Click on "Add to cart"
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }
    }
=======
import java.util.Arrays;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberAddProduct {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

//Brocolli - 1 Kg

//Brocolli,    1 kg

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{

				j++;

//click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
}
