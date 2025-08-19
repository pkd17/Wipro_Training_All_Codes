package com.wiprojuly.testng;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LabSession18_08_Q4 {

    WebDriver driver;

    @Parameters("browser")
    @Test
    public void addToCart(String browser) throws InterruptedException {

        // ✅ Browser setup based on parameter
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        driver.get("https://www.demoblaze.com/index.html");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        Thread.sleep(2000);

        WebElement phonesCat = driver.findElement(By.xpath("//a[text()='Phones']"));
        phonesCat.click();
        Thread.sleep(2000);

        WebElement firstProduct = driver.findElement(By.xpath("(//div[@id='tbodyid']//a)[1]"));
        firstProduct.click();
        Thread.sleep(2000);

        WebElement addToCart = driver.findElement(By.xpath("//a[text()='Add to cart']"));
        addToCart.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);

        WebElement cartLink = driver.findElement(By.xpath("//a[@id='cartur']"));
        cartLink.click();
        Thread.sleep(2000);

        WebElement placeOrder = driver.findElement(By.xpath("//button[text()='Place Order']"));
        placeOrder.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pratyush Kumar Das");
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Berhampur");
        driver.findElement(By.xpath("//input[@id='card']")).sendKeys("9556959930");
        driver.findElement(By.xpath("//input[@id='month']")).sendKeys("09");
        driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2026");

        WebElement purchaseBtn = driver.findElement(By.xpath("//button[text()='Purchase']"));
        purchaseBtn.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
