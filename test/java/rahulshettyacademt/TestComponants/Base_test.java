package rahulshettyacademt.TestComponants;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobjects.LandingPage;

public class Base_test {
    
  
      
      
        public WebDriver driver;
        public LandingPage landingpage;
        
        public WebDriver initializeDriver() throws IOException
        {
        	
        	
        	Properties prop=new Properties();
        	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//rahulshettyacademy//resources//GlobalData.properties");
        	prop.load(fis);
        	String browserName = prop.getProperty("browser");
        	
        	
        	if(browserName.equalsIgnoreCase("FirefoxDriver"))
        	{
        		
        	 	WebDriverManager.firefoxdriver().setup();
                driver  = new FirefoxDriver();
               
                
    	}
        	else if(browserName.equalsIgnoreCase("edge"))
        	{
        	 	WebDriverManager.edgedriver().setup();
                 driver = new EdgeDriver();
        	}
        	
        	
        	
        	 driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
             return driver;
        	
    }
        
        @BeforeMethod
        public LandingPage launchApplication() throws IOException{
        	{
        		
        	driver	=initializeDriver();
            landingpage = new LandingPage(driver);
    		landingpage.goTo();
        	return landingpage;
        	
        		
        	}
        }
        
        public void TearDown()
        {
        	driver.close();
        }
        
        
        
        
        
        
        
    }

