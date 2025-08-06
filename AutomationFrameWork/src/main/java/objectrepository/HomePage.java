package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computerLink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutButton() {
		return logoutLink;
	}

	public WebElement getBooks() {
		return booksLink;
	}

	public WebElement getComputer() {
		return computerLink;
	}

	public WebElement getElectronics() {
		return electronicLink;
	}
	
	

}
