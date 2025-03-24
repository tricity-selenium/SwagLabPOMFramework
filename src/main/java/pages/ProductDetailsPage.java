package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {
	
	@FindBy(xpath="//*[@id=\'inventory_item_container\']/div/div/div[2]/div[1]")
	private WebElement productTitle;
	
	@FindBy(id="add-to-cart")
	private WebElement addToCartButton;
	
	@FindBy(id="remove")
	private WebElement removeButton;
	
	@FindBy(className="shopping_cart_link")
	private WebElement shoppingCartIcon;
		
	public ProductDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getProductTitle()
	{
		return productTitle.getText();
	}
	
	public boolean isAddToCartButtonDisplayed()
	{
		return addToCartButton.isDisplayed();
	}
	
	public String verifyclickAddToCart()
	{
		addToCartButton.click();
		return removeButton.getText();
		
	}
	
	public void clickShoppingCartIcon()
	{
		shoppingCartIcon.click();
	}

}
