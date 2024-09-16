package io.cucumber.skeleton.glue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.core.Context;
import io.cucumber.skeleton.core.Manager;
import io.cucumber.skeleton.pages.SortableDataTablesPage;

import java.util.List;
import java.util.Map;

public class SortableDataTablesSteps extends Context {

    public SortableDataTablesSteps(Manager manager) {
        super(manager);
    }

    SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(manager.getDriver());

    @When("I navigate to the {string} example")
    public void i_navigate_to_the_example(String urlPath) {
        sortableDataTablesPage.openSortableDataTablesPage(urlPath);
    }
    @Then("I should see the table with the following results:")
    public void i_should_see_the_table_with_the_following_results(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> expectedData = dataTable.asMaps(String.class, String.class);
        sortableDataTablesPage.verifyTableData(expectedData);
    }
}
