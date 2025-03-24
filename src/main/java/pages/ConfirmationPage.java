package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	
	@FindBy(className="title")
	private WebElement confirmationPageHeading;
	
	@FindBy(id="finish")
	private WebElement finishButton;
	
	
	public ConfirmationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getPageHeading()
	{
		return confirmationPageHeading.getText();
	}
	
	
	public void clickFinishButton()
	{
		finishButton.click();
	}
	
	
	
	
	
	

}
