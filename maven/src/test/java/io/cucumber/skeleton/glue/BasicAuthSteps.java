package io.cucumber.skeleton.glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.core.Context;
import io.cucumber.skeleton.core.Manager;
import io.cucumber.skeleton.pages.BasicAuthPage;

public class BasicAuthSteps extends Context {

  public BasicAuthSteps(Manager manager) {
    super(manager);
  }

  BasicAuthPage basicAuthPage = new BasicAuthPage(manager.getDriver());


  @Given("I enter username {string} and password {string}")
  public void i_enter_username_and_password(String username, String password) {
    String authUrl = basicAuthPage.enterCredentials(username, password);
    stash("authUrl", authUrl);
  }

  @When("I navigate to the Basic Auth example")
  public void i_navigate_to_the_basic_auth_example() {
    basicAuthPage.navigateToExample(getTestStash().get("authUrl").toString());
  }

  @Then("I should see the message {string}")
  public void i_should_see_the_message(String message) {
    basicAuthPage.verifyLoginSuccessMessage(message);
  }

}