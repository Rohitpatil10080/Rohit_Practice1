package Section1to13_code_RahulShetty;

<<<<<<< HEAD
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {

    public static void main(String[] args) throws MalformedURLException, IOException {
        
        // Setup Firefox WebDriver
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();

        // Open the webpage
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        // Find all links on the page
        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        
        // Create a SoftAssert object
        SoftAssert a = new SoftAssert();

        // Iterate through each link
        for (WebElement link : links) {
            String url = link.getAttribute("href"); // Get the URL of the link
            
            // Open a connection to the URL and get the response code
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
            System.out.println(respCode); // Print the response code
            
            // Check if the response code indicates a broken link
            a.assertTrue(respCode < 400, "The link with Text" + link.getText() + " is broken with code" + respCode);
        }

        // Assert all soft assertions
        a.assertAll();
    }
}
=======



import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.net.URLConnection;

import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Brokenlinks {



public static void main(String[] args) throws MalformedURLException, IOException {

// TODO Auto-generated method stub

	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver = new FirefoxDriver();
         

         //broken URL

         //Step 1 - IS to get all urls tied up to the links using Selenium

         //  Java methods will call URL's and gets you the status code

         //if status code >400 then that url is not working-> link which tied to url is broken

         //a[href*="soapui"]'

         driver.get("https://rahulshettyacademy.com/AutomationPractice/");

         

         

      List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));

      SoftAssert a =new SoftAssert();

     

      for(WebElement link : links)

      {

       

          String url= link.getAttribute("href");

         

          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

          conn.setRequestMethod("HEAD");

          conn.connect();

          int respCode = conn.getResponseCode();

          System.out.println(respCode);

          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

         

     

      }

     

      a.assertAll();

   

     

     

         

         

         

         

         

     

       

       

       

       

       

       

       

       

       

       

       

       

       

       

       

       

         

         

         

}




}



>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
