package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
 
  @Test
  public void testValidLogin() {
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUsername("standard_user");
	  loginpage.enterPassword("secret_sauce");
	  loginpage.clickLogin();
	  
	  String actualURL = driver.getCurrentUrl();
	  String ExpectedURL = "https://www.saucedemo.com/inventory.html";
	  Assert.assertEquals(actualURL,ExpectedURL);
	  
  }
}
