package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendMessage {
	WebDriver driver = null;
	@Given("^I on message website$")
	public void i_on_message_website() throws Throwable {
		//if you didn't update the Path system variable to add the full directory path to the executable as above mentioned then doing this directly through code
		System.setProperty("webdriver.gecko.driver", "C:/Users/isantos/geckodriver-v0.14.0-win64/geckodriver.exe");

		
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com.br/");
	    
	}

	@When("^I write a message$")
	public void i_write_a_message() throws Throwable {
		System.out.println(2);
	}

	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Throwable {
		System.out.println(3);
	}

	@Then("^the confirmation message is displayed$")
	public void the_confirmation_message_is_displayed() throws Throwable {
		System.out.println(4);
	}
}
