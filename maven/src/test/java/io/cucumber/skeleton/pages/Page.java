package io.cucumber.skeleton.pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

  protected ChromeDriver driver;

  public Page(ChromeDriver driver) {
    this.driver = driver;
    PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    waitForPageLoad(5);
  }

  public void waitForPageLoad(int timeOutInSeconds) {
    // Wait for page to load
    ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
      public Boolean apply(WebDriver driver) {
        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
      }
    };
    try {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
      wait.until(expectation);
    } catch (Throwable error) {
      error.printStackTrace();
    }
  }

  public void takeScreenshot() {
    System.out.println("Taking screenshot...");
    String filePath = System.getProperty("user.dir") + "/screenshots";
    TakesScreenshot screenshot = (TakesScreenshot) driver;
    File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
    try {
      LocalDateTime myDateObj = LocalDateTime.now();
      FileUtils.copyFile(scr1, new File(filePath + "/" + myDateObj + ".jpg"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}