package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//input[@id='Email']") 
	@CacheLookup 
	WebElement enterEmail;
	
	@FindBy(xpath = "//input[@id='Password']")
	@CacheLookup
	WebElement enterPassword;
	
	@FindBy(xpath = "//button[text()='Log in']")
	@CacheLookup 
	WebElement loginButton;
	
	public void enterEmail(String email) {
		enterEmail.clear();
		enterEmail.sendKeys(email);
	}
	public void enterPassword(String pass) {
		enterPassword.clear();
		enterPassword.sendKeys(pass);
	}
	public void clickOnloginButton()
	{
		loginButton.click();
	}
}
