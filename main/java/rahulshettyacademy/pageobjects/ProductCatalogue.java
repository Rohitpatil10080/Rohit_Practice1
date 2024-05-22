package rahulshettyacademy.pageobjects;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstarctComponants.AbstaractCompnant;

public class ProductCatalogue extends AbstaractCompnant {

	WebDriver driver;

	public ProductCatalogue(WebDriver driver) {
		// intilization
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = ".offset-sm-1")
	List<WebElement> products;

	@FindBy(css = ".ng-animating")
	WebElement Spinner;

	@FindBy(css = ".cartSection h3")
	List<WebElement> cardproducts;

	// driver.findElement(By.cssSelector("[routerlink*='/dashboard/cart']")).click();
	// driver.findElements(By.cssSelector(".cartSection h3"));

	By productBy = By.cssSelector(".offset-sm-1");
	By addtoCart = By.cssSelector(".card-body button:last-of-type");
	By ToastMsg = By.cssSelector("#toast-container");

	public List<WebElement> getProductList() {

		waitForElementToAppear(productBy);
		return products;

	}

	public WebElement getProductbyName(String productsname) {
		WebElement prod = products.stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productsname)).findFirst()
				.orElse(null);

		return prod;
	}

	public void addProducttoCart(String productsname) {
		WebElement prod = getProductbyName(productsname);
		prod.findElement(addtoCart).click();
		waitForElementToAppear(ToastMsg);
		waitForElementToDisappear(Spinner);

	}

}
