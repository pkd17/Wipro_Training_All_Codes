package com.wiprojuly.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LabSession18_08_Q3 {
    WebDriver driver;

    @BeforeMethod 
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(priority = 1, groups = {"Sanity"})
    public void validLoginTest() throws InterruptedException {
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("student");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Password123");
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.xpath("//button[@id='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        // Assertion
        WebElement successMessage = driver.findElement(By.xpath("//h1[contains(text(),'Logged In Successfully')]"));
        Assert.assertTrue(successMessage.isDisplayed(), "Login Failed with Valid Credentials");
    }

    @Test(priority = 2, groups = {"Regression"})
    public void invalidLoginTest() throws InterruptedException {
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("wrongUser");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("wrongPass");
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.xpath("//button[@id='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        // Assertion for error message
        WebElement errorMessage = driver.findElement(By.xpath("//div[@id='error']"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error Message Not Displayed for Invalid Login");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
