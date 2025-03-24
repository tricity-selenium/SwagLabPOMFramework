package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
	//UI Elements of the Page	
	@FindBy(id = "user-name") 
	private WebElement usernameField;
	
    @FindBy(id = "password") 
    private WebElement passwordField;
    
    @FindBy(id = "login-button") 
    private WebElement loginButton;
      
    //Methods to interact with UI Elements of page
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }
}
