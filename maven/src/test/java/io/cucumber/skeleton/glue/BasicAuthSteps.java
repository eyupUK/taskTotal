package io.cucumber.skeleton.glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.core.Context;
import io.cucumber.skeleton.core.Manager;

public class BasicAuthSteps extends Context {

  public BasicAuthSteps(Manager manager) {
    super(manager);
  }

  @When("the {string} example is opened")
  public void the_example_is_opened(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
  @When("I enter username {string} and password {string}")
  public void i_enter_username_and_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
  @Then("I should see the message {string}")
  public void i_should_see_the_message(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

}