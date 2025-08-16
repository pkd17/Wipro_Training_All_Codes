package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropEg {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null; // ✅ Declare the driver before using it

        try {
            // Set up ChromeDriver
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            // Open the drag-and-drop page
            driver.get("https://the-internet.herokuapp.com/drag_and_drop");
            driver.manage().window().maximize();

            // Create Actions instance for performing drag and drop
            Actions act = new Actions(driver);

            // Locate source and target elements
            WebElement from = driver.findElement(By.id("column-a"));
            WebElement to = driver.findElement(By.id("column-b"));

            // Perform drag and drop action
            act.dragAndDrop(from, to).perform();

            // Wait to observe the result
            Thread.sleep(5000);

            System.out.println("Drag and drop completed successfully!");

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            // Close browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
