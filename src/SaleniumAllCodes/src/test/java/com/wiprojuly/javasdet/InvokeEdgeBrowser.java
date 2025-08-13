package com.wiprojuly.javasdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeEdgeBrowser {

    public static void main(String[] args) {

        // Create EdgeOptions (optional custom settings)
        EdgeOptions edgeOptions = new EdgeOptions();

        // Setup WebDriver for Edge using WebDriverManager
        WebDriverManager.edgedriver().setup();

        // Launch Edge browser
        WebDriver driver = new EdgeDriver(edgeOptions);

        // Open URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Close the browser
        driver.quit();
    }
}
