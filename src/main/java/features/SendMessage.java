package features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

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
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.id("lst-ib")).sendKeys("helo ivan");
	}

	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Throwable {
		
		//driver.findElement(By.name("btnK")).click();
	}

	@Then("^the confirmation message is displayed$")
	public void the_confirmation_message_is_displayed() throws Throwable {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//Assert.assertEquals("salvo", driver.findElement(By.className("ng-binding")).getText());
	}
}
