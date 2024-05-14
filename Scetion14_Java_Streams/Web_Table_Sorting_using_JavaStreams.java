package Scetion14_Java_Streams; // Declaring the package name

import java.util.List; // Importing List interface
import java.util.stream.Collectors; // Importing Collectors class for stream operations

import org.openqa.selenium.By; // Importing Selenium's By class for locating elements
import org.openqa.selenium.WebElement; // Importing WebElement interface for representing HTML elements
import org.openqa.selenium.edge.EdgeDriver; // Importing EdgeDriver class for Selenium WebDriver
import org.testng.Assert; // Importing Assert class from TestNG for assertions

import io.github.bonigarcia.wdm.WebDriverManager; // Importing WebDriverManager for managing WebDriver binaries

public class Web_Table_Sorting_using_JavaStreams { // Declaring a class named Web_Table_Sorting_using_JavaStreams

    public static void main(String[] args) throws InterruptedException { // Declaring the main method

        WebDriverManager.edgedriver().setup(); // Setting up Edge WebDriver using WebDriverManager

        EdgeDriver driver = new EdgeDriver(); // Creating a new instance of EdgeDriver
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers"); // Opening a webpage using the driver
        
        Thread.sleep(5000); // Adding a sleep to wait for the page to load

        // Click on column
        driver.findElement(By.xpath("//tr/th[1]")).click(); // Locating and clicking on the first column header

        // capture all web elements into list
        List<WebElement> element = driver.findElements(By.xpath("//tbody/tr/td[1]")); // Finding all elements in the first column and storing them in a list

        // capture text of all web elements into new (original) list
        List<String> originallist = element.stream().map(s -> s.getText()).collect(Collectors.toList()); // Extracting text from web elements and storing them in a list

        // sort original list of step 3 --> sorted list
        List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList()); // Sorting the original list of text values

        // compare original list vs sorted list
        Assert.assertTrue(originallist.equals(sortedlist)); // Asserting that the original list is equal to the sorted list
        
        List<String> price;

        // scan the name column with getText -> Beans -> print the price of the Rice
        do {
            List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]")); // Finding all rows in the first column

            // Filtering rows to find the one containing "Rice", then extracting and printing its price
            price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());
            price.forEach(a -> System.out.println(a)); // Printing the price

            // If no price is found, navigate to the next page by clicking the "Next" button
            if (price.size() < 1) {
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        } while (price.size() < 1); // Continue looping until a price for "Rice" is found
    }
    
    // Method to extract price of a vegetable
    private static String getPriceVeggie(WebElement r) {
        // Locating the price element next to the vegetable row and extracting its text
        String pricevalue = r.findElement(By.xpath("following-sibling::td[1]")).getText();
        return pricevalue; // Returning the extracted price value
    }
}

/*
 Explanation:
 
 

The code begins with setting up the Edge WebDriver using WebDriverManager, creating an instance of EdgeDriver, and navigating to a webpage.

It then waits for 5 seconds for the page to load.

Next, it locates and clicks on the first column header of a table to sort it.

It captures all web elements in the first column and stores their text in an original list.

The original list is sorted, and an assertion checks if it equals the sorted list.

The code then enters a loop to find and print the price of "Rice":

It finds all rows in the first column.

Filters these rows to find the one containing "Rice", then extracts and prints its price.

If no price is found, it navigates to the next page by clicking the "Next" button.

It continues this process until a price for "Rice" is found.

The getPriceVeggie method extracts the price value of a vegetable by locating the price element next to the vegetable row in the table.
*/