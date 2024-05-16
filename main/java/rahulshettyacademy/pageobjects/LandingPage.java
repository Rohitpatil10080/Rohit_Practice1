package rahulshettyacademy.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;

   public LandingPage(WebDriver driver)
   {
	   //intilization
	   
	   this.driver=driver;
	   PageFactory.initElements(driver, this);

	}
   
  @FindBy(id="userEmail")
  WebElement userEmail;
  
  @FindBy(xpath="//input[@formcontrolname='userPassword']")
  WebElement password1;
  
  
 @FindBy(css="#login")
 WebElement login;


}
   
   
   
 


