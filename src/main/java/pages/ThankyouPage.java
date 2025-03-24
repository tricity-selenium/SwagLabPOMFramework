package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankyouPage {
	
	@FindBy(className="title")
	private WebElement thankyouPageHeading;
	
	@FindBy(className="complete-header")
	private WebElement ThankyouMessage;
	
	
	public ThankyouPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getPageHeading()
	{
		return thankyouPageHeading.getText();
	}
	
	
	public String getThankyouMessage()
	{
		return ThankyouMessage.getText();
	}
	
	
	
	
	
	

}
