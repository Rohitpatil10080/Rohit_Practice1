import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AitoIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("WebDriver.gicko.driver", "D:\\gickodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Basic Auth")).click();;

	}

}
