package com.wiprojuly.testng;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNGListener.class)
public class TestNG_ListenerTestCase {

    @Test
    public void testLogin() {

        // Setup Chrome Driver
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        try {
            // Open application
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Explicit wait for username field
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement username = wait.until(d -> driver.findElement(By.name("username")));
            username.sendKeys("Admin");

            // Fluent wait for password field
            WebElement password = driver.findElement(By.name("password"));
            Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(5))
                    .pollingEvery(Duration.ofMillis(500))
                    .ignoring(ElementNotInteractableException.class);

            fluentWait.until(d -> {
                password.sendKeys("admin123");
                return true;
            });

            // Click login button
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
            loginButton.click();

        } finally {
            // Close browser after execution
            driver.quit();
        }
    }
}

 