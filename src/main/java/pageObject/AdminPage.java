package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='Email']")
			WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='Password']")
			WebElement txtPassword;
	
	@FindBy(xpath="//button[text()='Log in']")
			WebElement btnLogin;
	

}
