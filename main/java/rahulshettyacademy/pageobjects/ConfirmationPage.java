package rahulshettyacademy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstarctComponants.AbstaractCompnant;

public class ConfirmationPage extends AbstaractCompnant {

	WebDriver driver;

	public ConfirmationPage(WebDriver driver) {

		super(driver);

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(css = ".hero-primary")
	WebElement Thanksmessage;

	// String confirmmessage =
	// driver.findElement(By.cssSelector(".hero-primary")).getText();
	// Assert.assertTrue(confirmmessage.equalsIgnoreCase("Thankyou for the
	// order."));

	public String getConfirmMessage() {
		return Thanksmessage.getText();
	}

}
