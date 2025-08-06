package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "Email")
	private WebElement emailTextElement;
	
	@FindBy(id = "Password")
	private WebElement passwordTextElement;
	
	@FindBy(xpath ="//input[@value='Log in']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getEmailTextElement() {
		return emailTextElement;
	}

	public WebElement getPasswordTextElement() {
		return passwordTextElement;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	
	
	

}
