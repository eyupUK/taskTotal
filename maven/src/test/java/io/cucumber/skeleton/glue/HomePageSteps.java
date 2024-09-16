package io.cucumber.skeleton.glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.core.Context;
import io.cucumber.skeleton.core.Manager;
import io.cucumber.skeleton.pages.HomePage;
import org.junit.Assert;
import java.util.List;

public class HomePageSteps extends Context {

  public HomePageSteps(Manager manager) {
    super(manager);
  }

  HomePage homePage = new HomePage(manager.getDriver());

  @Given("the page under test is {string}")
  public void the_page_under_test_is(String url) {
    homePage.openHomePage(url);
  }

  @When("I navigate to the homepage")
  public void i_navigate_to_the_homepage() {
    homePage.verifyHomePage();
  }

  @Then("I should see a list of expected examples")
  public void i_should_see_a_list_of_expected_examples() {
    homePage.takeScreenshot();
  }

  @Then("the following links should be present:")
  public void the_following_links_should_be_present(io.cucumber.datatable.DataTable dataTable) {
    List<String> expectedLinks = dataTable.asList();
    Assert.assertTrue("Expected links are not present", homePage.verifyExpectedLinks(expectedLinks));
  }
}