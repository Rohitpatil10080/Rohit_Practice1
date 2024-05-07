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
	  
			   //Please use temporary password 'rahulshettyacademy' to Login.
	   
			   //0th index= please use temporary password
			   //1st index= 'rahulshettyacademy' to login
			   
			   //0th index=rahulshettyacademy
			   //1st index=to login
	   
	   
	   
	    

		

	}

}
