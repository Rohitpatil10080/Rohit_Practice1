package rahulshettyacademy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstarctComponants.AbstaractCompnant;

public class LandingPage extends AbstaractCompnant {

	WebDriver driver;

	public LandingPage(WebDriver driver) {

		// intilization
		super(driver);

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "userEmail")
	WebElement userEmail;

	@FindBy(xpath = "//input[@formcontrolname='userPassword']")
	WebElement password1;

	@FindBy(css = "#login")
	WebElement login;

	public ProductCatalogue loginApplication(String email, String password) {
		userEmail.sendKeys(email);
		password1.sendKeys(password);
		login.click();

		ProductCatalogue productcatalogue = new ProductCatalogue(driver);
		return productcatalogue;

	}

	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client/");

	}

}
