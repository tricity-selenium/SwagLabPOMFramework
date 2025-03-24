package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.ProductsListPage;

public class ProductsListTest extends BaseTest{
	
  @Test
  public void verifyProductListPageHeading() {
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUsername("standard_user");
	  loginpage.enterPassword("secret_sauce");
	  loginpage.clickLogin();
	  
	  ProductsListPage product = new ProductsListPage(driver);
	  String actualPageHeading = product.getPageHeading();
	  String expectedPageHeading = "Products";
	  Assert.assertEquals(actualPageHeading, expectedPageHeading);
	  
	  Assert.assertTrue(product.isSortingDisplayed());
	  
	  	  
	  
	  
  }
}
