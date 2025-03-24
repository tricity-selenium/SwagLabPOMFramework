package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	@FindBy(className="title")
	private WebElement checkoutPageHeading;
	
	@FindBy(id="first-name")
	private WebElement firstname;
	
	@FindBy(id="last-name")
	private WebElement lastname;
	
	@FindBy(id="postal-code")
	private WebElement postalcode;
	
	@FindBy(id="continue")
	private WebElement continueButton;
	
	
		
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getPageHeading()
	{
		return checkoutPageHeading.getText();
	}
	
	public void enterFirstName()
	{
		firstname.sendKeys("Amit");
	}
	
	public void enterLastName()
	{
		lastname.sendKeys("Kumar");
	}
	
	public void enterPostalCode()
	{
		postalcode.sendKeys("123456");
	}
	
	public void clickContinueButton()
	{
		continueButton.click();
	}
	
	
	
	
	
	

}
