package rahulshettyacademy.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;
import rahulshettyacademt.TestComponants.Base_test;

public class SubmitOrderTest extends Base_test {

    @Test
    public void SubmitOrder() throws IOException {
        String productsname = "ZARA COAT 3";
       
        ProductCatalogue productcatalogue = landingpage.loginApplication("rohitp@gmail.com", "Rohit12");

       
        List<WebElement> products = productcatalogue.getProductList();
        productcatalogue.addProducttoCart(productsname);
        CartPage cartpage = productcatalogue.goTocartPage();

        boolean match = cartpage.verifyProductDisplay(productsname);
        Assert.assertTrue(match, "Product display verification failed");

        CheckoutPage checkoutpage = cartpage.CheckoutPage();
        checkoutpage.selectCountry("india");

        ConfirmationPage confirmationpage = checkoutpage.SubmitOrder();
        String confirmMessage = confirmationpage.getConfirmMessage();
        Assert.assertEquals(confirmMessage, "THANKYOU FOR THE ORDER.", "Confirmation message mismatch");

        
    }
}
