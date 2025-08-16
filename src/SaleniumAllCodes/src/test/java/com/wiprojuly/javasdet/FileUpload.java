package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        // Upload file - correct locator
        WebElement fileInput = driver.findElement(By.xpath("//input[@id='file-upload']"));
        fileInput.sendKeys("C:\\Users\\Pratyush Kumar Das\\Downloads\\test-file.txt"); 
        // or use: "C:/Users/Pratyush Kumar Das/Downloads/test-file.txt"

        WebElement submit = driver.findElement(By.xpath("//input[@id='file-submit']"));
        submit.click();

        Thread.sleep(2000);

        WebElement validationMsg = driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!']"));
        if (validationMsg.isDisplayed()) {
            System.out.println("The message is displayed properly");
        } else {
            System.out.println("The message is not displayed");
        }

        driver.quit();
    }
}

