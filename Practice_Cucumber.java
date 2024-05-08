import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Cucumber {

	public static void main(String[] args) {
		
		
		//WebDriver driver =new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		int j=0;
		
		String[]  itemlist= {"Brocolli","Cauliflower","Cucumber","Beetroot"};
		
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<product.size();i++)
		{
			String[] addeditem = product.get(i).getText().split("-");
			String formattedname = addeditem[0].trim();
			
			
			List<String> items = Arrays.asList(itemlist);
			
			if(items.contains(formattedname))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itemlist.length)
				{
					break;
				}
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
