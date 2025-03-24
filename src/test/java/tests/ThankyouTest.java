package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ConfirmationPage;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.ProductsListPage;
import pages.ThankyouPage;

public class ThankyouTest extends BaseTest{
	
	@Test
	  public void verifyThankyouPage() {
		  
		  LoginPage loginpage = new LoginPage(driver);
		  loginpage.enterUsername("standard_user");
		  loginpage.enterPassword("secret_sauce");
		  loginpage.clickLogin();
		  String actualURL = driver.getCurrentUrl();
		  String ExpectedURL = "https://www.saucedemo.com/inventory.html";
		  Assert.assertEquals(actualURL,ExpectedURL);
		  
		  ProductsListPage product = new ProductsListPage(driver);
		  String actualPageHeading = product.getPageHeading();
		  String expectedPageHeading = "Products";
		  Assert.assertEquals(actualPageHeading, expectedPageHeading);		  
		  Assert.assertTrue(product.isSortingDisplayed());
		  product.clickProduct();		  
		  
		  ProductDetailsPage productDetails = new ProductDetailsPage(driver);		  
		  String actulaProductTitle = productDetails.getProductTitle();
		  String expectedProductTitle = "Sauce Labs Backpack";
		  Assert.assertEquals(actulaProductTitle, expectedProductTitle);
		  Assert.assertTrue(productDetails.isAddToCartButtonDisplayed());
		  
		  String  actualButtonText  = productDetails.verifyclickAddToCart();
		  String expectedButtonText = "Remove";
		  Assert.assertEquals(actualButtonText, expectedButtonText);
		  
		  productDetails.clickShoppingCartIcon();
		  
		  CartPage cart = new CartPage(driver);
		  String actualCartPageHeading =  cart.getPageHeading();
		  String expectedCartPageHeading = "Your Cart";
		  Assert.assertEquals(actualCartPageHeading, expectedCartPageHeading);
		  cart.clickCheckoutButton();
		  
		  CheckoutPage checkout = new CheckoutPage(driver);
		  String actualCheckoutPageHeading = checkout.getPageHeading();
		  String expectedCheckoutPageHeading = "Checkout: Your Information";
		  Assert.assertEquals(actualCheckoutPageHeading, expectedCheckoutPageHeading);
		  checkout.enterFirstName();
		  checkout.enterLastName();
		  checkout.enterPostalCode();
		  checkout.clickContinueButton();
		  
		  ConfirmationPage confirmation = new ConfirmationPage(driver);
		  String actualConfirmationPageHeading = confirmation.getPageHeading();
		  String expectedConfirmationPageHeading = "Checkout: Overview";
		  Assert.assertEquals(actualConfirmationPageHeading, expectedConfirmationPageHeading);
		  confirmation.clickFinishButton();
		  
		  ThankyouPage thankyou = new ThankyouPage(driver);
		  String actualThankyouPageHeading = thankyou.getPageHeading();
		  String expectedThankyouPageHeading = "Checkout: Complete!";
		  Assert.assertEquals(actualThankyouPageHeading, expectedThankyouPageHeading);
		  
		  String actualThankyouMessage = thankyou.getThankyouMessage();
		  String expectedThankyouMessage = "Thank you for your order!";
		  Assert.assertEquals(actualThankyouMessage, expectedThankyouMessage);
		  
		  		  
	  }

}
