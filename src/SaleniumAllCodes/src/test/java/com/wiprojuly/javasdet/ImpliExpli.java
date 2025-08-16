package com.wiprojuly.javasdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpliExpli {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/login");
		
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        
        wait.until(ExpectedConditions.visibilityOf(username));

        // Fluent wait for password field to be interactable before sending keys
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class);
        
        username.sendKeys("tomsmith");
        System.out.println("Username entered");

        // Use fluent wait lambda to send keys to password safely
        fluentWait.until(d -> {
            password.sendKeys("SuperSecretPassword!");
            return true;
        });
        System.out.println("Password entered");

        // Optionally, submit the form or click login button
        WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        loginBtn.click();

        Thread.sleep(3000); // Wait to see result

        // Verify successful login by checking URL or message
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("/secure")) {
            System.out.println("✅ Login successful!");
        } else {
            System.out.println("❌ Login failed.");
        }
	 
             driver.quit();
             System.out.println("✅ Browser closed.");
         }
	}
