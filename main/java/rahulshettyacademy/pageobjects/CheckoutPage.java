package rahulshettyacademy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstarctComponants.AbstaractCompnant;

public class CheckoutPage extends AbstaractCompnant {

	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		super(driver);

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(css = ".btnn.action__submit")
	WebElement submit;

	@FindBy(xpath = "(//button[contains(@class,'ta-item')])[2]")
	WebElement selectCountry;

	@FindBy(css = "[placeholder='Select Country']")
	WebElement Country;

	By results = By.cssSelector(".ta-results");

	public void selectCountry(String countryName) {
		Actions a = new Actions(driver);
		a.sendKeys(Country, "india").build().perform();

		waitForElementToAppear(By.cssSelector(".ta-results"));

		selectCountry.click();
	}

	public ConfirmationPage SubmitOrder() {
		submit.click();
		return new ConfirmationPage(driver);
	}

}
