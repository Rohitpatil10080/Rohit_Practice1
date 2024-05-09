import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		// here we can switching on i-frame our source and targeted element inside the
		// frame so we need to capture first i-frame

		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

		// you can capture i-frame using index number as well but its not good practice
		// after someday developer can change it

		// driver.switchTo().frame(0);

		// you can check how many i-fames are present in the web-page using size()
		// method

		System.out.println(driver.findElements(By.tagName("iframe")).size());

		// driver.findElement(By.id("draggable")).click();

		// we can perform drag and drop action using Actions class

		Actions a = new Actions(driver);

		// here we find out locator for source element which field need to drag

		WebElement source = driver.findElement(By.id("draggable"));

		// here we find out targeted element locator where we are going to drop the
		// element
		WebElement target = driver.findElement(By.id("droppable"));

		// here we are performing drag and drop action using build().perform() methods

		a.dragAndDrop(source, target).build().perform();

		// suppose if you want click any other field which present outside of the page
		// but we are still in the frame so
		// to come out from i-frame we can use below method

		driver.switchTo().defaultContent();

	}

}