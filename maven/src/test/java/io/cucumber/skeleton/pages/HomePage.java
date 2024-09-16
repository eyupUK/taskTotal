package io.cucumber.skeleton.pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class HomePage extends Page {
    WebDriver driver;

    public HomePage(ChromeDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By exampleLinksLocator = By.cssSelector("ul li a");

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void verifyHomePage() {
        System.out.println("Homepage title is : " + driver.getTitle());
        Assert.assertTrue("Expected title is not present", driver.getTitle().contains("The Internet"));
    }

    public boolean verifyExpectedLinks(List<String> expectedLinks) {
        List<WebElement> links = driver.findElements(exampleLinksLocator);
        for (String expectedLink : expectedLinks) {
            boolean found = links.stream().anyMatch(link -> link.getText().contains(expectedLink));
            if (!found) {
                return false;
            }
        }
        return true;
    }

}
