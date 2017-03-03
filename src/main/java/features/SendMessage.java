package features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendMessage {
	@Given("^I on message website$")
	public void i_on_message_website() throws Throwable {
	    System.out.println(1);
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
