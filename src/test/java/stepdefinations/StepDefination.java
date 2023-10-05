package stepdefinations;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AdminPage;

public class StepDefination extends BaseClass {
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() throws Exception {
		driver=new ChromeDriver();
		adm=new AdminPage(driver);
		Thread.sleep(1000);
		
	}
	@Given("Chrome Browser is maximize")
	public void chrome_browser_is_maximize() throws Exception {
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	}


	@When("User Open URL {string}")
	public void user_open_url(String url) throws Exception {
		driver.get(url);
		Thread.sleep(1000);
		
	    
	}

	@When("User enter Email Id as {string} and Password as {string}")
	public void user_enter_email_id_as_and_password_as(String uname, String pwd) throws Exception {
		adm.setUserName(uname);
		adm.setPassword(pwd);
		Thread.sleep(1000);
	   
	}

	@When("User click on LOGIN button")
	public void user_click_on_login_button() throws Exception {
		adm.clickOnLoginButton();
		Thread.sleep(1000);
	    
	}
	@Then("user verify page title should be {string}")
	public void user_verify_page_title_should_be(String title) throws Exception {
		Assert.assertEquals(driver.getTitle(),title);
		Thread.sleep(2000);
	    
	}


	@Then("close Browser")
	public void close_browser() {
		driver.close();
	   
	}



}
