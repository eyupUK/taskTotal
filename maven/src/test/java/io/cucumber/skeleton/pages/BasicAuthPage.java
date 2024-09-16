package io.cucumber.skeleton.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPage extends Page{
    ChromeDriver driver;
    public BasicAuthPage(ChromeDriver driver) {
        super(driver);
        this.driver = driver;
    }
    // Method to open the Basic Auth page with credentials
    public String enterCredentials(String username, String password) {
        String baseURL = "https://the-internet.herokuapp.com/basic_auth";

        // Open Basic Auth page by embedding credentials in URL
        String authURL = "https://" + username + ":" + password + "@" + baseURL.substring(8);
        return authURL;
    }

    // Method to verify successful login message
    public void verifyLoginSuccessMessage(String expectedMessage) {
        String pageSource = driver.getPageSource();
        if (!pageSource.contains(expectedMessage)) {
            throw new AssertionError("Expected message not found: " + expectedMessage);
        }
    }

    public void navigateToExample(String authURL) {
        driver.get(authURL);
    }
}
