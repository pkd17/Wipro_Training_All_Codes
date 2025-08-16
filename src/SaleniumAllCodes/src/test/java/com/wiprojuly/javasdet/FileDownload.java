package com.wiprojuly.javasdet;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions chromeOptions = new ChromeOptions();
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver(chromeOptions);

	        driver.get("https://the-internet.herokuapp.com/upload");
	        
	        WebElement fileDownload = driver.findElement(By.xpath("//a[text()='some-file.txt']")); // replace with actual file name
	        fileDownload.click();

	        // Wait for file to download (basic wait)
	        Thread.sleep(5000);

	        // Check if the file exists in Downloads folder
	        String downloadPath = "C:\\Users\\HP\\Downloads\\some-file.txt"; // update file name here
	        File f = new File(downloadPath);

	        if (f.exists()) {
	            System.out.println("File download complete: " + f.getName());
	        } else {
	            System.out.println("File not found in Downloads.");
	        }

	        // Close browser
	        driver.quit();

	        
	}

}
