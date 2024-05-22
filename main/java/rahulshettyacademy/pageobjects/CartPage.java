package rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstarctComponants.AbstaractCompnant;

public class CartPage extends AbstaractCompnant {

	WebDriver driver;

	// driver.findElement(By.cssSelector("[type='button']:first-child")).click();

	@FindBy(css = "[type='button']:first-child")
	WebElement checkout;

	@FindBy(css = ".cartSection h3")
	List<WebElement> cardproducts;

	// List<WebElement> cardproducts =
	// driver.findEments(By.cssSelector(".cartSection h3"));

	public CartPage(WebDriver driver) {
		super(driver);

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public boolean verifyProductDisplay(String productsname)

	{

		boolean match = cardproducts.stream()
				.anyMatch(cardproduct -> cardproduct.getText().equalsIgnoreCase(productsname));
		return match;

	}

	public rahulshettyacademy.pageobjects.CheckoutPage CheckoutPage() {
		checkout.click();
		return new CheckoutPage(driver);

	}

}
