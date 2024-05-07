import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings_Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//header/div/button[1]/following-sibling::button[1]
		//Absolute xpath=// from top traverse chield
		//Relative xpath =/ slash
		//sibling to sibling=following-sibling::siblingname
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		
		
		
		
		
		

	}

}
