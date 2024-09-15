package io.cucumber.skeleton.glue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.core.Context;
import io.cucumber.skeleton.core.Manager;

public class SortableDataTablesSteps extends Context {

    public SortableDataTablesSteps(Manager manager) {
        super(manager);
    }

    @When("I navigate to the {string} example")
    public void i_navigate_to_the_example(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see the table with the following results:")
    public void i_should_see_the_table_with_the_following_results(io.cucumber.datatable.DataTable dataTable) {
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
