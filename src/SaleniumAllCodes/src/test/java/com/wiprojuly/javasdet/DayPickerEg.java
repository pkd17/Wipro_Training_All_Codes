package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DayPickerEg {

    public static void main(String[] args) throws InterruptedException {
        
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://ui.shadcn.com/docs/components/date-picker");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement datePickerBtn = driver.findElement(By.xpath("//*[@id='date']"));
        datePickerBtn.click();
        Thread.sleep(2000);

        WebElement daypicker1 = driver.findElement(By.xpath("//button[@data-day='8/13/2025']"));
        daypicker1.click();
        Thread.sleep(2000);

        datePickerBtn.click();
        Thread.sleep(2000);

        WebElement daypicker2 = driver.findElement(By.xpath("//button[@data-day='8/14/2025']"));
        daypicker2.click();
        Thread.sleep(2000);
        
        

    }
}

