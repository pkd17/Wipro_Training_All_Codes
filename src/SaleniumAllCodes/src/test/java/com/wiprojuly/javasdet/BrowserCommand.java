package com.wiprojuly.javasdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommand {

    public static void main(String[] args) throws InterruptedException {

        // Create ChromeOptions (optional custom settings)
        ChromeOptions chromeOptions = new ChromeOptions();

        // Setup WebDriver for Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Open the webpage
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(2000);

        // Browser commands
        System.out.println("Page Title: " + driver.getTitle());       // Get page title
        System.out.println("Current URL: " + driver.getCurrentUrl()); // Get current URL

        // Minimize browser window (Java 11+)
        driver.manage().window().minimize();
        Thread.sleep(1000);

        // Full screen mode
        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        // Close the browser
        driver.quit();  // quit ends the entire browser session
    }
}
