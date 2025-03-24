package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsListPage {
	
	@FindBy(className="title")
	private WebElement pageHeading;
	
	@FindBy(className="product_sort_container")
	private WebElement sortingDropDown;
	
	@FindBy(xpath="//div[@class=\'inventory_item_name \']")
	private WebElement product;
	
	@FindBy(xpath="//*[@id=\'inventory_container\']/div/div[1]/div[2]/div[2]/div/text()[2]")
	private WebElement productPrice;
	
	
	public ProductsListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeading()
	{
		return pageHeading.getText();		
	}
	
	public boolean isSortingDisplayed()
	{
		return sortingDropDown.isDisplayed();
	}
	
	public void clickProduct()
	{
		product.click();
	}
	
	public String getProductPrice()
	{
		return productPrice.getText();		
	}

}
