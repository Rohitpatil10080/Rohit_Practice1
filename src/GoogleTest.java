import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class GoogleTest {

    @Test
    public void HomepageCheck() throws MalformedURLException, URISyntaxException {
    	
    	DesiredCapabilities caps= new DesiredCapabilities();
    	caps.setBrowserName("fireFox");
    	//caps.setPlatform(Platform.WIN10);
    	caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
    	//caps.setCapability(CapabilityType.BROWSER_NAME, "Firefox");
    	
    	WebDriver driver = new RemoteWebDriver(new URI("http://192.168.1.139:5555").toURL(), caps);
        
    	driver.get("https://www.google.com/");
        System.out.println(	driver.getTitle());
    	driver.findElement(By.name("q")).sendKeys("rahulshetty academy");
    	
    	
    }
}