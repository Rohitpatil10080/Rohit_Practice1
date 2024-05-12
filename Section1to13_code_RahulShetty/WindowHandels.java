package Section1to13_code_RahulShetty;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();

		// handling multiple windows
		Set<String> windows = driver.getWindowHandles();

		/*
		 * The window iterator allows you to iterate through each window or tab that
		 * Selenium has control over
		 */
		// sppose while in chrome two tabs opend lwt suppose one parent and one chield
		// so first it will get control on
		// parent using next method after that if you define one one more next then will
		// switch on cheild window

		Iterator<String> it = windows.iterator();

		// 1st next get control over on parent window
		String Parentid = it.next();
		// 2nd next() method get control over on chield window
		String chieldid = it.next();
		// and using switch to method it will switch parent to chailed window
		driver.switchTo().window(chieldid);

		// get text from chield window

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		/*main setence- Please email us at mentor@rahulshettyacademy.com with below template to receive response

		 * after 1stsplit setence would be -Please email us ,
		 * mentor@rahulshettyacademy.com with below templ, e to receive response]
		 * 
		 * so now we need to capture email id so [please email us) index number is 0 and
		 * email id index is 1 also we need to give 1 index numbber
		 * 
		 * driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1]
		 * 
		 * //senetence
		 * 
		 * mentor@rahulshettyacademy.com with below templ
		 * 
		 * //after giving index number 1 senetence would be below so we need to capture
		 * only email id also one white space left to email id // so we need to trim
		 * that space
		 * 
		 * 
		 * driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].
		 * trim()
		 * 
		 * mentor@rahulshettyacademy.com with below templ
		 * 
		 * //again split of white space of com and with
		 * 
		 * driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].
		 * trim().split(" ")
		 * 
		 * now sentence is
		 * 
		 * [mentor@rahulshettyacademy.com, with, below, templ]
		 * 
		 * so now just need to give index number our email id is present on oth index
		 * number so we will get our email id
		 * 
		 * mentor@rahulshettyacademy.com
		 */

		String emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
				.split(" ")[0];

		driver.switchTo().window(Parentid);
		driver.findElement(By.id("username")).sendKeys(emailid);

	}

}
