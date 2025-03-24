package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="checkout")
	private WebElement checkoutButton;
	
	@FindBy(id="continue-shopping")
	private WebElement continueshoppingButton;
	
	@FindBy(className="title")
	private WebElement cartPageHeading;
		
	public String getPageHeading()
	{
		return cartPageHeading.getText();
	}
	
	public void clickCheckoutButton()
	{
		checkoutButton.click();
	}
	
	public void clickContinueShoppingButton()
	{
		continueshoppingButton.click();
	}
	
	
	
	
	
	

}
