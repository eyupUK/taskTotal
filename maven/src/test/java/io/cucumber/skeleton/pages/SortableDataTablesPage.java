package io.cucumber.skeleton.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class SortableDataTablesPage extends Page{

    private ChromeDriver driver;
    public SortableDataTablesPage(ChromeDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // Locators for the table rows and columns
    By tableRowsLocator = By.cssSelector("#table1 tbody tr");

    // Method to open the sortable data tables page
    public void openSortableDataTablesPage(String urlPath) {
        driver.get("https://the-internet.herokuapp.com" + urlPath);
    }

    // Method to verify table data
    public void verifyTableData(List<Map<String, String>> expectedData) {
        List<WebElement> rows = driver.findElements(tableRowsLocator);

        // Verify each row data matches expected data
        for (int i = 0; i < expectedData.size(); i++) {
            WebElement row = rows.get(i);
            String[] rowData = row.getText().split("\\s+"); // Splitting row data by spaces

            Map<String, String> expectedRowData = expectedData.get(i);

            // Assert each cell matches expected values
            if (!rowData[0].equals(expectedRowData.get("Last Name")) ||
                    !rowData[1].equals(expectedRowData.get("First Name")) ||
                    !rowData[2].equals(expectedRowData.get("Email")) ||
                    !rowData[3].equals(expectedRowData.get("Due")) ||
                    !rowData[4].equals(expectedRowData.get("Web Site"))) {
                throw new AssertionError("Table data does not match expected data at row " + (i + 1));
            }
        }
    }
}
