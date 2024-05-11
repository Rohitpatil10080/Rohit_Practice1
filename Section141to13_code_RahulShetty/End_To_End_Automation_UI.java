package Section141to13_code_RahulShetty;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

public class End_To_End_Automation_UI {

	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		Actions element = new Actions(driver);
		String city = "Bengaluru (BLR)";

		WebElement from = driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul/li/a[contains(text(),'" + city + "')]"));
		from.click();

		// Thread.sleep(3000);
		String To = "Belagavi (IXG)";

		WebElement ele2 = driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul/li/a[contains(text(),'" + To + "')]"));
		ele2.click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		/*
		 * Thread.sleep(2000); driver.findElement(By.id("divpaxinfo")).click();
		 * 
		 * 
		 * for(int i=1;i<5;i++) {
		 * driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		 * 
		 * i++; }
		 */

		WebElement drop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		drop.click();

		Select s = new Select(drop);

		s.selectByVisibleText("USD");

		Thread.sleep(1000);

		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		// driver.findElement(By.id("ctl00_mainContent_view_date2")).click();

		// driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		// driver.findElement(By.xpath("//tbody/tr//td//a[contains(@class,'ui-state-default
		// ui-state-highlight')]")).click();

	}

}
