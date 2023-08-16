package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pomPackage.LoginPage;

public class steps {
	
	public WebDriver driver;
	public  LoginPage lp;

	@Given("User launches Chrome browser")
	public void user_launches_chrome_browser() {
	    driver = new ChromeDriver();
	    lp = new LoginPage(driver);
	    
	}

	@When("User opens url {string}")
	public void user_opens_url(String string) {
		driver.get(string);
	   
	}

	@When("User Enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
		lp.enterEmail(string);
		lp.enterPassword(string2);
	}

	@When("Click on Login")
	public void click_on_login() {
		lp.clickOnloginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
	   
	}

	@When("User clicks on the logout Link")
	public void user_clicks_on_the_logout_link() {
	   
	}

	@Then("the Page title should be {string}")
	public void the_page_title_should_be(String string) {
	   
	}

	@Then("Close Browser")
	public void close_browser() {
	  
	}
}
