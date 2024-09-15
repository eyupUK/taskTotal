package io.cucumber.skeleton.glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.core.Context;
import io.cucumber.skeleton.core.Manager;

public class HomePageSteps extends Context {

  public HomePageSteps(Manager manager) {
    super(manager);
  }

  @Given("the page under test is {string}")
  public void the_page_under_test_is(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @When("I navigate to the homepage")
  public void i_navigate_to_the_homepage() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("I should see a list of expected examples")
  public void i_should_see_a_list_of_expected_examples() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("the following links should be present:")
  public void the_following_links_should_be_present(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    throw new io.cucumber.java.PendingException();
  }
}