package Section1to13_code_RahulShetty;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 //in css we can not give 2 slash for tagname(just right tagname) and one slash for parent cheild relation 
        //just we have give one space
        
        //in css we can give index number we give like //Tagname[@attribute='value']:nth-chield(index no)
		
		
<<<<<<< HEAD
		 // Create a new FirefoxDriver instance
        WebDriver driver = new FirefoxDriver();
        
        // Set implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        // Get the password
        String password = getpassword(driver);
        
        // Open the webpage
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        
        // Enter username
        driver.findElement(By.id("inputUsername")).sendKeys("name");
        
        // Enter password
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        
        // Click on "Remember my username" checkbox
        driver.findElement(By.xpath(".//label[contains(text(),' Remember my username')]")).click();
        
        // Click on "I agree with the Terms and Conditions" checkbox
        driver.findElement(By.xpath(".//input[@value='agreeTerms']")).click();
        
        // Click on submit button
        driver.findElement(By.xpath(".//button[@type='submit']")).click();
        
        // Print error message
        System.out.println(driver.findElement(By.cssSelector(".error")).getText());
        
        // Click on "Forgot your password?" link
        driver.findElement(By.xpath(".//a[contains(text(),'Forgot your password?')]")).click();
        
        // Enter name for password reset
        driver.findElement(By.xpath(".//input[@placeholder='Name']")).sendKeys("rohitpatil3353");
        Thread.sleep(6000);
        
        // Enter email for password reset
        driver.findElement(By.xpath(".//input[@placeholder='Email']")).sendKeys("rohit@gmail.com");
        Thread.sleep(2000);
        
        // Clear email field
        driver.findElement(By.xpath(".//input[@placeholder='Email']")).clear();
        
        // Enter new email for password reset
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("rohit10080@gmail.com");
        Thread.sleep(2000);
        
        // Enter phone number for password reset
=======
		WebDriver driver=new FirefoxDriver();
		String name="Rohit";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("name");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.xpath(".//label[contains(text(),' Remember my username')]")).click();
		driver.findElement(By.xpath(".//input[@value='agreeTerms']")).click();
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		//Thread.sleep(4000);
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		driver.findElement(By.xpath(".//a[contains(text(),'Forgot your password?')]")).click();
        driver.findElement(By.xpath(".//input[@placeholder='Name']")).sendKeys("rohitpatil3353");
        Thread.sleep(6000);
        driver.findElement(By.xpath(".//input[@placeholder='Email']")).sendKeys("rohit@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//input[@placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("rohit10080@gmail.com");
        Thread.sleep(2000);
        
        //driver.findElement(By.xpath(".//input[@placeholder='Phone Number']")).sendKeys("1234567891");
        
        //parent chield 
>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456789");
 /* ------------------------------------------------------------------------------------------------------------------------------      
        //1) contains method
        
        driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
        
 -----------------------------------------------------------------------------------------------------------------------------------
        
        //2) 2nd way parent chield
      
       driver.findElement(By.xpath("//div/button[2]")).click();
       
  --------------------------------------------------------------------------------------------------------------------------------    
        
        
        //3) attributename=Attributute value //tagname[@input="value"]
        
        driver.findElement(By.xpath("//button[@class=\"reset-pwd-btn\"]")).click();
        
-----------------------------------------------------------------------------------------------------------------------------------        
        
        //4) css selector .classname
        
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        
 ---------------------------------------------------------------------------------------------------------------------------------
        
       // *css selector getText()*
       
        
        /*in css we can not give 2 slash for tagname(just right tagname) and one slash for parent cheild relation 
        just we have give one space
        
        in css we can give index number we give like //Tagname[@attribute='value']:nth-chield(index no)
        
 ---------------------------------------------------------------------------------------------------------------------------------*/
        //contains method
        
<<<<<<< HEAD
        // Click on "Reset Login" button using contains method in XPath
        driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
        
        // Print text from paragraph
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        
        // Click on "Go to Login" button using class name in CSS Selector
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        
        // Enter username and password using CSS Selector
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("name");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        Thread.sleep(1000);
        
        // Click on checkboxes using ID in CSS Selector
        driver.findElement(By.cssSelector("#chkboxOne")).click();
        driver.findElement(By.cssSelector("#chkboxTwo")).click();
        
        // Click on submit button using CSS Selector
        driver.findElement(By.cssSelector("button[type*='submit']")).click();
        Thread.sleep(2000);
        
        // Print text from paragraph
        System.out.println(driver.findElement(By.cssSelector("div p")).getText());
        Thread.sleep(2000);
        
        // Click on "Log Out" button using XPath
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        
        // Close the browser
        driver.close();
    }

=======
        driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
        
        
       System.out.println( driver.findElement(By.cssSelector("form p")).getText());
       driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        
        //driver.findElement(By.xpath(".//button[@class='go-to-login-btn']")).click();
       // driver.findElement(By.xpath("//button[@id='visitUsTwo']")).click();
       
       
       driver.findElement(By.cssSelector("#inputUsername")).sendKeys("name");
       driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
       Thread.sleep(1000);
       driver.findElement(By.cssSelector("#chkboxOne")).click();
       driver.findElement(By.cssSelector("#chkboxTwo")).click();
       driver.findElement(By.cssSelector("button[type*='submit']")).click();
       Thread.sleep(2000);
      System.out.println( driver.findElement(By.cssSelector("div p")).getText());
      //Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello"+name+",");
   Thread.sleep(2000);
    driver.findElement(By.xpath("//button[text()='Log Out']")).click();
    driver.close();
   
>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
  
     
    
      
     
   
      
      
<<<<<<< HEAD
	
	
	public static String getpassword(WebDriver driver) throws InterruptedException {
	    // Navigate to the webpage where the password reset functionality is available
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    
	    // Click on the "Forgot your password?" link
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    
	    // Wait for the page to load
	    Thread.sleep(2000);
	    
	    // Click on the "Reset Login" button
	    driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
	    
	    // Retrieve the password text from a paragraph
	    String passwordtext = driver.findElement(By.cssSelector("form p")).getText();
	    
	    // Split the text to extract the password using single quotes ('') as a delimiter
	    String[] passwordarray = passwordtext.split("'");
	    
	    // Extract the password
	    String password = passwordarray[1];
	    
	    // Return the extracted password
	    return password;
	}

=======
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
	    String passwordtext= driver.findElement(By.cssSelector("form p")).getText();
	   String[] passwordarray =passwordtext.split("'");
	  // String[] passwordarray2=passwordarray[1].split("'");
	   String password=passwordarray[1];
	       return password;
>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
	  
			   //Please use temporary password 'rahulshettyacademy' to Login.
	   
			   //0th index= please use temporary password
			   //1st index= 'rahulshettyacademy' to login
			   
			   //0th index=rahulshettyacademy
			   //1st index=to login
	   
	   
	   
	    

		

<<<<<<< HEAD
}


=======
	}

}
>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
